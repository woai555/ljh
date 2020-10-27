package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医疗费用、预交金动态日报表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ReportDayfee implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 报表日期
     */
    @TableId(value = "OPER_DATE", type = IdType.AUTO)
    private LocalDateTime operDate;

    /**
     * 报表类型（1：医疗费用日报表  0：预交金日报表）
     */
    private String reportType;

    /**
     * 总余额
     */
    private BigDecimal totCost;

    /**
     * 在院患者医药费或预交金
     */
    private BigDecimal inpatientCost;

    /**
     * 出院患者医药费或预交金
     */
    private BigDecimal outpatientCost;

    /**
     * 本日增加医药费或预交金
     */
    private BigDecimal currdayAddcost;

    /**
     * 本日结帐医药费或预交金
     */
    private BigDecimal currdayBalancecost;

    /**
     * 欠费结转医药费或预交金
     */
    private BigDecimal arrearageCost;

    /**
     * 操作员代码
     */
    private String opercode;

    /**
     * 操作日期
     */
    private LocalDateTime operdate;

    /**
     * 本日减少预交金
     */
    private BigDecimal currdayDecprepay;


    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public BigDecimal getTotCost() {
        return totCost;
    }

    public void setTotCost(BigDecimal totCost) {
        this.totCost = totCost;
    }

    public BigDecimal getInpatientCost() {
        return inpatientCost;
    }

    public void setInpatientCost(BigDecimal inpatientCost) {
        this.inpatientCost = inpatientCost;
    }

    public BigDecimal getOutpatientCost() {
        return outpatientCost;
    }

    public void setOutpatientCost(BigDecimal outpatientCost) {
        this.outpatientCost = outpatientCost;
    }

    public BigDecimal getCurrdayAddcost() {
        return currdayAddcost;
    }

    public void setCurrdayAddcost(BigDecimal currdayAddcost) {
        this.currdayAddcost = currdayAddcost;
    }

    public BigDecimal getCurrdayBalancecost() {
        return currdayBalancecost;
    }

    public void setCurrdayBalancecost(BigDecimal currdayBalancecost) {
        this.currdayBalancecost = currdayBalancecost;
    }

    public BigDecimal getArrearageCost() {
        return arrearageCost;
    }

    public void setArrearageCost(BigDecimal arrearageCost) {
        this.arrearageCost = arrearageCost;
    }

    public String getOpercode() {
        return opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    public BigDecimal getCurrdayDecprepay() {
        return currdayDecprepay;
    }

    public void setCurrdayDecprepay(BigDecimal currdayDecprepay) {
        this.currdayDecprepay = currdayDecprepay;
    }

    @Override
    public String toString() {
        return "ReportDayfee{" +
        "operDate=" + operDate +
        ", reportType=" + reportType +
        ", totCost=" + totCost +
        ", inpatientCost=" + inpatientCost +
        ", outpatientCost=" + outpatientCost +
        ", currdayAddcost=" + currdayAddcost +
        ", currdayBalancecost=" + currdayBalancecost +
        ", arrearageCost=" + arrearageCost +
        ", opercode=" + opercode +
        ", operdate=" + operdate +
        ", currdayDecprepay=" + currdayDecprepay +
        "}";
    }
}
