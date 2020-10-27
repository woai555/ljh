package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_INFO_INSTORE
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewInfoInstore implements Serializable {

    private static final long serialVersionUID=1L;

    private String nationalCode;

    private String mCode;

    private String tradeName;

    private String tradeCode;

    private String packUnit;

    private Integer packQty;

    private String specs;

    private String usageCode;

    private BigDecimal tradePrice;

    private BigDecimal salePrice;

    private String placeCode;

    private String wbCode;

    private String producer;

    private String drugCode;

    private String drugType;

    private String drugQuality;

    private String batchNo;

    private LocalDateTime validDate;

    private BigDecimal storeSum;

    private String operCode;

    private String drugDeptCode;

    private BigDecimal approvePrice;

    private Integer priceNo;


    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getmCode() {
        return mCode;
    }

    public void setmCode(String mCode) {
        this.mCode = mCode;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getPackUnit() {
        return packUnit;
    }

    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit;
    }

    public Integer getPackQty() {
        return packQty;
    }

    public void setPackQty(Integer packQty) {
        this.packQty = packQty;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode;
    }

    public BigDecimal getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(BigDecimal tradePrice) {
        this.tradePrice = tradePrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode = wbCode;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getDrugQuality() {
        return drugQuality;
    }

    public void setDrugQuality(String drugQuality) {
        this.drugQuality = drugQuality;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public LocalDateTime getValidDate() {
        return validDate;
    }

    public void setValidDate(LocalDateTime validDate) {
        this.validDate = validDate;
    }

    public BigDecimal getStoreSum() {
        return storeSum;
    }

    public void setStoreSum(BigDecimal storeSum) {
        this.storeSum = storeSum;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getDrugDeptCode() {
        return drugDeptCode;
    }

    public void setDrugDeptCode(String drugDeptCode) {
        this.drugDeptCode = drugDeptCode;
    }

    public BigDecimal getApprovePrice() {
        return approvePrice;
    }

    public void setApprovePrice(BigDecimal approvePrice) {
        this.approvePrice = approvePrice;
    }

    public Integer getPriceNo() {
        return priceNo;
    }

    public void setPriceNo(Integer priceNo) {
        this.priceNo = priceNo;
    }

    @Override
    public String toString() {
        return "ViewInfoInstore{" +
        "nationalCode=" + nationalCode +
        ", mCode=" + mCode +
        ", tradeName=" + tradeName +
        ", tradeCode=" + tradeCode +
        ", packUnit=" + packUnit +
        ", packQty=" + packQty +
        ", specs=" + specs +
        ", usageCode=" + usageCode +
        ", tradePrice=" + tradePrice +
        ", salePrice=" + salePrice +
        ", placeCode=" + placeCode +
        ", wbCode=" + wbCode +
        ", producer=" + producer +
        ", drugCode=" + drugCode +
        ", drugType=" + drugType +
        ", drugQuality=" + drugQuality +
        ", batchNo=" + batchNo +
        ", validDate=" + validDate +
        ", storeSum=" + storeSum +
        ", operCode=" + operCode +
        ", drugDeptCode=" + drugDeptCode +
        ", approvePrice=" + approvePrice +
        ", priceNo=" + priceNo +
        "}";
    }
}
