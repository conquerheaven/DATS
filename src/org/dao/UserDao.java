package org.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.model.Userinfo;

public interface UserDao {
	SessionFactory sessionfactory = null;
	
	public void setSessionfactory(SessionFactory sessionfactory);
	
	public ArrayList<Userinfo> FindUser(Userinfo userinfo);
	
	public boolean AddUser(Userinfo userinfo);

}
