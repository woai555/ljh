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
public class VWsdocSchedule implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime schedulingdate;

    private String doctid;

    private String doctName;

    private String deptid;

    private String deptName;

    private String levelid;

    private String levelname;

    private BigDecimal totalfee;

    private String timeofdayid;

    private BigDecimal valuablenumber;

    private BigDecimal totalnumber;

    private BigDecimal tingzhen;

    private LocalDateTime starttime;

    private LocalDateTime endtime;


    public LocalDateTime getSchedulingdate() {
        return schedulingdate;
    }

    public void setSchedulingdate(LocalDateTime schedulingdate) {
        this.schedulingdate = schedulingdate;
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

    public String getLevelid() {
        return levelid;
    }

    public void setLevelid(String levelid) {
        this.levelid = levelid;
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname;
    }

    public BigDecimal getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(BigDecimal totalfee) {
        this.totalfee = totalfee;
    }

    public String getTimeofdayid() {
        return timeofdayid;
    }

    public void setTimeofdayid(String timeofdayid) {
        this.timeofdayid = timeofdayid;
    }

    public BigDecimal getValuablenumber() {
        return valuablenumber;
    }

    public void setValuablenumber(BigDecimal valuablenumber) {
        this.valuablenumber = valuablenumber;
    }

    public BigDecimal getTotalnumber() {
        return totalnumber;
    }

    public void setTotalnumber(BigDecimal totalnumber) {
        this.totalnumber = totalnumber;
    }

    public BigDecimal getTingzhen() {
        return tingzhen;
    }

    public void setTingzhen(BigDecimal tingzhen) {
        this.tingzhen = tingzhen;
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

    @Override
    public String toString() {
        return "VWsdocSchedule{" +
        "schedulingdate=" + schedulingdate +
        ", doctid=" + doctid +
        ", doctName=" + doctName +
        ", deptid=" + deptid +
        ", deptName=" + deptName +
        ", levelid=" + levelid +
        ", levelname=" + levelname +
        ", totalfee=" + totalfee +
        ", timeofdayid=" + timeofdayid +
        ", valuablenumber=" + valuablenumber +
        ", totalnumber=" + totalnumber +
        ", tingzhen=" + tingzhen +
        ", starttime=" + starttime +
        ", endtime=" + endtime +
        "}";
    }
}
