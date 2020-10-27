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
public class VAppRecipeDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String mcardNo;

    private String cardnoJyt;

    private String accessPatId;

    private String patName;

    private String accPresId;

    private String prescriptionType;

    private String prescriptionNo;

    private LocalDateTime prescriptionDate;

    private String prescriptionName;

    private String drugCode;

    private String drugName;

    private String drugTradeName;

    private String drugSpec;

    private String drugNum;

    private String dosage;

    private String drugUsage;

    private String guidelines;

    private String remark;


    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getAccessPatId() {
        return accessPatId;
    }

    public void setAccessPatId(String accessPatId) {
        this.accessPatId = accessPatId;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getAccPresId() {
        return accPresId;
    }

    public void setAccPresId(String accPresId) {
        this.accPresId = accPresId;
    }

    public String getPrescriptionType() {
        return prescriptionType;
    }

    public void setPrescriptionType(String prescriptionType) {
        this.prescriptionType = prescriptionType;
    }

    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    public LocalDateTime getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(LocalDateTime prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugTradeName() {
        return drugTradeName;
    }

    public void setDrugTradeName(String drugTradeName) {
        this.drugTradeName = drugTradeName;
    }

    public String getDrugSpec() {
        return drugSpec;
    }

    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec;
    }

    public String getDrugNum() {
        return drugNum;
    }

    public void setDrugNum(String drugNum) {
        this.drugNum = drugNum;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDrugUsage() {
        return drugUsage;
    }

    public void setDrugUsage(String drugUsage) {
        this.drugUsage = drugUsage;
    }

    public String getGuidelines() {
        return guidelines;
    }

    public void setGuidelines(String guidelines) {
        this.guidelines = guidelines;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "VAppRecipeDetail{" +
        "mcardNo=" + mcardNo +
        ", cardnoJyt=" + cardnoJyt +
        ", accessPatId=" + accessPatId +
        ", patName=" + patName +
        ", accPresId=" + accPresId +
        ", prescriptionType=" + prescriptionType +
        ", prescriptionNo=" + prescriptionNo +
        ", prescriptionDate=" + prescriptionDate +
        ", prescriptionName=" + prescriptionName +
        ", drugCode=" + drugCode +
        ", drugName=" + drugName +
        ", drugTradeName=" + drugTradeName +
        ", drugSpec=" + drugSpec +
        ", drugNum=" + drugNum +
        ", dosage=" + dosage +
        ", drugUsage=" + drugUsage +
        ", guidelines=" + guidelines +
        ", remark=" + remark +
        "}";
    }
}
