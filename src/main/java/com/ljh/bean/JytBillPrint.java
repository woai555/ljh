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
public class JytBillPrint implements Serializable {

    private static final long serialVersionUID=1L;

    private String hosCode;

    private String tradeNo;

    private String cardNo;

    private Integer cardType;

    private String patientId;

    private BigDecimal payType;

    private String invoiceNo;

    private String medicineWindows;

    private LocalDateTime birthday;


    public String getHosCode() {
        return hosCode;
    }

    public void setHosCode(String hosCode) {
        this.hosCode = hosCode;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
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

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public BigDecimal getPayType() {
        return payType;
    }

    public void setPayType(BigDecimal payType) {
        this.payType = payType;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getMedicineWindows() {
        return medicineWindows;
    }

    public void setMedicineWindows(String medicineWindows) {
        this.medicineWindows = medicineWindows;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "JytBillPrint{" +
        "hosCode=" + hosCode +
        ", tradeNo=" + tradeNo +
        ", cardNo=" + cardNo +
        ", cardType=" + cardType +
        ", patientId=" + patientId +
        ", payType=" + payType +
        ", invoiceNo=" + invoiceNo +
        ", medicineWindows=" + medicineWindows +
        ", birthday=" + birthday +
        "}";
    }
}
