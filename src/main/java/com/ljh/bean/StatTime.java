package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 统计时间设定
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class StatTime implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 部门编码
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * AJ-调价    IA-住院固定费用统计
     */
    private String reportId;

    /**
     * 报表名称
     */
    private String reportName;

    /**
     * 0_不统计, 1_每日统计,  2_每周统计,  3_每月统计，4_每季度统计,5_每年统计,7_自定义
     */
    private String statDataFlag;

    /**
     * 统计时间
     */
    private LocalDateTime statDatetime;

    /**
     * 间隔天数
     */
    private Integer intervalNum;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getStatDataFlag() {
        return statDataFlag;
    }

    public void setStatDataFlag(String statDataFlag) {
        this.statDataFlag = statDataFlag;
    }

    public LocalDateTime getStatDatetime() {
        return statDatetime;
    }

    public void setStatDatetime(LocalDateTime statDatetime) {
        this.statDatetime = statDatetime;
    }

    public Integer getIntervalNum() {
        return intervalNum;
    }

    public void setIntervalNum(Integer intervalNum) {
        this.intervalNum = intervalNum;
    }

    @Override
    public String toString() {
        return "StatTime{" +
        "deptCode=" + deptCode +
        ", reportId=" + reportId +
        ", reportName=" + reportName +
        ", statDataFlag=" + statDataFlag +
        ", statDatetime=" + statDatetime +
        ", intervalNum=" + intervalNum +
        "}";
    }
}
