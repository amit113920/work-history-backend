package com.ak.work.history.work_history.dto;

public class DeleteIssueRequest {
	private String id;
	
	
	
	
	public DeleteIssueRequest() {
		super();
	}
	public DeleteIssueRequest(String id) {
		super();
		this.id = id;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
