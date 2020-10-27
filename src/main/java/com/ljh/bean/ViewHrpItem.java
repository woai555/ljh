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
public class ViewHrpItem implements Serializable {

    private static final long serialVersionUID=1L;

    private String undrugCode;

    private String undrugName;

    private String feeCode;

    private String nationalCode;

    private String hhCode;

    private String deptCode;

    private BigDecimal unitPrice;

    private String zt;

    private String stopFlag;


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

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getHhCode() {
        return hhCode;
    }

    public void setHhCode(String hhCode) {
        this.hhCode = hhCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getStopFlag() {
        return stopFlag;
    }

    public void setStopFlag(String stopFlag) {
        this.stopFlag = stopFlag;
    }

    @Override
    public String toString() {
        return "ViewHrpItem{" +
        "undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        ", feeCode=" + feeCode +
        ", nationalCode=" + nationalCode +
        ", hhCode=" + hhCode +
        ", deptCode=" + deptCode +
        ", unitPrice=" + unitPrice +
        ", zt=" + zt +
        ", stopFlag=" + stopFlag +
        "}";
    }
}
