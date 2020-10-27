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
public class VDoctTimeAvail implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String noonCode;

    private String timeCode;

    private String deptCode;

    private String emplCode;

    private String emplName;

    private String reglevlCode;

    private BigDecimal firRegLmt;

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

    public BigDecimal getFirRegLmt() {
        return firRegLmt;
    }

    public void setFirRegLmt(BigDecimal firRegLmt) {
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
        return "VDoctTimeAvail{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", timeCode=" + timeCode +
        ", deptCode=" + deptCode +
        ", emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", reglevlCode=" + reglevlCode +
        ", firRegLmt=" + firRegLmt +
        ", flag=" + flag +
        ", groupCnt=" + groupCnt +
        ", timeLmt=" + timeLmt +
        ", bookNum=" + bookNum +
        "}";
    }
}
