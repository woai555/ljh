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
public class ViewJiaheClinicVisit implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String visitId;

    private String inpNo;

    private String name;

    private String mailingAddress;

    private String zipCodeOfHome;

    private String phoneNumber;

    private LocalDateTime visitDate;

    private String visitDept;

    private String visitType;

    private LocalDateTime startDate;

    private LocalDateTime startTime;

    private String stopDate;

    private String stopTime;

    private String deptDischarge;

    private String insuranceNo;

    private String serviceAgency;

    private String doctorInCharge;

    private String doctorId;

    private String doctorQualification;

    private String nextOfKin;

    private String relationship;

    private String nextOfKinPhone;

    private String registerDate;

    private String diagnosis;

    private String chargeType;

    private String existFlag;

    private String hospitalNo;

    private String synchTimeStamp;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
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

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getZipCodeOfHome() {
        return zipCodeOfHome;
    }

    public void setZipCodeOfHome(String zipCodeOfHome) {
        this.zipCodeOfHome = zipCodeOfHome;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }

    public String getVisitDept() {
        return visitDept;
    }

    public void setVisitDept(String visitDept) {
        this.visitDept = visitDept;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public String getStopDate() {
        return stopDate;
    }

    public void setStopDate(String stopDate) {
        this.stopDate = stopDate;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public String getDeptDischarge() {
        return deptDischarge;
    }

    public void setDeptDischarge(String deptDischarge) {
        this.deptDischarge = deptDischarge;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public String getServiceAgency() {
        return serviceAgency;
    }

    public void setServiceAgency(String serviceAgency) {
        this.serviceAgency = serviceAgency;
    }

    public String getDoctorInCharge() {
        return doctorInCharge;
    }

    public void setDoctorInCharge(String doctorInCharge) {
        this.doctorInCharge = doctorInCharge;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorQualification() {
        return doctorQualification;
    }

    public void setDoctorQualification(String doctorQualification) {
        this.doctorQualification = doctorQualification;
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

    public String getNextOfKinPhone() {
        return nextOfKinPhone;
    }

    public void setNextOfKinPhone(String nextOfKinPhone) {
        this.nextOfKinPhone = nextOfKinPhone;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getExistFlag() {
        return existFlag;
    }

    public void setExistFlag(String existFlag) {
        this.existFlag = existFlag;
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
        return "ViewJiaheClinicVisit{" +
        "patientId=" + patientId +
        ", visitId=" + visitId +
        ", inpNo=" + inpNo +
        ", name=" + name +
        ", mailingAddress=" + mailingAddress +
        ", zipCodeOfHome=" + zipCodeOfHome +
        ", phoneNumber=" + phoneNumber +
        ", visitDate=" + visitDate +
        ", visitDept=" + visitDept +
        ", visitType=" + visitType +
        ", startDate=" + startDate +
        ", startTime=" + startTime +
        ", stopDate=" + stopDate +
        ", stopTime=" + stopTime +
        ", deptDischarge=" + deptDischarge +
        ", insuranceNo=" + insuranceNo +
        ", serviceAgency=" + serviceAgency +
        ", doctorInCharge=" + doctorInCharge +
        ", doctorId=" + doctorId +
        ", doctorQualification=" + doctorQualification +
        ", nextOfKin=" + nextOfKin +
        ", relationship=" + relationship +
        ", nextOfKinPhone=" + nextOfKinPhone +
        ", registerDate=" + registerDate +
        ", diagnosis=" + diagnosis +
        ", chargeType=" + chargeType +
        ", existFlag=" + existFlag +
        ", hospitalNo=" + hospitalNo +
        ", synchTimeStamp=" + synchTimeStamp +
        "}";
    }
}
