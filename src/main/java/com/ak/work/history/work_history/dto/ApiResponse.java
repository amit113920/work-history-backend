package com.ak.work.history.work_history.dto;

public class ApiResponse {

	private int code;
	private String status;
	private String desc;
	private Object data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public ApiResponse(int code, String status, String desc, Object data) {
		super();
		this.code = code;
		this.status = status;
		this.desc = desc;
		this.data = data;
	}
	public ApiResponse() {
		super();
	}
	
	
}
