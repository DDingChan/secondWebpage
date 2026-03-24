package com.example.webTest.Controller;

public class MemberForm {
    private String userId;
    private String password;
    private String name;
    private String email;
    private String telNum;
    private String digitNum;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getDigitNum() {
        return digitNum;
    }

    public void setDigitNum(String digitNum) {
        this.digitNum = digitNum;
    }
}
