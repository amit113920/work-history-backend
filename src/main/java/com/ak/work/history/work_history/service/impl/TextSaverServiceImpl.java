package com.ak.work.history.work_history.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.work.history.work_history.dao.TextSaverDao;
import com.ak.work.history.work_history.dto.SaveSolutionRequest;
import com.ak.work.history.work_history.service.TextSaverService;
@Service
public class TextSaverServiceImpl implements TextSaverService{
	@Autowired
	private TextSaverDao saverDao; 

	@Override
	public String saveSolution(SaveSolutionRequest request) {
		// TODO Auto-generated method stub
		return saverDao.saveSolution(request);
	}
	
	

}
