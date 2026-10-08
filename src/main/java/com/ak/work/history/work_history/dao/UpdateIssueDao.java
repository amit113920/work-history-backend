package com.ak.work.history.work_history.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ak.work.history.work_history.dto.UpdateIssueRequest;
import com.ak.work.history.work_history.mapper.UpdateIssueMapper;
import com.ak.work.history.work_history.repo.SaveSolutionRepo;
@Component
public class UpdateIssueDao {
	@Autowired
	private SaveSolutionRepo saveSolutionRepo;
	
	public String updateIssue(UpdateIssueRequest request) {
		
		saveSolutionRepo.save(UpdateIssueMapper.updateIssueDtoToEntity(request));
	return "updated";
	}
}
