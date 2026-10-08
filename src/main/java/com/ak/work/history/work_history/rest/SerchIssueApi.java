package com.ak.work.history.work_history.rest;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ak.work.history.work_history.dto.ApiResponse;
import com.ak.work.history.work_history.dto.SearchIssueRequestDto;
import com.ak.work.history.work_history.service.SearchIssueService;
import com.ak.work.history.work_history.service.TextSaverService;

@RestController
public class SerchIssueApi {
	@Autowired
	private SearchIssueService searchIssueService;
	
	@GetMapping("/searchIssue")
	@CrossOrigin(origins = "*")
	public ResponseEntity<ApiResponse>  searchIssue(@Param("issue") SearchIssueRequestDto request){
		ApiResponse apiResponse=new ApiResponse();
		apiResponse.setData(searchIssueService.searchIssue(request.getIssue()));
		//searchIssueService.searchIssue(request.getIssue());
		ResponseEntity<ApiResponse> response=ResponseEntity.ok(apiResponse);
		
		return response;
	}

}
