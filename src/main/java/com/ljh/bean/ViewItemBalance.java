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
public class ViewItemBalance implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugCode;

    private String name;

    private BigDecimal quantity;

    private BigDecimal totCost;

    private BigDecimal ownCost;

    private String feeCode;

    private String specs;

    private BigDecimal salePrice;

    private String paykindCode;

    private String minUnit;

    private String inpatientNo;

    private Integer balanceNo;


    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotCost() {
        return totCost;
    }

    public void setTotCost(BigDecimal totCost) {
        this.totCost = totCost;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(String minUnit) {
        this.minUnit = minUnit;
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public Integer getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(Integer balanceNo) {
        this.balanceNo = balanceNo;
    }

    @Override
    public String toString() {
        return "ViewItemBalance{" +
        "drugCode=" + drugCode +
        ", name=" + name +
        ", quantity=" + quantity +
        ", totCost=" + totCost +
        ", ownCost=" + ownCost +
        ", feeCode=" + feeCode +
        ", specs=" + specs +
        ", salePrice=" + salePrice +
        ", paykindCode=" + paykindCode +
        ", minUnit=" + minUnit +
        ", inpatientNo=" + inpatientNo +
        ", balanceNo=" + balanceNo +
        "}";
    }
}
