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
public class JytBillCheckRecipe implements Serializable {

    private static final long serialVersionUID=1L;

    private String invoiceNo;

    private String recipeNo;

    private String recipeType;

    private String transType;

    private BigDecimal fee;

    private BigDecimal medicareFee;

    private BigDecimal selfpayFee;


    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public String getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getMedicareFee() {
        return medicareFee;
    }

    public void setMedicareFee(BigDecimal medicareFee) {
        this.medicareFee = medicareFee;
    }

    public BigDecimal getSelfpayFee() {
        return selfpayFee;
    }

    public void setSelfpayFee(BigDecimal selfpayFee) {
        this.selfpayFee = selfpayFee;
    }

    @Override
    public String toString() {
        return "JytBillCheckRecipe{" +
        "invoiceNo=" + invoiceNo +
        ", recipeNo=" + recipeNo +
        ", recipeType=" + recipeType +
        ", transType=" + transType +
        ", fee=" + fee +
        ", medicareFee=" + medicareFee +
        ", selfpayFee=" + selfpayFee +
        "}";
    }
}
