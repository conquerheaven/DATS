package org.service.imp;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.PojThread.imp.mainThread;
import org.dao.imp.Solutiondao;
import org.model.Solution;
import org.service.SubmitService;

public class Submitservice implements SubmitService{
	private mainThread mthread;
	private Solutiondao std;

	@Override
	public void setMthread(mainThread mthread) {
		// TODO Auto-generated method stub
		this.mthread = mthread;
	}

	@Override
	public void setStd(Solutiondao std) {
		// TODO Auto-generated method stub
		this.std = std;
	}

	@Override
	public void submit(Solution solution) {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String locTime = dateFormat.format(new Date()); 
		solution.setLocTime(locTime);
		solution.setLanguage("C++");
		std.AddSolution(solution);
		mthread.setSolution(solution);
		Thread T = new Thread(mthread);
		T.start();
	}

}
