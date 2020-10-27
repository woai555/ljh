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
public class ViewHlhtCdrinpay implements Serializable {

    private static final long serialVersionUID=1L;

    private String inPatientId;

    private String inpNo;

    private String healthCardNo;

    private String caseNo;

    private String visitId;

    private String visitType;

    private String ledgerSn;

    private BigDecimal paymentFee;

    private String paymentOperator;

    private String paymentTime;

    private String paymentWindow;

    private String paymentMethod;

    private String paymentDept;

    private String operateType;

    private LocalDateTime operatortime;


    public String getInPatientId() {
        return inPatientId;
    }

    public void setInPatientId(String inPatientId) {
        this.inPatientId = inPatientId;
    }

    public String getInpNo() {
        return inpNo;
    }

    public void setInpNo(String inpNo) {
        this.inpNo = inpNo;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getLedgerSn() {
        return ledgerSn;
    }

    public void setLedgerSn(String ledgerSn) {
        this.ledgerSn = ledgerSn;
    }

    public BigDecimal getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(BigDecimal paymentFee) {
        this.paymentFee = paymentFee;
    }

    public String getPaymentOperator() {
        return paymentOperator;
    }

    public void setPaymentOperator(String paymentOperator) {
        this.paymentOperator = paymentOperator;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPaymentWindow() {
        return paymentWindow;
    }

    public void setPaymentWindow(String paymentWindow) {
        this.paymentWindow = paymentWindow;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentDept() {
        return paymentDept;
    }

    public void setPaymentDept(String paymentDept) {
        this.paymentDept = paymentDept;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdrinpay{" +
        "inPatientId=" + inPatientId +
        ", inpNo=" + inpNo +
        ", healthCardNo=" + healthCardNo +
        ", caseNo=" + caseNo +
        ", visitId=" + visitId +
        ", visitType=" + visitType +
        ", ledgerSn=" + ledgerSn +
        ", paymentFee=" + paymentFee +
        ", paymentOperator=" + paymentOperator +
        ", paymentTime=" + paymentTime +
        ", paymentWindow=" + paymentWindow +
        ", paymentMethod=" + paymentMethod +
        ", paymentDept=" + paymentDept +
        ", operateType=" + operateType +
        ", operatortime=" + operatortime +
        "}";
    }
}
