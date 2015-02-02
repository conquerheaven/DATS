package org.PojThread;

import org.dao.imp.Solutiondao;
import org.model.Solution;

public interface MainThread{
	Solution solution = null;
	SubmitThread submit = null;
	ResultThread result = null;
	Solutiondao std = null;
	
	public void setSolution(Solution solution);
	
	public void setStd(Solutiondao std);
	
	public void setSubmit(SubmitThread submit);
	
	public void setResult(ResultThread result);
	
	public void run();
}
