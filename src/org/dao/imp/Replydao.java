package org.dao.imp;

import java.util.ArrayList;



import org.dao.ReplyDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.model.Reply;

public class Replydao implements ReplyDao{
	SessionFactory sessionfactory;

	@Override
	public void setSessionfactory(SessionFactory sessionfactory) {
		// TODO Auto-generated method stub
		this.sessionfactory = sessionfactory;
	}

	@Override
	public ArrayList<Reply> FindReply() {
		// TODO Auto-generated method stub
		try{
			Session session = sessionfactory.openSession();
			Query query = session.createQuery("from Reply");
			ArrayList<Reply> ls = (ArrayList<Reply>) query.list();
			session.close();
			return ls;
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public void AddReply(Reply reply) {
		// TODO Auto-generated method stub
		try{
			Session session = sessionfactory.openSession();
			Transaction ts = session.beginTransaction();
			session.save(reply);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
