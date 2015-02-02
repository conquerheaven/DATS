package org.dao.imp;

import java.util.ArrayList;

import org.dao.DiscussDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.model.Discuss;

public class Discussdao implements DiscussDao{
	private SessionFactory sessionfactory;

	@Override
	public void setSessionfactory(SessionFactory sessionfactory) {
		// TODO Auto-generated method stub
		this.sessionfactory = sessionfactory;
	}

	@Override
	public ArrayList<Discuss> FindDiscuss() {
		try{
			Session session = sessionfactory.openSession();
			Query query = session.createQuery("from Discuss order by disTime desc");
			ArrayList<Discuss> ls = (ArrayList<Discuss>) query.list();
			session.close();
			return ls;
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public void AddDiscuss(Discuss discuss) {
		// TODO Auto-generated method stub
		try{
			Session session = sessionfactory.openSession();
			Transaction ts = session.beginTransaction();
			session.save(discuss);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
