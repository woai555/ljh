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
public class ViewHrpLgtbYbincome implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime invoiceDtime;

    private String consignNo;

    private String consignName;

    private String kindName;

    private BigDecimal allCost;


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

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public BigDecimal getAllCost() {
        return allCost;
    }

    public void setAllCost(BigDecimal allCost) {
        this.allCost = allCost;
    }

    @Override
    public String toString() {
        return "ViewHrpLgtbYbincome{" +
        "invoiceDtime=" + invoiceDtime +
        ", consignNo=" + consignNo +
        ", consignName=" + consignName +
        ", kindName=" + kindName +
        ", allCost=" + allCost +
        "}";
    }
}
