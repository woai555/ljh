package com.ljh.bean;

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
public class ViewRwzbDrugreport implements Serializable {

    private static final long serialVersionUID=1L;

    private String recipeNo;

    private String transType;

    private String cardNo;

    private String stockCode;

    private String drugCode;

    private String drugName;

    private String payFlag;

    private String getDrugFlag;

    private String cancelFlag;

    private String mcardNo;

    private String cardnoJyt;

    private String invoiceNo;

    private String doctDept;


    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
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

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag;
    }

    public String getGetDrugFlag() {
        return getDrugFlag;
    }

    public void setGetDrugFlag(String getDrugFlag) {
        this.getDrugFlag = getDrugFlag;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getDoctDept() {
        return doctDept;
    }

    public void setDoctDept(String doctDept) {
        this.doctDept = doctDept;
    }

    @Override
    public String toString() {
        return "ViewRwzbDrugreport{" +
        "recipeNo=" + recipeNo +
        ", transType=" + transType +
        ", cardNo=" + cardNo +
        ", stockCode=" + stockCode +
        ", drugCode=" + drugCode +
        ", drugName=" + drugName +
        ", payFlag=" + payFlag +
        ", getDrugFlag=" + getDrugFlag +
        ", cancelFlag=" + cancelFlag +
        ", mcardNo=" + mcardNo +
        ", cardnoJyt=" + cardnoJyt +
        ", invoiceNo=" + invoiceNo +
        ", doctDept=" + doctDept +
        "}";
    }
}
