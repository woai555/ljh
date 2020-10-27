package com.ljh.bean;

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
public class ViewHlhtCdrdrugdispenseList implements Serializable {

    private static final long serialVersionUID=1L;

    private String pattientNo;

    private String visitNo;

    private String formNo;

    private String orderNo;

    private String drugitemCode;

    private String pharmacyStore;

    private String drugSpec;

    private String orderedQty;

    private String orderedQtyUomCode;

    private String orderedQtyUomDesc;

    private LocalDateTime operDate;

    private String recipeNo;


    public String getPattientNo() {
        return pattientNo;
    }

    public void setPattientNo(String pattientNo) {
        this.pattientNo = pattientNo;
    }

    public String getVisitNo() {
        return visitNo;
    }

    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo;
    }

    public String getFormNo() {
        return formNo;
    }

    public void setFormNo(String formNo) {
        this.formNo = formNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getDrugitemCode() {
        return drugitemCode;
    }

    public void setDrugitemCode(String drugitemCode) {
        this.drugitemCode = drugitemCode;
    }

    public String getPharmacyStore() {
        return pharmacyStore;
    }

    public void setPharmacyStore(String pharmacyStore) {
        this.pharmacyStore = pharmacyStore;
    }

    public String getDrugSpec() {
        return drugSpec;
    }

    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec;
    }

    public String getOrderedQty() {
        return orderedQty;
    }

    public void setOrderedQty(String orderedQty) {
        this.orderedQty = orderedQty;
    }

    public String getOrderedQtyUomCode() {
        return orderedQtyUomCode;
    }

    public void setOrderedQtyUomCode(String orderedQtyUomCode) {
        this.orderedQtyUomCode = orderedQtyUomCode;
    }

    public String getOrderedQtyUomDesc() {
        return orderedQtyUomDesc;
    }

    public void setOrderedQtyUomDesc(String orderedQtyUomDesc) {
        this.orderedQtyUomDesc = orderedQtyUomDesc;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdrdrugdispenseList{" +
        "pattientNo=" + pattientNo +
        ", visitNo=" + visitNo +
        ", formNo=" + formNo +
        ", orderNo=" + orderNo +
        ", drugitemCode=" + drugitemCode +
        ", pharmacyStore=" + pharmacyStore +
        ", drugSpec=" + drugSpec +
        ", orderedQty=" + orderedQty +
        ", orderedQtyUomCode=" + orderedQtyUomCode +
        ", orderedQtyUomDesc=" + orderedQtyUomDesc +
        ", operDate=" + operDate +
        ", recipeNo=" + recipeNo +
        "}";
    }
}
