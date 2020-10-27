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
public class V54docSchedule implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String doctid;

    private String doctName;

    private String deptid;

    private String deptName;

    private String reglevlCode;

    private String reglevlName;

    private BigDecimal totalfee;

    private String regHalf;

    private BigDecimal regCount;

    private BigDecimal totalNum;


    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getDoctid() {
        return doctid;
    }

    public void setDoctid(String doctid) {
        this.doctid = doctid;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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

    public BigDecimal getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(BigDecimal totalfee) {
        this.totalfee = totalfee;
    }

    public String getRegHalf() {
        return regHalf;
    }

    public void setRegHalf(String regHalf) {
        this.regHalf = regHalf;
    }

    public BigDecimal getRegCount() {
        return regCount;
    }

    public void setRegCount(BigDecimal regCount) {
        this.regCount = regCount;
    }

    public BigDecimal getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(BigDecimal totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public String toString() {
        return "V54docSchedule{" +
        "seeDate=" + seeDate +
        ", doctid=" + doctid +
        ", doctName=" + doctName +
        ", deptid=" + deptid +
        ", deptName=" + deptName +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", totalfee=" + totalfee +
        ", regHalf=" + regHalf +
        ", regCount=" + regCount +
        ", totalNum=" + totalNum +
        "}";
    }
}
