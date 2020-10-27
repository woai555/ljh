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
public class ViewJiahePatMasterIndex implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String inpNo;

    private String name;

    private String sex;

    private String dateOfBirth;

    private String birthPlace;

    private String citizenship;

    private String nation;

    private String idNo;

    private String mailingAddress;

    private String phoneNumberHome;

    private String phoneNumberBusiness;

    private LocalDateTime lastVisitDate;

    private LocalDateTime lastModifyDate;

    private String hospitalNo;

    private String synchTimeStamp;


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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
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

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
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

    public LocalDateTime getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(LocalDateTime lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public LocalDateTime getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(LocalDateTime lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    public String getSynchTimeStamp() {
        return synchTimeStamp;
    }

    public void setSynchTimeStamp(String synchTimeStamp) {
        this.synchTimeStamp = synchTimeStamp;
    }

    @Override
    public String toString() {
        return "ViewJiahePatMasterIndex{" +
        "patientId=" + patientId +
        ", inpNo=" + inpNo +
        ", name=" + name +
        ", sex=" + sex +
        ", dateOfBirth=" + dateOfBirth +
        ", birthPlace=" + birthPlace +
        ", citizenship=" + citizenship +
        ", nation=" + nation +
        ", idNo=" + idNo +
        ", mailingAddress=" + mailingAddress +
        ", phoneNumberHome=" + phoneNumberHome +
        ", phoneNumberBusiness=" + phoneNumberBusiness +
        ", lastVisitDate=" + lastVisitDate +
        ", lastModifyDate=" + lastModifyDate +
        ", hospitalNo=" + hospitalNo +
        ", synchTimeStamp=" + synchTimeStamp +
        "}";
    }
}
