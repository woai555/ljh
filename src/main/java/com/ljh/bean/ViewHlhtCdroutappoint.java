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
public class ViewHlhtCdroutappoint implements Serializable {

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

    private String appointRegId;

    private String appointRegWindows;

    private String appointRegSource;

    private String appointRegStatus;

    private String planVisitDept;

    private String planVisitDate;

    private String planVisitDoctor;

    private String appointRegOper;

    private String appointRegTime;

    private String takeTime;

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

    public String getAppointRegId() {
        return appointRegId;
    }

    public void setAppointRegId(String appointRegId) {
        this.appointRegId = appointRegId;
    }

    public String getAppointRegWindows() {
        return appointRegWindows;
    }

    public void setAppointRegWindows(String appointRegWindows) {
        this.appointRegWindows = appointRegWindows;
    }

    public String getAppointRegSource() {
        return appointRegSource;
    }

    public void setAppointRegSource(String appointRegSource) {
        this.appointRegSource = appointRegSource;
    }

    public String getAppointRegStatus() {
        return appointRegStatus;
    }

    public void setAppointRegStatus(String appointRegStatus) {
        this.appointRegStatus = appointRegStatus;
    }

    public String getPlanVisitDept() {
        return planVisitDept;
    }

    public void setPlanVisitDept(String planVisitDept) {
        this.planVisitDept = planVisitDept;
    }

    public String getPlanVisitDate() {
        return planVisitDate;
    }

    public void setPlanVisitDate(String planVisitDate) {
        this.planVisitDate = planVisitDate;
    }

    public String getPlanVisitDoctor() {
        return planVisitDoctor;
    }

    public void setPlanVisitDoctor(String planVisitDoctor) {
        this.planVisitDoctor = planVisitDoctor;
    }

    public String getAppointRegOper() {
        return appointRegOper;
    }

    public void setAppointRegOper(String appointRegOper) {
        this.appointRegOper = appointRegOper;
    }

    public String getAppointRegTime() {
        return appointRegTime;
    }

    public void setAppointRegTime(String appointRegTime) {
        this.appointRegTime = appointRegTime;
    }

    public String getTakeTime() {
        return takeTime;
    }

    public void setTakeTime(String takeTime) {
        this.takeTime = takeTime;
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
        return "ViewHlhtCdroutappoint{" +
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
        ", appointRegId=" + appointRegId +
        ", appointRegWindows=" + appointRegWindows +
        ", appointRegSource=" + appointRegSource +
        ", appointRegStatus=" + appointRegStatus +
        ", planVisitDept=" + planVisitDept +
        ", planVisitDate=" + planVisitDate +
        ", planVisitDoctor=" + planVisitDoctor +
        ", appointRegOper=" + appointRegOper +
        ", appointRegTime=" + appointRegTime +
        ", takeTime=" + takeTime +
        ", operateType=" + operateType +
        ", operatortime=" + operatortime +
        "}";
    }
}
