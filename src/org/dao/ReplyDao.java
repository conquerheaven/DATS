package org.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.model.Reply;

public interface ReplyDao {
	SessionFactory sessionfactory = null;
	
	public void setSessionfactory(SessionFactory sessionfactory);
	
	public ArrayList<Reply> FindReply();
	
	public void AddReply(Reply reply);

}
