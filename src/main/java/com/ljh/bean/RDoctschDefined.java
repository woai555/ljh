package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊医师分时段排班表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RDoctschDefined implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 医师代号
     */
    @TableId(value = "EMPL_CODE", type = IdType.AUTO)
    private String emplCode;

    /**
     * 星期
     */
    private String week;

    /**
     * 午别
     */
    private String noonCode;

    /**
     * 时间段
     */
    private String timeCode;

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

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;

    /**
     * 0为加号时段
     */
    private String flag;


    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

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

    public String getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
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

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "RDoctschDefined{" +
        "emplCode=" + emplCode +
        ", week=" + week +
        ", noonCode=" + noonCode +
        ", timeCode=" + timeCode +
        ", deptCode=" + deptCode +
        ", seedeptCode=" + seedeptCode +
        ", reglevlCode=" + reglevlCode +
        ", firRegLmt=" + firRegLmt +
        ", repRegLmt=" + repRegLmt +
        ", bkRegLmt=" + bkRegLmt +
        ", note=" + note +
        ", bkBegin=" + bkBegin +
        ", bkEnd=" + bkEnd +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", flag=" + flag +
        "}";
    }
}
