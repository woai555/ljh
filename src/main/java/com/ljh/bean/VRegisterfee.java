package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class VRegisterfee implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String reglevlCode;

    private BigDecimal firRegFee;

    private BigDecimal repRegFee;

    private BigDecimal chckFee;

    private BigDecimal diagFee;

    private BigDecimal othFee;

    private BigDecimal urgRegFee;

    private BigDecimal urgChckFee;

    private BigDecimal urgDiagFee;

    private BigDecimal urgOthFee;

    private LocalDateTime operDate;

    private String relativeDept;

    private String operCode;

    private String regfeeHisid;

    private String diagfeeHisid;

    private String jzregfeeHisid;

    private String regHisname;

    private String diagHisname;


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

    public String getRegHisname() {
        return regHisname;
    }

    public void setRegHisname(String regHisname) {
        this.regHisname = regHisname;
    }

    public String getDiagHisname() {
        return diagHisname;
    }

    public void setDiagHisname(String diagHisname) {
        this.diagHisname = diagHisname;
    }

    @Override
    public String toString() {
        return "VRegisterfee{" +
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
        ", regHisname=" + regHisname +
        ", diagHisname=" + diagHisname +
        "}";
    }
}
