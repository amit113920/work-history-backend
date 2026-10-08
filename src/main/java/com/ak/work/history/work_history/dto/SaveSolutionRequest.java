package com.ak.work.history.work_history.dto;

public class SaveSolutionRequest {
	private String issue;
	private String solution;
	
	
	
	public SaveSolutionRequest() {
		super();
	}
	public SaveSolutionRequest(String issue, String solution) {
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
	
}
