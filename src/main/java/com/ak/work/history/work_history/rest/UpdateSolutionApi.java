package com.ak.work.history.work_history.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ak.work.history.work_history.dto.ApiResponse;
import com.ak.work.history.work_history.dto.UpdateIssueRequest;
import com.ak.work.history.work_history.service.UpdateIssueService;
@RestController
public class UpdateSolutionApi {
	@Autowired
	private UpdateIssueService issueService;
	@PutMapping("/updateIssue")
	@CrossOrigin(origins = "*")
	public ResponseEntity<ApiResponse> updateIssue(@RequestBody UpdateIssueRequest request){

		ApiResponse apiResponse=new ApiResponse();
		apiResponse.setData(issueService.updateIssue(request));
		//issueService.updateIssue(request);
		ResponseEntity<ApiResponse> response=ResponseEntity.ok(apiResponse);
		
		return response;
		
	}
}
