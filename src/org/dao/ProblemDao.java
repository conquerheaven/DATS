package org.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.model.*;

public interface ProblemDao {
	SessionFactory sessionfactory = null;
	
	public void setSessionfactory(SessionFactory sessionfactory);
	
	public ArrayList<Problem> FindProblemByKnowledge(String knowledge);

}
