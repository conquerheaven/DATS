package org.model;

/**
 * Problem entity. @author MyEclipse Persistence Tools
 */

public class Problem implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer problemId;
	private String oj;
	private String problemTitle;
	private String knowledgePoint;
	private Integer year;
	private Integer ac;

	// Constructors

	/** default constructor */
	public Problem() {
	}

	/** minimal constructor */
	public Problem(Integer problemId, String oj) {
		this.problemId = problemId;
		this.oj = oj;
	}

	/** full constructor */
	public Problem(Integer problemId, String oj, String problemTitle,
			String knowledgePoint, Integer year, Integer ac) {
		this.problemId = problemId;
		this.oj = oj;
		this.problemTitle = problemTitle;
		this.knowledgePoint = knowledgePoint;
		this.year = year;
		this.ac = ac;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProblemId() {
		return this.problemId;
	}

	public void setProblemId(Integer problemId) {
		this.problemId = problemId;
	}

	public String getOj() {
		return this.oj;
	}

	public void setOj(String oj) {
		this.oj = oj;
	}

	public String getProblemTitle() {
		return this.problemTitle;
	}

	public void setProblemTitle(String problemTitle) {
		this.problemTitle = problemTitle;
	}

	public String getKnowledgePoint() {
		return this.knowledgePoint;
	}

	public void setKnowledgePoint(String knowledgePoint) {
		this.knowledgePoint = knowledgePoint;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getAc() {
		return this.ac;
	}

	public void setAc(Integer ac) {
		this.ac = ac;
	}

}