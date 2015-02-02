package org.model;

/**
 * Reply entity. @author MyEclipse Persistence Tools
 */

public class Reply implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer replyTo;
	private String acmer;
	private String replyTime;
	private String content;

	// Constructors

	/** default constructor */
	public Reply() {
	}

	/** minimal constructor */
	public Reply(Integer replyTo) {
		this.replyTo = replyTo;
	}

	/** full constructor */
	public Reply(Integer replyTo, String acmer, String replyTime, String content) {
		this.replyTo = replyTo;
		this.acmer = acmer;
		this.replyTime = replyTime;
		this.content = content;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getReplyTo() {
		return this.replyTo;
	}

	public void setReplyTo(Integer replyTo) {
		this.replyTo = replyTo;
	}

	public String getAcmer() {
		return this.acmer;
	}

	public void setAcmer(String acmer) {
		this.acmer = acmer;
	}

	public String getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}