package org.model;

/**
 * Discuss entity. @author MyEclipse Persistence Tools
 */

public class Discuss implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String title;
	private String content;
	private String acmer;
	private String disTime;
	private Integer problemId;

	// Constructors

	/** default constructor */
	public Discuss() {
	}

	/** minimal constructor */
	public Discuss(String title) {
		this.title = title;
	}

	/** full constructor */
	public Discuss(String title, String content, String acmer, String disTime,
			Integer problemId) {
		this.title = title;
		this.content = content;
		this.acmer = acmer;
		this.disTime = disTime;
		this.problemId = problemId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAcmer() {
		return this.acmer;
	}

	public void setAcmer(String acmer) {
		this.acmer = acmer;
	}

	public String getDisTime() {
		return this.disTime;
	}

	public void setDisTime(String disTime) {
		this.disTime = disTime;
	}

	public Integer getProblemId() {
		return this.problemId;
	}

	public void setProblemId(Integer problemId) {
		this.problemId = problemId;
	}

}