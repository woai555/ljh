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
public class ViewEmPatient implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String inpNo;

    private String name;

    private String namePhonetic;

    private String sex;

    private LocalDateTime dateOfBirth;

    private String citizenship;

    private String birthPlace;

    private String nation;

    private String idNo;

    private String nextOfKin;

    private String nextOfKinAddr;

    private String nextOfKinZipCode;

    private String nextOfKinPhone;

    private String chargeType;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getInpNo() {
        return inpNo;
    }

    public void setInpNo(String inpNo) {
        this.inpNo = inpNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePhonetic() {
        return namePhonetic;
    }

    public void setNamePhonetic(String namePhonetic) {
        this.namePhonetic = namePhonetic;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getNextOfKinAddr() {
        return nextOfKinAddr;
    }

    public void setNextOfKinAddr(String nextOfKinAddr) {
        this.nextOfKinAddr = nextOfKinAddr;
    }

    public String getNextOfKinZipCode() {
        return nextOfKinZipCode;
    }

    public void setNextOfKinZipCode(String nextOfKinZipCode) {
        this.nextOfKinZipCode = nextOfKinZipCode;
    }

    public String getNextOfKinPhone() {
        return nextOfKinPhone;
    }

    public void setNextOfKinPhone(String nextOfKinPhone) {
        this.nextOfKinPhone = nextOfKinPhone;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    @Override
    public String toString() {
        return "ViewEmPatient{" +
        "patientId=" + patientId +
        ", inpNo=" + inpNo +
        ", name=" + name +
        ", namePhonetic=" + namePhonetic +
        ", sex=" + sex +
        ", dateOfBirth=" + dateOfBirth +
        ", citizenship=" + citizenship +
        ", birthPlace=" + birthPlace +
        ", nation=" + nation +
        ", idNo=" + idNo +
        ", nextOfKin=" + nextOfKin +
        ", nextOfKinAddr=" + nextOfKinAddr +
        ", nextOfKinZipCode=" + nextOfKinZipCode +
        ", nextOfKinPhone=" + nextOfKinPhone +
        ", chargeType=" + chargeType +
        "}";
    }
}
