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
public class OrdCombdetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 组套代码
     */
    @TableId(value = "COMB_CODE", type = IdType.AUTO)
    private String combCode;

    /**
     * 组套项目流水号
     */
    private Integer combNo;

    /**
     * 项目代码
     */
    private String itemCode;

    /**
     * 拼音码
     */
    private String spellCode;

    /**
     * 1药品，2非药品
     */
    private String itemType;

    /**
     * 项目名称
     */
    private String itemName;

    /**
     * 执行科室代码
     */
    private String deptCode;

    /**
     * 执行科室名称
     */
    private String deptName;

    /**
     * 规格
     */
    private String specs;

    /**
     * 用法
     */
    private String usageCode;

    /**
     * 频次
     */
    private String freqCode;

    /**
     * 每次剂量
     */
    private BigDecimal onceDose;

    /**
     * 每次剂量单位
     */
    private String onceUnit;

    /**
     * 基本剂量
     */
    private BigDecimal baseDose;

    /**
     * 基本剂量单位
     */
    private String baseUnit;

    /**
     * 草药付数
     */
    private Integer days;

    /**
     * 开立数量
     */
    private BigDecimal qty;

    /**
     * 开立单位
     */
    private String itemUnit;

    /**
     * 开立是否是最小单位,1是,2否
     */
    private String isMinunit;

    /**
     * 最小费用代码
     */
    private String feeCode;

    /**
     * 主药标志
     */
    private String mainDrug;

    /**
     * 组合号
     */
    private String groupNo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;

    /**
     * 包装数量
     */
    private Integer packQty;

    private String ztCode;


    public String getCombCode() {
        return combCode;
    }

    public void setCombCode(String combCode) {
        this.combCode = combCode;
    }

    public Integer getCombNo() {
        return combNo;
    }

    public void setCombNo(Integer combNo) {
        this.combNo = combNo;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    public String getFreqCode() {
        return freqCode;
    }

    public void setFreqCode(String freqCode) {
        this.freqCode = freqCode;
    }

    public BigDecimal getOnceDose() {
        return onceDose;
    }

    public void setOnceDose(BigDecimal onceDose) {
        this.onceDose = onceDose;
    }

    public String getOnceUnit() {
        return onceUnit;
    }

    public void setOnceUnit(String onceUnit) {
        this.onceUnit = onceUnit;
    }

    public BigDecimal getBaseDose() {
        return baseDose;
    }

    public void setBaseDose(BigDecimal baseDose) {
        this.baseDose = baseDose;
    }

    public String getBaseUnit() {
        return baseUnit;
    }

    public void setBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public String getIsMinunit() {
        return isMinunit;
    }

    public void setIsMinunit(String isMinunit) {
        this.isMinunit = isMinunit;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getMainDrug() {
        return mainDrug;
    }

    public void setMainDrug(String mainDrug) {
        this.mainDrug = mainDrug;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getPackQty() {
        return packQty;
    }

    public void setPackQty(Integer packQty) {
        this.packQty = packQty;
    }

    public String getZtCode() {
        return ztCode;
    }

    public void setZtCode(String ztCode) {
        this.ztCode = ztCode;
    }

    @Override
    public String toString() {
        return "OrdCombdetail{" +
        "combCode=" + combCode +
        ", combNo=" + combNo +
        ", itemCode=" + itemCode +
        ", spellCode=" + spellCode +
        ", itemType=" + itemType +
        ", itemName=" + itemName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", specs=" + specs +
        ", usageCode=" + usageCode +
        ", freqCode=" + freqCode +
        ", onceDose=" + onceDose +
        ", onceUnit=" + onceUnit +
        ", baseDose=" + baseDose +
        ", baseUnit=" + baseUnit +
        ", days=" + days +
        ", qty=" + qty +
        ", itemUnit=" + itemUnit +
        ", isMinunit=" + isMinunit +
        ", feeCode=" + feeCode +
        ", mainDrug=" + mainDrug +
        ", groupNo=" + groupNo +
        ", remark=" + remark +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", packQty=" + packQty +
        ", ztCode=" + ztCode +
        "}";
    }
}
