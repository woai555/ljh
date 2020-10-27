package com.ljh.bean;

import java.math.BigDecimal;
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
public class ViewEmPatientNew implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String inpNo;

    private String name;

    private String namePhonetic;

    private String sex;

    private LocalDateTime dateOfBirth;

    private String birthPlace;

    private String citizenship;

    private String nation;

    private String idNo;

    private String identity;

    private String chargeType;

    private String unitInContract;

    private String mailingAddress;

    private String zipCode;

    private String phoneNumberHome;

    private String phoneNumberBusiness;

    private String nextOfKin;

    private String relationship;

    private String nextOfKinAddr;

    private String nextOfKinZipCode;

    private String nextOfKinPhone;

    private LocalDateTime lastVisitDate;

    private BigDecimal vipIndicator;

    private LocalDateTime createDate;

    private String operator;


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

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
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

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getUnitInContract() {
        return unitInContract;
    }

    public void setUnitInContract(String unitInContract) {
        this.unitInContract = unitInContract;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumberHome() {
        return phoneNumberHome;
    }

    public void setPhoneNumberHome(String phoneNumberHome) {
        this.phoneNumberHome = phoneNumberHome;
    }

    public String getPhoneNumberBusiness() {
        return phoneNumberBusiness;
    }

    public void setPhoneNumberBusiness(String phoneNumberBusiness) {
        this.phoneNumberBusiness = phoneNumberBusiness;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
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

    public LocalDateTime getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(LocalDateTime lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public BigDecimal getVipIndicator() {
        return vipIndicator;
    }

    public void setVipIndicator(BigDecimal vipIndicator) {
        this.vipIndicator = vipIndicator;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "ViewEmPatientNew{" +
        "patientId=" + patientId +
        ", inpNo=" + inpNo +
        ", name=" + name +
        ", namePhonetic=" + namePhonetic +
        ", sex=" + sex +
        ", dateOfBirth=" + dateOfBirth +
        ", birthPlace=" + birthPlace +
        ", citizenship=" + citizenship +
        ", nation=" + nation +
        ", idNo=" + idNo +
        ", identity=" + identity +
        ", chargeType=" + chargeType +
        ", unitInContract=" + unitInContract +
        ", mailingAddress=" + mailingAddress +
        ", zipCode=" + zipCode +
        ", phoneNumberHome=" + phoneNumberHome +
        ", phoneNumberBusiness=" + phoneNumberBusiness +
        ", nextOfKin=" + nextOfKin +
        ", relationship=" + relationship +
        ", nextOfKinAddr=" + nextOfKinAddr +
        ", nextOfKinZipCode=" + nextOfKinZipCode +
        ", nextOfKinPhone=" + nextOfKinPhone +
        ", lastVisitDate=" + lastVisitDate +
        ", vipIndicator=" + vipIndicator +
        ", createDate=" + createDate +
        ", operator=" + operator +
        "}";
    }
}
