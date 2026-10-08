package com.ak.work.history.work_history.dto;

public class IssueDetailsDto {

    private String id;
	private String issue;
	private String solution;
	
	
	
	public IssueDetailsDto() {
		super();
	}
	
	public IssueDetailsDto(String id, String issue, String solution) {
		super();
		this.id = id;
		this.issue = issue;
		this.solution = solution;
	}

	public IssueDetailsDto(String issue, String solution) {
		super();
		this.issue = issue;
		this.solution = solution;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
