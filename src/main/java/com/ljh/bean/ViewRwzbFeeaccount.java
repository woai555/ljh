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
public class ViewRwzbFeeaccount implements Serializable {

    private static final long serialVersionUID=1L;

    private String hosArea;

    private String payType;

    private String tradeType;

    private String billType;

    private String feeType;

    private String yuanqu;

    private String operator;

    private String patOde;

    private String subject;

    private BigDecimal totalAmount;

    private String tradeNo;

    private LocalDateTime tradeTime;

    private String channel;

    private String tradeno;


    public String getHosArea() {
        return hosArea;
    }

    public void setHosArea(String hosArea) {
        this.hosArea = hosArea;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getYuanqu() {
        return yuanqu;
    }

    public void setYuanqu(String yuanqu) {
        this.yuanqu = yuanqu;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getPatOde() {
        return patOde;
    }

    public void setPatOde(String patOde) {
        this.patOde = patOde;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public LocalDateTime getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(LocalDateTime tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    @Override
    public String toString() {
        return "ViewRwzbFeeaccount{" +
        "hosArea=" + hosArea +
        ", payType=" + payType +
        ", tradeType=" + tradeType +
        ", billType=" + billType +
        ", feeType=" + feeType +
        ", yuanqu=" + yuanqu +
        ", operator=" + operator +
        ", patOde=" + patOde +
        ", subject=" + subject +
        ", totalAmount=" + totalAmount +
        ", tradeNo=" + tradeNo +
        ", tradeTime=" + tradeTime +
        ", channel=" + channel +
        ", tradeno=" + tradeno +
        "}";
    }
}
