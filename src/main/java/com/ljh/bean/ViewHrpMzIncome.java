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
public class ViewHrpMzIncome implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime invoiceDtime;

    private String consignNo;

    private String consignName;

    private String operCode;

    private String operName;

    private BigDecimal allCost;

    private String kindName;


    public LocalDateTime getInvoiceDtime() {
        return invoiceDtime;
    }

    public void setInvoiceDtime(LocalDateTime invoiceDtime) {
        this.invoiceDtime = invoiceDtime;
    }

    public String getConsignNo() {
        return consignNo;
    }

    public void setConsignNo(String consignNo) {
        this.consignNo = consignNo;
    }

    public String getConsignName() {
        return consignName;
    }

    public void setConsignName(String consignName) {
        this.consignName = consignName;
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

    public BigDecimal getAllCost() {
        return allCost;
    }

    public void setAllCost(BigDecimal allCost) {
        this.allCost = allCost;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    @Override
    public String toString() {
        return "ViewHrpMzIncome{" +
        "invoiceDtime=" + invoiceDtime +
        ", consignNo=" + consignNo +
        ", consignName=" + consignName +
        ", operCode=" + operCode +
        ", operName=" + operName +
        ", allCost=" + allCost +
        ", kindName=" + kindName +
        "}";
    }
}
