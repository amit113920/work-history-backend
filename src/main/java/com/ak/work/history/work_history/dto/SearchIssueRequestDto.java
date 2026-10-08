package com.ak.work.history.work_history.dto;

public class SearchIssueRequestDto {
private String issue;

public SearchIssueRequestDto(String issue) {
	super();
	this.issue = issue;
}

public SearchIssueRequestDto() {
	super();
}

public String getIssue() {
	return issue;
}

public void setIssue(String issue) {
	this.issue = issue;
}

}
