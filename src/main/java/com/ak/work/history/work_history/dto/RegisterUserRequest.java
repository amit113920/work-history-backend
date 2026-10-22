package com.ak.work.history.work_history.dto;

public class RegisterUserRequest {
    protected String userName;
    protected String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RegisterUserRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public RegisterUserRequest() {
    }
}
