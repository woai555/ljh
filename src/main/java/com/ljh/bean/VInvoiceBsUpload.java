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
public class VInvoiceBsUpload implements Serializable {

    private static final long serialVersionUID=1L;

    private String invoiceBs;

    private LocalDateTime invoiceDtime;

    private String invoiceNo;

    private String transType;

    private String registerOutpbill;

    private String patientName;

    private String cardNo;

    private BigDecimal cost;

    private String operCode;

    private String invoiceNoJyt;


    public String getInvoiceBs() {
        return invoiceBs;
    }

    public void setInvoiceBs(String invoiceBs) {
        this.invoiceBs = invoiceBs;
    }

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

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getInvoiceNoJyt() {
        return invoiceNoJyt;
    }

    public void setInvoiceNoJyt(String invoiceNoJyt) {
        this.invoiceNoJyt = invoiceNoJyt;
    }

    @Override
    public String toString() {
        return "VInvoiceBsUpload{" +
        "invoiceBs=" + invoiceBs +
        ", invoiceDtime=" + invoiceDtime +
        ", invoiceNo=" + invoiceNo +
        ", transType=" + transType +
        ", registerOutpbill=" + registerOutpbill +
        ", patientName=" + patientName +
        ", cardNo=" + cardNo +
        ", cost=" + cost +
        ", operCode=" + operCode +
        ", invoiceNoJyt=" + invoiceNoJyt +
        "}";
    }
}
