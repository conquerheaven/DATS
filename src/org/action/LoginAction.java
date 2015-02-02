package org.action;

import java.util.Map;


import org.apache.struts2.interceptor.SessionAware;
import org.model.Userinfo;
import org.service.imp.Loginservice;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Userinfo userinfo;
	private Loginservice ls;
	Map<String, Object>  session;
	public void setUserinfo(Userinfo userinfo){
		this.userinfo = userinfo;
	}
	public Userinfo getUserinfo(){
		return this.userinfo;
	}
	
	public void setLs(Loginservice ls){
		this.ls = ls;
	}
	public Loginservice getLs(){
		return this.ls;
	}
	
	public String login(){
		if(ls.checkLogin(userinfo)){
			session.put("ACMer", userinfo.getUsername());
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public String logout(){
		session.clear();
		return SUCCESS;
	}
	@Override
	public void setSession(Map<String, Object>  session) {
		// TODO Auto-generated method stub
		this.session = session;
		
	}

}
