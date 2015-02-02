package org.service;

import java.util.ArrayList;

import org.dao.imp.Solutiondao;
import org.model.*;

public interface SolutionService {
	Solutiondao std = null;
	
	public void setStd(Solutiondao std);
	
	public ArrayList<Solution> getSolution(int top);
	
	public void AddSolution(Solution solution);
}
