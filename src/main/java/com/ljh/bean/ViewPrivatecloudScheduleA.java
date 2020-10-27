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
public class ViewPrivatecloudScheduleA implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime seeDate;

    private String objid;

    private String hospid;

    private String doctid;

    private String doctName;

    private String deptid;

    private String deptName;

    private String reglevlCode;

    private String reglevlName;

    private BigDecimal totalfee;

    private BigDecimal inspectfee;

    private BigDecimal regfee;

    private BigDecimal diagnosefee;

    private BigDecimal spclfee;

    private BigDecimal objtype;

    private BigDecimal regCount;

    private String pointname;

    private BigDecimal pointtype;

    private String pointid;

    private String starttime;

    private String endtime;

    private String noonid;


    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getHospid() {
        return hospid;
    }

    public void setHospid(String hospid) {
        this.hospid = hospid;
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

    public BigDecimal getInspectfee() {
        return inspectfee;
    }

    public void setInspectfee(BigDecimal inspectfee) {
        this.inspectfee = inspectfee;
    }

    public BigDecimal getRegfee() {
        return regfee;
    }

    public void setRegfee(BigDecimal regfee) {
        this.regfee = regfee;
    }

    public BigDecimal getDiagnosefee() {
        return diagnosefee;
    }

    public void setDiagnosefee(BigDecimal diagnosefee) {
        this.diagnosefee = diagnosefee;
    }

    public BigDecimal getSpclfee() {
        return spclfee;
    }

    public void setSpclfee(BigDecimal spclfee) {
        this.spclfee = spclfee;
    }

    public BigDecimal getObjtype() {
        return objtype;
    }

    public void setObjtype(BigDecimal objtype) {
        this.objtype = objtype;
    }

    public BigDecimal getRegCount() {
        return regCount;
    }

    public void setRegCount(BigDecimal regCount) {
        this.regCount = regCount;
    }

    public String getPointname() {
        return pointname;
    }

    public void setPointname(String pointname) {
        this.pointname = pointname;
    }

    public BigDecimal getPointtype() {
        return pointtype;
    }

    public void setPointtype(BigDecimal pointtype) {
        this.pointtype = pointtype;
    }

    public String getPointid() {
        return pointid;
    }

    public void setPointid(String pointid) {
        this.pointid = pointid;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getNoonid() {
        return noonid;
    }

    public void setNoonid(String noonid) {
        this.noonid = noonid;
    }

    @Override
    public String toString() {
        return "ViewPrivatecloudScheduleA{" +
        "seeDate=" + seeDate +
        ", objid=" + objid +
        ", hospid=" + hospid +
        ", doctid=" + doctid +
        ", doctName=" + doctName +
        ", deptid=" + deptid +
        ", deptName=" + deptName +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", totalfee=" + totalfee +
        ", inspectfee=" + inspectfee +
        ", regfee=" + regfee +
        ", diagnosefee=" + diagnosefee +
        ", spclfee=" + spclfee +
        ", objtype=" + objtype +
        ", regCount=" + regCount +
        ", pointname=" + pointname +
        ", pointtype=" + pointtype +
        ", pointid=" + pointid +
        ", starttime=" + starttime +
        ", endtime=" + endtime +
        ", noonid=" + noonid +
        "}";
    }
}
