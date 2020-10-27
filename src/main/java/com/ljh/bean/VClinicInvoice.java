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
public class VClinicInvoice implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime invoiceDtime;

    private String invoiceNo;

    private String transType;

    private String registerOutpbill;

    private String patientName;

    private String cardNo;

    private BigDecimal cost;

    private BigDecimal ownCost;

    private BigDecimal pubCost;

    private String payWay;

    private String operCode;

    private String mcardNo;

    private String tradeno;

    private LocalDateTime cancelDate;

    private String cancelFlag;

    private String cancelInvoice;

    private String cancelMan;

    private String pactCode;

    private String paykindCode;

    private String djbFlag;

    private BigDecimal evalueScore;

    private String tradenoJyt;

    private LocalDateTime invoicePntDate;

    private String invoicePntOper;

    private String invoiceNoJyt;

    private String invoiceYnprintJyt;


    public LocalDateTime getInvoiceDtime() {
        return invoiceDtime;
    }

    public void setInvoiceDtime(LocalDateTime invoiceDtime) {
        this.invoiceDtime = invoiceDtime;
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

    public String getRegisterOutpbill() {
        return registerOutpbill;
    }

    public void setRegisterOutpbill(String registerOutpbill) {
        this.registerOutpbill = registerOutpbill;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public String getCancelInvoice() {
        return cancelInvoice;
    }

    public void setCancelInvoice(String cancelInvoice) {
        this.cancelInvoice = cancelInvoice;
    }

    public String getCancelMan() {
        return cancelMan;
    }

    public void setCancelMan(String cancelMan) {
        this.cancelMan = cancelMan;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getDjbFlag() {
        return djbFlag;
    }

    public void setDjbFlag(String djbFlag) {
        this.djbFlag = djbFlag;
    }

    public BigDecimal getEvalueScore() {
        return evalueScore;
    }

    public void setEvalueScore(BigDecimal evalueScore) {
        this.evalueScore = evalueScore;
    }

    public String getTradenoJyt() {
        return tradenoJyt;
    }

    public void setTradenoJyt(String tradenoJyt) {
        this.tradenoJyt = tradenoJyt;
    }

    public LocalDateTime getInvoicePntDate() {
        return invoicePntDate;
    }

    public void setInvoicePntDate(LocalDateTime invoicePntDate) {
        this.invoicePntDate = invoicePntDate;
    }

    public String getInvoicePntOper() {
        return invoicePntOper;
    }

    public void setInvoicePntOper(String invoicePntOper) {
        this.invoicePntOper = invoicePntOper;
    }

    public String getInvoiceNoJyt() {
        return invoiceNoJyt;
    }

    public void setInvoiceNoJyt(String invoiceNoJyt) {
        this.invoiceNoJyt = invoiceNoJyt;
    }

    public String getInvoiceYnprintJyt() {
        return invoiceYnprintJyt;
    }

    public void setInvoiceYnprintJyt(String invoiceYnprintJyt) {
        this.invoiceYnprintJyt = invoiceYnprintJyt;
    }

    @Override
    public String toString() {
        return "VClinicInvoice{" +
        "invoiceDtime=" + invoiceDtime +
        ", invoiceNo=" + invoiceNo +
        ", transType=" + transType +
        ", registerOutpbill=" + registerOutpbill +
        ", patientName=" + patientName +
        ", cardNo=" + cardNo +
        ", cost=" + cost +
        ", ownCost=" + ownCost +
        ", pubCost=" + pubCost +
        ", payWay=" + payWay +
        ", operCode=" + operCode +
        ", mcardNo=" + mcardNo +
        ", tradeno=" + tradeno +
        ", cancelDate=" + cancelDate +
        ", cancelFlag=" + cancelFlag +
        ", cancelInvoice=" + cancelInvoice +
        ", cancelMan=" + cancelMan +
        ", pactCode=" + pactCode +
        ", paykindCode=" + paykindCode +
        ", djbFlag=" + djbFlag +
        ", evalueScore=" + evalueScore +
        ", tradenoJyt=" + tradenoJyt +
        ", invoicePntDate=" + invoicePntDate +
        ", invoicePntOper=" + invoicePntOper +
        ", invoiceNoJyt=" + invoiceNoJyt +
        ", invoiceYnprintJyt=" + invoiceYnprintJyt +
        "}";
    }
}
