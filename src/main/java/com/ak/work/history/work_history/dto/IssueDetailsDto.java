package com.ak.work.history.work_history.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IssueDetailsDto implements Serializable {

    private String id;
	private String issue;
	private String solution;
}
