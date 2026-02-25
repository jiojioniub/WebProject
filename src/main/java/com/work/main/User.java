package com.work.main;

import java.util.Objects;

public class User {

    private Integer user_id;
    private Integer user_code;
    private String user_username;
    private String user_password;
    private String user_headPortrait;
    private Integer user_status;
    private String user_identity;

    public User() {
    }

    public User(Integer user_code, String user_username, String user_password, String user_headPortrait, Integer user_status, String user_identity) {
        this.user_code = user_code;
        this.user_username = user_username;
        this.user_password = user_password;
        this.user_headPortrait = user_headPortrait;
        this.user_status = user_status;
        this.user_identity = user_identity;
    }

    public User(Integer user_id, Integer user_code, String user_username, String user_password, String user_headPortrait, Integer user_status, String user_identity) {
        this.user_id = user_id;
        this.user_code = user_code;
        this.user_username = user_username;
        this.user_password = user_password;
        this.user_headPortrait = user_headPortrait;
        this.user_status = user_status;
        this.user_identity = user_identity;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getUser_code() {
        return user_code;
    }

    public void setUser_code(Integer user_code) {
        this.user_code = user_code;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_headPortrait() {
        return user_headPortrait;
    }

    public void setUser_headPortrait(String user_headPortrait) {
        this.user_headPortrait = user_headPortrait;
    }

    public Integer getUser_status() {
        return user_status;
    }

    public void setUser_status(Integer user_status) {
        this.user_status = user_status;
    }

    public String getUser_identity() {
        return user_identity;
    }

    public void setUser_identity(String user_identity) {
        this.user_identity = user_identity;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_code=" + user_code +
                ", user_username='" + user_username + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_headPortrait='" + user_headPortrait + '\'' +
                ", user_status='" + user_status + '\'' +
                ", user_identity='" + user_identity + '\'' +
                '}';
    }
}
