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
public class JytFeeitemDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String hisregno;

    private Integer itemno;

    private String recipeno;

    private String hiscode;

    private String itemType;

    private String itemname;

    private String itemtype;

    private BigDecimal unitprice;

    private BigDecimal count;

    private BigDecimal fee;

    private String dose;

    private String specification;

    private String unit;

    private String howtouse;

    private String dosage;

    private String packaging;

    private String minpackage;

    private String conversion;

    private String days;

    private String drugapprovalnumber;

    private String itemgrade;

    private String combNo;

    private String itemCode;

    private String cardNo;

    private String drugFlag;

    private LocalDateTime operDate;

    private BigDecimal baseDose;

    private String feeCode;

    private LocalDateTime regDtime;


    public String getHisregno() {
        return hisregno;
    }

    public void setHisregno(String hisregno) {
        this.hisregno = hisregno;
    }

    public Integer getItemno() {
        return itemno;
    }

    public void setItemno(Integer itemno) {
        this.itemno = itemno;
    }

    public String getRecipeno() {
        return recipeno;
    }

    public void setRecipeno(String recipeno) {
        this.recipeno = recipeno;
    }

    public String getHiscode() {
        return hiscode;
    }

    public void setHiscode(String hiscode) {
        this.hiscode = hiscode;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
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

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
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

    public String getHowtouse() {
        return howtouse;
    }

    public void setHowtouse(String howtouse) {
        this.howtouse = howtouse;
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

    public String getMinpackage() {
        return minpackage;
    }

    public void setMinpackage(String minpackage) {
        this.minpackage = minpackage;
    }

    public String getConversion() {
        return conversion;
    }

    public void setConversion(String conversion) {
        this.conversion = conversion;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getDrugapprovalnumber() {
        return drugapprovalnumber;
    }

    public void setDrugapprovalnumber(String drugapprovalnumber) {
        this.drugapprovalnumber = drugapprovalnumber;
    }

    public String getItemgrade() {
        return itemgrade;
    }

    public void setItemgrade(String itemgrade) {
        this.itemgrade = itemgrade;
    }

    public String getCombNo() {
        return combNo;
    }

    public void setCombNo(String combNo) {
        this.combNo = combNo;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getDrugFlag() {
        return drugFlag;
    }

    public void setDrugFlag(String drugFlag) {
        this.drugFlag = drugFlag;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public BigDecimal getBaseDose() {
        return baseDose;
    }

    public void setBaseDose(BigDecimal baseDose) {
        this.baseDose = baseDose;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public LocalDateTime getRegDtime() {
        return regDtime;
    }

    public void setRegDtime(LocalDateTime regDtime) {
        this.regDtime = regDtime;
    }

    @Override
    public String toString() {
        return "JytFeeitemDetail{" +
        "hisregno=" + hisregno +
        ", itemno=" + itemno +
        ", recipeno=" + recipeno +
        ", hiscode=" + hiscode +
        ", itemType=" + itemType +
        ", itemname=" + itemname +
        ", itemtype=" + itemtype +
        ", unitprice=" + unitprice +
        ", count=" + count +
        ", fee=" + fee +
        ", dose=" + dose +
        ", specification=" + specification +
        ", unit=" + unit +
        ", howtouse=" + howtouse +
        ", dosage=" + dosage +
        ", packaging=" + packaging +
        ", minpackage=" + minpackage +
        ", conversion=" + conversion +
        ", days=" + days +
        ", drugapprovalnumber=" + drugapprovalnumber +
        ", itemgrade=" + itemgrade +
        ", combNo=" + combNo +
        ", itemCode=" + itemCode +
        ", cardNo=" + cardNo +
        ", drugFlag=" + drugFlag +
        ", operDate=" + operDate +
        ", baseDose=" + baseDose +
        ", feeCode=" + feeCode +
        ", regDtime=" + regDtime +
        "}";
    }
}
