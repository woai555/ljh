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
public class Mzbyd implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugDeptCode;

    private String drugCode;

    private String batchNo;

    private BigDecimal approvePrice;


    public String getDrugDeptCode() {
        return drugDeptCode;
    }

    public void setDrugDeptCode(String drugDeptCode) {
        this.drugDeptCode = drugDeptCode;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public BigDecimal getApprovePrice() {
        return approvePrice;
    }

    public void setApprovePrice(BigDecimal approvePrice) {
        this.approvePrice = approvePrice;
    }

    @Override
    public String toString() {
        return "Mzbyd{" +
        "drugDeptCode=" + drugDeptCode +
        ", drugCode=" + drugCode +
        ", batchNo=" + batchNo +
        ", approvePrice=" + approvePrice +
        "}";
    }
}
