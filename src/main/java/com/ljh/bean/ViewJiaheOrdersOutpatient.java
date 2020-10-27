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
public class ViewJiaheOrdersOutpatient implements Serializable {

    private static final long serialVersionUID=1L;

    private String hospitalNo;

    private String patientId;

    private String reportNo;

    private String drugName;

    private String drugCode;

    private String drugStandard;

    private BigDecimal drugUnitPrice;

    private String drugDosageForms;

    private BigDecimal drugDose;

    private String baseunit;

    private String drugFrequency;

    private BigDecimal medicationDays;

    private String dc;

    private String drugUsage;

    private String costType;

    private BigDecimal drugQuantity;

    private BigDecimal totalCost;

    private String standardCode;

    private String drugAllergy;

    private String remark;

    private Integer orderNo;

    private LocalDateTime orderDate;


    public String getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugStandard() {
        return drugStandard;
    }

    public void setDrugStandard(String drugStandard) {
        this.drugStandard = drugStandard;
    }

    public BigDecimal getDrugUnitPrice() {
        return drugUnitPrice;
    }

    public void setDrugUnitPrice(BigDecimal drugUnitPrice) {
        this.drugUnitPrice = drugUnitPrice;
    }

    public String getDrugDosageForms() {
        return drugDosageForms;
    }

    public void setDrugDosageForms(String drugDosageForms) {
        this.drugDosageForms = drugDosageForms;
    }

    public BigDecimal getDrugDose() {
        return drugDose;
    }

    public void setDrugDose(BigDecimal drugDose) {
        this.drugDose = drugDose;
    }

    public String getBaseunit() {
        return baseunit;
    }

    public void setBaseunit(String baseunit) {
        this.baseunit = baseunit;
    }

    public String getDrugFrequency() {
        return drugFrequency;
    }

    public void setDrugFrequency(String drugFrequency) {
        this.drugFrequency = drugFrequency;
    }

    public BigDecimal getMedicationDays() {
        return medicationDays;
    }

    public void setMedicationDays(BigDecimal medicationDays) {
        this.medicationDays = medicationDays;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getDrugUsage() {
        return drugUsage;
    }

    public void setDrugUsage(String drugUsage) {
        this.drugUsage = drugUsage;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public BigDecimal getDrugQuantity() {
        return drugQuantity;
    }

    public void setDrugQuantity(BigDecimal drugQuantity) {
        this.drugQuantity = drugQuantity;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public String getStandardCode() {
        return standardCode;
    }

    public void setStandardCode(String standardCode) {
        this.standardCode = standardCode;
    }

    public String getDrugAllergy() {
        return drugAllergy;
    }

    public void setDrugAllergy(String drugAllergy) {
        this.drugAllergy = drugAllergy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "ViewJiaheOrdersOutpatient{" +
        "hospitalNo=" + hospitalNo +
        ", patientId=" + patientId +
        ", reportNo=" + reportNo +
        ", drugName=" + drugName +
        ", drugCode=" + drugCode +
        ", drugStandard=" + drugStandard +
        ", drugUnitPrice=" + drugUnitPrice +
        ", drugDosageForms=" + drugDosageForms +
        ", drugDose=" + drugDose +
        ", baseunit=" + baseunit +
        ", drugFrequency=" + drugFrequency +
        ", medicationDays=" + medicationDays +
        ", dc=" + dc +
        ", drugUsage=" + drugUsage +
        ", costType=" + costType +
        ", drugQuantity=" + drugQuantity +
        ", totalCost=" + totalCost +
        ", standardCode=" + standardCode +
        ", drugAllergy=" + drugAllergy +
        ", remark=" + remark +
        ", orderNo=" + orderNo +
        ", orderDate=" + orderDate +
        "}";
    }
}
