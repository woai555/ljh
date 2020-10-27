package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_QUERY_ALLFEE_DEPT
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewQueryAllfeeDept implements Serializable {

    private static final long serialVersionUID=1L;

    private String reportCode;

    private String feeStatName;

    private String deptCode;

    private BigDecimal cost;


    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode;
    }

    public String getFeeStatName() {
        return feeStatName;
    }

    public void setFeeStatName(String feeStatName) {
        this.feeStatName = feeStatName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ViewQueryAllfeeDept{" +
        "reportCode=" + reportCode +
        ", feeStatName=" + feeStatName +
        ", deptCode=" + deptCode +
        ", cost=" + cost +
        "}";
    }
}
