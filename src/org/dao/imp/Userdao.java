package org.dao.imp;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.dao.UserDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.model.Userinfo;

public class Userdao implements UserDao{
	@Resource private SessionFactory sessionfactory;
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	public ArrayList<Userinfo> FindUser(Userinfo userinfo) {
		try{
			Session session = sessionfactory.openSession();
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Userinfo where username = ?");
			query.setParameter(0, userinfo.getUsername());
			ArrayList<Userinfo> ls = (ArrayList<Userinfo>)query.list();
			ts.commit();
			session.close();
			return ls;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean AddUser(Userinfo userinfo) {
		try{
			Session session = sessionfactory.openSession();
			Transaction ts = session.beginTransaction();
			session.save(userinfo);
			ts.commit();
			session.close();
			return true;
		}catch(Exception e){
			return false;
		}
		
	}

}
