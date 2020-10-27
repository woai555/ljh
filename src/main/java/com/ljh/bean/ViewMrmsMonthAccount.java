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
public class ViewMrmsMonthAccount implements Serializable {

    private static final long serialVersionUID=1L;

    private String inpatientNo;

    private String name;

    private String feeCode;

    private BigDecimal totCost;

    private String deptCode;

    private BigDecimal days;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getDays() {
        return days;
    }

    public void setDays(BigDecimal days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "ViewMrmsMonthAccount{" +
        "inpatientNo=" + inpatientNo +
        ", name=" + name +
        ", feeCode=" + feeCode +
        ", totCost=" + totCost +
        ", deptCode=" + deptCode +
        ", days=" + days +
        "}";
    }
}
