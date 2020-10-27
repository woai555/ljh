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
public class ViewHlhtCdroutpv implements Serializable {

    private static final long serialVersionUID=1L;

    private String outPatientId;

    private String healthCardNo;

    private String outpNo;

    private String visitId;

    private String visitType;

    private String emergencyVisitInd;

    private String personName;

    private String chargeType;

    private String dateOfBirth;

    private String idCardNo;

    private String sex;

    private String maritalStatus;

    private String occupation;

    private String phoneNumber;

    private String mailingAddress;

    private String visitDept;

    private String visitDoctor;

    private String regCategory;

    private String regType;

    private String regVisitSection;

    private String registerBy;

    private String registingTime;

    private String markBy;

    private String markTime;

    private String registerCancelBy;

    private String registerCancelTime;

    private String separateTime;

    private String separateOper;

    private String separateNo;

    private String firstvIndicator;

    private String visitTime;

    private String visitConsaltRoom;

    private String operateType;

    private LocalDateTime operatortime;


    public String getOutPatientId() {
        return outPatientId;
    }

    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public String getOutpNo() {
        return outpNo;
    }

    public void setOutpNo(String outpNo) {
        this.outpNo = outpNo;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getEmergencyVisitInd() {
        return emergencyVisitInd;
    }

    public void setEmergencyVisitInd(String emergencyVisitInd) {
        this.emergencyVisitInd = emergencyVisitInd;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getVisitDept() {
        return visitDept;
    }

    public void setVisitDept(String visitDept) {
        this.visitDept = visitDept;
    }

    public String getVisitDoctor() {
        return visitDoctor;
    }

    public void setVisitDoctor(String visitDoctor) {
        this.visitDoctor = visitDoctor;
    }

    public String getRegCategory() {
        return regCategory;
    }

    public void setRegCategory(String regCategory) {
        this.regCategory = regCategory;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getRegVisitSection() {
        return regVisitSection;
    }

    public void setRegVisitSection(String regVisitSection) {
        this.regVisitSection = regVisitSection;
    }

    public String getRegisterBy() {
        return registerBy;
    }

    public void setRegisterBy(String registerBy) {
        this.registerBy = registerBy;
    }

    public String getRegistingTime() {
        return registingTime;
    }

    public void setRegistingTime(String registingTime) {
        this.registingTime = registingTime;
    }

    public String getMarkBy() {
        return markBy;
    }

    public void setMarkBy(String markBy) {
        this.markBy = markBy;
    }

    public String getMarkTime() {
        return markTime;
    }

    public void setMarkTime(String markTime) {
        this.markTime = markTime;
    }

    public String getRegisterCancelBy() {
        return registerCancelBy;
    }

    public void setRegisterCancelBy(String registerCancelBy) {
        this.registerCancelBy = registerCancelBy;
    }

    public String getRegisterCancelTime() {
        return registerCancelTime;
    }

    public void setRegisterCancelTime(String registerCancelTime) {
        this.registerCancelTime = registerCancelTime;
    }

    public String getSeparateTime() {
        return separateTime;
    }

    public void setSeparateTime(String separateTime) {
        this.separateTime = separateTime;
    }

    public String getSeparateOper() {
        return separateOper;
    }

    public void setSeparateOper(String separateOper) {
        this.separateOper = separateOper;
    }

    public String getSeparateNo() {
        return separateNo;
    }

    public void setSeparateNo(String separateNo) {
        this.separateNo = separateNo;
    }

    public String getFirstvIndicator() {
        return firstvIndicator;
    }

    public void setFirstvIndicator(String firstvIndicator) {
        this.firstvIndicator = firstvIndicator;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitConsaltRoom() {
        return visitConsaltRoom;
    }

    public void setVisitConsaltRoom(String visitConsaltRoom) {
        this.visitConsaltRoom = visitConsaltRoom;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdroutpv{" +
        "outPatientId=" + outPatientId +
        ", healthCardNo=" + healthCardNo +
        ", outpNo=" + outpNo +
        ", visitId=" + visitId +
        ", visitType=" + visitType +
        ", emergencyVisitInd=" + emergencyVisitInd +
        ", personName=" + personName +
        ", chargeType=" + chargeType +
        ", dateOfBirth=" + dateOfBirth +
        ", idCardNo=" + idCardNo +
        ", sex=" + sex +
        ", maritalStatus=" + maritalStatus +
        ", occupation=" + occupation +
        ", phoneNumber=" + phoneNumber +
        ", mailingAddress=" + mailingAddress +
        ", visitDept=" + visitDept +
        ", visitDoctor=" + visitDoctor +
        ", regCategory=" + regCategory +
        ", regType=" + regType +
        ", regVisitSection=" + regVisitSection +
        ", registerBy=" + registerBy +
        ", registingTime=" + registingTime +
        ", markBy=" + markBy +
        ", markTime=" + markTime +
        ", registerCancelBy=" + registerCancelBy +
        ", registerCancelTime=" + registerCancelTime +
        ", separateTime=" + separateTime +
        ", separateOper=" + separateOper +
        ", separateNo=" + separateNo +
        ", firstvIndicator=" + firstvIndicator +
        ", visitTime=" + visitTime +
        ", visitConsaltRoom=" + visitConsaltRoom +
        ", operateType=" + operateType +
        ", operatortime=" + operatortime +
        "}";
    }
}
