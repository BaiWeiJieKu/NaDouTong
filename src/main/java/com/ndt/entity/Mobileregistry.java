package com.ndt.entity;

public class Mobileregistry {
    private Integer id;

    private String realname;

    private String tel;

    private String password;

    private String uploadstate;

    private String pcphoto;

    private String drivercard;

    private String idcarda;

    private String idcardb;

    private String drivinglicensepath;

    private String operatinglicencepath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUploadstate() {
        return uploadstate;
    }

    public void setUploadstate(String uploadstate) {
        this.uploadstate = uploadstate == null ? null : uploadstate.trim();
    }

    public String getPcphoto() {
        return pcphoto;
    }

    public void setPcphoto(String pcphoto) {
        this.pcphoto = pcphoto == null ? null : pcphoto.trim();
    }

    public String getDrivercard() {
        return drivercard;
    }

    public void setDrivercard(String drivercard) {
        this.drivercard = drivercard == null ? null : drivercard.trim();
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
}