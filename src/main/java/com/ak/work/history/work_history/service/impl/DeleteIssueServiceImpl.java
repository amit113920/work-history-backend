package com.ak.work.history.work_history.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ak.work.history.work_history.dao.DeleteIssueDao;
import com.ak.work.history.work_history.dto.DeleteIssueRequest;
import com.ak.work.history.work_history.service.DeleteIssueService;
@Service
public class DeleteIssueServiceImpl implements DeleteIssueService{
@Autowired
	private DeleteIssueDao deleteIssueDao;
	
	@Override
	public String deleteIssue(DeleteIssueRequest id) {
		// TODO Auto-generated method stub
		return deleteIssueDao.deleteIssue(id);
	}

}
