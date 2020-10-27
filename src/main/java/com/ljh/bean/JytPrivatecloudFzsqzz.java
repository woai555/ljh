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
public class JytPrivatecloudFzsqzz implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String doctid;

    private String doctName;

    private String deptCode;

    private String deptName;

    private String reglevlCode;

    private String reglevlName;

    private BigDecimal leftnum;

    private String noonCode;

    private String noonName;

    private String regHour;


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

    public BigDecimal getLeftnum() {
        return leftnum;
    }

    public void setLeftnum(BigDecimal leftnum) {
        this.leftnum = leftnum;
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

    public String getRegHour() {
        return regHour;
    }

    public void setRegHour(String regHour) {
        this.regHour = regHour;
    }

    @Override
    public String toString() {
        return "JytPrivatecloudFzsqzz{" +
        "seeDate=" + seeDate +
        ", doctid=" + doctid +
        ", doctName=" + doctName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", leftnum=" + leftnum +
        ", noonCode=" + noonCode +
        ", noonName=" + noonName +
        ", regHour=" + regHour +
        "}";
    }
}
