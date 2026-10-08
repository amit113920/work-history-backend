package com.ak.work.history.work_history.mapper;

import com.ak.work.history.work_history.dto.IssueDetailsDto;
import com.ak.work.history.work_history.entity.SolutionsEntity;

public class IssueDetailMapper {
	
	public static IssueDetailsDto solutionsEntityToDto(SolutionsEntity entity) {
		
		return new IssueDetailsDto(entity.getId(), entity.getIssue(), entity.getSolution());
	}
	
}
