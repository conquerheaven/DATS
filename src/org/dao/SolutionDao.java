package org.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.model.Solution;

public interface SolutionDao {
	SessionFactory sessionfactory = null;
	
	public void setSessionfactory(SessionFactory sessionfactory);
	
	public ArrayList<Solution> FindSolution(int top);
	
	public void AddSolution(Solution solution);
	
	public void UpdateSolution(Solution solution);
}
