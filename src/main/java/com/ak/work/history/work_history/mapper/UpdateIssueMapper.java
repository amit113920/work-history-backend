package com.ak.work.history.work_history.mapper;

import com.ak.work.history.work_history.dto.UpdateIssueRequest;
import com.ak.work.history.work_history.entity.SolutionsEntity;

public class UpdateIssueMapper {
	
	public static SolutionsEntity updateIssueDtoToEntity(UpdateIssueRequest dto) {
		
		return new SolutionsEntity(dto.getId(), dto.getIssue(), dto.getSolution());
	}

}
