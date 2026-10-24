package com.ak.work.history.work_history.entity;

import jakarta.persistence.*;

@Entity
public class SolutionsEntity {
	
	@GeneratedValue(strategy = GenerationType.UUID)
	@Id
	private String id;
	@Lob
	private String issue;
	@Lob
	private String solution;
	
	
	
	public SolutionsEntity() {
		super();
	}
	public SolutionsEntity(String id, String issue, String solution) {
		super();
		this.id = id;
		this.issue = issue;
		this.solution = solution;
	}
	
	
	
	public SolutionsEntity(String issue, String solution) {
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
