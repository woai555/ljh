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
public class ViewHlhtCdrseparate implements Serializable {

    private static final long serialVersionUID=1L;

    private String outPatientId;

    private String healthCardNo;

    private String outpNo;

    private String visitId;

    private String visitType;

    private String personName;

    private String dateOfBirth;

    private String idCardNo;

    private String sex;

    private String visitDept;

    private String visitDoctor;

    private String regCategory;

    private String regType;

    private String regVisitSec;

    private String registingTime;

    private String separateTime;

    private String separateOper;

    private String separateNo;

    private String callSeqNo;

    private String callSeqTime;

    private String visitConsaltRoom;

    private String operateType;

    private LocalDateTime callTime;

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

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
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

    public String getRegVisitSec() {
        return regVisitSec;
    }

    public void setRegVisitSec(String regVisitSec) {
        this.regVisitSec = regVisitSec;
    }

    public String getRegistingTime() {
        return registingTime;
    }

    public void setRegistingTime(String registingTime) {
        this.registingTime = registingTime;
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

    public String getCallSeqNo() {
        return callSeqNo;
    }

    public void setCallSeqNo(String callSeqNo) {
        this.callSeqNo = callSeqNo;
    }

    public String getCallSeqTime() {
        return callSeqTime;
    }

    public void setCallSeqTime(String callSeqTime) {
        this.callSeqTime = callSeqTime;
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

    public LocalDateTime getCallTime() {
        return callTime;
    }

    public void setCallTime(LocalDateTime callTime) {
        this.callTime = callTime;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdrseparate{" +
        "outPatientId=" + outPatientId +
        ", healthCardNo=" + healthCardNo +
        ", outpNo=" + outpNo +
        ", visitId=" + visitId +
        ", visitType=" + visitType +
        ", personName=" + personName +
        ", dateOfBirth=" + dateOfBirth +
        ", idCardNo=" + idCardNo +
        ", sex=" + sex +
        ", visitDept=" + visitDept +
        ", visitDoctor=" + visitDoctor +
        ", regCategory=" + regCategory +
        ", regType=" + regType +
        ", regVisitSec=" + regVisitSec +
        ", registingTime=" + registingTime +
        ", separateTime=" + separateTime +
        ", separateOper=" + separateOper +
        ", separateNo=" + separateNo +
        ", callSeqNo=" + callSeqNo +
        ", callSeqTime=" + callSeqTime +
        ", visitConsaltRoom=" + visitConsaltRoom +
        ", operateType=" + operateType +
        ", callTime=" + callTime +
        ", operatortime=" + operatortime +
        "}";
    }
}
