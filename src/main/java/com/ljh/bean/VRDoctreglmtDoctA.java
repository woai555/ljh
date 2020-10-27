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
public class VRDoctreglmtDoctA implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String noonCode;

    private String doctCode;

    private String doctName;

    private String outpatientTime;

    private String deptCode;

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

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public String getOutpatientTime() {
        return outpatientTime;
    }

    public void setOutpatientTime(String outpatientTime) {
        this.outpatientTime = outpatientTime;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
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
        return "VRDoctreglmtDoctA{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", doctCode=" + doctCode +
        ", doctName=" + doctName +
        ", outpatientTime=" + outpatientTime +
        ", deptCode=" + deptCode +
        ", timeLmt=" + timeLmt +
        ", bookNum=" + bookNum +
        "}";
    }
}
