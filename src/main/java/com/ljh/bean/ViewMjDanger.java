package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewMjDanger implements Serializable {

    private static final long serialVersionUID=1L;

    private String token;

    private String roomid;

    private String roomname;

    private String bedno;

    private String cardNo;

    private String name;

    private String contect;

    private LocalDateTime sendtime;

    private String smsType;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getBedno() {
        return bedno;
    }

    public void setBedno(String bedno) {
        this.bedno = bedno;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContect() {
        return contect;
    }

    public void setContect(String contect) {
        this.contect = contect;
    }

    public LocalDateTime getSendtime() {
        return sendtime;
    }

    public void setSendtime(LocalDateTime sendtime) {
        this.sendtime = sendtime;
    }

    public String getSmsType() {
        return smsType;
    }

    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    @Override
    public String toString() {
        return "ViewMjDanger{" +
        "token=" + token +
        ", roomid=" + roomid +
        ", roomname=" + roomname +
        ", bedno=" + bedno +
        ", cardNo=" + cardNo +
        ", name=" + name +
        ", contect=" + contect +
        ", sendtime=" + sendtime +
        ", smsType=" + smsType +
        "}";
    }
}
