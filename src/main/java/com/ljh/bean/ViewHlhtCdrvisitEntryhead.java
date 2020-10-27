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
public class ViewHlhtCdrvisitEntryhead implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientNo;

    private String healthCardNo;

    private String cardNo;

    private String visitNo;

    private String visitId;

    private String clinicType;

    private String visitType;

    private String orderedCareproviderCode;

    private String orderedCareproviderName;

    private BigDecimal age;

    private String regDatetime;

    private String orderedSubspecialtyCode;

    private String orderedSubspecialtyDesc;

    private String orderedDatetime;

    private String seeTime;

    private String cancelledCpCode;

    private String cancelledCpName;

    private String cancelledDatetime;

    private String cancelledReasonDesc;

    private String entityCode;

    private LocalDateTime operDate;

    private String operateType;

    private LocalDateTime operatortime;


    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getVisitNo() {
        return visitNo;
    }

    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getClinicType() {
        return clinicType;
    }

    public void setClinicType(String clinicType) {
        this.clinicType = clinicType;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getOrderedCareproviderCode() {
        return orderedCareproviderCode;
    }

    public void setOrderedCareproviderCode(String orderedCareproviderCode) {
        this.orderedCareproviderCode = orderedCareproviderCode;
    }

    public String getOrderedCareproviderName() {
        return orderedCareproviderName;
    }

    public void setOrderedCareproviderName(String orderedCareproviderName) {
        this.orderedCareproviderName = orderedCareproviderName;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getRegDatetime() {
        return regDatetime;
    }

    public void setRegDatetime(String regDatetime) {
        this.regDatetime = regDatetime;
    }

    public String getOrderedSubspecialtyCode() {
        return orderedSubspecialtyCode;
    }

    public void setOrderedSubspecialtyCode(String orderedSubspecialtyCode) {
        this.orderedSubspecialtyCode = orderedSubspecialtyCode;
    }

    public String getOrderedSubspecialtyDesc() {
        return orderedSubspecialtyDesc;
    }

    public void setOrderedSubspecialtyDesc(String orderedSubspecialtyDesc) {
        this.orderedSubspecialtyDesc = orderedSubspecialtyDesc;
    }

    public String getOrderedDatetime() {
        return orderedDatetime;
    }

    public void setOrderedDatetime(String orderedDatetime) {
        this.orderedDatetime = orderedDatetime;
    }

    public String getSeeTime() {
        return seeTime;
    }

    public void setSeeTime(String seeTime) {
        this.seeTime = seeTime;
    }

    public String getCancelledCpCode() {
        return cancelledCpCode;
    }

    public void setCancelledCpCode(String cancelledCpCode) {
        this.cancelledCpCode = cancelledCpCode;
    }

    public String getCancelledCpName() {
        return cancelledCpName;
    }

    public void setCancelledCpName(String cancelledCpName) {
        this.cancelledCpName = cancelledCpName;
    }

    public String getCancelledDatetime() {
        return cancelledDatetime;
    }

    public void setCancelledDatetime(String cancelledDatetime) {
        this.cancelledDatetime = cancelledDatetime;
    }

    public String getCancelledReasonDesc() {
        return cancelledReasonDesc;
    }

    public void setCancelledReasonDesc(String cancelledReasonDesc) {
        this.cancelledReasonDesc = cancelledReasonDesc;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
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
        return "ViewHlhtCdrvisitEntryhead{" +
        "patientNo=" + patientNo +
        ", healthCardNo=" + healthCardNo +
        ", cardNo=" + cardNo +
        ", visitNo=" + visitNo +
        ", visitId=" + visitId +
        ", clinicType=" + clinicType +
        ", visitType=" + visitType +
        ", orderedCareproviderCode=" + orderedCareproviderCode +
        ", orderedCareproviderName=" + orderedCareproviderName +
        ", age=" + age +
        ", regDatetime=" + regDatetime +
        ", orderedSubspecialtyCode=" + orderedSubspecialtyCode +
        ", orderedSubspecialtyDesc=" + orderedSubspecialtyDesc +
        ", orderedDatetime=" + orderedDatetime +
        ", seeTime=" + seeTime +
        ", cancelledCpCode=" + cancelledCpCode +
        ", cancelledCpName=" + cancelledCpName +
        ", cancelledDatetime=" + cancelledDatetime +
        ", cancelledReasonDesc=" + cancelledReasonDesc +
        ", entityCode=" + entityCode +
        ", operDate=" + operDate +
        ", operateType=" + operateType +
        ", operatortime=" + operatortime +
        "}";
    }
}
