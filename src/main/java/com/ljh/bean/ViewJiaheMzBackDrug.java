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
public class ViewJiaheMzBackDrug implements Serializable {

    private static final long serialVersionUID=1L;

    private String prescNo;

    private Integer sequenceNo;

    private String outpId;

    private LocalDateTime regDate;

    private String drugCode;

    private String recipeFlag;

    private BigDecimal unitPrice;

    private Integer packQty;

    private BigDecimal backQty;

    private String minUnit;

    private BigDecimal pubCost;

    private BigDecimal payCost;

    private BigDecimal ownCost;

    private String stockCode;

    private String stockName;

    private String minusStockFlag;

    private String operCode;

    private LocalDateTime dispensingTime;

    private String transType;

    private String dispensingNo;

    private String pharmacyName;

    private String specs;

    private String deptCode;

    private String chargeOperCode;

    private String dispenser;

    private String dispenserName;

    private String paykindCode;

    private String djbFlag;

    private Integer days;

    private String checkOperCode;

    private String receiveOperCode;

    private String batchNo;

    private String ipaddress;

    private String macaddress;

    private String machinename;

    private BigDecimal storeSumBeforeUpdate;

    private String commentPerson;

    private String commentPersonName;

    private LocalDateTime commentTime;

    private String provisionPerson;

    private String provisionPersonName;

    private LocalDateTime provisionBeginTime;

    private LocalDateTime provisionEndTime;

    private String auditPerson;

    private String auditPersonName;

    private LocalDateTime auditTime;

    private String patientId;

    private String dispersingWindow;

    private String visitType;


    public String getPrescNo() {
        return prescNo;
    }

