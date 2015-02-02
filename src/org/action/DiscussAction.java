package org.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.model.Discuss;
import org.model.Reply;
import org.service.imp.Discussservice;

import com.opensymphony.xwork2.ActionSupport;

public class DiscussAction extends ActionSupport implements RequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Discussservice dcs;
	private Discuss discuss;
	private Reply reply;
	Map<String , Object> request;
	
	public void setDcs(Discussservice dcs){
		this.dcs = dcs;
	}
	public Discussservice getDcs(){
		return this.dcs;
	}
	public void setDiscuss(Discuss discuss){
		this.discuss = discuss;
	}
	public Discuss getDiscuss(){
		return this.discuss;
	}
	public void setReply(Reply reply){
		this.reply = reply;
	}
	public Reply getReply(){
		return this.reply;
	}
	
	public String getContent(){
		int top = Integer.MAX_VALUE;
		if(ServletActionContext.getRequest().getParameter("top") != null){
			top = Integer.parseInt(ServletActionContext.getRequest().getParameter("top"));
		}
		ArrayList<Discuss> Dls = dcs.getDiscuss();
		ArrayList<Reply> Rls = dcs.getReply();
		request.put("Dls", Dls);
		request.put("Rls", Rls);
		request.put("top", top);
		if(ServletActionContext.getRequest().getParameter("problemId") != null){
			request.put("problemId", ServletActionContext.getRequest().getParameter("problemId"));
		}
		return SUCCESS;
	}
	public String AddDiscuss(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String disTime = dateFormat.format(new Date()); 
		discuss.setDisTime(disTime);
		dcs.AddDiscuss(discuss);
		return SUCCESS;
	}
	public String AddReply(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String replyTime = dateFormat.format(new Date()); 
		reply.setReplyTime(replyTime);
		dcs.AddReply(reply);
		return SUCCESS;
	}
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

}
