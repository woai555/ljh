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
public class JytCardFeelist implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 订单号
     */
    @TableId(value = "ORDER_NO", type = IdType.AUTO)
    private String orderNo;

    /**
     * 京医通卡号
     */
    private String cardNo;

    /**
     * 交易流水号
     */
    private String tradeNo;

    /**
     * 交易类型 1：建卡 2：充值 3:RWZB建卡
     */
    private String tradeFeeType;

    /**
     * 建卡费
     */
    private BigDecimal cardFeeAmount;

    /**
     * 交易时间
     */
    private LocalDateTime operDate;

    /**
     * 总金额
     */
    private BigDecimal totalAmount;

    /**
     * 充值费
     */
    private BigDecimal chargeAmount;

    /**
     * 操作员
     */
    private String operCode;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeFeeType() {
        return tradeFeeType;
    }

    public void setTradeFeeType(String tradeFeeType) {
        this.tradeFeeType = tradeFeeType;
    }

    public BigDecimal getCardFeeAmount() {
        return cardFeeAmount;
    }

    public void setCardFeeAmount(BigDecimal cardFeeAmount) {
        this.cardFeeAmount = cardFeeAmount;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(BigDecimal chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    @Override
    public String toString() {
        return "JytCardFeelist{" +
        "orderNo=" + orderNo +
        ", cardNo=" + cardNo +
        ", tradeNo=" + tradeNo +
        ", tradeFeeType=" + tradeFeeType +
        ", cardFeeAmount=" + cardFeeAmount +
        ", operDate=" + operDate +
        ", totalAmount=" + totalAmount +
        ", chargeAmount=" + chargeAmount +
        ", operCode=" + operCode +
        "}";
    }
}
