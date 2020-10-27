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
public class ViewRegInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientid;

    private String name;

    private String sex;

    private LocalDateTime birthday;

    private String documentno;

    private String identity;

    private String chargetype;

    private String nation;

    private String contactperson;

    private String contactphone;

    private String address;

    private LocalDateTime visitdate;

    private String visitno;

    private String cliniclabel;

    private String registerno;

    private LocalDateTime registertime;

    private String registerdeptcode;

    private String registerdept;

    private Integer servialno;

    private String registeroperator;


    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getDocumentno() {
        return documentno;
    }

    public void setDocumentno(String documentno) {
        this.documentno = documentno;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getChargetype() {
        return chargetype;
    }

    public void setChargetype(String chargetype) {
        this.chargetype = chargetype;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getVisitdate() {
        return visitdate;
    }

    public void setVisitdate(LocalDateTime visitdate) {
        this.visitdate = visitdate;
    }

    public String getVisitno() {
        return visitno;
    }

    public void setVisitno(String visitno) {
        this.visitno = visitno;
    }

    public String getCliniclabel() {
        return cliniclabel;
    }

    public void setCliniclabel(String cliniclabel) {
        this.cliniclabel = cliniclabel;
    }

    public String getRegisterno() {
        return registerno;
    }

    public void setRegisterno(String registerno) {
        this.registerno = registerno;
    }

    public LocalDateTime getRegistertime() {
        return registertime;
    }

    public void setRegistertime(LocalDateTime registertime) {
        this.registertime = registertime;
    }

    public String getRegisterdeptcode() {
        return registerdeptcode;
    }

    public void setRegisterdeptcode(String registerdeptcode) {
        this.registerdeptcode = registerdeptcode;
    }

    public String getRegisterdept() {
        return registerdept;
    }

    public void setRegisterdept(String registerdept) {
        this.registerdept = registerdept;
    }

    public Integer getServialno() {
        return servialno;
    }

    public void setServialno(Integer servialno) {
        this.servialno = servialno;
    }

    public String getRegisteroperator() {
        return registeroperator;
    }

    public void setRegisteroperator(String registeroperator) {
        this.registeroperator = registeroperator;
    }

    @Override
    public String toString() {
        return "ViewRegInfo{" +
        "patientid=" + patientid +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", documentno=" + documentno +
        ", identity=" + identity +
        ", chargetype=" + chargetype +
        ", nation=" + nation +
        ", contactperson=" + contactperson +
        ", contactphone=" + contactphone +
        ", address=" + address +
        ", visitdate=" + visitdate +
        ", visitno=" + visitno +
        ", cliniclabel=" + cliniclabel +
        ", registerno=" + registerno +
        ", registertime=" + registertime +
        ", registerdeptcode=" + registerdeptcode +
        ", registerdept=" + registerdept +
        ", servialno=" + servialno +
        ", registeroperator=" + registeroperator +
        "}";
    }
}
