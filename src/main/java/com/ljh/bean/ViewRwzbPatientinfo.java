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
public class ViewRwzbPatientinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String status;

    private String cardid;

    private String name;

    private LocalDateTime orderdate;

    private String sex;

    private Integer age;

    private String roomname;

    private String address;

    private String idcardno;

    private String hamilyphone;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(LocalDateTime orderdate) {
        this.orderdate = orderdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getHamilyphone() {
        return hamilyphone;
    }

    public void setHamilyphone(String hamilyphone) {
        this.hamilyphone = hamilyphone;
    }

    @Override
    public String toString() {
        return "ViewRwzbPatientinfo{" +
        "status=" + status +
        ", cardid=" + cardid +
        ", name=" + name +
        ", orderdate=" + orderdate +
        ", sex=" + sex +
        ", age=" + age +
        ", roomname=" + roomname +
        ", address=" + address +
        ", idcardno=" + idcardno +
        ", hamilyphone=" + hamilyphone +
        "}";
    }
}
