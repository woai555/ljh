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
public class ViewJiaheMzInvoiceinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String invoiceNo;

    private String transType;

    private String cardNo;

    private String paykindCode;

    private String paykindName;

    private String mcardNo;

    private String pactCode;

    private String patientName;

    private BigDecimal cost;

    private BigDecimal pubCost;

    private BigDecimal ownCost;

    private BigDecimal payCost;

    private BigDecimal realCost;

    private LocalDateTime invoiceDtime;

    private String cancelFlag;

    private String operCode;

    private String operName;

    private BigDecimal bankCost;

    private String cancelInvoice;

    private String payWay;

    private String cancelMan;

    private LocalDateTime cancelDate;

    private String medicalType;

    private BigDecimal gwyCost;

    private BigDecimal debzCost;

    private String checkOperCode;

    private LocalDateTime checkDate;

    private BigDecimal cashCost;

    private String djbFlag;

    private String tradeno;

    private BigDecimal pastCost;

    private BigDecimal evalueScore;

    private String invoiceKind;

    private String invoiceYnprintJyt;

    private String invoiceNoJyt;

    private String tradenoJyt;

    private String invoicePntOper;

    private LocalDateTime invoicePntDate;

    private BigDecimal kss;

    private BigDecimal hy;

    private BigDecimal jc;

    private BigDecimal qt;

    private BigDecimal ss;

    private BigDecimal wc;

    private BigDecimal xy;

    private BigDecimal zl;

    private BigDecimal zcy;

    private BigDecimal zchy;


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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getPaykindName() {
        return paykindName;
    }

    public void setPaykindName(String paykindName) {
        this.paykindName = paykindName;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public BigDecimal getPayCost() {
        return payCost;
    }

    public void setPayCost(BigDecimal payCost) {
        this.payCost = payCost;
    }

    public BigDecimal getRealCost() {
        return realCost;
    }

    public void setRealCost(BigDecimal realCost) {
        this.realCost = realCost;
    }

    public LocalDateTime getInvoiceDtime() {
        return invoiceDtime;
    }

    public void setInvoiceDtime(LocalDateTime invoiceDtime) {
        this.invoiceDtime = invoiceDtime;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public BigDecimal getBankCost() {
        return bankCost;
    }

    public void setBankCost(BigDecimal bankCost) {
        this.bankCost = bankCost;
    }

    public String getCancelInvoice() {
        return cancelInvoice;
    }

    public void setCancelInvoice(String cancelInvoice) {
        this.cancelInvoice = cancelInvoice;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getCancelMan() {
        return cancelMan;
    }

    public void setCancelMan(String cancelMan) {
        this.cancelMan = cancelMan;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getMedicalType() {
        return medicalType;
    }

    public void setMedicalType(String medicalType) {
        this.medicalType = medicalType;
    }

    public BigDecimal getGwyCost() {
        return gwyCost;
    }

    public void setGwyCost(BigDecimal gwyCost) {
        this.gwyCost = gwyCost;
    }

    public BigDecimal getDebzCost() {
        return debzCost;
    }

    public void setDebzCost(BigDecimal debzCost) {
        this.debzCost = debzCost;
    }

    public String getCheckOperCode() {
        return checkOperCode;
    }

    public void setCheckOperCode(String checkOperCode) {
        this.checkOperCode = checkOperCode;
    }

    public LocalDateTime getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(LocalDateTime checkDate) {
        this.checkDate = checkDate;
    }

    public BigDecimal getCashCost() {
        return cashCost;
    }

    public void setCashCost(BigDecimal cashCost) {
        this.cashCost = cashCost;
    }

    public String getDjbFlag() {
        return djbFlag;
    }

    public void setDjbFlag(String djbFlag) {
        this.djbFlag = djbFlag;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public BigDecimal getPastCost() {
        return pastCost;
    }

    public void setPastCost(BigDecimal pastCost) {
        this.pastCost = pastCost;
    }

    public BigDecimal getEvalueScore() {
        return evalueScore;
    }

    public void setEvalueScore(BigDecimal evalueScore) {
        this.evalueScore = evalueScore;
    }

    public String getInvoiceKind() {
        return invoiceKind;
    }

    public void setInvoiceKind(String invoiceKind) {
        this.invoiceKind = invoiceKind;
    }

    public String getInvoiceYnprintJyt() {
        return invoiceYnprintJyt;
    }

    public void setInvoiceYnprintJyt(String invoiceYnprintJyt) {
        this.invoiceYnprintJyt = invoiceYnprintJyt;
    }

    public String getInvoiceNoJyt() {
        return invoiceNoJyt;
    }

    public void setInvoiceNoJyt(String invoiceNoJyt) {
        this.invoiceNoJyt = invoiceNoJyt;
    }

    public String getTradenoJyt() {
        return tradenoJyt;
    }

    public void setTradenoJyt(String tradenoJyt) {
        this.tradenoJyt = tradenoJyt;
    }

    public String getInvoicePntOper() {
        return invoicePntOper;
    }

    public void setInvoicePntOper(String invoicePntOper) {
        this.invoicePntOper = invoicePntOper;
    }

    public LocalDateTime getInvoicePntDate() {
        return invoicePntDate;
    }

    public void setInvoicePntDate(LocalDateTime invoicePntDate) {
        this.invoicePntDate = invoicePntDate;
    }

    public BigDecimal getKss() {
        return kss;
    }

    public void setKss(BigDecimal kss) {
        this.kss = kss;
    }

    public BigDecimal getHy() {
        return hy;
    }

    public void setHy(BigDecimal hy) {
        this.hy = hy;
    }

    public BigDecimal getJc() {
        return jc;
    }

    public void setJc(BigDecimal jc) {
        this.jc = jc;
    }

    public BigDecimal getQt() {
        return qt;
    }

    public void setQt(BigDecimal qt) {
        this.qt = qt;
    }

    public BigDecimal getSs() {
        return ss;
    }

    public void setSs(BigDecimal ss) {
        this.ss = ss;
    }

    public BigDecimal getWc() {
        return wc;
    }

    public void setWc(BigDecimal wc) {
        this.wc = wc;
    }

    public BigDecimal getXy() {
        return xy;
    }

    public void setXy(BigDecimal xy) {
        this.xy = xy;
    }

    public BigDecimal getZl() {
        return zl;
    }

    public void setZl(BigDecimal zl) {
        this.zl = zl;
    }

    public BigDecimal getZcy() {
        return zcy;
    }

    public void setZcy(BigDecimal zcy) {
        this.zcy = zcy;
    }

    public BigDecimal getZchy() {
        return zchy;
    }

    public void setZchy(BigDecimal zchy) {
        this.zchy = zchy;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzInvoiceinfo{" +
        "invoiceNo=" + invoiceNo +
        ", transType=" + transType +
        ", cardNo=" + cardNo +
        ", paykindCode=" + paykindCode +
        ", paykindName=" + paykindName +
        ", mcardNo=" + mcardNo +
        ", pactCode=" + pactCode +
        ", patientName=" + patientName +
        ", cost=" + cost +
        ", pubCost=" + pubCost +
        ", ownCost=" + ownCost +
        ", payCost=" + payCost +
        ", realCost=" + realCost +
        ", invoiceDtime=" + invoiceDtime +
        ", cancelFlag=" + cancelFlag +
        ", operCode=" + operCode +
        ", operName=" + operName +
        ", bankCost=" + bankCost +
        ", cancelInvoice=" + cancelInvoice +
        ", payWay=" + payWay +
        ", cancelMan=" + cancelMan +
        ", cancelDate=" + cancelDate +
        ", medicalType=" + medicalType +
        ", gwyCost=" + gwyCost +
        ", debzCost=" + debzCost +
        ", checkOperCode=" + checkOperCode +
        ", checkDate=" + checkDate +
        ", cashCost=" + cashCost +
        ", djbFlag=" + djbFlag +
        ", tradeno=" + tradeno +
        ", pastCost=" + pastCost +
        ", evalueScore=" + evalueScore +
        ", invoiceKind=" + invoiceKind +
        ", invoiceYnprintJyt=" + invoiceYnprintJyt +
        ", invoiceNoJyt=" + invoiceNoJyt +
        ", tradenoJyt=" + tradenoJyt +
        ", invoicePntOper=" + invoicePntOper +
        ", invoicePntDate=" + invoicePntDate +
        ", kss=" + kss +
        ", hy=" + hy +
        ", jc=" + jc +
        ", qt=" + qt +
        ", ss=" + ss +
        ", wc=" + wc +
        ", xy=" + xy +
        ", zl=" + zl +
        ", zcy=" + zcy +
        ", zchy=" + zchy +
        "}";
    }
}
