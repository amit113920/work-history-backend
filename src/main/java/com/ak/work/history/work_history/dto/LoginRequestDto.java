package com.ak.work.history.work_history.dto;

public class LoginRequestDto {
    protected String userId;
    protected String password;

    public LoginRequestDto(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public LoginRequestDto() {
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
