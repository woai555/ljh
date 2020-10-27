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
public class VDoctAvailableTelecom implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String noonCode;

    private String noonName;

    private String reglevlCode;

    private String reglevlName;

    private String week;

    private BigDecimal bookcount;

    private Integer reglmt;

    private String deptCode;

    private String deptName;

    private String emplCode;

    private String emplName;

    private String emplPy;

    private String ynexpert;

    private String levl;

    private BigDecimal cost;


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

    public String getNoonName() {
        return noonName;
    }

    public void setNoonName(String noonName) {
        this.noonName = noonName;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getReglevlName() {
        return reglevlName;
    }

    public void setReglevlName(String reglevlName) {
        this.reglevlName = reglevlName;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public BigDecimal getBookcount() {
        return bookcount;
    }

    public void setBookcount(BigDecimal bookcount) {
        this.bookcount = bookcount;
    }

    public Integer getReglmt() {
        return reglmt;
    }

    public void setReglmt(Integer reglmt) {
        this.reglmt = reglmt;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getEmplPy() {
        return emplPy;
    }

    public void setEmplPy(String emplPy) {
        this.emplPy = emplPy;
    }

    public String getYnexpert() {
        return ynexpert;
    }

    public void setYnexpert(String ynexpert) {
        this.ynexpert = ynexpert;
    }

    public String getLevl() {
        return levl;
    }

    public void setLevl(String levl) {
        this.levl = levl;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "VDoctAvailableTelecom{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", noonName=" + noonName +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", week=" + week +
        ", bookcount=" + bookcount +
        ", reglmt=" + reglmt +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", emplPy=" + emplPy +
        ", ynexpert=" + ynexpert +
        ", levl=" + levl +
        ", cost=" + cost +
        "}";
    }
}
