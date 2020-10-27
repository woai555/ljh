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
public class UndrugZt implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 组套编码
     */
    private String ztCode;

    /**
     * 组套名称
     */
    private String ztName;

    /**
     * 拼音码
     */
    private String spellCode;

    /**
     * 五笔码
     */
    private String wbCode;

    /**
     * 输入码
     */
    private String inputCode;

    /**
     * 停止标记
     */
    private String stopFlag;

    /**
     * 父级编码
     */
    private String parentCode;

    /**
     * 是否父级标志
     */
    private String parentFlag;

    /**
     * 非药品编码
     */
    private String undrugCode;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 系统类别
     */
    private String sysClass;

    /**
     * 费用代码
     */
    private String feeCode;

    /**
     * 执行科室编码
     */
    private String deptCode;

    /**
     * 执行科室名称
     */
    private String deptName;

    /**
     * 组套内子序号
     */
    @TableId(value = "ZT_ORDER", type = IdType.AUTO)
    private BigDecimal ztOrder;

    /**
     * 确认标志
     */
    private String confirmFlag;

    /**
     * 启用时间
     */
    private LocalDateTime startDate;

    /**
     * 停用时间(4.15停则写为4.16)
     */
    private LocalDateTime stopDate;

    /**
     * 每次剂量
     */
    private BigDecimal onceDose;

    /**
     * 剂量单位
     */
    private String onceUnit;

    /**
     * 用法
     */
    private String usageCode;

    /**
     * 频次
     */
    private String freqCode;

    /**
     * 数量
     */
    private BigDecimal qty;

    /**
     * 知情同意书
     */
    private String informConsent;


    public String getZtCode() {
        return ztCode;
    }

    public void setZtCode(String ztCode) {
        this.ztCode = ztCode;
    }

    public String getZtName() {
        return ztName;
    }

    public void setZtName(String ztName) {
        this.ztName = ztName;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode = wbCode;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getStopFlag() {
        return stopFlag;
    }

    public void setStopFlag(String stopFlag) {
        this.stopFlag = stopFlag;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentFlag() {
        return parentFlag;
    }

    public void setParentFlag(String parentFlag) {
        this.parentFlag = parentFlag;
    }

    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getSysClass() {
        return sysClass;
    }

    public void setSysClass(String sysClass) {
        this.sysClass = sysClass;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
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

    public BigDecimal getZtOrder() {
        return ztOrder;
    }

    public void setZtOrder(BigDecimal ztOrder) {
        this.ztOrder = ztOrder;
    }

    public String getConfirmFlag() {
        return confirmFlag;
    }

    public void setConfirmFlag(String confirmFlag) {
        this.confirmFlag = confirmFlag;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getStopDate() {
        return stopDate;
    }

    public void setStopDate(LocalDateTime stopDate) {
        this.stopDate = stopDate;
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

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getInformConsent() {
        return informConsent;
    }

    public void setInformConsent(String informConsent) {
        this.informConsent = informConsent;
    }

    @Override
    public String toString() {
        return "UndrugZt{" +
        "ztCode=" + ztCode +
        ", ztName=" + ztName +
        ", spellCode=" + spellCode +
        ", wbCode=" + wbCode +
        ", inputCode=" + inputCode +
        ", stopFlag=" + stopFlag +
        ", parentCode=" + parentCode +
        ", parentFlag=" + parentFlag +
        ", undrugCode=" + undrugCode +
        ", unitPrice=" + unitPrice +
        ", sysClass=" + sysClass +
        ", feeCode=" + feeCode +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", ztOrder=" + ztOrder +
        ", confirmFlag=" + confirmFlag +
        ", startDate=" + startDate +
        ", stopDate=" + stopDate +
        ", onceDose=" + onceDose +
        ", onceUnit=" + onceUnit +
        ", usageCode=" + usageCode +
        ", freqCode=" + freqCode +
        ", qty=" + qty +
        ", informConsent=" + informConsent +
        "}";
    }
}
