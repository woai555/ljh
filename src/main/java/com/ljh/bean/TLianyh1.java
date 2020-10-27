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
public class TLianyh1 implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugDeptCode;

    private String checkNum;

    private String drugCode;

    private String batchNo;

    private BigDecimal approvePrice;

    private String operCode;

    private BigDecimal checkSum;

    private LocalDateTime operDate;


    public String getDrugDeptCode() {
        return drugDeptCode;
    }

    public void setDrugDeptCode(String drugDeptCode) {
        this.drugDeptCode = drugDeptCode;
    }

    public String getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(String checkNum) {
        this.checkNum = checkNum;
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

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public BigDecimal getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(BigDecimal checkSum) {
        this.checkSum = checkSum;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "TLianyh1{" +
        "drugDeptCode=" + drugDeptCode +
        ", checkNum=" + checkNum +
        ", drugCode=" + drugCode +
        ", batchNo=" + batchNo +
        ", approvePrice=" + approvePrice +
        ", operCode=" + operCode +
        ", checkSum=" + checkSum +
        ", operDate=" + operDate +
        "}";
    }
}
