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
public class ViewMrmsTt implements Serializable {

    private static final long serialVersionUID=1L;

    private String recipeNo;

    private Integer sequenceNo;

    private String cardNo;

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

    private String minusStockFlag;

    private String operCode;

    private LocalDateTime operDate;

    private String transType;

    private String invoiceNo;

    private String drugName;

    private String specs;

    private String drugDeptCode;

    private String deptCode;

    private String chargeOperCode;

    private String sendOperCode;

    private String paykindCode;

    private String djbFlag;

    private Integer days;

    private String checkOperCode;

    private String receiveOperCode;

    private String batchNo;

    private String ipaddress;

    private String macaddress;

    private String machinename;


    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
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

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getDrugDeptCode() {
        return drugDeptCode;
    }

    public void setDrugDeptCode(String drugDeptCode) {
        this.drugDeptCode = drugDeptCode;
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

    public String getSendOperCode() {
        return sendOperCode;
    }

    public void setSendOperCode(String sendOperCode) {
        this.sendOperCode = sendOperCode;
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

    @Override
    public String toString() {
        return "ViewMrmsTt{" +
        "recipeNo=" + recipeNo +
        ", sequenceNo=" + sequenceNo +
        ", cardNo=" + cardNo +
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
        ", minusStockFlag=" + minusStockFlag +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", transType=" + transType +
        ", invoiceNo=" + invoiceNo +
        ", drugName=" + drugName +
        ", specs=" + specs +
        ", drugDeptCode=" + drugDeptCode +
        ", deptCode=" + deptCode +
        ", chargeOperCode=" + chargeOperCode +
        ", sendOperCode=" + sendOperCode +
        ", paykindCode=" + paykindCode +
        ", djbFlag=" + djbFlag +
        ", days=" + days +
        ", checkOperCode=" + checkOperCode +
        ", receiveOperCode=" + receiveOperCode +
        ", batchNo=" + batchNo +
        ", ipaddress=" + ipaddress +
        ", macaddress=" + macaddress +
        ", machinename=" + machinename +
        "}";
    }
}
