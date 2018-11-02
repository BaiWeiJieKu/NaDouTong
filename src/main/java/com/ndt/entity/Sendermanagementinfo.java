package com.ndt.entity;

import java.util.Date;

public class Sendermanagementinfo {
    private Integer id;

    private String ordernumber;

    private Double ordermoney;

    private String numberplate;

    private String orderdriver;

    private String oncetraffic;

    private String singlenumber;

    private String waybillstate;

    private String totaltraffic;

    private Date btime;

    private Date etime;

    private String location;

    private String transport;

    private String operating;

    private String mark;

    private Date createtime;

    private Integer oid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }

    public Double getOrdermoney() {
        return ordermoney;
    }

    public void setOrdermoney(Double ordermoney) {
        this.ordermoney = ordermoney;
    }

    public String getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate == null ? null : numberplate.trim();
    }

    public String getOrderdriver() {
        return orderdriver;
    }

    public void setOrderdriver(String orderdriver) {
        this.orderdriver = orderdriver == null ? null : orderdriver.trim();
    }

    public String getOncetraffic() {
        return oncetraffic;
    }

    public void setOncetraffic(String oncetraffic) {
        this.oncetraffic = oncetraffic == null ? null : oncetraffic.trim();
    }

    public String getSinglenumber() {
        return singlenumber;
    }

    public void setSinglenumber(String singlenumber) {
        this.singlenumber = singlenumber == null ? null : singlenumber.trim();
    }

    public String getWaybillstate() {
        return waybillstate;
    }

    public void setWaybillstate(String waybillstate) {
        this.waybillstate = waybillstate == null ? null : waybillstate.trim();
    }

    public String getTotaltraffic() {
        return totaltraffic;
    }

    public void setTotaltraffic(String totaltraffic) {
        this.totaltraffic = totaltraffic == null ? null : totaltraffic.trim();
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport == null ? null : transport.trim();
    }

    public String getOperating() {
        return operating;
    }

    public void setOperating(String operating) {
        this.operating = operating == null ? null : operating.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}