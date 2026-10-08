package com.ak.work.history.work_history.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.work.history.work_history.dao.UpdateIssueDao;
import com.ak.work.history.work_history.dto.UpdateIssueRequest;
import com.ak.work.history.work_history.service.UpdateIssueService;
@Service
public class UpdateIssueServiceImpl implements UpdateIssueService{
@Autowired
private UpdateIssueDao issueDao;
	@Override
	public String updateIssue(UpdateIssueRequest request) {
		// TODO Auto-generated method stub
		return issueDao.updateIssue(request);
	}

}
