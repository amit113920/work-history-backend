package com.ak.work.history.work_history.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IssueDetailsDto {

    private String id;
	private String issue;
	private String solution;
}
