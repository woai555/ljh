package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_DS_STORAGE
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewDsStorage implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugStorageCode;

    private String drugType;

    private String placecode;

    private String mCode;

    private String tradeName;

    private String tradeCode;

    private String formalName;

    private String formalCode;

    private String englishName;

    private String userCode;

    private BigDecimal storeSum;

    private BigDecimal baseDose;

    private String doseUnit;

    private String minUnit;

    private String packUnit;

    private Integer packQty;

    private String specs;

    private String frequencyCode;

    private String onceUnit;

    private BigDecimal onceDose;

    private String useWayCode;

    private String doseModelCode;

    private String drugQuality;

    private BigDecimal salePrice;

    private BigDecimal tradePrice;

    private String drugCode;

    private BigDecimal lowestStoreSum;

    private BigDecimal topStoreSum;

    private BigDecimal needBatch;


    public String getDrugStorageCode() {
        return drugStorageCode;
    }

    public void setDrugStorageCode(String drugStorageCode) {
        this.drugStorageCode = drugStorageCode;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getPlacecode() {
        return placecode;
    }

    public void setPlacecode(String placecode) {
        this.placecode = placecode;
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

    public String getFormalName() {
        return formalName;
    }

    public void setFormalName(String formalName) {
        this.formalName = formalName;
    }

    public String getFormalCode() {
        return formalCode;
    }

    public void setFormalCode(String formalCode) {
        this.formalCode = formalCode;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public BigDecimal getStoreSum() {
        return storeSum;
    }

    public void setStoreSum(BigDecimal storeSum) {
        this.storeSum = storeSum;
    }

    public BigDecimal getBaseDose() {
        return baseDose;
    }

    public void setBaseDose(BigDecimal baseDose) {
        this.baseDose = baseDose;
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit;
    }

    public String getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(String minUnit) {
        this.minUnit = minUnit;
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

    public String getFrequencyCode() {
        return frequencyCode;
    }

    public void setFrequencyCode(String frequencyCode) {
        this.frequencyCode = frequencyCode;
    }

    public String getOnceUnit() {
        return onceUnit;
    }

    public void setOnceUnit(String onceUnit) {
        this.onceUnit = onceUnit;
    }

    public BigDecimal getOnceDose() {
        return onceDose;
    }

    public void setOnceDose(BigDecimal onceDose) {
        this.onceDose = onceDose;
    }

    public String getUseWayCode() {
        return useWayCode;
    }

    public void setUseWayCode(String useWayCode) {
        this.useWayCode = useWayCode;
    }

    public String getDoseModelCode() {
        return doseModelCode;
    }

    public void setDoseModelCode(String doseModelCode) {
        this.doseModelCode = doseModelCode;
    }

    public String getDrugQuality() {
        return drugQuality;
    }

    public void setDrugQuality(String drugQuality) {
        this.drugQuality = drugQuality;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(BigDecimal tradePrice) {
        this.tradePrice = tradePrice;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public BigDecimal getLowestStoreSum() {
        return lowestStoreSum;
    }

    public void setLowestStoreSum(BigDecimal lowestStoreSum) {
        this.lowestStoreSum = lowestStoreSum;
    }

    public BigDecimal getTopStoreSum() {
        return topStoreSum;
    }

    public void setTopStoreSum(BigDecimal topStoreSum) {
        this.topStoreSum = topStoreSum;
    }

    public BigDecimal getNeedBatch() {
        return needBatch;
    }

    public void setNeedBatch(BigDecimal needBatch) {
        this.needBatch = needBatch;
    }

    @Override
    public String toString() {
        return "ViewDsStorage{" +
        "drugStorageCode=" + drugStorageCode +
        ", drugType=" + drugType +
        ", placecode=" + placecode +
        ", mCode=" + mCode +
        ", tradeName=" + tradeName +
        ", tradeCode=" + tradeCode +
        ", formalName=" + formalName +
        ", formalCode=" + formalCode +
        ", englishName=" + englishName +
        ", userCode=" + userCode +
        ", storeSum=" + storeSum +
        ", baseDose=" + baseDose +
        ", doseUnit=" + doseUnit +
        ", minUnit=" + minUnit +
        ", packUnit=" + packUnit +
        ", packQty=" + packQty +
        ", specs=" + specs +
        ", frequencyCode=" + frequencyCode +
        ", onceUnit=" + onceUnit +
        ", onceDose=" + onceDose +
        ", useWayCode=" + useWayCode +
        ", doseModelCode=" + doseModelCode +
        ", drugQuality=" + drugQuality +
        ", salePrice=" + salePrice +
        ", tradePrice=" + tradePrice +
        ", drugCode=" + drugCode +
        ", lowestStoreSum=" + lowestStoreSum +
        ", topStoreSum=" + topStoreSum +
        ", needBatch=" + needBatch +
        "}";
    }
}
