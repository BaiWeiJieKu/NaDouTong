package com.ndt.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Captaininfo {
    private Integer id;

    private String captainname;

    private String fleetname;

    private String captaintel;

    private Date createtime;

    private String mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaptainname() {
        return captainname;
    }

    public void setCaptainname(String captainname) {
        this.captainname = captainname == null ? null : captainname.trim();
    }

    public String getFleetname() {
        return fleetname;
    }

    public void setFleetname(String fleetname) {
        this.fleetname = fleetname == null ? null : fleetname.trim();
    }

    public String getCaptaintel() {
        return captaintel;
    }

    public void setCaptaintel(String captaintel) {
        this.captaintel = captaintel == null ? null : captaintel.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}