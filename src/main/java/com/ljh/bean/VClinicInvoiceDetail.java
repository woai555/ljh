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
public class VClinicInvoiceDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String invoiceNo;

    private String transType;

    private String invoName;

    private BigDecimal ownCost;


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

    public String getInvoName() {
        return invoName;
    }

    public void setInvoName(String invoName) {
        this.invoName = invoName;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    @Override
    public String toString() {
        return "VClinicInvoiceDetail{" +
        "invoiceNo=" + invoiceNo +
        ", transType=" + transType +
        ", invoName=" + invoName +
        ", ownCost=" + ownCost +
        "}";
    }
}
