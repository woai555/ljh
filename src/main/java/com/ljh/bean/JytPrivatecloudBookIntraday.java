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
public class JytPrivatecloudBookIntraday implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String doctid;

    private String doctName;

    private String deptid;

    private String deptName;

    private String reglevlCode;

    private String reglevlName;

    private BigDecimal totalfee;

    private BigDecimal regCount;

    private LocalDateTime starttime;

    private LocalDateTime endtime;

    private String regHalf;

    private String regHour;

    private String flag;

    private String specialty;

    private String remark;

    private String extParam;


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

    public BigDecimal getRegCount() {
        return regCount;
    }

    public void setRegCount(BigDecimal regCount) {
        this.regCount = regCount;
    }

    public LocalDateTime getStarttime() {
        return starttime;
    }

    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }

    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }

    public String getRegHalf() {
        return regHalf;
    }

    public void setRegHalf(String regHalf) {
        this.regHalf = regHalf;
    }

    public String getRegHour() {
        return regHour;
    }

    public void setRegHour(String regHour) {
        this.regHour = regHour;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getExtParam() {
        return extParam;
    }

    public void setExtParam(String extParam) {
        this.extParam = extParam;
    }

    @Override
    public String toString() {
        return "JytPrivatecloudBookIntraday{" +
        "seeDate=" + seeDate +
        ", doctid=" + doctid +
        ", doctName=" + doctName +
        ", deptid=" + deptid +
        ", deptName=" + deptName +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", totalfee=" + totalfee +
        ", regCount=" + regCount +
        ", starttime=" + starttime +
        ", endtime=" + endtime +
        ", regHalf=" + regHalf +
        ", regHour=" + regHour +
        ", flag=" + flag +
        ", specialty=" + specialty +
        ", remark=" + remark +
        ", extParam=" + extParam +
        "}";
    }
}
