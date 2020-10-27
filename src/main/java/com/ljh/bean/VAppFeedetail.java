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
public class VAppFeedetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String feeNo;

    private String regDtime;

    private String itemname;

    private BigDecimal totalcost;

    private BigDecimal healcost;

    private BigDecimal selfcost;

    private BigDecimal unitprice;

    private BigDecimal number1;

    private String tips;

    private String sortsumfee;

    private String itemprice;

    private String itemspec;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getFeeNo() {
        return feeNo;
    }

    public void setFeeNo(String feeNo) {
        this.feeNo = feeNo;
    }

    public String getRegDtime() {
        return regDtime;
    }

    public void setRegDtime(String regDtime) {
        this.regDtime = regDtime;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public BigDecimal getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(BigDecimal totalcost) {
        this.totalcost = totalcost;
    }

    public BigDecimal getHealcost() {
        return healcost;
    }

    public void setHealcost(BigDecimal healcost) {
        this.healcost = healcost;
    }

    public BigDecimal getSelfcost() {
        return selfcost;
    }

    public void setSelfcost(BigDecimal selfcost) {
        this.selfcost = selfcost;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public BigDecimal getNumber1() {
        return number1;
    }

    public void setNumber1(BigDecimal number1) {
        this.number1 = number1;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getSortsumfee() {
        return sortsumfee;
    }

    public void setSortsumfee(String sortsumfee) {
        this.sortsumfee = sortsumfee;
    }

    public String getItemprice() {
        return itemprice;
    }

    public void setItemprice(String itemprice) {
        this.itemprice = itemprice;
    }

    public String getItemspec() {
        return itemspec;
    }

    public void setItemspec(String itemspec) {
        this.itemspec = itemspec;
    }

    @Override
    public String toString() {
        return "VAppFeedetail{" +
        "cardNo=" + cardNo +
        ", feeNo=" + feeNo +
        ", regDtime=" + regDtime +
        ", itemname=" + itemname +
        ", totalcost=" + totalcost +
        ", healcost=" + healcost +
        ", selfcost=" + selfcost +
        ", unitprice=" + unitprice +
        ", number1=" + number1 +
        ", tips=" + tips +
        ", sortsumfee=" + sortsumfee +
        ", itemprice=" + itemprice +
        ", itemspec=" + itemspec +
        "}";
    }
}
