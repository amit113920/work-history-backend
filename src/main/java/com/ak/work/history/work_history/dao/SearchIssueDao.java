package com.ak.work.history.work_history.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ak.work.history.work_history.dto.IssueDetailsDto;
import com.ak.work.history.work_history.mapper.IssueDetailMapper;
import com.ak.work.history.work_history.repo.SaveSolutionRepo;
@Component
public class SearchIssueDao {
	
	@Autowired
	private SaveSolutionRepo saveSolutionRepo;
	
	public List<IssueDetailsDto> searchIssue(String request) {
		System.out.println("dao call for search==========");

		return saveSolutionRepo.findByIssueContaining(request).stream().map(req-> IssueDetailMapper.solutionsEntityToDto(req)).toList();
		
		 
		
	}

}
