package org.service;

import org.PojThread.imp.mainThread;
import org.dao.imp.Solutiondao;
import org.model.Solution;

public interface SubmitService {
	mainThread mthread = null;
	Solutiondao std = null;
	
	public void setMthread(mainThread mthread);
	
	public void setStd(Solutiondao std);
	
	public void submit(Solution solution);

}
