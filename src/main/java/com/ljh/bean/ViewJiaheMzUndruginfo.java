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
public class ViewJiaheMzUndruginfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String undrugCode;

    private String undrugName;

    private BigDecimal unitPrice;

    private String stockUnit;

    private String deptCode;

    private String deptName;

    private String feeCode;

    private String feeCodeName;


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

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getFeeCodeName() {
        return feeCodeName;
    }

    public void setFeeCodeName(String feeCodeName) {
        this.feeCodeName = feeCodeName;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzUndruginfo{" +
        "undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        ", unitPrice=" + unitPrice +
        ", stockUnit=" + stockUnit +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", feeCode=" + feeCode +
        ", feeCodeName=" + feeCodeName +
        "}";
    }
}
