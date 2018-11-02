package com.ndt.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Ordermanagementinfo {
    private Integer id;

    private String dispatchedparty;

    private String carrier;

    private String departure;

    private String destination;

    private String sendername;

    private String sendertel;

    private String receivername;

    private String receivertel;

    private String ordernumber;

    private Date ordercreatetime;

    private String totaltraffic;

    private String remain;

    private String volume;

    private String contractrote;

    private String gid;

    private String mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDispatchedparty() {
        return dispatchedparty;
    }

    public void setDispatchedparty(String dispatchedparty) {
        this.dispatchedparty = dispatchedparty == null ? null : dispatchedparty.trim();
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure == null ? null : departure.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getSendername() {
        return sendername;
    }

    public void setSendername(String sendername) {
        this.sendername = sendername == null ? null : sendername.trim();
    }

    public String getSendertel() {
        return sendertel;
    }

    public void setSendertel(String sendertel) {
        this.sendertel = sendertel == null ? null : sendertel.trim();
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername == null ? null : receivername.trim();
    }

    public String getReceivertel() {
        return receivertel;
    }

    public void setReceivertel(String receivertel) {
        this.receivertel = receivertel == null ? null : receivertel.trim();
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getOrdercreatetime() {
        return ordercreatetime;
    }
   
    public void setOrdercreatetime(Date ordercreatetime) {
        this.ordercreatetime = ordercreatetime;
    }

    public String getTotaltraffic() {
        return totaltraffic;
    }

    public void setTotaltraffic(String totaltraffic) {
        this.totaltraffic = totaltraffic == null ? null : totaltraffic.trim();
    }

    public String getRemain() {
        return remain;
    }

    public void setRemain(String remain) {
        this.remain = remain == null ? null : remain.trim();
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume == null ? null : volume.trim();
    }

    public String getContractrote() {
        return contractrote;
    }

    public void setContractrote(String contractrote) {
        this.contractrote = contractrote == null ? null : contractrote.trim();
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

	@Override
	public String toString() {
		return "Ordermanagementinfo [id=" + id + ", dispatchedparty=" + dispatchedparty + ", carrier=" + carrier
				+ ", departure=" + departure + ", destination=" + destination + ", sendername=" + sendername
				+ ", sendertel=" + sendertel + ", receivername=" + receivername + ", receivertel=" + receivertel
				+ ", ordernumber=" + ordernumber + ", ordercreatetime=" + ordercreatetime + ", totaltraffic="
				+ totaltraffic + ", remain=" + remain + ", volume=" + volume + ", contractrote=" + contractrote
				+ ", gid=" + gid + ", mark=" + mark + "]";
	}
    
}