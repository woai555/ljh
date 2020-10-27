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
public class JytPrivatecloudRegQuery implements Serializable {

    private static final long serialVersionUID=1L;

    private String regNo;

    private String hisRegNo;

    private String cardNo;

    private String cardType;

    private String status;

    private String payStatus;

    private BigDecimal fee;

    private BigDecimal userAmount;

    private BigDecimal medicareAmount;

    private BigDecimal medicarePersonFee;

    private String paySource;

    private String takeSource;


    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getHisRegNo() {
        return hisRegNo;
    }

    public void setHisRegNo(String hisRegNo) {
        this.hisRegNo = hisRegNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getUserAmount() {
        return userAmount;
    }

    public void setUserAmount(BigDecimal userAmount) {
        this.userAmount = userAmount;
    }

    public BigDecimal getMedicareAmount() {
        return medicareAmount;
    }

    public void setMedicareAmount(BigDecimal medicareAmount) {
        this.medicareAmount = medicareAmount;
    }

    public BigDecimal getMedicarePersonFee() {
        return medicarePersonFee;
    }

    public void setMedicarePersonFee(BigDecimal medicarePersonFee) {
        this.medicarePersonFee = medicarePersonFee;
    }

    public String getPaySource() {
        return paySource;
    }

    public void setPaySource(String paySource) {
        this.paySource = paySource;
    }

    public String getTakeSource() {
        return takeSource;
    }

    public void setTakeSource(String takeSource) {
        this.takeSource = takeSource;
    }

    @Override
    public String toString() {
        return "JytPrivatecloudRegQuery{" +
        "regNo=" + regNo +
        ", hisRegNo=" + hisRegNo +
        ", cardNo=" + cardNo +
        ", cardType=" + cardType +
        ", status=" + status +
        ", payStatus=" + payStatus +
        ", fee=" + fee +
        ", userAmount=" + userAmount +
        ", medicareAmount=" + medicareAmount +
        ", medicarePersonFee=" + medicarePersonFee +
        ", paySource=" + paySource +
        ", takeSource=" + takeSource +
        "}";
    }
}
