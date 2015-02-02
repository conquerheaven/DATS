package org.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.service.imp.Solutionservice;
import org.model.*;

import com.opensymphony.xwork2.ActionSupport;

public class SolutionAction extends ActionSupport implements RequestAware{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Solutionservice sts;
	Map<String, Object> request;
	
	public String execute() throws Exception{
		int top = 1000000000;
		if(ServletActionContext.getRequest().getParameter("top") != null){
			top = Integer.parseInt(ServletActionContext.getRequest().getParameter("top"));
		}
		//System.out.print(ServletActionContext.getRequest().getParameter("top"));
		request.put("top", top);
		ArrayList<Solution> ls = null;
		ls = sts.getSolution(top);
		request.put("ls", ls);
		return SUCCESS;
	}

	public void setRequest(Map<String, Object>  request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
	public void setSts(Solutionservice sts){
		this.sts = sts;
	}

}
