package com.shivam.gharseekers.Models;

import android.net.Uri;

public class UserModel {
    private String userName;
    private String email;
    private String number;
    private String userId;
    private Uri imageURI;

    public UserModel() {
    }

    public UserModel(String userName, String email, Uri uri) {
        this.userName = userName;
        this.email = email;
        this.imageURI = uri;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
