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
public class ViewJiaheCdssMzrecipe implements Serializable {

    private static final long serialVersionUID=1L;

    private String orderClassName;

    private String orderClassCode;

    private String frequencyCode;

    private String frequencyName;

    private LocalDateTime orderTime;

    private LocalDateTime prescTime;

    private BigDecimal dosageValue;

    private String dosageUnit;

    private String pharmacyWayName;

    private String patientId;

    private BigDecimal visitId;

    private String chargeName;

    private String orderClassConvertName;


    public String getOrderClassName() {
        return orderClassName;
    }

    public void setOrderClassName(String orderClassName) {
        this.orderClassName = orderClassName;
    }

    public String getOrderClassCode() {
        return orderClassCode;
    }

    public void setOrderClassCode(String orderClassCode) {
        this.orderClassCode = orderClassCode;
    }

    public String getFrequencyCode() {
        return frequencyCode;
    }

    public void setFrequencyCode(String frequencyCode) {
        this.frequencyCode = frequencyCode;
    }

    public String getFrequencyName() {
        return frequencyName;
    }

    public void setFrequencyName(String frequencyName) {
        this.frequencyName = frequencyName;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public LocalDateTime getPrescTime() {
        return prescTime;
    }

    public void setPrescTime(LocalDateTime prescTime) {
        this.prescTime = prescTime;
    }

    public BigDecimal getDosageValue() {
        return dosageValue;
    }

    public void setDosageValue(BigDecimal dosageValue) {
        this.dosageValue = dosageValue;
    }

    public String getDosageUnit() {
        return dosageUnit;
    }

    public void setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit;
    }

    public String getPharmacyWayName() {
        return pharmacyWayName;
    }

    public void setPharmacyWayName(String pharmacyWayName) {
        this.pharmacyWayName = pharmacyWayName;
    }

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

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    public String getOrderClassConvertName() {
        return orderClassConvertName;
    }

    public void setOrderClassConvertName(String orderClassConvertName) {
        this.orderClassConvertName = orderClassConvertName;
    }

    @Override
    public String toString() {
        return "ViewJiaheCdssMzrecipe{" +
        "orderClassName=" + orderClassName +
        ", orderClassCode=" + orderClassCode +
        ", frequencyCode=" + frequencyCode +
        ", frequencyName=" + frequencyName +
        ", orderTime=" + orderTime +
        ", prescTime=" + prescTime +
        ", dosageValue=" + dosageValue +
        ", dosageUnit=" + dosageUnit +
        ", pharmacyWayName=" + pharmacyWayName +
        ", patientId=" + patientId +
        ", visitId=" + visitId +
        ", chargeName=" + chargeName +
        ", orderClassConvertName=" + orderClassConvertName +
        "}";
    }
}
