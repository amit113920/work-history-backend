package com.ak.work.history.work_history.service;

import java.util.List;

import com.ak.work.history.work_history.dto.IssueDetailsDto;
import com.ak.work.history.work_history.entity.SolutionsEntity;

public interface SearchIssueService {

	public List<IssueDetailsDto> searchIssue(String request);
	
}
