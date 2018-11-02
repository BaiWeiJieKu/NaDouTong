package com.ndt.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Logininfo {
    private Integer id;

    private String username;

    private String password;

    private String disablelogin;

    private String isreview;

    private Date createtime;

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
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDisablelogin() {
        return disablelogin;
    }

    public void setDisablelogin(String disablelogin) {
        this.disablelogin = disablelogin == null ? null : disablelogin.trim();
    }

    public String getIsreview() {
        return isreview;
    }

    public void setIsreview(String isreview) {
        this.isreview = isreview == null ? null : isreview.trim();
    }
    
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}