package org.service;

import java.util.ArrayList;

import org.dao.imp.*;
import org.model.Problem;

public interface SearchService {
	problemDao pbd = null;
	
	public void setPbd(problemDao pbd);
	
	public ArrayList<Problem> searchByKnowledge(Problem problem);

}
