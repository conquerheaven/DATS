package org.service.imp;

import java.util.ArrayList;
import java.util.Iterator;

import org.dao.imp.Userdao;
import org.model.Userinfo;
import org.service.LoginService;


public class Loginservice implements LoginService{
	Userdao usd;
	public void setUsd(Userdao usd){
		this.usd = usd;
	}
	public boolean checkLogin(Userinfo userinfo){
		ArrayList<Userinfo> al = null;
		al = usd.FindUser(userinfo);
		Iterator<Userinfo> it = al.iterator();
		while(it.hasNext()){
			Userinfo tem = it.next();
			//System.out.println(tem.getUsername()+" "+tem.getPassword());
			if(tem.getUsername().equals(userinfo.getUsername()) && tem.getPassword().equals(userinfo.getPassword())){
				return true;
			}
		}
		return false;
	}

}
