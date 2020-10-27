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
public class TLianyh implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal pubCost;

    private BigDecimal ownCost;

    private BigDecimal payCost;

    private String invoiceNo;

    private BigDecimal jz;

    private BigDecimal tcost;


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

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public BigDecimal getJz() {
        return jz;
    }

    public void setJz(BigDecimal jz) {
        this.jz = jz;
    }

    public BigDecimal getTcost() {
        return tcost;
    }

    public void setTcost(BigDecimal tcost) {
        this.tcost = tcost;
    }

    @Override
    public String toString() {
        return "TLianyh{" +
        "pubCost=" + pubCost +
        ", ownCost=" + ownCost +
        ", payCost=" + payCost +
        ", invoiceNo=" + invoiceNo +
        ", jz=" + jz +
        ", tcost=" + tcost +
        "}";
    }
}
