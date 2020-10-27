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
public class ViewBookNoontimeAvailZzdef implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String noonCode;

    private String deptCode;

    private String emplCode;

    private String reglevlCode;

    private BigDecimal firRegLmt;

    private String timeCode;

    private String flag;

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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public BigDecimal getFirRegLmt() {
        return firRegLmt;
    }

    public void setFirRegLmt(BigDecimal firRegLmt) {
        this.firRegLmt = firRegLmt;
    }

    public String getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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
        return "ViewBookNoontimeAvailZzdef{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", deptCode=" + deptCode +
        ", emplCode=" + emplCode +
        ", reglevlCode=" + reglevlCode +
        ", firRegLmt=" + firRegLmt +
        ", timeCode=" + timeCode +
        ", flag=" + flag +
        ", emplName=" + emplName +
        ", llYy=" + llYy +
        ", llReg=" + llReg +
        "}";
    }
}
