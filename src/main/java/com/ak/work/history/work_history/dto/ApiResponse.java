package com.ak.work.history.work_history.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse {
	private int code;
	private String status;
	private String desc;
	private Object data;
}
