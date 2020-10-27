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
public class JytBillQueryItem implements Serializable {

    private static final long serialVersionUID=1L;

    private String itemCode;

    private String itemType;

    private String itemName;

    private BigDecimal unitPrice;

    private BigDecimal count;

    private BigDecimal fee;

    private String specification;

    private String unit;

    private String usage;

    private String dose;

    private String dosage;

    private String packaging;

    private String days;

    private String recipeNo;

    private String feeLevel;

    private String drugType;

    private BigDecimal weight;


    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
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

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public String getFeeLevel() {
        return feeLevel;
    }

    public void setFeeLevel(String feeLevel) {
        this.feeLevel = feeLevel;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "JytBillQueryItem{" +
        "itemCode=" + itemCode +
        ", itemType=" + itemType +
        ", itemName=" + itemName +
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
        ", recipeNo=" + recipeNo +
        ", feeLevel=" + feeLevel +
        ", drugType=" + drugType +
        ", weight=" + weight +
        "}";
    }
}
