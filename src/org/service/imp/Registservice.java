package org.service.imp;

import org.dao.imp.Userdao;
import org.model.Userinfo;
import org.service.RegistService;

public class Registservice implements RegistService{

	private Userdao usd;
	@Override
	public void setUsd(Userdao usd) {
		// TODO Auto-generated method stub
		this.usd = usd;
	}

	@Override
	public boolean register(Userinfo userinfo) {
		// TODO Auto-generated method stub
		try{
			if(usd.AddUser(userinfo)){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
