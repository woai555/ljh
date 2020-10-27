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
public class OutpSchemePerformedBak0818 implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String visitId;

    private LocalDateTime visitDate;

    private String prescriptionNo;

    private String orderNo;

    private Integer orderSubNo;

    private String orderCode;

    private String orderClass;

    private String orderTextM;

    private String orderTextB;

    private BigDecimal dosage;

    private String dosageUnits;

    private String administration;

    private String frequency;

    private String dutation;

    private String freqDetail;

    private String orderingDept;

    private String orderingDoc;

    private BigDecimal useDays;

    private String prescriptionDoc;

    private LocalDateTime prescriptionTime;


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

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }

    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderSubNo() {
        return orderSubNo;
    }

    public void setOrderSubNo(Integer orderSubNo) {
        this.orderSubNo = orderSubNo;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderClass() {
        return orderClass;
    }

    public void setOrderClass(String orderClass) {
        this.orderClass = orderClass;
    }

    public String getOrderTextM() {
        return orderTextM;
    }

    public void setOrderTextM(String orderTextM) {
        this.orderTextM = orderTextM;
    }

    public String getOrderTextB() {
        return orderTextB;
    }

    public void setOrderTextB(String orderTextB) {
        this.orderTextB = orderTextB;
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

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDutation() {
        return dutation;
    }

    public void setDutation(String dutation) {
        this.dutation = dutation;
    }

    public String getFreqDetail() {
        return freqDetail;
    }

    public void setFreqDetail(String freqDetail) {
        this.freqDetail = freqDetail;
    }

    public String getOrderingDept() {
        return orderingDept;
    }

    public void setOrderingDept(String orderingDept) {
        this.orderingDept = orderingDept;
    }

    public String getOrderingDoc() {
        return orderingDoc;
    }

    public void setOrderingDoc(String orderingDoc) {
        this.orderingDoc = orderingDoc;
    }

    public BigDecimal getUseDays() {
        return useDays;
    }

    public void setUseDays(BigDecimal useDays) {
        this.useDays = useDays;
    }

    public String getPrescriptionDoc() {
        return prescriptionDoc;
    }

    public void setPrescriptionDoc(String prescriptionDoc) {
        this.prescriptionDoc = prescriptionDoc;
    }

    public LocalDateTime getPrescriptionTime() {
        return prescriptionTime;
    }

    public void setPrescriptionTime(LocalDateTime prescriptionTime) {
        this.prescriptionTime = prescriptionTime;
    }

    @Override
    public String toString() {
        return "OutpSchemePerformedBak0818{" +
        "patientId=" + patientId +
        ", visitId=" + visitId +
        ", visitDate=" + visitDate +
        ", prescriptionNo=" + prescriptionNo +
        ", orderNo=" + orderNo +
        ", orderSubNo=" + orderSubNo +
        ", orderCode=" + orderCode +
        ", orderClass=" + orderClass +
        ", orderTextM=" + orderTextM +
        ", orderTextB=" + orderTextB +
        ", dosage=" + dosage +
        ", dosageUnits=" + dosageUnits +
        ", administration=" + administration +
        ", frequency=" + frequency +
        ", dutation=" + dutation +
        ", freqDetail=" + freqDetail +
        ", orderingDept=" + orderingDept +
        ", orderingDoc=" + orderingDoc +
        ", useDays=" + useDays +
        ", prescriptionDoc=" + prescriptionDoc +
        ", prescriptionTime=" + prescriptionTime +
        "}";
    }
}
