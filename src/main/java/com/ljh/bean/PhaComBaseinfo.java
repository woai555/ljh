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
public class PhaComBaseinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugCode;

    private String nationalCode;

    private String mCode;

    private String tradeName;

    private String tradeCode;

    private String formalName;

    private String formalCode;

    private String englishName;

    private String userCode;

    private BigDecimal baseDose;

    private String doseUnit;

    private String minUnit;

    private String packUnit;

    private Integer packQty;

    private String specs;

    private String usageCode;

    private String frequencyCode;

    private String onceUnit;

    private BigDecimal onceDose;

    private String useWayCode;

    private String doseModelCode;

    private String homeMade;

    private String drugType;

    private String drugQuality;

    private String payRule;

    private String approveInfo;

    private String producer;

    private BigDecimal tradePrice;

    private BigDecimal approvePrice;

    private BigDecimal salePrice;

    private BigDecimal pubPrice;

    private BigDecimal payPrice;

    private BigDecimal ownPrice;

    private BigDecimal emergRatio;

    private BigDecimal emergPubRatio;

    private BigDecimal emergPayRatio;

    private BigDecimal emergOwnRatio;

    private String appendItem;

    private String lackDrug;

    private BigDecimal actualRate;

    private String companyCode;

    private BigDecimal lowestStoreSum;

    private BigDecimal needBatch;

    private BigDecimal topStoreSum;

    private String drugDeptCode;

    private String placeCode;

    private String operCode;

    private LocalDateTime operDate;

    private String priceMode;

    private String wbCode;

    private String drugUse;

    private String mark;

    private BigDecimal pubRate;

    private String itemGrade;

    private String stopItem;

    private String oldCode;

    private String drugManager;

    private String currentCode;

    private String currentName;

    private String currentWb;

    private String drugbyname;

    private String bynamespell;

    private String antibioticType;

    private Integer psyFlag;

    private Integer ynIncitant;

    private Integer ynzfy;

    private BigDecimal druglevel;

    private BigDecimal limitOnce;

    private BigDecimal limitDay;

    private String hhCode;


    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

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

    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode;
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

    public String getHomeMade() {
        return homeMade;
    }

    public void setHomeMade(String homeMade) {
        this.homeMade = homeMade;
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

    public String getPayRule() {
        return payRule;
    }

    public void setPayRule(String payRule) {
        this.payRule = payRule;
    }

    public String getApproveInfo() {
        return approveInfo;
    }

    public void setApproveInfo(String approveInfo) {
        this.approveInfo = approveInfo;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public BigDecimal getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(BigDecimal tradePrice) {
        this.tradePrice = tradePrice;
    }

    public BigDecimal getApprovePrice() {
        return approvePrice;
    }

    public void setApprovePrice(BigDecimal approvePrice) {
        this.approvePrice = approvePrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getPubPrice() {
        return pubPrice;
    }

    public void setPubPrice(BigDecimal pubPrice) {
        this.pubPrice = pubPrice;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public BigDecimal getOwnPrice() {
        return ownPrice;
    }

    public void setOwnPrice(BigDecimal ownPrice) {
        this.ownPrice = ownPrice;
    }

    public BigDecimal getEmergRatio() {
        return emergRatio;
    }

    public void setEmergRatio(BigDecimal emergRatio) {
        this.emergRatio = emergRatio;
    }

    public BigDecimal getEmergPubRatio() {
        return emergPubRatio;
    }

    public void setEmergPubRatio(BigDecimal emergPubRatio) {
        this.emergPubRatio = emergPubRatio;
    }

    public BigDecimal getEmergPayRatio() {
        return emergPayRatio;
    }

    public void setEmergPayRatio(BigDecimal emergPayRatio) {
        this.emergPayRatio = emergPayRatio;
    }

    public BigDecimal getEmergOwnRatio() {
        return emergOwnRatio;
    }

    public void setEmergOwnRatio(BigDecimal emergOwnRatio) {
        this.emergOwnRatio = emergOwnRatio;
    }

    public String getAppendItem() {
        return appendItem;
    }

    public void setAppendItem(String appendItem) {
        this.appendItem = appendItem;
    }

    public String getLackDrug() {
        return lackDrug;
    }

    public void setLackDrug(String lackDrug) {
        this.lackDrug = lackDrug;
    }

    public BigDecimal getActualRate() {
        return actualRate;
    }

    public void setActualRate(BigDecimal actualRate) {
        this.actualRate = actualRate;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public BigDecimal getLowestStoreSum() {
        return lowestStoreSum;
    }

    public void setLowestStoreSum(BigDecimal lowestStoreSum) {
        this.lowestStoreSum = lowestStoreSum;
    }

    public BigDecimal getNeedBatch() {
        return needBatch;
    }

    public void setNeedBatch(BigDecimal needBatch) {
        this.needBatch = needBatch;
    }

    public BigDecimal getTopStoreSum() {
        return topStoreSum;
    }

    public void setTopStoreSum(BigDecimal topStoreSum) {
        this.topStoreSum = topStoreSum;
    }

    public String getDrugDeptCode() {
        return drugDeptCode;
    }

    public void setDrugDeptCode(String drugDeptCode) {
        this.drugDeptCode = drugDeptCode;
    }

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
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

    public String getPriceMode() {
        return priceMode;
    }

    public void setPriceMode(String priceMode) {
        this.priceMode = priceMode;
    }

    public String getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode = wbCode;
    }

    public String getDrugUse() {
        return drugUse;
    }

    public void setDrugUse(String drugUse) {
        this.drugUse = drugUse;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public BigDecimal getPubRate() {
        return pubRate;
    }

    public void setPubRate(BigDecimal pubRate) {
        this.pubRate = pubRate;
    }

    public String getItemGrade() {
        return itemGrade;
    }

    public void setItemGrade(String itemGrade) {
        this.itemGrade = itemGrade;
    }

    public String getStopItem() {
        return stopItem;
    }

    public void setStopItem(String stopItem) {
        this.stopItem = stopItem;
    }

    public String getOldCode() {
        return oldCode;
    }

    public void setOldCode(String oldCode) {
        this.oldCode = oldCode;
    }

    public String getDrugManager() {
        return drugManager;
    }

    public void setDrugManager(String drugManager) {
        this.drugManager = drugManager;
    }

    public String getCurrentCode() {
        return currentCode;
    }

    public void setCurrentCode(String currentCode) {
        this.currentCode = currentCode;
    }

    public String getCurrentName() {
        return currentName;
    }

    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    public String getCurrentWb() {
        return currentWb;
    }

    public void setCurrentWb(String currentWb) {
        this.currentWb = currentWb;
    }

    public String getDrugbyname() {
        return drugbyname;
    }

    public void setDrugbyname(String drugbyname) {
        this.drugbyname = drugbyname;
    }

    public String getBynamespell() {
        return bynamespell;
    }

    public void setBynamespell(String bynamespell) {
        this.bynamespell = bynamespell;
    }

    public String getAntibioticType() {
        return antibioticType;
    }

    public void setAntibioticType(String antibioticType) {
        this.antibioticType = antibioticType;
    }

    public Integer getPsyFlag() {
        return psyFlag;
    }

    public void setPsyFlag(Integer psyFlag) {
        this.psyFlag = psyFlag;
    }

    public Integer getYnIncitant() {
        return ynIncitant;
    }

    public void setYnIncitant(Integer ynIncitant) {
        this.ynIncitant = ynIncitant;
    }

    public Integer getYnzfy() {
        return ynzfy;
    }

    public void setYnzfy(Integer ynzfy) {
        this.ynzfy = ynzfy;
    }

    public BigDecimal getDruglevel() {
        return druglevel;
    }

    public void setDruglevel(BigDecimal druglevel) {
        this.druglevel = druglevel;
    }

    public BigDecimal getLimitOnce() {
        return limitOnce;
    }

    public void setLimitOnce(BigDecimal limitOnce) {
        this.limitOnce = limitOnce;
    }

    public BigDecimal getLimitDay() {
        return limitDay;
    }

    public void setLimitDay(BigDecimal limitDay) {
        this.limitDay = limitDay;
    }

    public String getHhCode() {
        return hhCode;
    }

    public void setHhCode(String hhCode) {
        this.hhCode = hhCode;
    }

    @Override
    public String toString() {
        return "PhaComBaseinfo{" +
        "drugCode=" + drugCode +
        ", nationalCode=" + nationalCode +
        ", mCode=" + mCode +
        ", tradeName=" + tradeName +
        ", tradeCode=" + tradeCode +
        ", formalName=" + formalName +
        ", formalCode=" + formalCode +
        ", englishName=" + englishName +
        ", userCode=" + userCode +
        ", baseDose=" + baseDose +
        ", doseUnit=" + doseUnit +
        ", minUnit=" + minUnit +
        ", packUnit=" + packUnit +
        ", packQty=" + packQty +
        ", specs=" + specs +
        ", usageCode=" + usageCode +
        ", frequencyCode=" + frequencyCode +
        ", onceUnit=" + onceUnit +
        ", onceDose=" + onceDose +
        ", useWayCode=" + useWayCode +
        ", doseModelCode=" + doseModelCode +
        ", homeMade=" + homeMade +
        ", drugType=" + drugType +
        ", drugQuality=" + drugQuality +
        ", payRule=" + payRule +
        ", approveInfo=" + approveInfo +
        ", producer=" + producer +
        ", tradePrice=" + tradePrice +
        ", approvePrice=" + approvePrice +
        ", salePrice=" + salePrice +
        ", pubPrice=" + pubPrice +
        ", payPrice=" + payPrice +
        ", ownPrice=" + ownPrice +
        ", emergRatio=" + emergRatio +
        ", emergPubRatio=" + emergPubRatio +
        ", emergPayRatio=" + emergPayRatio +
        ", emergOwnRatio=" + emergOwnRatio +
        ", appendItem=" + appendItem +
        ", lackDrug=" + lackDrug +
        ", actualRate=" + actualRate +
        ", companyCode=" + companyCode +
        ", lowestStoreSum=" + lowestStoreSum +
        ", needBatch=" + needBatch +
        ", topStoreSum=" + topStoreSum +
        ", drugDeptCode=" + drugDeptCode +
        ", placeCode=" + placeCode +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", priceMode=" + priceMode +
        ", wbCode=" + wbCode +
        ", drugUse=" + drugUse +
        ", mark=" + mark +
        ", pubRate=" + pubRate +
        ", itemGrade=" + itemGrade +
        ", stopItem=" + stopItem +
        ", oldCode=" + oldCode +
        ", drugManager=" + drugManager +
        ", currentCode=" + currentCode +
        ", currentName=" + currentName +
        ", currentWb=" + currentWb +
        ", drugbyname=" + drugbyname +
        ", bynamespell=" + bynamespell +
        ", antibioticType=" + antibioticType +
        ", psyFlag=" + psyFlag +
        ", ynIncitant=" + ynIncitant +
        ", ynzfy=" + ynzfy +
        ", druglevel=" + druglevel +
        ", limitOnce=" + limitOnce +
        ", limitDay=" + limitDay +
        ", hhCode=" + hhCode +
        "}";
    }
}
