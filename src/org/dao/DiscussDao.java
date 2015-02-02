package org.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.model.Discuss;

public interface DiscussDao {
	SessionFactory sessionfactory = null;
	
	public void setSessionfactory(SessionFactory sessionfactory);
	
	public ArrayList<Discuss> FindDiscuss();
	
	public void AddDiscuss(Discuss discuss);

}
