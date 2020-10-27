package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_QUERY_ICU_DEPT
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewQueryIcuDept implements Serializable {

    private static final long serialVersionUID=1L;

    private String reportCode;

    private String feeStatName;

    private String newDataCode;

    private String inpatientNo;

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

    public String getNewDataCode() {
        return newDataCode;
    }

    public void setNewDataCode(String newDataCode) {
        this.newDataCode = newDataCode;
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ViewQueryIcuDept{" +
        "reportCode=" + reportCode +
        ", feeStatName=" + feeStatName +
        ", newDataCode=" + newDataCode +
        ", inpatientNo=" + inpatientNo +
        ", cost=" + cost +
        "}";
    }
}
