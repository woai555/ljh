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
public class ViewHlhtCdropayoffd implements Serializable {

    private static final long serialVersionUID=1L;

    private String outPatientId;

    private String healthCardNo;

    private String outpNo;

    private String visitId;

    private String visitType;

    private String receiptSn;

    private String ledgerSn;

    private String transactionType;

    private String billItemCode;

    private String billItemName;

    private BigDecimal payoffTotalFee;

    private String payoffRealFee;

    private String payoffMethodCode;

    private String payoffMethodName;

    private String mainPk;

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

    public String getBillItemName() {
        return billItemName;
    }

    public void setBillItemName(String billItemName) {
        this.billItemName = billItemName;
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

    public String getPayoffMethodName() {
        return payoffMethodName;
    }

    public void setPayoffMethodName(String payoffMethodName) {
        this.payoffMethodName = payoffMethodName;
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
        return "ViewHlhtCdropayoffd{" +
        "outPatientId=" + outPatientId +
        ", healthCardNo=" + healthCardNo +
        ", outpNo=" + outpNo +
        ", visitId=" + visitId +
        ", visitType=" + visitType +
        ", receiptSn=" + receiptSn +
        ", ledgerSn=" + ledgerSn +
        ", transactionType=" + transactionType +
        ", billItemCode=" + billItemCode +
        ", billItemName=" + billItemName +
        ", payoffTotalFee=" + payoffTotalFee +
        ", payoffRealFee=" + payoffRealFee +
        ", payoffMethodCode=" + payoffMethodCode +
        ", payoffMethodName=" + payoffMethodName +
        ", mainPk=" + mainPk +
        ", operateType=" + operateType +
        ", operatortime=" + operatortime +
        "}";
    }
}
