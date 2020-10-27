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
public class ViewHzyhPatientinfo2 implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String patientName;

    private String identityNo;

    private String cardNo;

    private String sex;

    private LocalDateTime bob;

    private String phoneNo;

    private String familyAddress;

    private String company;

    private String contactAddress;

    private String patientType;

    private String insurance;

    private String remark;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBob() {
        return bob;
    }

    public void setBob(LocalDateTime bob) {
        this.bob = bob;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ViewHzyhPatientinfo2{" +
        "patientId=" + patientId +
        ", patientName=" + patientName +
        ", identityNo=" + identityNo +
        ", cardNo=" + cardNo +
        ", sex=" + sex +
        ", bob=" + bob +
        ", phoneNo=" + phoneNo +
        ", familyAddress=" + familyAddress +
        ", company=" + company +
        ", contactAddress=" + contactAddress +
        ", patientType=" + patientType +
        ", insurance=" + insurance +
        ", remark=" + remark +
        "}";
    }
}
