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
public class VQyylOrderNumberInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String hosorgcode;

    private String onedeptcode;

    private String deptcode;

    private String resourcecode;

    private LocalDateTime starttime;

    private LocalDateTime endtime;

    private String scheduleid;

    private String numsourceid;

    private String ordertype;

    private String hosname;

    private String onedeptname;

    private String deptname;

    private String resourcename;

    private BigDecimal visitcost;

    private LocalDateTime scheduledate;

    private String timerange;

    private String starttime1;

    private String endtime1;

    private BigDecimal remainnum;

    private String reserveordernum;

    private String ordernumtype100;


    public String getHosorgcode() {
        return hosorgcode;
    }

    public void setHosorgcode(String hosorgcode) {
        this.hosorgcode = hosorgcode;
    }

    public String getOnedeptcode() {
        return onedeptcode;
    }

    public void setOnedeptcode(String onedeptcode) {
        this.onedeptcode = onedeptcode;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getResourcecode() {
        return resourcecode;
    }

    public void setResourcecode(String resourcecode) {
        this.resourcecode = resourcecode;
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

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getNumsourceid() {
        return numsourceid;
    }

    public void setNumsourceid(String numsourceid) {
        this.numsourceid = numsourceid;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public String getHosname() {
        return hosname;
    }

    public void setHosname(String hosname) {
        this.hosname = hosname;
    }

    public String getOnedeptname() {
        return onedeptname;
    }

    public void setOnedeptname(String onedeptname) {
        this.onedeptname = onedeptname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    public BigDecimal getVisitcost() {
        return visitcost;
    }

    public void setVisitcost(BigDecimal visitcost) {
        this.visitcost = visitcost;
    }

    public LocalDateTime getScheduledate() {
        return scheduledate;
    }

    public void setScheduledate(LocalDateTime scheduledate) {
        this.scheduledate = scheduledate;
    }

    public String getTimerange() {
        return timerange;
    }

    public void setTimerange(String timerange) {
        this.timerange = timerange;
    }

    public String getStarttime1() {
        return starttime1;
    }

    public void setStarttime1(String starttime1) {
        this.starttime1 = starttime1;
    }

    public String getEndtime1() {
        return endtime1;
    }

    public void setEndtime1(String endtime1) {
        this.endtime1 = endtime1;
    }

    public BigDecimal getRemainnum() {
        return remainnum;
    }

    public void setRemainnum(BigDecimal remainnum) {
        this.remainnum = remainnum;
    }

    public String getReserveordernum() {
        return reserveordernum;
    }

    public void setReserveordernum(String reserveordernum) {
        this.reserveordernum = reserveordernum;
    }

    public String getOrdernumtype100() {
        return ordernumtype100;
    }

    public void setOrdernumtype100(String ordernumtype100) {
        this.ordernumtype100 = ordernumtype100;
    }

    @Override
    public String toString() {
        return "VQyylOrderNumberInfo{" +
        "hosorgcode=" + hosorgcode +
        ", onedeptcode=" + onedeptcode +
        ", deptcode=" + deptcode +
        ", resourcecode=" + resourcecode +
        ", starttime=" + starttime +
        ", endtime=" + endtime +
        ", scheduleid=" + scheduleid +
        ", numsourceid=" + numsourceid +
        ", ordertype=" + ordertype +
        ", hosname=" + hosname +
        ", onedeptname=" + onedeptname +
        ", deptname=" + deptname +
        ", resourcename=" + resourcename +
        ", visitcost=" + visitcost +
        ", scheduledate=" + scheduledate +
        ", timerange=" + timerange +
        ", starttime1=" + starttime1 +
        ", endtime1=" + endtime1 +
        ", remainnum=" + remainnum +
        ", reserveordernum=" + reserveordernum +
        ", ordernumtype100=" + ordernumtype100 +
        "}";
    }
}
