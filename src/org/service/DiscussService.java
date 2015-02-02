package org.service;

import java.util.ArrayList;

import org.dao.imp.Discussdao;
import org.dao.imp.Replydao;
import org.model.Discuss;
import org.model.Reply;

public interface DiscussService {
	Discussdao dcd = null;
	Replydao rpd = null;
	
	public void setDcd(Discussdao dcd);
	
	public void setRpd(Replydao rpd);
	
	public ArrayList<Discuss> getDiscuss();
	
	public ArrayList<Reply> getReply();
	
	public void AddDiscuss(Discuss discuss);
	
	public void AddReply(Reply reply);
}
