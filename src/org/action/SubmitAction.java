package org.action;

import org.model.Solution;
import org.service.imp.Submitservice;

import com.opensymphony.xwork2.ActionSupport;

public class SubmitAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Solution solution;
	Submitservice sbs;
	
	public void setSolution(Solution solution){
		this.solution = solution;
	}
	
	public Solution getSolution(){
		return this.solution;
	}
	
	public void setSbs(Submitservice sbs){
		this.sbs = sbs;
	}
	public Submitservice getSbs(){
		return this.sbs;
	}
	
	public void validate(){
		this.clearFieldErrors();
		if(solution.getProblemId() == null){
			this.addFieldError("solution.problemId", "Enter problem ID please!");
		}else if(solution.getProblemId() < 1000 || solution.getProblemId() > 4054){
			this.addFieldError("solution.problemId", "No such problem");
		}
		if(solution.getCode() == null){
			this.addFieldError("solution.code", "Enter your code please!");
		}else if(solution.getCode().length() < 50){
			this.addFieldError("solution.code", "Code too short!");
		}
	}
	
	public String execute() throws Exception{
		sbs.submit(solution);
		return SUCCESS;
	}

}
