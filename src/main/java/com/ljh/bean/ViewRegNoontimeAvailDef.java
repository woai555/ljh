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
public class ViewRegNoontimeAvailDef implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String noonCode;

    private String timeCode;

    private String emplCode;

    private String reglevlCode;

    private String deptCode;

    private Integer firRegLmt;

    private BigDecimal repRegLmt;

    private String emplName;

    private BigDecimal llYy;

    private BigDecimal llReg;


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

    public String getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Integer getFirRegLmt() {
        return firRegLmt;
    }

    public void setFirRegLmt(Integer firRegLmt) {
        this.firRegLmt = firRegLmt;
    }

    public BigDecimal getRepRegLmt() {
        return repRegLmt;
    }

    public void setRepRegLmt(BigDecimal repRegLmt) {
        this.repRegLmt = repRegLmt;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public BigDecimal getLlYy() {
        return llYy;
    }

    public void setLlYy(BigDecimal llYy) {
        this.llYy = llYy;
    }

    public BigDecimal getLlReg() {
        return llReg;
    }

    public void setLlReg(BigDecimal llReg) {
        this.llReg = llReg;
    }

    @Override
    public String toString() {
        return "ViewRegNoontimeAvailDef{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", timeCode=" + timeCode +
        ", emplCode=" + emplCode +
        ", reglevlCode=" + reglevlCode +
        ", deptCode=" + deptCode +
        ", firRegLmt=" + firRegLmt +
        ", repRegLmt=" + repRegLmt +
        ", emplName=" + emplName +
        ", llYy=" + llYy +
        ", llReg=" + llReg +
        "}";
    }
}
