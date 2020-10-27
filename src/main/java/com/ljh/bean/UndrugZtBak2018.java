package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
public class UndrugZtBak2018 implements Serializable {

    private static final long serialVersionUID=1L;

    private String ztCode;

    private String ztName;

    private String spellCode;

    private String wbCode;

    private String inputCode;

    private String stopFlag;

    private String parentCode;

    private String parentFlag;

    private String undrugCode;

    private BigDecimal unitPrice;

    private String sysClass;

    private String feeCode;

    private String deptCode;

    private String deptName;

    private BigDecimal ztOrder;

    private String confirmFlag;


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

    @Override
    public String toString() {
        return "UndrugZtBak2018{" +
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
        "}";
    }
}
