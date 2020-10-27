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
public class ViewHlhtCdropayoffdRealtime implements Serializable {

    private static final long serialVersionUID=1L;

    private String personName;

    private String outPatientId;

    private String inPatientId;

    private String cardId;

    private String outpNo;

    private String healthCardNo;

    private String visitId;

    private String visitType;

    private String receiptSn;

    private String ledgerSn;

    private String transactionType;

    private String billItemCode;

    private String billItem;

    private BigDecimal payoffTotalFee;

    private String payoffRealFee;

    private String payoffMethodCode;

    private String payoffMethod;

    private String mainPk;

    private String operateType;

    private LocalDateTime operatortime;


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getOutPatientId() {
        return outPatientId;
    }

    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    public String getInPatientId() {
        return inPatientId;
    }

    public void setInPatientId(String inPatientId) {
        this.inPatientId = inPatientId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getOutpNo() {
        return outpNo;
    }

    public void setOutpNo(String outpNo) {
        this.outpNo = outpNo;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
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

    public String getLedgerSn() {
        return ledgerSn;
    }

    public void setLedgerSn(String ledgerSn) {
        this.ledgerSn = ledgerSn;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getBillItemCode() {
        return billItemCode;
    }

    public void setBillItemCode(String billItemCode) {
        this.billItemCode = billItemCode;
    }

    public String getBillItem() {
        return billItem;
    }

    public void setBillItem(String billItem) {
        this.billItem = billItem;
    }

    public BigDecimal getPayoffTotalFee() {
        return payoffTotalFee;
    }

    public void setPayoffTotalFee(BigDecimal payoffTotalFee) {
        this.payoffTotalFee = payoffTotalFee;
    }

    public String getPayoffRealFee() {
        return payoffRealFee;
    }

    public void setPayoffRealFee(String payoffRealFee) {
        this.payoffRealFee = payoffRealFee;
    }

    public String getPayoffMethodCode() {
        return payoffMethodCode;
    }

    public void setPayoffMethodCode(String payoffMethodCode) {
        this.payoffMethodCode = payoffMethodCode;
    }

    public String getPayoffMethod() {
        return payoffMethod;
    }

    public void setPayoffMethod(String payoffMethod) {
        this.payoffMethod = payoffMethod;
    }

    public String getMainPk() {
        return mainPk;
    }

    public void setMainPk(String mainPk) {
        this.mainPk = mainPk;
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
        return "ViewHlhtCdropayoffdRealtime{" +
        "personName=" + personName +
        ", outPatientId=" + outPatientId +
        ", inPatientId=" + inPatientId +
        ", cardId=" + cardId +
        ", outpNo=" + outpNo +
        ", healthCardNo=" + healthCardNo +
        ", visitId=" + visitId +
        ", visitType=" + visitType +
        ", receiptSn=" + receiptSn +
        ", ledgerSn=" + ledgerSn +
        ", transactionType=" + transactionType +
        ", billItemCode=" + billItemCode +
        ", billItem=" + billItem +
        ", payoffTotalFee=" + payoffTotalFee +
        ", payoffRealFee=" + payoffRealFee +
        ", payoffMethodCode=" + payoffMethodCode +
        ", payoffMethod=" + payoffMethod +
        ", mainPk=" + mainPk +
        ", operateType=" + operateType +
        ", operatortime=" + operatortime +
        "}";
    }
}
