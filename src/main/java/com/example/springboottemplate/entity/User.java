package com.example.springboottemplate.entity;


import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

public class User implements Serializable {


    @Schema(description = "用户id")
    private Integer id;
    @Schema(description = "姓名")
    private String username;
    @Schema(description = "角色id")
    private Integer roleId;
    @Schema(description = "邮箱")
    private String mail;
    @Schema(description = "手机号")
    private String phone;

    public User() {
    }

    public User(Integer id, String username, Integer roleId, String mail, String phone) {
        this.id = id;
        this.username = username;
        this.roleId = roleId;
        this.mail = mail;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
