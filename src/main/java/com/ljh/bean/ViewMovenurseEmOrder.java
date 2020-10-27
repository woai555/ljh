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
public class ViewMovenurseEmOrder implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String visitId;

    private String orderNo;

    private String orderSubNo;

    private BigDecimal repeatIndicator;

    private String orderClass;

    private String orderText;

    private String orderCode;

    private String spec;

    private BigDecimal dosage;

    private String dosageUnits;

    private String administration;

    private String duration;

    private String durationUnits;

    private LocalDateTime startDateTime;

    private LocalDateTime stopDateTime;

    private String frequency;

    private String freqCounter;

    private String freqInterval;

    private String freqIntervalUnit;

    private String freqDetail;

    private String performSchedule;

    private String performResult;

    private String orderingDept;

    private String doctor;

    private String stopDoctor;

    private String nurse;

    private String enterDateTime;

    private String orderStatus;

    private String billingAttr;

    private LocalDateTime lastPerformDateTime;

    private LocalDateTime lastAcctingDateTime;

    private LocalDateTime stopOrderDateTime;

    private String stopNurse;

    private String drugBillingAttr;

    private String remark;


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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderSubNo() {
        return orderSubNo;
    }

    public void setOrderSubNo(String orderSubNo) {
        this.orderSubNo = orderSubNo;
    }

    public BigDecimal getRepeatIndicator() {
        return repeatIndicator;
    }

    public void setRepeatIndicator(BigDecimal repeatIndicator) {
        this.repeatIndicator = repeatIndicator;
    }

    public String getOrderClass() {
        return orderClass;
    }

    public void setOrderClass(String orderClass) {
        this.orderClass = orderClass;
    }

    public String getOrderText() {
        return orderText;
    }

    public void setOrderText(String orderText) {
        this.orderText = orderText;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public BigDecimal getDosage() {
        return dosage;
    }

    public void setDosage(BigDecimal dosage) {
        this.dosage = dosage;
    }

    public String getDosageUnits() {
        return dosageUnits;
    }

    public void setDosageUnits(String dosageUnits) {
        this.dosageUnits = dosageUnits;
    }

    public String getAdministration() {
        return administration;
    }

    public void setAdministration(String administration) {
        this.administration = administration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDurationUnits() {
        return durationUnits;
    }

    public void setDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getStopDateTime() {
        return stopDateTime;
    }

    public void setStopDateTime(LocalDateTime stopDateTime) {
        this.stopDateTime = stopDateTime;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getFreqCounter() {
        return freqCounter;
    }

    public void setFreqCounter(String freqCounter) {
        this.freqCounter = freqCounter;
    }

    public String getFreqInterval() {
        return freqInterval;
    }

    public void setFreqInterval(String freqInterval) {
        this.freqInterval = freqInterval;
    }

    public String getFreqIntervalUnit() {
        return freqIntervalUnit;
    }

    public void setFreqIntervalUnit(String freqIntervalUnit) {
        this.freqIntervalUnit = freqIntervalUnit;
    }

    public String getFreqDetail() {
        return freqDetail;
    }

    public void setFreqDetail(String freqDetail) {
        this.freqDetail = freqDetail;
    }

    public String getPerformSchedule() {
        return performSchedule;
    }

    public void setPerformSchedule(String performSchedule) {
        this.performSchedule = performSchedule;
    }

    public String getPerformResult() {
        return performResult;
    }

    public void setPerformResult(String performResult) {
        this.performResult = performResult;
    }

    public String getOrderingDept() {
        return orderingDept;
    }

    public void setOrderingDept(String orderingDept) {
        this.orderingDept = orderingDept;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getStopDoctor() {
        return stopDoctor;
    }

    public void setStopDoctor(String stopDoctor) {
        this.stopDoctor = stopDoctor;
    }

    public String getNurse() {
        return nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public String getEnterDateTime() {
        return enterDateTime;
    }

    public void setEnterDateTime(String enterDateTime) {
        this.enterDateTime = enterDateTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getBillingAttr() {
        return billingAttr;
    }

    public void setBillingAttr(String billingAttr) {
        this.billingAttr = billingAttr;
    }

    public LocalDateTime getLastPerformDateTime() {
        return lastPerformDateTime;
    }

    public void setLastPerformDateTime(LocalDateTime lastPerformDateTime) {
        this.lastPerformDateTime = lastPerformDateTime;
    }

    public LocalDateTime getLastAcctingDateTime() {
        return lastAcctingDateTime;
    }

    public void setLastAcctingDateTime(LocalDateTime lastAcctingDateTime) {
        this.lastAcctingDateTime = lastAcctingDateTime;
    }

    public LocalDateTime getStopOrderDateTime() {
        return stopOrderDateTime;
    }

    public void setStopOrderDateTime(LocalDateTime stopOrderDateTime) {
        this.stopOrderDateTime = stopOrderDateTime;
    }

    public String getStopNurse() {
        return stopNurse;
    }

    public void setStopNurse(String stopNurse) {
        this.stopNurse = stopNurse;
    }

    public String getDrugBillingAttr() {
        return drugBillingAttr;
    }

    public void setDrugBillingAttr(String drugBillingAttr) {
        this.drugBillingAttr = drugBillingAttr;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ViewMovenurseEmOrder{" +
        "patientId=" + patientId +
        ", visitId=" + visitId +
        ", orderNo=" + orderNo +
        ", orderSubNo=" + orderSubNo +
        ", repeatIndicator=" + repeatIndicator +
        ", orderClass=" + orderClass +
        ", orderText=" + orderText +
        ", orderCode=" + orderCode +
        ", spec=" + spec +
        ", dosage=" + dosage +
        ", dosageUnits=" + dosageUnits +
        ", administration=" + administration +
        ", duration=" + duration +
        ", durationUnits=" + durationUnits +
        ", startDateTime=" + startDateTime +
        ", stopDateTime=" + stopDateTime +
        ", frequency=" + frequency +
        ", freqCounter=" + freqCounter +
        ", freqInterval=" + freqInterval +
        ", freqIntervalUnit=" + freqIntervalUnit +
        ", freqDetail=" + freqDetail +
        ", performSchedule=" + performSchedule +
        ", performResult=" + performResult +
        ", orderingDept=" + orderingDept +
        ", doctor=" + doctor +
        ", stopDoctor=" + stopDoctor +
        ", nurse=" + nurse +
        ", enterDateTime=" + enterDateTime +
        ", orderStatus=" + orderStatus +
        ", billingAttr=" + billingAttr +
        ", lastPerformDateTime=" + lastPerformDateTime +
        ", lastAcctingDateTime=" + lastAcctingDateTime +
        ", stopOrderDateTime=" + stopOrderDateTime +
        ", stopNurse=" + stopNurse +
        ", drugBillingAttr=" + drugBillingAttr +
        ", remark=" + remark +
        "}";
    }
}
