package org.service;

import org.dao.imp.Userdao;
import org.model.Userinfo;

public interface RegistService {
	Userdao usd = null;
	
	public void setUsd(Userdao usd);
	
	public boolean register(Userinfo userinfo);

}
