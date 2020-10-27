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
public class ViewPatientinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientid;

    private String name;

    private String sex;

    private LocalDateTime birthday;

    private String documentno;

    private String chargetype;

    private String chargetypecode;

    private String nation;

    private String contactperson;

    private String contactphone;

    private String address;

    private String jytcard;

    private String mcardNo;


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

    public String getChargetype() {
        return chargetype;
    }

    public void setChargetype(String chargetype) {
        this.chargetype = chargetype;
    }

    public String getChargetypecode() {
        return chargetypecode;
    }

    public void setChargetypecode(String chargetypecode) {
        this.chargetypecode = chargetypecode;
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

    public String getJytcard() {
        return jytcard;
    }

    public void setJytcard(String jytcard) {
        this.jytcard = jytcard;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    @Override
    public String toString() {
        return "ViewPatientinfo{" +
        "patientid=" + patientid +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", documentno=" + documentno +
        ", chargetype=" + chargetype +
        ", chargetypecode=" + chargetypecode +
        ", nation=" + nation +
        ", contactperson=" + contactperson +
        ", contactphone=" + contactphone +
        ", address=" + address +
        ", jytcard=" + jytcard +
        ", mcardNo=" + mcardNo +
        "}";
    }
}
