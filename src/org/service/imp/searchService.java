package org.service.imp;

import java.util.ArrayList;

import org.dao.imp.problemDao;
import org.model.Problem;
import org.service.SearchService;

public class searchService implements SearchService{

	private problemDao pbd;
	@Override
	public void setPbd(problemDao pbd) {
		// TODO Auto-generated method stub
		this.pbd = pbd;
	}

	@Override
	public ArrayList<Problem> searchByKnowledge(Problem problem) {
		// TODO Auto-generated method stub
		ArrayList<Problem> ls = null;
		ls = pbd.FindProblemByKnowledge(problem.getKnowledgePoint());
		return ls;
	}

}
