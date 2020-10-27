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
public class ViewHlhtCdropayoff implements Serializable {

    private static final long serialVersionUID=1L;

    private String outPatientId;

    private String healthCardNo;

    private String outpNo;

    private String visitId;

    private String visitType;

    private String receiptSn;

    private String transactionType;

    private String invalidReceiptSn;

    private String receiptPrintTime;

    private String receiptPrint0ne;

    private String ledgerSn;

    private BigDecimal payoffTotalFee;

    private BigDecimal pubCost;

    private String cancelFalg;

    private String invalidTime;

    private String invalidPerson;

    private String payoffOperator;

    private String payoffTime;

    private String payoffWindow;

    private String payoffDept;

    private String payoffMethod;

    private BigDecimal paymentFee;

    private String paymentOperator;

    private String paymentTime;

    private String paymentWindow;

    private String paymentDept;

    private String paymentMethod;

    private String operateType;

    private LocalDateTime operatortime;


    public String getOutPatientId() {
        return outPatientId;
    }

    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public String getOutpNo() {
        return outpNo;
    }

    public void setOutpNo(String outpNo) {
        this.outpNo = outpNo;
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

    public String getReceiptSn() {
        return receiptSn;
    }

    public void setReceiptSn(String receiptSn) {
        this.receiptSn = receiptSn;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getInvalidReceiptSn() {
        return invalidReceiptSn;
    }

    public void setInvalidReceiptSn(String invalidReceiptSn) {
        this.invalidReceiptSn = invalidReceiptSn;
    }

    public String getReceiptPrintTime() {
        return receiptPrintTime;
    }

    public void setReceiptPrintTime(String receiptPrintTime) {
        this.receiptPrintTime = receiptPrintTime;
    }

    public String getReceiptPrint0ne() {
        return receiptPrint0ne;
    }

    public void setReceiptPrint0ne(String receiptPrint0ne) {
        this.receiptPrint0ne = receiptPrint0ne;
    }

    public String getLedgerSn() {
        return ledgerSn;
    }

    public void setLedgerSn(String ledgerSn) {
        this.ledgerSn = ledgerSn;
    }

    public BigDecimal getPayoffTotalFee() {
        return payoffTotalFee;
    }

    public void setPayoffTotalFee(BigDecimal payoffTotalFee) {
        this.payoffTotalFee = payoffTotalFee;
    }

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public String getCancelFalg() {
        return cancelFalg;
    }

    public void setCancelFalg(String cancelFalg) {
        this.cancelFalg = cancelFalg;
    }

    public String getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
    }

    public String getInvalidPerson() {
        return invalidPerson;
    }

    public void setInvalidPerson(String invalidPerson) {
        this.invalidPerson = invalidPerson;
    }

    public String getPayoffOperator() {
        return payoffOperator;
    }

    public void setPayoffOperator(String payoffOperator) {
        this.payoffOperator = payoffOperator;
    }

    public String getPayoffTime() {
        return payoffTime;
    }

    public void setPayoffTime(String payoffTime) {
        this.payoffTime = payoffTime;
    }

    public String getPayoffWindow() {
        return payoffWindow;
    }

    public void setPayoffWindow(String payoffWindow) {
        this.payoffWindow = payoffWindow;
    }

    public String getPayoffDept() {
        return payoffDept;
    }

    public void setPayoffDept(String payoffDept) {
        this.payoffDept = payoffDept;
    }

    public String getPayoffMethod() {
        return payoffMethod;
    }

    public void setPayoffMethod(String payoffMethod) {
        this.payoffMethod = payoffMethod;
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

    public String getPaymentDept() {
        return paymentDept;
    }

    public void setPaymentDept(String paymentDept) {
        this.paymentDept = paymentDept;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
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
        return "ViewHlhtCdropayoff{" +
        "outPatientId=" + outPatientId +
        ", healthCardNo=" + healthCardNo +
        ", outpNo=" + outpNo +
        ", visitId=" + visitId +
        ", visitType=" + visitType +
        ", receiptSn=" + receiptSn +
        ", transactionType=" + transactionType +
        ", invalidReceiptSn=" + invalidReceiptSn +
        ", receiptPrintTime=" + receiptPrintTime +
        ", receiptPrint0ne=" + receiptPrint0ne +
        ", ledgerSn=" + ledgerSn +
        ", payoffTotalFee=" + payoffTotalFee +
        ", pubCost=" + pubCost +
        ", cancelFalg=" + cancelFalg +
        ", invalidTime=" + invalidTime +
        ", invalidPerson=" + invalidPerson +
        ", payoffOperator=" + payoffOperator +
        ", payoffTime=" + payoffTime +
        ", payoffWindow=" + payoffWindow +
        ", payoffDept=" + payoffDept +
        ", payoffMethod=" + payoffMethod +
        ", paymentFee=" + paymentFee +
        ", paymentOperator=" + paymentOperator +
        ", paymentTime=" + paymentTime +
        ", paymentWindow=" + paymentWindow +
        ", paymentDept=" + paymentDept +
        ", paymentMethod=" + paymentMethod +
        ", operateType=" + operateType +
        ", operatortime=" + operatortime +
        "}";
    }
}
