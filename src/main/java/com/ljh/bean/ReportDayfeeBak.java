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
public class ReportDayfeeBak implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime operDate;

    private String reportType;

    private BigDecimal totCost;

    private BigDecimal inpatientCost;

    private BigDecimal outpatientCost;

    private BigDecimal currdayAddcost;

    private BigDecimal currdayBalancecost;

    private BigDecimal arrearageCost;

    private String opercode;

    private LocalDateTime operdate;

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
        return "ReportDayfeeBak{" +
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
