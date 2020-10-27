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
public class ViewEmOrder implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private Integer visitId;

    private String orderNo;

    private String orderSubNo;

    private BigDecimal repeatIndicator;

    private BigDecimal orderClass;

    private String orderText;

    private String orderCode;

    private BigDecimal dosage;

    private String dosageUnits;

    private String administration;

    private String useName;

    private String duration;

    private String durationUnits;

    private LocalDateTime startDateTime;

    private LocalDateTime stopDateTime;

    private String frequency;

    private BigDecimal freqCounter;

    private BigDecimal freqInterval;

    private String freqIntervalUnit;

    private String freqDetail;

    private String performSchedule;

    private String performResult;

    private String orderingDept;

    private String doctor;

    private String stopDoctor;

    private String nurse;

    private LocalDateTime enterDateTime;

    private String orderStatus;

    private String billingAttr;

    private LocalDateTime lastPerformDateTime;

    private LocalDateTime lastAcctingDateTime;

    private LocalDateTime stopOrderDateTime;

    private String stopNurse;

    private String drugBillingAttr;

    private String spec;

    private LocalDateTime cancelDate;

    private String seeNo;

    private Integer visitIdOld;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
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

    public BigDecimal getOrderClass() {
        return orderClass;
    }

    public void setOrderClass(BigDecimal orderClass) {
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

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
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

    public BigDecimal getFreqCounter() {
        return freqCounter;
    }

    public void setFreqCounter(BigDecimal freqCounter) {
        this.freqCounter = freqCounter;
    }

    public BigDecimal getFreqInterval() {
        return freqInterval;
    }

    public void setFreqInterval(BigDecimal freqInterval) {
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

    public LocalDateTime getEnterDateTime() {
        return enterDateTime;
    }

    public void setEnterDateTime(LocalDateTime enterDateTime) {
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

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public Integer getVisitIdOld() {
        return visitIdOld;
    }

    public void setVisitIdOld(Integer visitIdOld) {
        this.visitIdOld = visitIdOld;
    }

    @Override
    public String toString() {
        return "ViewEmOrder{" +
        "patientId=" + patientId +
        ", visitId=" + visitId +
        ", orderNo=" + orderNo +
        ", orderSubNo=" + orderSubNo +
        ", repeatIndicator=" + repeatIndicator +
        ", orderClass=" + orderClass +
        ", orderText=" + orderText +
        ", orderCode=" + orderCode +
        ", dosage=" + dosage +
        ", dosageUnits=" + dosageUnits +
        ", administration=" + administration +
        ", useName=" + useName +
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
        ", spec=" + spec +
        ", cancelDate=" + cancelDate +
        ", seeNo=" + seeNo +
        ", visitIdOld=" + visitIdOld +
        "}";
    }
}
