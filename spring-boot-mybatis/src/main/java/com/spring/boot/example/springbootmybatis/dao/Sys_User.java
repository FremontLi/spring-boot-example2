package com.spring.boot.example.springbootmybatis.dao;

import java.sql.Timestamp;

public class Sys_User {
    private String id;
    private String nickname;
    private String phone;
    private String email;
    private String password;
    private String salt;
    private Timestamp gmt_create;
    private Timestamp gmt_update;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Timestamp getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Timestamp gmt_create) {
        this.gmt_create= gmt_create;
    }

    public Timestamp getGmt_update() {
        return gmt_update;
    }

    public void setGmt_update(Timestamp gmt_update) {
        this.gmt_update= gmt_update;
    }

}