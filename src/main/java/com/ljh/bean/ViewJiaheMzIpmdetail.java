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
public class ViewJiaheMzIpmdetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String actId;

    private String patientId;

    private String outpId;

    private String itemClassDl;

    private String itemClassDlName;

    private String itemClass;

    private String itemClassName;

    private String orderProperties;

    private String orderPropertiesName;

    private String orderNo;

    private String itemCode;

    private String itemName;

    private String ordStatus;

    private String ordStatusName;

    private String orderDept;

    private String orderDeptName;

    private String orderDoctor;

    private String orderDoctorName;

    private LocalDateTime stopTime;

    private String stopDoctor;

    private String stopDoctorName;

    private LocalDateTime orderTime;

    private BigDecimal dosage;

    private String dosageUnit;

    private String injectionInd;

    private String antibioticInd;

    private BigDecimal amount;

    private String amountUnit;

    private String pharmacyWay;

    private String pharmacyWayName;

    private String frequency;

    private String frequencyName;

    private String frequencyDesc;

    private BigDecimal duration;

    private String durationUnit;

    private String visitType;


    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getOutpId() {
        return outpId;
    }

    public void setOutpId(String outpId) {
        this.outpId = outpId;
    }

    public String getItemClassDl() {
        return itemClassDl;
    }

    public void setItemClassDl(String itemClassDl) {
        this.itemClassDl = itemClassDl;
    }

    public String getItemClassDlName() {
        return itemClassDlName;
    }

    public void setItemClassDlName(String itemClassDlName) {
        this.itemClassDlName = itemClassDlName;
    }

    public String getItemClass() {
        return itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    public String getItemClassName() {
        return itemClassName;
    }

    public void setItemClassName(String itemClassName) {
        this.itemClassName = itemClassName;
    }

    public String getOrderProperties() {
        return orderProperties;
    }

    public void setOrderProperties(String orderProperties) {
        this.orderProperties = orderProperties;
    }

    public String getOrderPropertiesName() {
        return orderPropertiesName;
    }

    public void setOrderPropertiesName(String orderPropertiesName) {
        this.orderPropertiesName = orderPropertiesName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(String ordStatus) {
        this.ordStatus = ordStatus;
    }

    public String getOrdStatusName() {
        return ordStatusName;
    }

    public void setOrdStatusName(String ordStatusName) {
        this.ordStatusName = ordStatusName;
    }

    public String getOrderDept() {
        return orderDept;
    }

    public void setOrderDept(String orderDept) {
        this.orderDept = orderDept;
    }

    public String getOrderDeptName() {
        return orderDeptName;
    }

    public void setOrderDeptName(String orderDeptName) {
        this.orderDeptName = orderDeptName;
    }

    public String getOrderDoctor() {
        return orderDoctor;
    }

    public void setOrderDoctor(String orderDoctor) {
        this.orderDoctor = orderDoctor;
    }

    public String getOrderDoctorName() {
        return orderDoctorName;
    }

    public void setOrderDoctorName(String orderDoctorName) {
        this.orderDoctorName = orderDoctorName;
    }

    public LocalDateTime getStopTime() {
        return stopTime;
    }

    public void setStopTime(LocalDateTime stopTime) {
        this.stopTime = stopTime;
    }

    public String getStopDoctor() {
        return stopDoctor;
    }

    public void setStopDoctor(String stopDoctor) {
        this.stopDoctor = stopDoctor;
    }

    public String getStopDoctorName() {
        return stopDoctorName;
    }

    public void setStopDoctorName(String stopDoctorName) {
        this.stopDoctorName = stopDoctorName;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public BigDecimal getDosage() {
        return dosage;
    }

    public void setDosage(BigDecimal dosage) {
        this.dosage = dosage;
    }

    public String getDosageUnit() {
        return dosageUnit;
    }

    public void setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit;
    }

    public String getInjectionInd() {
        return injectionInd;
    }

    public void setInjectionInd(String injectionInd) {
        this.injectionInd = injectionInd;
    }

    public String getAntibioticInd() {
        return antibioticInd;
    }

    public void setAntibioticInd(String antibioticInd) {
        this.antibioticInd = antibioticInd;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(String amountUnit) {
        this.amountUnit = amountUnit;
    }

    public String getPharmacyWay() {
        return pharmacyWay;
    }

    public void setPharmacyWay(String pharmacyWay) {
        this.pharmacyWay = pharmacyWay;
    }

    public String getPharmacyWayName() {
        return pharmacyWayName;
    }

    public void setPharmacyWayName(String pharmacyWayName) {
        this.pharmacyWayName = pharmacyWayName;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getFrequencyName() {
        return frequencyName;
    }

    public void setFrequencyName(String frequencyName) {
        this.frequencyName = frequencyName;
    }

    public String getFrequencyDesc() {
        return frequencyDesc;
    }

    public void setFrequencyDesc(String frequencyDesc) {
        this.frequencyDesc = frequencyDesc;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public String getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzIpmdetail{" +
        "actId=" + actId +
        ", patientId=" + patientId +
        ", outpId=" + outpId +
        ", itemClassDl=" + itemClassDl +
        ", itemClassDlName=" + itemClassDlName +
        ", itemClass=" + itemClass +
        ", itemClassName=" + itemClassName +
        ", orderProperties=" + orderProperties +
        ", orderPropertiesName=" + orderPropertiesName +
        ", orderNo=" + orderNo +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", ordStatus=" + ordStatus +
        ", ordStatusName=" + ordStatusName +
        ", orderDept=" + orderDept +
        ", orderDeptName=" + orderDeptName +
        ", orderDoctor=" + orderDoctor +
        ", orderDoctorName=" + orderDoctorName +
        ", stopTime=" + stopTime +
        ", stopDoctor=" + stopDoctor +
        ", stopDoctorName=" + stopDoctorName +
        ", orderTime=" + orderTime +
        ", dosage=" + dosage +
        ", dosageUnit=" + dosageUnit +
        ", injectionInd=" + injectionInd +
        ", antibioticInd=" + antibioticInd +
        ", amount=" + amount +
        ", amountUnit=" + amountUnit +
        ", pharmacyWay=" + pharmacyWay +
        ", pharmacyWayName=" + pharmacyWayName +
        ", frequency=" + frequency +
        ", frequencyName=" + frequencyName +
        ", frequencyDesc=" + frequencyDesc +
        ", duration=" + duration +
        ", durationUnit=" + durationUnit +
        ", visitType=" + visitType +
        "}";
    }
}
