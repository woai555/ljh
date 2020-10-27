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
public class VRDoctreglmtApp implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String noonCode;

    private String emplCode;

    private String deptCode;

    private String reglevlCode;

    private Integer firRegLmt;

    private Integer repRegLmt;

    private Integer bkRegLmt;

    private Integer firReged;

    private Integer repReged;

    private Integer urgReged;

    private Integer bkReged;

    private String ynfregfull;

    private String ynrregfull;

    private String ynbkregfull;

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

    private String operCode;

    private String week;

    private String note;

    private BigDecimal bkBegin;

    private BigDecimal bkEnd;


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

    public String getYnbkregfull() {
        return ynbkregfull;
    }

    public void setYnbkregfull(String ynbkregfull) {
        this.ynbkregfull = ynbkregfull;
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
        return "VRDoctreglmtApp{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", emplCode=" + emplCode +
        ", deptCode=" + deptCode +
        ", reglevlCode=" + reglevlCode +
        ", firRegLmt=" + firRegLmt +
        ", repRegLmt=" + repRegLmt +
        ", bkRegLmt=" + bkRegLmt +
        ", firReged=" + firReged +
        ", repReged=" + repReged +
        ", urgReged=" + urgReged +
        ", bkReged=" + bkReged +
        ", ynfregfull=" + ynfregfull +
        ", ynrregfull=" + ynrregfull +
        ", ynbkregfull=" + ynbkregfull +
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
        ", note=" + note +
        ", bkBegin=" + bkBegin +
        ", bkEnd=" + bkEnd +
        "}";
    }
}
