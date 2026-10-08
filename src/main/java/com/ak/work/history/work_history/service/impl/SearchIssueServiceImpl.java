package com.ak.work.history.work_history.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.work.history.work_history.dao.SearchIssueDao;
import com.ak.work.history.work_history.dto.IssueDetailsDto;
import com.ak.work.history.work_history.entity.SolutionsEntity;
import com.ak.work.history.work_history.repo.SaveSolutionRepo;
import com.ak.work.history.work_history.service.SearchIssueService;
@Service
public class SearchIssueServiceImpl implements SearchIssueService{
@Autowired
	private SearchIssueDao searchIssueDao;
	@Override
	public List<IssueDetailsDto> searchIssue(String request) {
		// TODO Auto-generated method stub
		return  searchIssueDao.searchIssue(request);
	}

}
