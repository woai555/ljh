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
public class ViewJhyltRecipe implements Serializable {

    private static final long serialVersionUID=1L;

    private String fzsqzzData;

    private String cardNo;

    private String name;

    private LocalDateTime regDate;

    private String itemCode;

    private String itemName;

    private BigDecimal unitPrice;

    private String itemUnit;

    private BigDecimal qty;

    private BigDecimal ownCost;

    private String spec;

    private BigDecimal onceDose;

    private String onceUnit;

    private String useName;

    private String freqName;

    private BigDecimal useDays;

    private String deptCode;

    private String deptName;

    private String doctCode;

    private String doctName;

    private String classname;


    public String getFzsqzzData() {
        return fzsqzzData;
    }

    public void setFzsqzzData(String fzsqzzData) {
        this.fzsqzzData = fzsqzzData;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
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

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
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

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getFreqName() {
        return freqName;
    }

    public void setFreqName(String freqName) {
        this.freqName = freqName;
    }

    public BigDecimal getUseDays() {
        return useDays;
    }

    public void setUseDays(BigDecimal useDays) {
        this.useDays = useDays;
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

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "ViewJhyltRecipe{" +
        "fzsqzzData=" + fzsqzzData +
        ", cardNo=" + cardNo +
        ", name=" + name +
        ", regDate=" + regDate +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", unitPrice=" + unitPrice +
        ", itemUnit=" + itemUnit +
        ", qty=" + qty +
        ", ownCost=" + ownCost +
        ", spec=" + spec +
        ", onceDose=" + onceDose +
        ", onceUnit=" + onceUnit +
        ", useName=" + useName +
        ", freqName=" + freqName +
        ", useDays=" + useDays +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", doctCode=" + doctCode +
        ", doctName=" + doctName +
        ", classname=" + classname +
        "}";
    }
}
