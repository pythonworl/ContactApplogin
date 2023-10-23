package com.example.contactapp.ui.model.request;

public class UserLoginRequestModel { //handeling the login request
    private String email;  //email as the username
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
