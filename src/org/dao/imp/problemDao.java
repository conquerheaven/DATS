package org.dao.imp;

import java.util.ArrayList;

import org.dao.ProblemDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.model.Problem;

public class problemDao implements ProblemDao{

	private SessionFactory sessionfactory;
	@Override
	public void setSessionfactory(SessionFactory sessionfactory) {
		// TODO Auto-generated method stub
		this.sessionfactory = sessionfactory;
	}

	@Override
	public ArrayList<Problem> FindProblemByKnowledge(String knowledge) {
		// TODO Auto-generated method stub
		try{
			ArrayList<Problem> ls = null;
			Session session = sessionfactory.openSession();
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Problem where knowledgePoint like ? order by AC desc");
			query.setParameter(0, "%"+knowledge+"%");
			ls = (ArrayList<Problem>) query.list();
			ts.commit();
			session.close();
			return ls;
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
