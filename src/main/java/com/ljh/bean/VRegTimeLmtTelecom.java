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
public class VRegTimeLmtTelecom implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String noonCode;

    private String noonName;

    private String timeCode;

    private String deptCode;

    private String deptName;

    private String emplCode;

    private String emplName;

    private String reglevlCode;

    private String reglevlName;

    private BigDecimal cost;

    private Integer firRegLmt;

    private String flag;

    private BigDecimal groupCnt;

    private BigDecimal timeLmt;

    private BigDecimal bookNum;


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

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getFirRegLmt() {
        return firRegLmt;
    }

    public void setFirRegLmt(Integer firRegLmt) {
        this.firRegLmt = firRegLmt;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public BigDecimal getGroupCnt() {
        return groupCnt;
    }

    public void setGroupCnt(BigDecimal groupCnt) {
        this.groupCnt = groupCnt;
    }

    public BigDecimal getTimeLmt() {
        return timeLmt;
    }

    public void setTimeLmt(BigDecimal timeLmt) {
        this.timeLmt = timeLmt;
    }

    public BigDecimal getBookNum() {
        return bookNum;
    }

    public void setBookNum(BigDecimal bookNum) {
        this.bookNum = bookNum;
    }

    @Override
    public String toString() {
        return "VRegTimeLmtTelecom{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", noonName=" + noonName +
        ", timeCode=" + timeCode +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", cost=" + cost +
        ", firRegLmt=" + firRegLmt +
        ", flag=" + flag +
        ", groupCnt=" + groupCnt +
        ", timeLmt=" + timeLmt +
        ", bookNum=" + bookNum +
        "}";
    }
}
