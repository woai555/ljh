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
public class ViewChargeDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String sortno;

    private String cardNo;

    private String transType;

    private String invoiceNo;

    private String chargecode;

    private String chargename;

    private String unit;

    private BigDecimal std;

    private BigDecimal number1;

    private BigDecimal amt;

    private BigDecimal selfamt;

    private String remark;


    public String getSortno() {
        return sortno;
    }

    public void setSortno(String sortno) {
        this.sortno = sortno;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getChargecode() {
        return chargecode;
    }

    public void setChargecode(String chargecode) {
        this.chargecode = chargecode;
    }

    public String getChargename() {
        return chargename;
    }

    public void setChargename(String chargename) {
        this.chargename = chargename;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getStd() {
        return std;
    }

    public void setStd(BigDecimal std) {
        this.std = std;
    }

    public BigDecimal getNumber1() {
        return number1;
    }

    public void setNumber1(BigDecimal number1) {
        this.number1 = number1;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getSelfamt() {
        return selfamt;
    }

    public void setSelfamt(BigDecimal selfamt) {
        this.selfamt = selfamt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ViewChargeDetail{" +
        "sortno=" + sortno +
        ", cardNo=" + cardNo +
        ", transType=" + transType +
        ", invoiceNo=" + invoiceNo +
        ", chargecode=" + chargecode +
        ", chargename=" + chargename +
        ", unit=" + unit +
        ", std=" + std +
        ", number1=" + number1 +
        ", amt=" + amt +
        ", selfamt=" + selfamt +
        ", remark=" + remark +
        "}";
    }
}
