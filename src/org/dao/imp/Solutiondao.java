package org.dao.imp;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.dao.SolutionDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.model.HibernateSessionFactory;
import org.model.Solution;

public class Solutiondao implements SolutionDao{
	@Resource private SessionFactory sessionfactory;
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	public ArrayList<Solution> FindSolution(int top) {
		try{
			Session session = sessionfactory.openSession();
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Solution where solutionId <="+top+"order by solutionId desc");
			query.setMaxResults(20);
			ArrayList<Solution> ls = (ArrayList<Solution>)query.list();
			ts.commit();
			session.close();
			return ls;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void AddSolution(Solution solution) {
		// TODO Auto-generated method stub
		try{
			Session session = sessionfactory.openSession();
			Transaction ts = session.beginTransaction();
			session.save(solution);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void UpdateSolution(Solution solution){
		try{
			Session session = sessionfactory.openSession();
			Transaction ts = session.beginTransaction();
			String hql = "update Solution s set s.result=? , s.memory=? , s.runTime=? , s.codeLength=? where s.locTime=?";
			Query query = session.createQuery(hql);
			query.setParameter(0, solution.getResult());
			query.setParameter(1, solution.getMemory());
			query.setParameter(2, solution.getRunTime());
			query.setParameter(3, solution.getCodeLength());
			query.setParameter(4, solution.getLocTime());
			query.executeUpdate();
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
