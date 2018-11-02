package com.ndt.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Driverinfo {
    private Integer id;

    private String sex;

    private String realname;

    private String tel;

    private String idcard;

    private String address;

    private Date createtime;

    private String pcphoto;

    private String idcarda;

    private String idcardb;

    private String drivercard;

    private Integer cid;

    private String mark;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreatetime() {
        return createtime;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getPcphoto() {
        return pcphoto;
    }

    public void setPcphoto(String pcphoto) {
        this.pcphoto = pcphoto == null ? null : pcphoto.trim();
    }

    public String getIdcarda() {
        return idcarda;
    }

    public void setIdcarda(String idcarda) {
        this.idcarda = idcarda == null ? null : idcarda.trim();
    }

    public String getIdcardb() {
        return idcardb;
    }

    public void setIdcardb(String idcardb) {
        this.idcardb = idcardb == null ? null : idcardb.trim();
    }

    public String getDrivercard() {
        return drivercard;
    }

    public void setDrivercard(String drivercard) {
        this.drivercard = drivercard == null ? null : drivercard.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

	@Override
	public String toString() {
		return "Driverinfo [id=" + id + ", sex=" + sex + ", realname=" + realname + ", tel=" + tel + ", idcard="
				+ idcard + ", address=" + address + ", createtime=" + createtime + ", pcphoto=" + pcphoto + ", idcarda="
				+ idcarda + ", idcardb=" + idcardb + ", drivercard=" + drivercard + ", cid=" + cid + ", mark=" + mark
				+ ", state=" + state + "]";
	}
    
    
}