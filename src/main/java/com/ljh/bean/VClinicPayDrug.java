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
public class VClinicPayDrug implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String seeNo;

    private Integer itemno;

    private String recipeno;

    private String hiscode;

    private String itemname;

    private String ybcode;

    private String itemtype;

    private BigDecimal unitprice;

    private BigDecimal count;

    private BigDecimal fee;

    private String howtouse;

    private String dosage;

    private String packaging;

    private String minpackage;

    private String conversion;

    private BigDecimal days;

    private String specification;

    private String unit;

    private String dose;

    private String drugapprovalnumber;

    private String itemgrade;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
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

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getYbcode() {
        return ybcode;
    }

    public void setYbcode(String ybcode) {
        this.ybcode = ybcode;
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

    public BigDecimal getDays() {
        return days;
    }

    public void setDays(BigDecimal days) {
        this.days = days;
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

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
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

    @Override
    public String toString() {
        return "VClinicPayDrug{" +
        "cardNo=" + cardNo +
        ", seeNo=" + seeNo +
        ", itemno=" + itemno +
        ", recipeno=" + recipeno +
        ", hiscode=" + hiscode +
        ", itemname=" + itemname +
        ", ybcode=" + ybcode +
        ", itemtype=" + itemtype +
        ", unitprice=" + unitprice +
        ", count=" + count +
        ", fee=" + fee +
        ", howtouse=" + howtouse +
        ", dosage=" + dosage +
        ", packaging=" + packaging +
        ", minpackage=" + minpackage +
        ", conversion=" + conversion +
        ", days=" + days +
        ", specification=" + specification +
        ", unit=" + unit +
        ", dose=" + dose +
        ", drugapprovalnumber=" + drugapprovalnumber +
        ", itemgrade=" + itemgrade +
        "}";
    }
}
