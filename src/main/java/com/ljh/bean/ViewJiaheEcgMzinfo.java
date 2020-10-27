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
public class ViewJiaheEcgMzinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String hisPatientId;

    private String hisExamId;

    private Integer hisSequenceNo;

    private String name;

    private String pym;

    private String gender;

    private LocalDateTime birthday;

    private BigDecimal patientAge;

    private BigDecimal patientAgeMonth;

    private BigDecimal patientAgeDay;

    private String treatType;

    private String treadId;

    private String inhospitalId;

    private String location;

    private String bedNo;

    private String visitId;

    private String procedureCode;

    private String procedureName;

    private String height;

    private String weight;

    private String homeTel;

    private String phoneNumberMobile;

    private String mailingAddress;

    private String zipCode;

    private String folk;

    private String idNo;

    private String race;

    private String applyDept;

    private String applyDoctId;

    private String applyDoctName;

    private LocalDateTime confirmTime;

    private String clinicDiag;

    private String medicalHistory;

    private String medication;

    private String deptcode;

    private String deptname;

    private LocalDateTime recordDate;

    private LocalDateTime regDate;

    private String regPatientId;


    public String getHisPatientId() {
        return hisPatientId;
    }

    public void setHisPatientId(String hisPatientId) {
        this.hisPatientId = hisPatientId;
    }

    public String getHisExamId() {
        return hisExamId;
    }

    public void setHisExamId(String hisExamId) {
        this.hisExamId = hisExamId;
    }

    public Integer getHisSequenceNo() {
        return hisSequenceNo;
    }

    public void setHisSequenceNo(Integer hisSequenceNo) {
        this.hisSequenceNo = hisSequenceNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPym() {
        return pym;
    }

    public void setPym(String pym) {
        this.pym = pym;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(BigDecimal patientAge) {
        this.patientAge = patientAge;
    }

    public BigDecimal getPatientAgeMonth() {
        return patientAgeMonth;
    }

    public void setPatientAgeMonth(BigDecimal patientAgeMonth) {
        this.patientAgeMonth = patientAgeMonth;
    }

    public BigDecimal getPatientAgeDay() {
        return patientAgeDay;
    }

    public void setPatientAgeDay(BigDecimal patientAgeDay) {
        this.patientAgeDay = patientAgeDay;
    }

    public String getTreatType() {
        return treatType;
    }

    public void setTreatType(String treatType) {
        this.treatType = treatType;
    }

    public String getTreadId() {
        return treadId;
    }

    public void setTreadId(String treadId) {
        this.treadId = treadId;
    }

    public String getInhospitalId() {
        return inhospitalId;
    }

    public void setInhospitalId(String inhospitalId) {
        this.inhospitalId = inhospitalId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getProcedureCode() {
        return procedureCode;
    }

    public void setProcedureCode(String procedureCode) {
        this.procedureCode = procedureCode;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getPhoneNumberMobile() {
        return phoneNumberMobile;
    }

    public void setPhoneNumberMobile(String phoneNumberMobile) {
        this.phoneNumberMobile = phoneNumberMobile;
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

    public String getFolk() {
        return folk;
    }

    public void setFolk(String folk) {
        this.folk = folk;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getApplyDept() {
        return applyDept;
    }

    public void setApplyDept(String applyDept) {
        this.applyDept = applyDept;
    }

    public String getApplyDoctId() {
        return applyDoctId;
    }

    public void setApplyDoctId(String applyDoctId) {
        this.applyDoctId = applyDoctId;
    }

    public String getApplyDoctName() {
        return applyDoctName;
    }

    public void setApplyDoctName(String applyDoctName) {
        this.applyDoctName = applyDoctName;
    }

    public LocalDateTime getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(LocalDateTime confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getClinicDiag() {
        return clinicDiag;
    }

    public void setClinicDiag(String clinicDiag) {
        this.clinicDiag = clinicDiag;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public LocalDateTime getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDateTime recordDate) {
        this.recordDate = recordDate;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getRegPatientId() {
        return regPatientId;
    }

    public void setRegPatientId(String regPatientId) {
        this.regPatientId = regPatientId;
    }

    @Override
    public String toString() {
        return "ViewJiaheEcgMzinfo{" +
        "hisPatientId=" + hisPatientId +
        ", hisExamId=" + hisExamId +
        ", hisSequenceNo=" + hisSequenceNo +
        ", name=" + name +
        ", pym=" + pym +
        ", gender=" + gender +
        ", birthday=" + birthday +
        ", patientAge=" + patientAge +
        ", patientAgeMonth=" + patientAgeMonth +
        ", patientAgeDay=" + patientAgeDay +
        ", treatType=" + treatType +
        ", treadId=" + treadId +
        ", inhospitalId=" + inhospitalId +
        ", location=" + location +
        ", bedNo=" + bedNo +
        ", visitId=" + visitId +
        ", procedureCode=" + procedureCode +
        ", procedureName=" + procedureName +
        ", height=" + height +
        ", weight=" + weight +
        ", homeTel=" + homeTel +
        ", phoneNumberMobile=" + phoneNumberMobile +
        ", mailingAddress=" + mailingAddress +
        ", zipCode=" + zipCode +
        ", folk=" + folk +
        ", idNo=" + idNo +
        ", race=" + race +
        ", applyDept=" + applyDept +
        ", applyDoctId=" + applyDoctId +
        ", applyDoctName=" + applyDoctName +
        ", confirmTime=" + confirmTime +
        ", clinicDiag=" + clinicDiag +
        ", medicalHistory=" + medicalHistory +
        ", medication=" + medication +
        ", deptcode=" + deptcode +
        ", deptname=" + deptname +
        ", recordDate=" + recordDate +
        ", regDate=" + regDate +
        ", regPatientId=" + regPatientId +
        "}";
    }
}
