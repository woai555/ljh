package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 科室出诊表(R_DeptRegLmt)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RDeptreglmt implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 看诊日期
     */
    @TableId(value = "SEE_DATE", type = IdType.AUTO)
    private LocalDateTime seeDate;

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
     * 初诊已挂
     */
    private Integer firReged;

    /**
     * 复诊已挂
     */
    private Integer repReged;

    /**
     * 急诊已挂
     */
    private Integer urgReged;

    /**
     * 预约已挂
     */
    private Integer bkReged;

    /**
     * 当前就诊号
     */
    private Integer seeno;

    /**
     * 初诊额满标记
     */
    private String ynfregfull;

    /**
     * 复诊额满标记
     */
    private String ynrregfull;

    /**
     * 预约额满标记
     */
    private String ynbkfull;

    /**
     * 初诊挂号费
     */
    private BigDecimal firRegFee;

    /**
     * 复诊挂号费
     */
    private BigDecimal repRegFee;

    /**
     * 检查费
     */
    private BigDecimal chckFee;

    /**
     * 诊察费
     */
    private BigDecimal diagFee;

    /**
     * 附加费
     */
    private BigDecimal othFee;

    /**
     * 急诊挂号费
     */
    private BigDecimal urgRegFee;

    /**
     * 急诊检查费
     */
    private BigDecimal urgChckFee;

    /**
     * 急诊诊察费
     */
    private BigDecimal urgDiagFee;

    /**
     * 急诊附加费
     */
    private BigDecimal urgOthFee;

    /**
     * 最近变动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 星期
     */
    private String week;


    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
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

    public Integer getFirReged() {
        return firReged;
    }

    public void setFirReged(Integer firReged) {
        this.firReged = firReged;
    }

    public Integer getRepReged() {
        return repReged;
    }

    public void setRepReged(Integer repReged) {
        this.repReged = repReged;
    }

    public Integer getUrgReged() {
        return urgReged;
    }

    public void setUrgReged(Integer urgReged) {
        this.urgReged = urgReged;
    }

    public Integer getBkReged() {
        return bkReged;
    }

    public void setBkReged(Integer bkReged) {
        this.bkReged = bkReged;
    }

    public Integer getSeeno() {
        return seeno;
    }

    public void setSeeno(Integer seeno) {
        this.seeno = seeno;
    }

    public String getYnfregfull() {
        return ynfregfull;
    }

    public void setYnfregfull(String ynfregfull) {
        this.ynfregfull = ynfregfull;
    }

    public String getYnrregfull() {
        return ynrregfull;
    }

    public void setYnrregfull(String ynrregfull) {
        this.ynrregfull = ynrregfull;
    }

    public String getYnbkfull() {
        return ynbkfull;
    }

    public void setYnbkfull(String ynbkfull) {
        this.ynbkfull = ynbkfull;
    }

    public BigDecimal getFirRegFee() {
        return firRegFee;
    }

    public void setFirRegFee(BigDecimal firRegFee) {
        this.firRegFee = firRegFee;
    }

    public BigDecimal getRepRegFee() {
        return repRegFee;
    }

    public void setRepRegFee(BigDecimal repRegFee) {
        this.repRegFee = repRegFee;
    }

    public BigDecimal getChckFee() {
        return chckFee;
    }

    public void setChckFee(BigDecimal chckFee) {
        this.chckFee = chckFee;
    }

    public BigDecimal getDiagFee() {
        return diagFee;
    }

    public void setDiagFee(BigDecimal diagFee) {
        this.diagFee = diagFee;
    }

    public BigDecimal getOthFee() {
        return othFee;
    }

    public void setOthFee(BigDecimal othFee) {
        this.othFee = othFee;
    }

    public BigDecimal getUrgRegFee() {
        return urgRegFee;
    }

    public void setUrgRegFee(BigDecimal urgRegFee) {
        this.urgRegFee = urgRegFee;
    }

    public BigDecimal getUrgChckFee() {
        return urgChckFee;
    }

    public void setUrgChckFee(BigDecimal urgChckFee) {
        this.urgChckFee = urgChckFee;
    }

    public BigDecimal getUrgDiagFee() {
        return urgDiagFee;
    }

    public void setUrgDiagFee(BigDecimal urgDiagFee) {
        this.urgDiagFee = urgDiagFee;
    }

    public BigDecimal getUrgOthFee() {
        return urgOthFee;
    }

    public void setUrgOthFee(BigDecimal urgOthFee) {
        this.urgOthFee = urgOthFee;
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

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return "RDeptreglmt{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", deptCode=" + deptCode +
        ", reglevlCode=" + reglevlCode +
        ", firRegLmt=" + firRegLmt +
        ", repRegLmt=" + repRegLmt +
        ", bkRegLmt=" + bkRegLmt +
        ", firReged=" + firReged +
        ", repReged=" + repReged +
        ", urgReged=" + urgReged +
        ", bkReged=" + bkReged +
        ", seeno=" + seeno +
        ", ynfregfull=" + ynfregfull +
        ", ynrregfull=" + ynrregfull +
        ", ynbkfull=" + ynbkfull +
        ", firRegFee=" + firRegFee +
        ", repRegFee=" + repRegFee +
        ", chckFee=" + chckFee +
        ", diagFee=" + diagFee +
        ", othFee=" + othFee +
        ", urgRegFee=" + urgRegFee +
        ", urgChckFee=" + urgChckFee +
        ", urgDiagFee=" + urgDiagFee +
        ", urgOthFee=" + urgOthFee +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", week=" + week +
        "}";
    }
}
