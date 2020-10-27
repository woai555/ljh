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
public class JytZzjCreatecardOrder implements Serializable {

    private static final long serialVersionUID=1L;

    private String hosArea;

    private String hisOrderNo;

    private String orderType;

    private String patient;

    private String cardNo;

    private String hosCode;

    private String source;

    private String hosName;

    private String visistTime;

    private String status;

    private BigDecimal totalAmount;

    private BigDecimal userPayAmount;

    private BigDecimal userRefundAmount;

    private BigDecimal medicareAmount;

    private BigDecimal medicareRefundAmount;

    private BigDecimal medicarePersonalAmount;

    private BigDecimal medicarePerRefundAmount;

    private BigDecimal chargeAmount;

    private BigDecimal cardAmount;

    private String createTime;

    private String updateTime;

    private String tradeNo;

    private String hisTradeNo;

    private String type;

    private BigDecimal tradeAmount;

    private String tradeTime;


    public String getHosArea() {
        return hosArea;
    }

    public void setHosArea(String hosArea) {
        this.hosArea = hosArea;
    }

    public String getHisOrderNo() {
        return hisOrderNo;
    }

    public void setHisOrderNo(String hisOrderNo) {
        this.hisOrderNo = hisOrderNo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getHosCode() {
        return hosCode;
    }

    public void setHosCode(String hosCode) {
        this.hosCode = hosCode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public String getVisistTime() {
        return visistTime;
    }

    public void setVisistTime(String visistTime) {
        this.visistTime = visistTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getUserPayAmount() {
        return userPayAmount;
    }

    public void setUserPayAmount(BigDecimal userPayAmount) {
        this.userPayAmount = userPayAmount;
    }

    public BigDecimal getUserRefundAmount() {
        return userRefundAmount;
    }

    public void setUserRefundAmount(BigDecimal userRefundAmount) {
        this.userRefundAmount = userRefundAmount;
    }

    public BigDecimal getMedicareAmount() {
        return medicareAmount;
    }

    public void setMedicareAmount(BigDecimal medicareAmount) {
        this.medicareAmount = medicareAmount;
    }

    public BigDecimal getMedicareRefundAmount() {
        return medicareRefundAmount;
    }

    public void setMedicareRefundAmount(BigDecimal medicareRefundAmount) {
        this.medicareRefundAmount = medicareRefundAmount;
    }

    public BigDecimal getMedicarePersonalAmount() {
        return medicarePersonalAmount;
    }

    public void setMedicarePersonalAmount(BigDecimal medicarePersonalAmount) {
        this.medicarePersonalAmount = medicarePersonalAmount;
    }

    public BigDecimal getMedicarePerRefundAmount() {
        return medicarePerRefundAmount;
    }

    public void setMedicarePerRefundAmount(BigDecimal medicarePerRefundAmount) {
        this.medicarePerRefundAmount = medicarePerRefundAmount;
    }

    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(BigDecimal chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public BigDecimal getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount(BigDecimal cardAmount) {
        this.cardAmount = cardAmount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
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
        return "JytZzjCreatecardOrder{" +
        "hosArea=" + hosArea +
        ", hisOrderNo=" + hisOrderNo +
        ", orderType=" + orderType +
        ", patient=" + patient +
        ", cardNo=" + cardNo +
        ", hosCode=" + hosCode +
        ", source=" + source +
        ", hosName=" + hosName +
        ", visistTime=" + visistTime +
        ", status=" + status +
        ", totalAmount=" + totalAmount +
        ", userPayAmount=" + userPayAmount +
        ", userRefundAmount=" + userRefundAmount +
        ", medicareAmount=" + medicareAmount +
        ", medicareRefundAmount=" + medicareRefundAmount +
        ", medicarePersonalAmount=" + medicarePersonalAmount +
        ", medicarePerRefundAmount=" + medicarePerRefundAmount +
        ", chargeAmount=" + chargeAmount +
        ", cardAmount=" + cardAmount +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", tradeNo=" + tradeNo +
        ", hisTradeNo=" + hisTradeNo +
        ", type=" + type +
        ", tradeAmount=" + tradeAmount +
        ", tradeTime=" + tradeTime +
        "}";
    }
}
