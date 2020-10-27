package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 挂号费用表R_REGISTERFEE
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RRegisterfee implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室号
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 挂号级别
     */
    private String reglevlCode;

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
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 与部门有关否
     */
    private String relativeDept;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 挂号费his代码，医保实时结算用，090921
     */
    private String regfeeHisid;

    /**
     * 诊疗费his代码，医保实时结算用，090921
     */
    private String diagfeeHisid;

    /**
     * 急诊挂号费his代码，医保实时结算用，090921
     */
    private String jzregfeeHisid;


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

    public String getRelativeDept() {
        return relativeDept;
    }

    public void setRelativeDept(String relativeDept) {
        this.relativeDept = relativeDept;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getRegfeeHisid() {
        return regfeeHisid;
    }

    public void setRegfeeHisid(String regfeeHisid) {
        this.regfeeHisid = regfeeHisid;
    }

    public String getDiagfeeHisid() {
        return diagfeeHisid;
    }

    public void setDiagfeeHisid(String diagfeeHisid) {
        this.diagfeeHisid = diagfeeHisid;
    }

    public String getJzregfeeHisid() {
        return jzregfeeHisid;
    }

    public void setJzregfeeHisid(String jzregfeeHisid) {
        this.jzregfeeHisid = jzregfeeHisid;
    }

    @Override
    public String toString() {
        return "RRegisterfee{" +
        "deptCode=" + deptCode +
        ", reglevlCode=" + reglevlCode +
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
        ", relativeDept=" + relativeDept +
        ", operCode=" + operCode +
        ", regfeeHisid=" + regfeeHisid +
        ", diagfeeHisid=" + diagfeeHisid +
        ", jzregfeeHisid=" + jzregfeeHisid +
        "}";
    }
}
