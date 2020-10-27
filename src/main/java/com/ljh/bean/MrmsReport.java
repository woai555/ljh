package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 报表信息表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MrmsReport implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 报表类型
     */
    @TableId(value = "REPORT_TYPE", type = IdType.AUTO)
    private String reportType;

    /**
     * 类型名称
     */
    private String reportName;

    /**
     * 所对应的数据窗口名称
     */
    private String dwName;

    /**
     * 所对应的数据窗口中文名
     */
    private String dwCname;


    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getDwName() {
        return dwName;
    }

    public void setDwName(String dwName) {
        this.dwName = dwName;
    }

    public String getDwCname() {
        return dwCname;
    }

    public void setDwCname(String dwCname) {
        this.dwCname = dwCname;
    }

    @Override
    public String toString() {
        return "MrmsReport{" +
        "reportType=" + reportType +
        ", reportName=" + reportName +
        ", dwName=" + dwName +
        ", dwCname=" + dwCname +
        "}";
    }
}