    public void setPrescNo(String prescNo) {
        this.prescNo = prescNo;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getOutpId() {
        return outpId;
    }

    public void setOutpId(String outpId) {
        this.outpId = outpId;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getRecipeFlag() {
        return recipeFlag;
    }

    public void setRecipeFlag(String recipeFlag) {
        this.recipeFlag = recipeFlag;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getPackQty() {
        return packQty;
    }

    public void setPackQty(Integer packQty) {
        this.packQty = packQty;
    }

    public BigDecimal getBackQty() {
        return backQty;
    }

    public void setBackQty(BigDecimal backQty) {
        this.backQty = backQty;
    }

    public String getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(String minUnit) {
        this.minUnit = minUnit;
    }

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public BigDecimal getPayCost() {
        return payCost;
    }

    public void setPayCost(BigDecimal payCost) {
        this.payCost = payCost;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getMinusStockFlag() {
        return minusStockFlag;
    }

    public void setMinusStockFlag(String minusStockFlag) {
        this.minusStockFlag = minusStockFlag;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getDispensingTime() {
        return dispensingTime;
    }

    public void setDispensingTime(LocalDateTime dispensingTime) {
        this.dispensingTime = dispensingTime;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getDispensingNo() {
        return dispensingNo;
    }

    public void setDispensingNo(String dispensingNo) {
        this.dispensingNo = dispensingNo;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getChargeOperCode() {
        return chargeOperCode;
    }

    public void setChargeOperCode(String chargeOperCode) {
        this.chargeOperCode = chargeOperCode;
    }

    public String getDispenser() {
        return dispenser;
    }

    public void setDispenser(String dispenser) {
        this.dispenser = dispenser;
    }

    public String getDispenserName() {
        return dispenserName;
    }

    public void setDispenserName(String dispenserName) {
        this.dispenserName = dispenserName;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getDjbFlag() {
        return djbFlag;
    }

    public void setDjbFlag(String djbFlag) {
        this.djbFlag = djbFlag;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getCheckOperCode() {
        return checkOperCode;
    }

    public void setCheckOperCode(String checkOperCode) {
        this.checkOperCode = checkOperCode;
    }

    public String getReceiveOperCode() {
        return receiveOperCode;
    }

    public void setReceiveOperCode(String receiveOperCode) {
        this.receiveOperCode = receiveOperCode;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    public String getMachinename() {
        return machinename;
    }

    public void setMachinename(String machinename) {
        this.machinename = machinename;
    }

    public BigDecimal getStoreSumBeforeUpdate() {
        return storeSumBeforeUpdate;
    }

    public void setStoreSumBeforeUpdate(BigDecimal storeSumBeforeUpdate) {
        this.storeSumBeforeUpdate = storeSumBeforeUpdate;
    }

    public String getCommentPerson() {
        return commentPerson;
    }

    public void setCommentPerson(String commentPerson) {
        this.commentPerson = commentPerson;
    }

    public String getCommentPersonName() {
        return commentPersonName;
    }

    public void setCommentPersonName(String commentPersonName) {
        this.commentPersonName = commentPersonName;
    }

    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(LocalDateTime commentTime) {
        this.commentTime = commentTime;
    }

    public String getProvisionPerson() {
        return provisionPerson;
    }

    public void setProvisionPerson(String provisionPerson) {
        this.provisionPerson = provisionPerson;
    }

    public String getProvisionPersonName() {
        return provisionPersonName;
    }

    public void setProvisionPersonName(String provisionPersonName) {
        this.provisionPersonName = provisionPersonName;
    }

    public LocalDateTime getProvisionBeginTime() {
        return provisionBeginTime;
    }

    public void setProvisionBeginTime(LocalDateTime provisionBeginTime) {
        this.provisionBeginTime = provisionBeginTime;
    }

    public LocalDateTime getProvisionEndTime() {
        return provisionEndTime;
    }

    public void setProvisionEndTime(LocalDateTime provisionEndTime) {
        this.provisionEndTime = provisionEndTime;
    }

    public String getAuditPerson() {
        return auditPerson;
    }

    public void setAuditPerson(String auditPerson) {
        this.auditPerson = auditPerson;
    }

    public String getAuditPersonName() {
        return auditPersonName;
    }

    public void setAuditPersonName(String auditPersonName) {
        this.auditPersonName = auditPersonName;
    }

    public LocalDateTime getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(LocalDateTime auditTime) {
        this.auditTime = auditTime;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDispersingWindow() {
        return dispersingWindow;
    }

    public void setDispersingWindow(String dispersingWindow) {
        this.dispersingWindow = dispersingWindow;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzBackDrug{" +
        "prescNo=" + prescNo +
        ", sequenceNo=" + sequenceNo +
        ", outpId=" + outpId +
        ", regDate=" + regDate +
        ", drugCode=" + drugCode +
        ", recipeFlag=" + recipeFlag +
        ", unitPrice=" + unitPrice +
        ", packQty=" + packQty +
        ", backQty=" + backQty +
        ", minUnit=" + minUnit +
        ", pubCost=" + pubCost +
        ", payCost=" + payCost +
        ", ownCost=" + ownCost +
        ", stockCode=" + stockCode +
        ", stockName=" + stockName +
        ", minusStockFlag=" + minusStockFlag +
        ", operCode=" + operCode +
        ", dispensingTime=" + dispensingTime +
        ", transType=" + transType +
        ", dispensingNo=" + dispensingNo +
        ", pharmacyName=" + pharmacyName +
        ", specs=" + specs +
        ", deptCode=" + deptCode +
        ", chargeOperCode=" + chargeOperCode +
        ", dispenser=" + dispenser +
        ", dispenserName=" + dispenserName +
        ", paykindCode=" + paykindCode +
        ", djbFlag=" + djbFlag +
        ", days=" + days +
        ", checkOperCode=" + checkOperCode +
        ", receiveOperCode=" + receiveOperCode +
        ", batchNo=" + batchNo +
        ", ipaddress=" + ipaddress +
        ", macaddress=" + macaddress +
        ", machinename=" + machinename +
        ", storeSumBeforeUpdate=" + storeSumBeforeUpdate +
        ", commentPerson=" + commentPerson +
        ", commentPersonName=" + commentPersonName +
        ", commentTime=" + commentTime +
        ", provisionPerson=" + provisionPerson +
        ", provisionPersonName=" + provisionPersonName +
        ", provisionBeginTime=" + provisionBeginTime +
        ", provisionEndTime=" + provisionEndTime +
        ", auditPerson=" + auditPerson +
        ", auditPersonName=" + auditPersonName +
        ", auditTime=" + auditTime +
        ", patientId=" + patientId +
        ", dispersingWindow=" + dispersingWindow +
        ", visitType=" + visitType +
        "}";
    }
}
