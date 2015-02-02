package org.PojThread.imp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.PojThread.MainThread;
import org.PojThread.ResultThread;
import org.PojThread.SubmitThread;
import org.dao.imp.Solutiondao;
import org.model.Solution;

public class mainThread implements MainThread , Runnable{
	private SubmitThread submit;
	private ResultThread result;
	private Solution solution;
	private Solutiondao std;
	
	public void setSubmit(SubmitThread submit){
		this.submit = submit;
	}
	
	public void setResult(ResultThread result){
		this.result = result;
	}
	
	public void setSolution(Solution solution) {
		this.solution = solution;
	}
	
	public void setStd(Solutiondao std){
		this.std = std;
	}
	
	public void run(){
		Map<String , Integer> pojresult = new HashMap<String , Integer>();
		pojresult.put("Running & Judging", 0);
		pojresult.put("Compiling", 0);
		pojresult.put("waitting" , 0);
		pojresult.put("Accepted", 1);
		pojresult.put("Wrong Answer", 2);
		pojresult.put("Time Limit Exceeded", 3);
		pojresult.put("Memory Limit Exceeded", 4);
		pojresult.put("Presentation Error", 5);
		pojresult.put("Runtime Error", 6);
		pojresult.put("Output Limit Exceeded", 7);
		pojresult.put("Compile Error", 8);
		int sub_t = 0;
		while(!submit.submit(solution)){
			sub_t++;
			if(sub_t == 5){
				solution.setResult("NetWork_Error");
				std.UpdateSolution(solution);
			}
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String subTime = dateFormat.format(new Date()); 
		solution.setSubTime(subTime);
		solution.setResult("waitting");
		std.UpdateSolution(solution);
		Solution tem = result.result(solution);
		sub_t = 0;
		while(pojresult.get(tem.getResult()).equals(0)){
			tem = result.result(solution);
			try{
				Thread.sleep(1000);
				sub_t++;
			}catch(InterruptedException e){
				solution.setResult("NetWork_Error");
				break;
			}
			if(sub_t > 60){
				solution.setResult("NetWork_Error");
				break;
			}
			//System.out.print(tem.getSubTime());
		}
		solution.setResult(tem.getResult());
		solution.setMemory(tem.getMemory());
		solution.setRunTime(tem.getRunTime());
		solution.setLanguage(tem.getLanguage());
		solution.setCodeLength(tem.getCodeLength());
		std.UpdateSolution(solution);

	}

	

}
