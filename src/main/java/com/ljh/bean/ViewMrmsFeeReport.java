package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_MRMS_FEE_REPORT
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewMrmsFeeReport implements Serializable {

    private static final long serialVersionUID=1L;

    private Long ifInvoiceNo;

    private String inpatientNo;

    private Integer balanceNo;

    private String feeCode;

    private BigDecimal totCost;

    private BigDecimal ownCost;

    private BigDecimal payCost;

    private BigDecimal pubCost;

    private BigDecimal derateCost;

    private LocalDateTime balanceDtime;

    private String deptCode;

    private String pactCode;

    private String balanceType;

    private String isBaby;

    private String invoiceNo;

    private String wasteFlag;

    private String operCode;

    private String operDeptCode;

    private String wasteOperCode;

    private String wasteDeptCode;

    private LocalDateTime wasteDtime;

    private String pkey;

    private LocalDateTime fromdate;

    private LocalDateTime enddate;


    public Long getIfInvoiceNo() {
        return ifInvoiceNo;
    }

    public void setIfInvoiceNo(Long ifInvoiceNo) {
        this.ifInvoiceNo = ifInvoiceNo;
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public Integer getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(Integer balanceNo) {
        this.balanceNo = balanceNo;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public BigDecimal getTotCost() {
        return totCost;
    }

    public void setTotCost(BigDecimal totCost) {
        this.totCost = totCost;
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

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public BigDecimal getDerateCost() {
        return derateCost;
    }

    public void setDerateCost(BigDecimal derateCost) {
        this.derateCost = derateCost;
    }

    public LocalDateTime getBalanceDtime() {
        return balanceDtime;
    }

    public void setBalanceDtime(LocalDateTime balanceDtime) {
        this.balanceDtime = balanceDtime;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public String getIsBaby() {
        return isBaby;
    }

    public void setIsBaby(String isBaby) {
        this.isBaby = isBaby;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getWasteFlag() {
        return wasteFlag;
    }

    public void setWasteFlag(String wasteFlag) {
        this.wasteFlag = wasteFlag;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperDeptCode() {
        return operDeptCode;
    }

    public void setOperDeptCode(String operDeptCode) {
        this.operDeptCode = operDeptCode;
    }

    public String getWasteOperCode() {
        return wasteOperCode;
    }

    public void setWasteOperCode(String wasteOperCode) {
        this.wasteOperCode = wasteOperCode;
    }

    public String getWasteDeptCode() {
        return wasteDeptCode;
    }

    public void setWasteDeptCode(String wasteDeptCode) {
        this.wasteDeptCode = wasteDeptCode;
    }

    public LocalDateTime getWasteDtime() {
        return wasteDtime;
    }

    public void setWasteDtime(LocalDateTime wasteDtime) {
        this.wasteDtime = wasteDtime;
    }

    public String getPkey() {
        return pkey;
    }

    public void setPkey(String pkey) {
        this.pkey = pkey;
    }

    public LocalDateTime getFromdate() {
        return fromdate;
    }

    public void setFromdate(LocalDateTime fromdate) {
        this.fromdate = fromdate;
    }

    public LocalDateTime getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "ViewMrmsFeeReport{" +
        "ifInvoiceNo=" + ifInvoiceNo +
        ", inpatientNo=" + inpatientNo +
        ", balanceNo=" + balanceNo +
        ", feeCode=" + feeCode +
        ", totCost=" + totCost +
        ", ownCost=" + ownCost +
        ", payCost=" + payCost +
        ", pubCost=" + pubCost +
        ", derateCost=" + derateCost +
        ", balanceDtime=" + balanceDtime +
        ", deptCode=" + deptCode +
        ", pactCode=" + pactCode +
        ", balanceType=" + balanceType +
        ", isBaby=" + isBaby +
        ", invoiceNo=" + invoiceNo +
        ", wasteFlag=" + wasteFlag +
        ", operCode=" + operCode +
        ", operDeptCode=" + operDeptCode +
        ", wasteOperCode=" + wasteOperCode +
        ", wasteDeptCode=" + wasteDeptCode +
        ", wasteDtime=" + wasteDtime +
        ", pkey=" + pkey +
        ", fromdate=" + fromdate +
        ", enddate=" + enddate +
        "}";
    }
}
