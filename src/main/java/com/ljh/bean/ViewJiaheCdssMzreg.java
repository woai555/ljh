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
public class ViewJiaheCdssMzreg implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private BigDecimal visitId;

    private String visitFlag;

    private String inpNo;

    private String name;

    private String sexName;

    private String idCardNo;

    private LocalDateTime dateOfBirth;

    private BigDecimal ageValue;

    private String ageValueUnit;

    private String nationalityName;

    private String familyExplicitAddress;

    private String mailingAddressName;

    private String nationalName;

    private String identityName;

    private LocalDateTime visitTime;

    private String visitDeptName;

    private String visitDeptCode;

    private String regCategoryCode;

    private String regCategoryName;

    private LocalDateTime registingTime;

    private String visitDoctorName;

    private String visitDoctorCode;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public BigDecimal getVisitId() {
        return visitId;
    }

    public void setVisitId(BigDecimal visitId) {
        this.visitId = visitId;
    }

    public String getVisitFlag() {
        return visitFlag;
    }

    public void setVisitFlag(String visitFlag) {
        this.visitFlag = visitFlag;
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

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public BigDecimal getAgeValue() {
        return ageValue;
    }

    public void setAgeValue(BigDecimal ageValue) {
        this.ageValue = ageValue;
    }

    public String getAgeValueUnit() {
        return ageValueUnit;
    }

    public void setAgeValueUnit(String ageValueUnit) {
        this.ageValueUnit = ageValueUnit;
    }

    public String getNationalityName() {
        return nationalityName;
    }

    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName;
    }

    public String getFamilyExplicitAddress() {
        return familyExplicitAddress;
    }

    public void setFamilyExplicitAddress(String familyExplicitAddress) {
        this.familyExplicitAddress = familyExplicitAddress;
    }

    public String getMailingAddressName() {
        return mailingAddressName;
    }

    public void setMailingAddressName(String mailingAddressName) {
        this.mailingAddressName = mailingAddressName;
    }

    public String getNationalName() {
        return nationalName;
    }

    public void setNationalName(String nationalName) {
        this.nationalName = nationalName;
    }

    public String getIdentityName() {
        return identityName;
    }

    public void setIdentityName(String identityName) {
        this.identityName = identityName;
    }

    public LocalDateTime getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(LocalDateTime visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitDeptName() {
        return visitDeptName;
    }

    public void setVisitDeptName(String visitDeptName) {
        this.visitDeptName = visitDeptName;
    }

    public String getVisitDeptCode() {
        return visitDeptCode;
    }

    public void setVisitDeptCode(String visitDeptCode) {
        this.visitDeptCode = visitDeptCode;
    }

    public String getRegCategoryCode() {
        return regCategoryCode;
    }

    public void setRegCategoryCode(String regCategoryCode) {
        this.regCategoryCode = regCategoryCode;
    }

    public String getRegCategoryName() {
        return regCategoryName;
    }

    public void setRegCategoryName(String regCategoryName) {
        this.regCategoryName = regCategoryName;
    }

    public LocalDateTime getRegistingTime() {
        return registingTime;
    }

    public void setRegistingTime(LocalDateTime registingTime) {
        this.registingTime = registingTime;
    }

    public String getVisitDoctorName() {
        return visitDoctorName;
    }

    public void setVisitDoctorName(String visitDoctorName) {
        this.visitDoctorName = visitDoctorName;
    }

    public String getVisitDoctorCode() {
        return visitDoctorCode;
    }

    public void setVisitDoctorCode(String visitDoctorCode) {
        this.visitDoctorCode = visitDoctorCode;
    }

    @Override
    public String toString() {
        return "ViewJiaheCdssMzreg{" +
        "patientId=" + patientId +
        ", visitId=" + visitId +
        ", visitFlag=" + visitFlag +
        ", inpNo=" + inpNo +
        ", name=" + name +
        ", sexName=" + sexName +
        ", idCardNo=" + idCardNo +
        ", dateOfBirth=" + dateOfBirth +
        ", ageValue=" + ageValue +
        ", ageValueUnit=" + ageValueUnit +
        ", nationalityName=" + nationalityName +
        ", familyExplicitAddress=" + familyExplicitAddress +
        ", mailingAddressName=" + mailingAddressName +
        ", nationalName=" + nationalName +
        ", identityName=" + identityName +
        ", visitTime=" + visitTime +
        ", visitDeptName=" + visitDeptName +
        ", visitDeptCode=" + visitDeptCode +
        ", regCategoryCode=" + regCategoryCode +
        ", regCategoryName=" + regCategoryName +
        ", registingTime=" + registingTime +
        ", visitDoctorName=" + visitDoctorName +
        ", visitDoctorCode=" + visitDoctorCode +
        "}";
    }
}
