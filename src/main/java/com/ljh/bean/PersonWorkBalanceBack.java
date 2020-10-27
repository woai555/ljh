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
public class PersonWorkBalanceBack implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime operDate;

    private String operCode;

    private LocalDateTime fromDate;

    private LocalDateTime toDate;

    private String feeStatCate;

    private String feeStatName;

    private BigDecimal totCost;

    private BigDecimal returnCost;

    private Integer printOrder;

    private String quitType;

    private String checkFlag;

    private String cancelFlag;

    private String checkOperCode;

    private LocalDateTime checkDate;


    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public String getFeeStatCate() {
        return feeStatCate;
    }

    public void setFeeStatCate(String feeStatCate) {
        this.feeStatCate = feeStatCate;
    }

    public String getFeeStatName() {
        return feeStatName;
    }

    public void setFeeStatName(String feeStatName) {
        this.feeStatName = feeStatName;
    }

    public BigDecimal getTotCost() {
        return totCost;
    }

    public void setTotCost(BigDecimal totCost) {
        this.totCost = totCost;
    }

    public BigDecimal getReturnCost() {
        return returnCost;
    }

    public void setReturnCost(BigDecimal returnCost) {
        this.returnCost = returnCost;
    }

    public Integer getPrintOrder() {
        return printOrder;
    }

    public void setPrintOrder(Integer printOrder) {
        this.printOrder = printOrder;
    }

    public String getQuitType() {
        return quitType;
    }

    public void setQuitType(String quitType) {
        this.quitType = quitType;
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public String getCheckOperCode() {
        return checkOperCode;
    }

    public void setCheckOperCode(String checkOperCode) {
        this.checkOperCode = checkOperCode;
    }

    public LocalDateTime getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(LocalDateTime checkDate) {
        this.checkDate = checkDate;
    }

    @Override
    public String toString() {
        return "PersonWorkBalanceBack{" +
        "operDate=" + operDate +
        ", operCode=" + operCode +
        ", fromDate=" + fromDate +
        ", toDate=" + toDate +
        ", feeStatCate=" + feeStatCate +
        ", feeStatName=" + feeStatName +
        ", totCost=" + totCost +
        ", returnCost=" + returnCost +
        ", printOrder=" + printOrder +
        ", quitType=" + quitType +
        ", checkFlag=" + checkFlag +
        ", cancelFlag=" + cancelFlag +
        ", checkOperCode=" + checkOperCode +
        ", checkDate=" + checkDate +
        "}";
    }
}
