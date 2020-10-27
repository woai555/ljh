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
public class ViewPatinfoType implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardid;

    private LocalDateTime indate;

    private LocalDateTime intime;

    private LocalDateTime bedIntime;

    private String inpatientno;

    private String patientid;

    private Integer sex;

    private LocalDateTime birthday;

    private String linkmanphone;

    private String idcardno;

    private String address;


    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public LocalDateTime getIndate() {
        return indate;
    }

    public void setIndate(LocalDateTime indate) {
        this.indate = indate;
    }

    public LocalDateTime getIntime() {
        return intime;
    }

    public void setIntime(LocalDateTime intime) {
        this.intime = intime;
    }

    public LocalDateTime getBedIntime() {
        return bedIntime;
    }

    public void setBedIntime(LocalDateTime bedIntime) {
        this.bedIntime = bedIntime;
    }

    public String getInpatientno() {
        return inpatientno;
    }

    public void setInpatientno(String inpatientno) {
        this.inpatientno = inpatientno;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getLinkmanphone() {
        return linkmanphone;
    }

    public void setLinkmanphone(String linkmanphone) {
        this.linkmanphone = linkmanphone;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ViewPatinfoType{" +
        "cardid=" + cardid +
        ", indate=" + indate +
        ", intime=" + intime +
        ", bedIntime=" + bedIntime +
        ", inpatientno=" + inpatientno +
        ", patientid=" + patientid +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", linkmanphone=" + linkmanphone +
        ", idcardno=" + idcardno +
        ", address=" + address +
        "}";
    }
}
