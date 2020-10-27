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
public class JytBillPrintItem implements Serializable {

    private static final long serialVersionUID=1L;

    private String invoiceNo;

    private String feeItemCode;

    private String feeItemType;

    private String feeItemName;

    private String feeLevel;

    private BigDecimal unitPrice;

    private BigDecimal count;

    private BigDecimal fee;

    private String specification;

    private String unit;

    private String usage;

    private String dose;

    private String dosage;

    private String packaging;

    private BigDecimal days;


    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getFeeItemCode() {
        return feeItemCode;
    }

    public void setFeeItemCode(String feeItemCode) {
        this.feeItemCode = feeItemCode;
    }

    public String getFeeItemType() {
        return feeItemType;
    }

    public void setFeeItemType(String feeItemType) {
        this.feeItemType = feeItemType;
    }

    public String getFeeItemName() {
        return feeItemName;
    }

    public void setFeeItemName(String feeItemName) {
        this.feeItemName = feeItemName;
    }

    public String getFeeLevel() {
        return feeLevel;
    }

    public void setFeeLevel(String feeLevel) {
        this.feeLevel = feeLevel;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public BigDecimal getDays() {
        return days;
    }

    public void setDays(BigDecimal days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "JytBillPrintItem{" +
        "invoiceNo=" + invoiceNo +
        ", feeItemCode=" + feeItemCode +
        ", feeItemType=" + feeItemType +
        ", feeItemName=" + feeItemName +
        ", feeLevel=" + feeLevel +
        ", unitPrice=" + unitPrice +
        ", count=" + count +
        ", fee=" + fee +
        ", specification=" + specification +
        ", unit=" + unit +
        ", usage=" + usage +
        ", dose=" + dose +
        ", dosage=" + dosage +
        ", packaging=" + packaging +
        ", days=" + days +
        "}";
    }
}
