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
public class ViewRegNoontimeLmt implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String noonCode;

    private String timeCode;

    private String emplCode;

    private String reglevlCode;

    private String deptCode;

    private Integer firRegLmt;

    private Integer repRegLmt;

    private String emplName;

    private String flag;

    private BigDecimal llYy;

    private BigDecimal llReg;

    private BigDecimal lnt;

    private BigDecimal llLimit;


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

    public Integer getRepRegLmt() {
        return repRegLmt;
    }

    public void setRepRegLmt(Integer repRegLmt) {
        this.repRegLmt = repRegLmt;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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

    public BigDecimal getLnt() {
        return lnt;
    }

    public void setLnt(BigDecimal lnt) {
        this.lnt = lnt;
    }

    public BigDecimal getLlLimit() {
        return llLimit;
    }

    public void setLlLimit(BigDecimal llLimit) {
        this.llLimit = llLimit;
    }

    @Override
    public String toString() {
        return "ViewRegNoontimeLmt{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", timeCode=" + timeCode +
        ", emplCode=" + emplCode +
        ", reglevlCode=" + reglevlCode +
        ", deptCode=" + deptCode +
        ", firRegLmt=" + firRegLmt +
        ", repRegLmt=" + repRegLmt +
        ", emplName=" + emplName +
        ", flag=" + flag +
        ", llYy=" + llYy +
        ", llReg=" + llReg +
        ", lnt=" + lnt +
        ", llLimit=" + llLimit +
        "}";
    }
}
