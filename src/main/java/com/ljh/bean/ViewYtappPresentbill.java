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
public class ViewYtappPresentbill implements Serializable {

    private static final long serialVersionUID=1L;

    private String tradeType;

    private BigDecimal tradeFee;

    private String outTradeNo;

    private String outPaymentNo;

    private String inTradeNo;

    private String tradeTime;

    private String tradeNo;

    private String paymentNo;


    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public BigDecimal getTradeFee() {
        return tradeFee;
    }

    public void setTradeFee(BigDecimal tradeFee) {
        this.tradeFee = tradeFee;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOutPaymentNo() {
        return outPaymentNo;
    }

    public void setOutPaymentNo(String outPaymentNo) {
        this.outPaymentNo = outPaymentNo;
    }

    public String getInTradeNo() {
        return inTradeNo;
    }

    public void setInTradeNo(String inTradeNo) {
        this.inTradeNo = inTradeNo;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    @Override
    public String toString() {
        return "ViewYtappPresentbill{" +
        "tradeType=" + tradeType +
        ", tradeFee=" + tradeFee +
        ", outTradeNo=" + outTradeNo +
        ", outPaymentNo=" + outPaymentNo +
        ", inTradeNo=" + inTradeNo +
        ", tradeTime=" + tradeTime +
        ", tradeNo=" + tradeNo +
        ", paymentNo=" + paymentNo +
        "}";
    }
}
