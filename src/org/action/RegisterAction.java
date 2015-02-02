package org.action;


import org.dao.imp.Userdao;
import org.model.Userinfo;
import org.service.imp.Registservice;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String password;
	Registservice rts;
	Userinfo userinfo;
	Userdao usd;
	
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return this.password;
	}
	public void setUserinfo(Userinfo userinfo){
		this.userinfo = userinfo;
	}
	public Userinfo getUserinfo(){
		return this.userinfo;
	}
	public void setRts(Registservice rts){
		this.rts = rts;
	}
	public Registservice getRts(){
		return this.rts;
	}
	public void setUsd(Userdao usd){
		this.usd = usd;
	}
	
	public void validate(){
		this.clearFieldErrors();
		if(userinfo.getUsername() == null || userinfo.getUsername().length()==0){
			this.addFieldError("userinfo.username", "ACMer must not be empty!");
		}else if(userinfo.getPassword() == null || userinfo.getPassword().length()==0 ){
			this.addFieldError("userinfo.password", "Password must not be empty!");
		}else if(usd.FindUser(userinfo).size() != 0){
			this.addFieldError("userinfo.username", "Existed ACMer!");
		}else{
			if(!userinfo.getPassword().equals(password)){
				this.addFieldError("password", "Different Password!");
			}
		}
	}
	
	public String execute() throws Exception{
		System.out.print(userinfo.getUsername()+userinfo.getPassword());
		if(rts.register(userinfo)){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

}
