package org.service.imp;


import java.util.ArrayList;

import org.dao.imp.Solutiondao;
import org.model.Solution;
import org.service.SolutionService;

public class Solutionservice implements SolutionService{
	Solutiondao std;
	
	public void setStd(Solutiondao std){
		this.std = std;
	}

	public ArrayList<Solution> getSolution(int top) {
		ArrayList<Solution> ls = null;
		ls = std.FindSolution(top);
		if(ls == null){
			return null;
		}else{
			return ls;
		}
	}

	public void AddSolution(Solution solution) {
		std.AddSolution(solution);
	}

}
