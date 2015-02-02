package org.service.imp;

import java.util.ArrayList;

import org.dao.imp.Discussdao;
import org.dao.imp.Replydao;
import org.model.Discuss;
import org.model.Reply;
import org.service.DiscussService;

public class Discussservice implements DiscussService{

	private Discussdao dcd;
	private Replydao rpd;
	@Override
	public void setDcd(Discussdao dcd) {
		// TODO Auto-generated method stub
		this.dcd = dcd;
	}

	@Override
	public void setRpd(Replydao rpd) {
		// TODO Auto-generated method stub
		this.rpd = rpd;
	}

	@Override
	public ArrayList<Discuss> getDiscuss() {
		// TODO Auto-generated method stub
		return dcd.FindDiscuss();
	}

	@Override
	public ArrayList<Reply> getReply() {
		// TODO Auto-generated method stub
		return rpd.FindReply();
	}

	@Override
	public void AddDiscuss(Discuss discuss) {
		// TODO Auto-generated method stub
		dcd.AddDiscuss(discuss);
	}

	@Override
	public void AddReply(Reply reply) {
		// TODO Auto-generated method stub
		rpd.AddReply(reply);
	}

}
