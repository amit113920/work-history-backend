package com.ak.work.history.work_history.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ak.work.history.work_history.dto.DeleteIssueRequest;
import com.ak.work.history.work_history.repo.SaveSolutionRepo;
@Component
public class DeleteIssueDao {
	@Autowired
	private SaveSolutionRepo saveSolutionRepo;
	
	public String deleteIssue(DeleteIssueRequest req) {
		
		saveSolutionRepo.deleteById(req.getId());
		return "deleted";
	}
}
