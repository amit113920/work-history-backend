package com.ak.work.history.work_history.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ak.work.history.work_history.dto.SaveSolutionRequest;
import com.ak.work.history.work_history.mapper.SaveSolutionMapper;
import com.ak.work.history.work_history.repo.SaveSolutionRepo;
@Component
public class TextSaverDao {
	@Autowired
	private SaveSolutionRepo saveSolutionRepo;
	
	
	public String saveSolution(SaveSolutionRequest request){
		
		
		saveSolutionRepo.save(SaveSolutionMapper.SolutionsDtoToEntity(request));
		
		return "successfully added";
	}

}
