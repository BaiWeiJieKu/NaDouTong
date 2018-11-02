package com.ndt.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Carinfo {
    private Integer id;

    private String numberplate;

    private String platetype;

    private String platecolor;

    private String cartype;

    private Double carlength;

    private Double fullload;

    private Double maxload;

    private String roadtransportcertificate;

    private String businessname;

    private String businesstel;

    private String businesslicense;

    private String brandmodel;

    private Date createtime;

    private String drivinglicensepath;

    private String operatinglicencepath;

    private Integer cid;

    private String mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate == null ? null : numberplate.trim();
    }

    public String getPlatetype() {
        return platetype;
    }

    public void setPlatetype(String platetype) {
        this.platetype = platetype == null ? null : platetype.trim();
    }

    public String getPlatecolor() {
        return platecolor;
    }

    public void setPlatecolor(String platecolor) {
        this.platecolor = platecolor == null ? null : platecolor.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public Double getCarlength() {
        return carlength;
    }

    public void setCarlength(Double carlength) {
        this.carlength = carlength;
    }

    public Double getFullload() {
        return fullload;
    }

    public void setFullload(Double fullload) {
        this.fullload = fullload;
    }

    public Double getMaxload() {
        return maxload;
    }

    public void setMaxload(Double maxload) {
        this.maxload = maxload;
    }

    public String getRoadtransportcertificate() {
        return roadtransportcertificate;
    }

    public void setRoadtransportcertificate(String roadtransportcertificate) {
        this.roadtransportcertificate = roadtransportcertificate == null ? null : roadtransportcertificate.trim();
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname == null ? null : businessname.trim();
    }

    public String getBusinesstel() {
        return businesstel;
    }

    public void setBusinesstel(String businesstel) {
        this.businesstel = businesstel == null ? null : businesstel.trim();
    }

    public String getBusinesslicense() {
        return businesslicense;
    }

    public void setBusinesslicense(String businesslicense) {
        this.businesslicense = businesslicense == null ? null : businesslicense.trim();
    }

    public String getBrandmodel() {
        return brandmodel;
    }

    public void setBrandmodel(String brandmodel) {
        this.brandmodel = brandmodel == null ? null : brandmodel.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreatetime() {
        return createtime;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDrivinglicensepath() {
        return drivinglicensepath;
    }

    public void setDrivinglicensepath(String drivinglicensepath) {
        this.drivinglicensepath = drivinglicensepath == null ? null : drivinglicensepath.trim();
    }

    public String getOperatinglicencepath() {
        return operatinglicencepath;
    }

    public void setOperatinglicencepath(String operatinglicencepath) {
        this.operatinglicencepath = operatinglicencepath == null ? null : operatinglicencepath.trim();
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
}