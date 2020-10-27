package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊医师排班表(R_DOCTSCH)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RDoctsch implements Serializable {

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
     * 医师代号
     */
    private String emplCode;

    /**
     * 所属科室
     */
    private String deptCode;

    /**
     * 出诊科室
     */
    private String seedeptCode;

    /**
     * 挂号级别
     */
    private String reglevlCode;

    /**
     * 初诊限额
     */
    private Integer firRegLmt;

    /**
     * 复诊限额(天坛不用)
     */
    private Integer repRegLmt;

    /**
     * 预约限额(天坛不用)
     */
    private Integer bkRegLmt;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 备注
     */
    private String note;

    /**
     * 预约起始号
     */
    private BigDecimal bkBegin;

    /**
     * 预约终止号
     */
    private BigDecimal bkEnd;


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

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getSeedeptCode() {
        return seedeptCode;
    }

    public void setSeedeptCode(String seedeptCode) {
        this.seedeptCode = seedeptCode;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigDecimal getBkBegin() {
        return bkBegin;
    }

    public void setBkBegin(BigDecimal bkBegin) {
        this.bkBegin = bkBegin;
    }

    public BigDecimal getBkEnd() {
        return bkEnd;
    }

    public void setBkEnd(BigDecimal bkEnd) {
        this.bkEnd = bkEnd;
    }

    @Override
    public String toString() {
        return "RDoctsch{" +
        "week=" + week +
        ", noonCode=" + noonCode +
        ", emplCode=" + emplCode +
        ", deptCode=" + deptCode +
        ", seedeptCode=" + seedeptCode +
        ", reglevlCode=" + reglevlCode +
        ", firRegLmt=" + firRegLmt +
        ", repRegLmt=" + repRegLmt +
        ", bkRegLmt=" + bkRegLmt +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", note=" + note +
        ", bkBegin=" + bkBegin +
        ", bkEnd=" + bkEnd +
        "}";
    }
}
