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
public class JytWsMscOrderSyncDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNoBy;

    private String regDate;

    private String hisorderno;

    private String tradeNo;

    private String hisTradeNo;

    private String type;

    private BigDecimal tradeAmount;

    private String tradeTime;


    public String getCardNoBy() {
        return cardNoBy;
    }

    public void setCardNoBy(String cardNoBy) {
        this.cardNoBy = cardNoBy;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getHisorderno() {
        return hisorderno;
    }

    public void setHisorderno(String hisorderno) {
        this.hisorderno = hisorderno;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getHisTradeNo() {
        return hisTradeNo;
    }

    public void setHisTradeNo(String hisTradeNo) {
        this.hisTradeNo = hisTradeNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    @Override
    public String toString() {
        return "JytWsMscOrderSyncDetail{" +
        "cardNoBy=" + cardNoBy +
        ", regDate=" + regDate +
        ", hisorderno=" + hisorderno +
        ", tradeNo=" + tradeNo +
        ", hisTradeNo=" + hisTradeNo +
        ", type=" + type +
        ", tradeAmount=" + tradeAmount +
        ", tradeTime=" + tradeTime +
        "}";
    }
}
