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
public class UndrugInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "UNDRUG_CODE", type = IdType.AUTO)
    private String undrugCode;

    private String undrugName;

    private String inputCode;

    private String spellCode;

    private String selfPayFlag;

    private BigDecimal costPrice;

    private BigDecimal unitPrice;

    private String stockUnit;

    private BigDecimal emergScale;

    private BigDecimal emergPubScale;

    private BigDecimal emergPayScale;

    private BigDecimal emergOwnScale;

    private Integer operateTime;

    private String needReport;

    private Integer deptScale;

    private String deptCode;

    private String deptName;

    private String sdeptCode;

    private String appendItem;

    private String feeCode;

    private String sysClass;

    private String familyPlan;

    private LocalDateTime operDate;

    private String operCode;

    private String operName;

    private String specialItem;

    private String operateCode;

    private String wbCode;

    private BigDecimal pubRate;

    private String itemGrade;

    private String confirmFlag;

    private String nationalCode;

    private String mark;

    private String stopFlag;

    private String showFlag;

    /**
     * 规格
     */
    private String specs;

    /**
     * 国家编码
     */
    private String gbCode;

    /**
     * 执行科室
     */
    private String exedeptInfo;

    /**
     *  非药品使用范围：0住院1门诊住院2门诊
     */
    private Integer usedRange;

    private String product;

    /**
     * 说明
     */
    private String introduct;

    /**
     * 备注
     */
    private String remark;

    /**
     * 海虹码
     */
    private String hhCode;

    /**
     * 手术或操作编码icd9
     */
    private String icd9Cm3Code;

    /**
     * 手术或操作名称icd9
     */
    private String icd9Cm3Name;

    /**
     * 是否立即收费 1立即计费 0 确认才计费
     */
    private Integer ifquickfee;

    /**
     * 新院项目备注
     */
    private String remarknew;

    /**
     * 标本采集地址
     */
    private String address;

    /**
     * 检查部位
     */
    private String pacsname;

    /**
     * 1是
     */
    private String rebuild;


    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getUndrugName() {
        return undrugName;
    }

    public void setUndrugName(String undrugName) {
        this.undrugName = undrugName;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getSelfPayFlag() {
        return selfPayFlag;
    }

    public void setSelfPayFlag(String selfPayFlag) {
        this.selfPayFlag = selfPayFlag;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getStockUnit() {
        return stockUnit;
    }

    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit;
    }

    public BigDecimal getEmergScale() {
        return emergScale;
    }

    public void setEmergScale(BigDecimal emergScale) {
        this.emergScale = emergScale;
    }

    public BigDecimal getEmergPubScale() {
        return emergPubScale;
    }

    public void setEmergPubScale(BigDecimal emergPubScale) {
        this.emergPubScale = emergPubScale;
    }

    public BigDecimal getEmergPayScale() {
        return emergPayScale;
    }

    public void setEmergPayScale(BigDecimal emergPayScale) {
        this.emergPayScale = emergPayScale;
    }

    public BigDecimal getEmergOwnScale() {
        return emergOwnScale;
    }

    public void setEmergOwnScale(BigDecimal emergOwnScale) {
        this.emergOwnScale = emergOwnScale;
    }

    public Integer getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Integer operateTime) {
        this.operateTime = operateTime;
    }

    public String getNeedReport() {
        return needReport;
    }

    public void setNeedReport(String needReport) {
        this.needReport = needReport;
    }

    public Integer getDeptScale() {
        return deptScale;
    }

    public void setDeptScale(Integer deptScale) {
        this.deptScale = deptScale;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getSdeptCode() {
        return sdeptCode;
    }

    public void setSdeptCode(String sdeptCode) {
        this.sdeptCode = sdeptCode;
    }

    public String getAppendItem() {
        return appendItem;
    }

    public void setAppendItem(String appendItem) {
        this.appendItem = appendItem;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getSysClass() {
        return sysClass;
    }

    public void setSysClass(String sysClass) {
        this.sysClass = sysClass;
    }

    public String getFamilyPlan() {
        return familyPlan;
    }

    public void setFamilyPlan(String familyPlan) {
        this.familyPlan = familyPlan;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public String getSpecialItem() {
        return specialItem;
    }

    public void setSpecialItem(String specialItem) {
        this.specialItem = specialItem;
    }

    public String getOperateCode() {
        return operateCode;
    }

    public void setOperateCode(String operateCode) {
        this.operateCode = operateCode;
    }

    public String getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode = wbCode;
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

    public String getConfirmFlag() {
        return confirmFlag;
    }

    public void setConfirmFlag(String confirmFlag) {
        this.confirmFlag = confirmFlag;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStopFlag() {
        return stopFlag;
    }

    public void setStopFlag(String stopFlag) {
        this.stopFlag = stopFlag;
    }

    public String getShowFlag() {
        return showFlag;
    }

    public void setShowFlag(String showFlag) {
        this.showFlag = showFlag;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getGbCode() {
        return gbCode;
    }

    public void setGbCode(String gbCode) {
        this.gbCode = gbCode;
    }

    public String getExedeptInfo() {
        return exedeptInfo;
    }

    public void setExedeptInfo(String exedeptInfo) {
        this.exedeptInfo = exedeptInfo;
    }

    public Integer getUsedRange() {
        return usedRange;
    }

    public void setUsedRange(Integer usedRange) {
        this.usedRange = usedRange;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getIntroduct() {
        return introduct;
    }

    public void setIntroduct(String introduct) {
        this.introduct = introduct;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHhCode() {
        return hhCode;
    }

    public void setHhCode(String hhCode) {
        this.hhCode = hhCode;
    }

    public String getIcd9Cm3Code() {
        return icd9Cm3Code;
    }

    public void setIcd9Cm3Code(String icd9Cm3Code) {
        this.icd9Cm3Code = icd9Cm3Code;
    }

    public String getIcd9Cm3Name() {
        return icd9Cm3Name;
    }

    public void setIcd9Cm3Name(String icd9Cm3Name) {
        this.icd9Cm3Name = icd9Cm3Name;
    }

    public Integer getIfquickfee() {
        return ifquickfee;
    }

    public void setIfquickfee(Integer ifquickfee) {
        this.ifquickfee = ifquickfee;
    }

    public String getRemarknew() {
        return remarknew;
    }

    public void setRemarknew(String remarknew) {
        this.remarknew = remarknew;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPacsname() {
        return pacsname;
    }

    public void setPacsname(String pacsname) {
        this.pacsname = pacsname;
    }

    public String getRebuild() {
        return rebuild;
    }

    public void setRebuild(String rebuild) {
        this.rebuild = rebuild;
    }

    @Override
    public String toString() {
        return "UndrugInfo{" +
        "undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        ", inputCode=" + inputCode +
        ", spellCode=" + spellCode +
        ", selfPayFlag=" + selfPayFlag +
        ", costPrice=" + costPrice +
        ", unitPrice=" + unitPrice +
        ", stockUnit=" + stockUnit +
        ", emergScale=" + emergScale +
        ", emergPubScale=" + emergPubScale +
        ", emergPayScale=" + emergPayScale +
        ", emergOwnScale=" + emergOwnScale +
        ", operateTime=" + operateTime +
        ", needReport=" + needReport +
        ", deptScale=" + deptScale +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", sdeptCode=" + sdeptCode +
        ", appendItem=" + appendItem +
        ", feeCode=" + feeCode +
        ", sysClass=" + sysClass +
        ", familyPlan=" + familyPlan +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", operName=" + operName +
        ", specialItem=" + specialItem +
        ", operateCode=" + operateCode +
        ", wbCode=" + wbCode +
        ", pubRate=" + pubRate +
        ", itemGrade=" + itemGrade +
        ", confirmFlag=" + confirmFlag +
        ", nationalCode=" + nationalCode +
        ", mark=" + mark +
        ", stopFlag=" + stopFlag +
        ", showFlag=" + showFlag +
        ", specs=" + specs +
        ", gbCode=" + gbCode +
        ", exedeptInfo=" + exedeptInfo +
        ", usedRange=" + usedRange +
        ", product=" + product +
        ", introduct=" + introduct +
        ", remark=" + remark +
        ", hhCode=" + hhCode +
        ", icd9Cm3Code=" + icd9Cm3Code +
        ", icd9Cm3Name=" + icd9Cm3Name +
        ", ifquickfee=" + ifquickfee +
        ", remarknew=" + remarknew +
        ", address=" + address +
        ", pacsname=" + pacsname +
        ", rebuild=" + rebuild +
        "}";
    }
}
