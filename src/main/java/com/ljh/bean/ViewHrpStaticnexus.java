package com.ljh.bean;

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
public class ViewHrpStaticnexus implements Serializable {

    private static final long serialVersionUID=1L;

    private String reportCode;

    private String reportName;

    private String feeCode;

    private String feeStatName;


    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
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

    @Override
    public String toString() {
        return "ViewHrpStaticnexus{" +
        "reportCode=" + reportCode +
        ", reportName=" + reportName +
        ", feeCode=" + feeCode +
        ", feeStatName=" + feeStatName +
        "}";
    }
}
