package com.ak.work.history.work_history.mapper;

import com.ak.work.history.work_history.dto.SaveSolutionRequest;
import com.ak.work.history.work_history.entity.SolutionsEntity;

public class SaveSolutionMapper {
	
	public static SaveSolutionRequest SolutionsEntityToDto(SolutionsEntity entity) {
		
		
		return new SaveSolutionRequest(entity.getIssue(), entity.getSolution());
	}
	
public static SolutionsEntity SolutionsDtoToEntity(SaveSolutionRequest dto) {
		
		
		return new SolutionsEntity(dto.getIssue(), dto.getSolution());
	}

}
