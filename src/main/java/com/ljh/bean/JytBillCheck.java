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
public class JytBillCheck implements Serializable {

    private static final long serialVersionUID=1L;

    private String hosCode;

    private LocalDateTime billTime;

    private String tradeNo;

    private String treatmentNo;

    private String cardNo;

    private Integer cardType;

    private BigDecimal totalFee;

    private BigDecimal medicareFee;

    private BigDecimal selfpayFee;

    private String invoiceNo;

    private String transType;


    public String getHosCode() {
        return hosCode;
    }

    public void setHosCode(String hosCode) {
        this.hosCode = hosCode;
    }

    public LocalDateTime getBillTime() {
        return billTime;
    }

    public void setBillTime(LocalDateTime billTime) {
        this.billTime = billTime;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTreatmentNo() {
        return treatmentNo;
    }

    public void setTreatmentNo(String treatmentNo) {
        this.treatmentNo = treatmentNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public BigDecimal getMedicareFee() {
        return medicareFee;
    }

    public void setMedicareFee(BigDecimal medicareFee) {
        this.medicareFee = medicareFee;
    }

    public BigDecimal getSelfpayFee() {
        return selfpayFee;
    }

    public void setSelfpayFee(BigDecimal selfpayFee) {
        this.selfpayFee = selfpayFee;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    @Override
    public String toString() {
        return "JytBillCheck{" +
        "hosCode=" + hosCode +
        ", billTime=" + billTime +
        ", tradeNo=" + tradeNo +
        ", treatmentNo=" + treatmentNo +
        ", cardNo=" + cardNo +
        ", cardType=" + cardType +
        ", totalFee=" + totalFee +
        ", medicareFee=" + medicareFee +
        ", selfpayFee=" + selfpayFee +
        ", invoiceNo=" + invoiceNo +
        ", transType=" + transType +
        "}";
    }
}
