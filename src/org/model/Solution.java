package org.model;



/**
 * Solution entity. @author MyEclipse Persistence Tools
 */

public class Solution  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer solutionId;
     private Integer problemId;
     private String result;
     private String memory;
     private String runTime;
     private String language;
     private String codeLength;
     private String subTime;
     private String oj;
     private String code;
     private String subuser;
     private String locTime;


    // Constructors

    /** default constructor */
    public Solution() {
    }

	/** minimal constructor */
    public Solution(Integer problemId) {
        this.problemId = problemId;
    }
    
    /** full constructor */
    public Solution(Integer problemId, String result, String memory, String runTime, String language, String codeLength, String subTime, String oj, String code, String subuser, String locTime) {
        this.problemId = problemId;
        this.result = result;
        this.memory = memory;
        this.runTime = runTime;
        this.language = language;
        this.codeLength = codeLength;
        this.subTime = subTime;
        this.oj = oj;
        this.code = code;
        this.subuser = subuser;
        this.locTime = locTime;
    }

   
    // Property accessors

    public Integer getSolutionId() {
        return this.solutionId;
    }
    
    public void setSolutionId(Integer solutionId) {
        this.solutionId = solutionId;
    }

    public Integer getProblemId() {
        return this.problemId;
    }
    
    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }

    public String getMemory() {
        return this.memory;
    }
    
    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getRunTime() {
        return this.runTime;
    }
    
    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCodeLength() {
        return this.codeLength;
    }
    
    public void setCodeLength(String codeLength) {
        this.codeLength = codeLength;
    }

    public String getSubTime() {
        return this.subTime;
    }
    
    public void setSubTime(String subTime) {
        this.subTime = subTime;
    }

    public String getOj() {
        return this.oj;
    }
    
    public void setOj(String oj) {
        this.oj = oj;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getSubuser() {
        return this.subuser;
    }
    
    public void setSubuser(String subuser) {
        this.subuser = subuser;
    }

    public String getLocTime() {
        return this.locTime;
    }
    
    public void setLocTime(String locTime) {
        this.locTime = locTime;
    }
   








}