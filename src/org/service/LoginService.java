package org.service;

import org.dao.imp.Userdao;
import org.model.Userinfo;

public interface LoginService {
	Userdao usd = null;
	public void setUsd(Userdao usd);
	
	public boolean checkLogin(Userinfo userinfo);

}
