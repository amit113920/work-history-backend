package com.ak.work.history.work_history.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ak.work.history.work_history.dto.ApiResponse;
import com.ak.work.history.work_history.dto.SaveSolutionRequest;
import com.ak.work.history.work_history.service.TextSaverService;

@RestController
public class TextSaverApi {
	@Autowired
	private TextSaverService saverService;
	
	@PostMapping("/saveSolution")
	@CrossOrigin(origins = "*")
	public ResponseEntity<ApiResponse> saveSolution(@RequestBody SaveSolutionRequest request){
		
		
		ApiResponse apiResponse=new ApiResponse();
		apiResponse.setData(saverService.saveSolution(request));
		//saverService.saveSolution(request);
		ResponseEntity<ApiResponse> response=ResponseEntity.ok(apiResponse);
		
		return response;
	}

}
