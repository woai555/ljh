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
public class ViewInteractmedItemdetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String seeNo;

    private String cardNo;

    private String recipeNo;

    private Integer sequenceNo;

    private String itemCode;

    private String itemName;

    private String drugFlag;

    private String spec;

    private BigDecimal oncedose;

    private String onceunit;

    private String freqcode;

    private String freqname;

    private String usagecode;

    private String usagename;

    private BigDecimal price;

    private BigDecimal itemqty;

    private BigDecimal cost;

    private BigDecimal useDays;

    private String remark;

    private LocalDateTime appTime;

    private String drugType;

    private Integer herbDays;

    private String yyjcRemark;

    private String hosBranch;

    private String formalname;

    private String status;

    private String groupCode;

    private String itemType;


    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
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

    public String getDrugFlag() {
        return drugFlag;
    }

    public void setDrugFlag(String drugFlag) {
        this.drugFlag = drugFlag;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public BigDecimal getOncedose() {
        return oncedose;
    }

    public void setOncedose(BigDecimal oncedose) {
        this.oncedose = oncedose;
    }

    public String getOnceunit() {
        return onceunit;
    }

    public void setOnceunit(String onceunit) {
        this.onceunit = onceunit;
    }

    public String getFreqcode() {
        return freqcode;
    }

    public void setFreqcode(String freqcode) {
        this.freqcode = freqcode;
    }

    public String getFreqname() {
        return freqname;
    }

    public void setFreqname(String freqname) {
        this.freqname = freqname;
    }

    public String getUsagecode() {
        return usagecode;
    }

    public void setUsagecode(String usagecode) {
        this.usagecode = usagecode;
    }

    public String getUsagename() {
        return usagename;
    }

    public void setUsagename(String usagename) {
        this.usagename = usagename;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getItemqty() {
        return itemqty;
    }

    public void setItemqty(BigDecimal itemqty) {
        this.itemqty = itemqty;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getUseDays() {
        return useDays;
    }

    public void setUseDays(BigDecimal useDays) {
        this.useDays = useDays;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getAppTime() {
        return appTime;
    }

    public void setAppTime(LocalDateTime appTime) {
        this.appTime = appTime;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public Integer getHerbDays() {
        return herbDays;
    }

    public void setHerbDays(Integer herbDays) {
        this.herbDays = herbDays;
    }

    public String getYyjcRemark() {
        return yyjcRemark;
    }

    public void setYyjcRemark(String yyjcRemark) {
        this.yyjcRemark = yyjcRemark;
    }

    public String getHosBranch() {
        return hosBranch;
    }

    public void setHosBranch(String hosBranch) {
        this.hosBranch = hosBranch;
    }

    public String getFormalname() {
        return formalname;
    }

    public void setFormalname(String formalname) {
        this.formalname = formalname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "ViewInteractmedItemdetail{" +
        "seeNo=" + seeNo +
        ", cardNo=" + cardNo +
        ", recipeNo=" + recipeNo +
        ", sequenceNo=" + sequenceNo +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", drugFlag=" + drugFlag +
        ", spec=" + spec +
        ", oncedose=" + oncedose +
        ", onceunit=" + onceunit +
        ", freqcode=" + freqcode +
        ", freqname=" + freqname +
        ", usagecode=" + usagecode +
        ", usagename=" + usagename +
        ", price=" + price +
        ", itemqty=" + itemqty +
        ", cost=" + cost +
        ", useDays=" + useDays +
        ", remark=" + remark +
        ", appTime=" + appTime +
        ", drugType=" + drugType +
        ", herbDays=" + herbDays +
        ", yyjcRemark=" + yyjcRemark +
        ", hosBranch=" + hosBranch +
        ", formalname=" + formalname +
        ", status=" + status +
        ", groupCode=" + groupCode +
        ", itemType=" + itemType +
        "}";
    }
}
