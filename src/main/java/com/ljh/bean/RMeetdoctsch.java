package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 会诊排班表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RMeetdoctsch implements Serializable {

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
     * 员工代码
     */
    private String emplCode;

    /**
     * 会诊类别
     */
    private String kindCode;

    /**
     * 挂号级别
     */
    private String reglevlCode;

    /**
     * 会诊号
     */
    private String regNo;

    /**
     * 序号
     */
    private Integer meetNo;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 专业特长
     */
    private String major;

    /**
     * 一级医生限额
     */
    private BigDecimal limitFir;

    /**
     * 二级医生限额
     */
    private BigDecimal limitSec;


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

    public String getKindCode() {
        return kindCode;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public Integer getMeetNo() {
        return meetNo;
    }

    public void setMeetNo(Integer meetNo) {
        this.meetNo = meetNo;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public BigDecimal getLimitFir() {
        return limitFir;
    }

    public void setLimitFir(BigDecimal limitFir) {
        this.limitFir = limitFir;
    }

    public BigDecimal getLimitSec() {
        return limitSec;
    }

    public void setLimitSec(BigDecimal limitSec) {
        this.limitSec = limitSec;
    }

    @Override
    public String toString() {
        return "RMeetdoctsch{" +
        "week=" + week +
        ", noonCode=" + noonCode +
        ", emplCode=" + emplCode +
        ", kindCode=" + kindCode +
        ", reglevlCode=" + reglevlCode +
        ", regNo=" + regNo +
        ", meetNo=" + meetNo +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", major=" + major +
        ", limitFir=" + limitFir +
        ", limitSec=" + limitSec +
        "}";
    }
}
