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
public class JytNewacount implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNoBy;

    private String regDate;

    private String hosCode;

    private String hisOrderNo;

    private String patient;

    private String cardNo;

    private String orderType;

    private String hosName;

    private String status;

    private String visitTime;

    private BigDecimal totalAmount;

    private BigDecimal userPayAmount;

    private BigDecimal userRefundAmount;

    private BigDecimal medicareAmount;

    private BigDecimal medicareRefundAmount;

    private BigDecimal medicarePersonalAmount;

    private BigDecimal mePersonalRefundAmount;

    private String createTime;

    private String updateTime;

    private String source;


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

    public String getHosCode() {
        return hosCode;
    }

    public void setHosCode(String hosCode) {
        this.hosCode = hosCode;
    }

    public String getHisOrderNo() {
        return hisOrderNo;
    }

    public void setHisOrderNo(String hisOrderNo) {
        this.hisOrderNo = hisOrderNo;
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

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
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

    public BigDecimal getMePersonalRefundAmount() {
        return mePersonalRefundAmount;
    }

    public void setMePersonalRefundAmount(BigDecimal mePersonalRefundAmount) {
        this.mePersonalRefundAmount = mePersonalRefundAmount;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "JytNewacount{" +
        "cardNoBy=" + cardNoBy +
        ", regDate=" + regDate +
        ", hosCode=" + hosCode +
        ", hisOrderNo=" + hisOrderNo +
        ", patient=" + patient +
        ", cardNo=" + cardNo +
        ", orderType=" + orderType +
        ", hosName=" + hosName +
        ", status=" + status +
        ", visitTime=" + visitTime +
        ", totalAmount=" + totalAmount +
        ", userPayAmount=" + userPayAmount +
        ", userRefundAmount=" + userRefundAmount +
        ", medicareAmount=" + medicareAmount +
        ", medicareRefundAmount=" + medicareRefundAmount +
        ", medicarePersonalAmount=" + medicarePersonalAmount +
        ", mePersonalRefundAmount=" + mePersonalRefundAmount +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", source=" + source +
        "}";
    }
}
