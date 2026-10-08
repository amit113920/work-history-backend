package com.ak.work.history.work_history.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ak.work.history.work_history.dto.ApiResponse;
import com.ak.work.history.work_history.dto.DeleteIssueRequest;
import com.ak.work.history.work_history.service.DeleteIssueService;

import jakarta.websocket.server.PathParam;
@RestController
public class DeleteSolutionApi {
	@Autowired
	private DeleteIssueService deleteIssueService;
	
	
	@DeleteMapping("/deleteIssue/{id}")
	@CrossOrigin(origins = "*")
	public ResponseEntity<ApiResponse> deleteIssue(@PathParam("id") DeleteIssueRequest request){

		ApiResponse apiResponse=new ApiResponse();
		apiResponse.setData(deleteIssueService.deleteIssue(request));
		//deleteIssueService.deleteIssue(request);
		ResponseEntity<ApiResponse> response=ResponseEntity.ok(apiResponse);
		
		return response;
		
	}
}
