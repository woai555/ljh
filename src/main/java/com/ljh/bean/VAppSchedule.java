package com.ljh.bean;

import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONType;
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
@JSONType(orders = {"accessschid","schdate","daytype","doctorid","doctorname","deptid","deptname","servicefee","regfee","resno","remain","isexpect","clinicaddr","titletype","numsrctype","state","specialty","remark"})
public class VAppSchedule implements Serializable {

    private static final long serialVersionUID=1L;

    private String accessschid;

    private LocalDateTime schdate;

    private String daytype;

    private String doctorid;

    private String doctorname;

    private String deptid;

    private String deptname;

    private BigDecimal servicefee;

    private BigDecimal regfee;

    private BigDecimal resno;

    private BigDecimal remain;


    private String isexpect;

    private String clinicaddr;

    private String titletype;

    private String numsrctype;

    private String state;

    private String specialty;

    private String remark;


    public String getAccessschid() {
        return accessschid;
    }

    public void setAccessschid(String accessschid) {
        this.accessschid = accessschid;
    }

    public LocalDateTime getSchdate() {
        return schdate;
    }

    public void setSchdate(LocalDateTime schdate) {
        this.schdate = schdate;
    }

    public String getDaytype() {
        return daytype;
    }

    public void setDaytype(String daytype) {
        this.daytype = daytype;
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public BigDecimal getServicefee() {
        return servicefee;
    }

    public void setServicefee(BigDecimal servicefee) {
        this.servicefee = servicefee;
    }

    public BigDecimal getRegfee() {
        return regfee;
    }

    public void setRegfee(BigDecimal regfee) {
        this.regfee = regfee;
    }

    public BigDecimal getResno() {
        return resno;
    }

    public void setResno(BigDecimal resno) {
        this.resno = resno;
    }

    public BigDecimal getRemain() {
        return remain;
    }

    public void setRemain(BigDecimal remain) {
        this.remain = remain;
    }

//    public LocalDateTime getStarttime() {
//        return starttime;
//    }
//
//    public void setStarttime(LocalDateTime starttime) {
//        this.starttime = starttime;
//    }
//
//    public LocalDateTime getEndtime() {
//        return endtime;
//    }
//
//    public void setEndtime(LocalDateTime endtime) {
//        this.endtime = endtime;
//    }

    public String getIsexpect() {
        return isexpect;
    }

    public void setIsexpect(String isexpect) {
        this.isexpect = isexpect;
    }

    public String getClinicaddr() {
        return clinicaddr;
    }

    public void setClinicaddr(String clinicaddr) {
        this.clinicaddr = clinicaddr;
    }

    public String getTitletype() {
        return titletype;
    }

    public void setTitletype(String titletype) {
        this.titletype = titletype;
    }

    public String getNumsrctype() {
        return numsrctype;
    }

    public void setNumsrctype(String numsrctype) {
        this.numsrctype = numsrctype;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    @Override
    public String toString() {
        return "VAppSchedule{" +
        "accessschid=" + accessschid +
        ", schdate=" + schdate +
        ", daytype=" + daytype +
        ", doctorid=" + doctorid +
        ", doctorname=" + doctorname +
        ", deptid=" + deptid +
        ", deptname=" + deptname +
        ", servicefee=" + servicefee +
        ", regfee=" + regfee +
        ", resno=" + resno +
        ", remain=" + remain +
//        ", starttime=" + starttime +
//        ", endtime=" + endtime +
        ", isexpect=" + isexpect +
        ", clinicaddr=" + clinicaddr +
        ", titletype=" + titletype +
        ", numsrctype=" + numsrctype +
        ", state=" + state +
        ", specialty=" + specialty +
        ", remark=" + remark +
        "}";
    }

}
