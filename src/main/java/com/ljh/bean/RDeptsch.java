package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊科室排班表(R_DeptSch)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RDeptsch implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 星期
     */
    @TableId(value = "WEEK", type = IdType.AUTO)
    private String week;

    /**
     * 午别
     */
    private String noonCode;

    /**
     * 科室号
     */
    private String deptCode;

    /**
     * 挂号级别
     */
    private String reglevlCode;

    /**
     * 初诊限额
     */
    private Integer firRegLmt;

    /**
     * 复诊限额
     */
    private Integer repRegLmt;

    /**
     * 预约限额
     */
    private Integer bkRegLmt;

    /**
     * 特色门诊
     */
    private String ynspecsee;

    /**
     * 备注
     */
    private String mark;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;


    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public Integer getFirRegLmt() {
        return firRegLmt;
    }

    public void setFirRegLmt(Integer firRegLmt) {
        this.firRegLmt = firRegLmt;
    }

    public Integer getRepRegLmt() {
        return repRegLmt;
    }

    public void setRepRegLmt(Integer repRegLmt) {
        this.repRegLmt = repRegLmt;
    }

    public Integer getBkRegLmt() {
        return bkRegLmt;
    }

    public void setBkRegLmt(Integer bkRegLmt) {
        this.bkRegLmt = bkRegLmt;
    }

    public String getYnspecsee() {
        return ynspecsee;
    }

    public void setYnspecsee(String ynspecsee) {
        this.ynspecsee = ynspecsee;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

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

    @Override
    public String toString() {
        return "RDeptsch{" +
        "week=" + week +
        ", noonCode=" + noonCode +
        ", deptCode=" + deptCode +
        ", reglevlCode=" + reglevlCode +
        ", firRegLmt=" + firRegLmt +
        ", repRegLmt=" + repRegLmt +
        ", bkRegLmt=" + bkRegLmt +
        ", ynspecsee=" + ynspecsee +
        ", mark=" + mark +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}
