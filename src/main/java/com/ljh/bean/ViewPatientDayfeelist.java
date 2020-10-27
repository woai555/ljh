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
public class ViewPatientDayfeelist implements Serializable {

    private static final long serialVersionUID=1L;

    private String inpatientNo;

    private String name;

    private BigDecimal totCost;

    private String deptCode;

    private BigDecimal days;

    private String reportCode;

    private String feeCode;

    private String feeStatName;

    private String feeStatCode;

    private Integer printOrder;


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

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getFeeStatName() {
        return feeStatName;
    }

    public void setFeeStatName(String feeStatName) {
        this.feeStatName = feeStatName;
    }

    public String getFeeStatCode() {
        return feeStatCode;
    }

    public void setFeeStatCode(String feeStatCode) {
        this.feeStatCode = feeStatCode;
    }

    public Integer getPrintOrder() {
        return printOrder;
    }

    public void setPrintOrder(Integer printOrder) {
        this.printOrder = printOrder;
    }

    @Override
    public String toString() {
        return "ViewPatientDayfeelist{" +
        "inpatientNo=" + inpatientNo +
        ", name=" + name +
        ", totCost=" + totCost +
        ", deptCode=" + deptCode +
        ", days=" + days +
        ", reportCode=" + reportCode +
        ", feeCode=" + feeCode +
        ", feeStatName=" + feeStatName +
        ", feeStatCode=" + feeStatCode +
        ", printOrder=" + printOrder +
        "}";
    }
}
