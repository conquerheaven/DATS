package org.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.model.Problem;
import org.service.imp.searchService;

import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport implements RequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	searchService scs;
	Problem problem;
	Map<String , Object> request;
	
	public void setProblem(Problem problem){
		this.problem = problem;
	}
	
	public void setScs(searchService scs){
		this.scs = scs;
	}
	
	public Problem getProblem(){
		return this.problem;
	}
	
	public searchService getScs(){
		return this.scs;
	}
	
	public String execute() throws Exception{
		
		//problem.setKnowledgePoint("fuck!!");
		if(ServletActionContext.getRequest().getParameter("knowledge") != null){
			String knowledge = new String(ServletActionContext.getRequest().getParameter("knowledge").getBytes("ISO8859-1"),"utf-8");
			problem.setKnowledgePoint(knowledge);
			//System.out.print(knowledge);
		}
		
		ArrayList<Problem> ls = scs.searchByKnowledge(problem);
		request.put("ls", ls);
		return SUCCESS;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

}
