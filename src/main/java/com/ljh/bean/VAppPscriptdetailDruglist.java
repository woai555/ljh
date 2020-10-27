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
public class VAppPscriptdetailDruglist implements Serializable {

    private static final long serialVersionUID=1L;

    private String hisPscriptNo;

    private String visitId;

    private String rpTitle;

    private String rpType;

    private LocalDateTime createTime;

    private LocalDateTime operDate;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String idCard;

    private String idCardType;

    private String mcardNo;

    private String cardnoJyt;

    private String docName;

    private String deptName;

    private String totalAmount;

    private String selfPayAmount;

    private String insuranceAmount;

    private String docAdmonish;

    private String drugName;

    private String drugSpec;

    private String drugAmount;

    private String usage;

    private String frequency;

    private BigDecimal dosage;

    private String tcmRpUsage;

    private String tcmRpAmount;

    private String drugCode;

    private BigDecimal drugPrice;

    private BigDecimal useDays;

    private BigDecimal ageDesc;

    private String sex;

    private String diagResult;

    private String hisDiagCode;

    private String cardNo;

    private LocalDateTime regDate;


    public String getHisPscriptNo() {
        return hisPscriptNo;
    }

    public void setHisPscriptNo(String hisPscriptNo) {
        this.hisPscriptNo = hisPscriptNo;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getRpTitle() {
        return rpTitle;
    }

    public void setRpTitle(String rpTitle) {
        this.rpTitle = rpTitle;
    }

    public String getRpType() {
        return rpType;
    }

    public void setRpType(String rpType) {
        this.rpType = rpType;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

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

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSelfPayAmount() {
        return selfPayAmount;
    }

    public void setSelfPayAmount(String selfPayAmount) {
        this.selfPayAmount = selfPayAmount;
    }

    public String getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(String insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public String getDocAdmonish() {
        return docAdmonish;
    }

    public void setDocAdmonish(String docAdmonish) {
        this.docAdmonish = docAdmonish;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugSpec() {
        return drugSpec;
    }

    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec;
    }

    public String getDrugAmount() {
        return drugAmount;
    }

    public void setDrugAmount(String drugAmount) {
        this.drugAmount = drugAmount;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public BigDecimal getDosage() {
        return dosage;
    }

    public void setDosage(BigDecimal dosage) {
        this.dosage = dosage;
    }

    public String getTcmRpUsage() {
        return tcmRpUsage;
    }

    public void setTcmRpUsage(String tcmRpUsage) {
        this.tcmRpUsage = tcmRpUsage;
    }

    public String getTcmRpAmount() {
        return tcmRpAmount;
    }

    public void setTcmRpAmount(String tcmRpAmount) {
        this.tcmRpAmount = tcmRpAmount;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public BigDecimal getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(BigDecimal drugPrice) {
        this.drugPrice = drugPrice;
    }

    public BigDecimal getUseDays() {
        return useDays;
    }

    public void setUseDays(BigDecimal useDays) {
        this.useDays = useDays;
    }

    public BigDecimal getAgeDesc() {
        return ageDesc;
    }

    public void setAgeDesc(BigDecimal ageDesc) {
        this.ageDesc = ageDesc;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDiagResult() {
        return diagResult;
    }

    public void setDiagResult(String diagResult) {
        this.diagResult = diagResult;
    }

    public String getHisDiagCode() {
        return hisDiagCode;
    }

    public void setHisDiagCode(String hisDiagCode) {
        this.hisDiagCode = hisDiagCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "VAppPscriptdetailDruglist{" +
        "hisPscriptNo=" + hisPscriptNo +
        ", visitId=" + visitId +
        ", rpTitle=" + rpTitle +
        ", rpType=" + rpType +
        ", createTime=" + createTime +
        ", operDate=" + operDate +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", idCard=" + idCard +
        ", idCardType=" + idCardType +
        ", mcardNo=" + mcardNo +
        ", cardnoJyt=" + cardnoJyt +
        ", docName=" + docName +
        ", deptName=" + deptName +
        ", totalAmount=" + totalAmount +
        ", selfPayAmount=" + selfPayAmount +
        ", insuranceAmount=" + insuranceAmount +
        ", docAdmonish=" + docAdmonish +
        ", drugName=" + drugName +
        ", drugSpec=" + drugSpec +
        ", drugAmount=" + drugAmount +
        ", usage=" + usage +
        ", frequency=" + frequency +
        ", dosage=" + dosage +
        ", tcmRpUsage=" + tcmRpUsage +
        ", tcmRpAmount=" + tcmRpAmount +
        ", drugCode=" + drugCode +
        ", drugPrice=" + drugPrice +
        ", useDays=" + useDays +
        ", ageDesc=" + ageDesc +
        ", sex=" + sex +
        ", diagResult=" + diagResult +
        ", hisDiagCode=" + hisDiagCode +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        "}";
    }
}
