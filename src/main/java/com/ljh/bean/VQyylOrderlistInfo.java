package com.ljh.bean;

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
public class VQyylOrderlistInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String querypersontype;

    private String usercardtype;

    private String usercardid;

    private String querydatetype;

    private String starttime;

    private String endtime;

    private String orderid;

    private String hosorgcode;

    private String orderstatus;

    private String onedeptcode;

    private String deptcode;

    private String ordertype;

    private String resourcecode;

    private String scheduleid;

    private String numsourceid;

    private String numsourcedetailid;

    private String hosname;

    private String deptname;

    private String resourcename;

    private LocalDateTime ordertime;

    private String timerange;

    private String paymode;

    private String paystate;

    private String medicardid;

    private String medicardtype;

    private String username;

    private String userphone;

    private LocalDateTime applydate;

    private String canceldate;


    public String getQuerypersontype() {
        return querypersontype;
    }

    public void setQuerypersontype(String querypersontype) {
        this.querypersontype = querypersontype;
    }

    public String getUsercardtype() {
        return usercardtype;
    }

    public void setUsercardtype(String usercardtype) {
        this.usercardtype = usercardtype;
    }

    public String getUsercardid() {
        return usercardid;
    }

    public void setUsercardid(String usercardid) {
        this.usercardid = usercardid;
    }

    public String getQuerydatetype() {
        return querydatetype;
    }

    public void setQuerydatetype(String querydatetype) {
        this.querydatetype = querydatetype;
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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getHosorgcode() {
        return hosorgcode;
    }

    public void setHosorgcode(String hosorgcode) {
        this.hosorgcode = hosorgcode;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
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

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public String getResourcecode() {
        return resourcecode;
    }

    public void setResourcecode(String resourcecode) {
        this.resourcecode = resourcecode;
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

    public String getNumsourcedetailid() {
        return numsourcedetailid;
    }

    public void setNumsourcedetailid(String numsourcedetailid) {
        this.numsourcedetailid = numsourcedetailid;
    }

    public String getHosname() {
        return hosname;
    }

    public void setHosname(String hosname) {
        this.hosname = hosname;
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

    public LocalDateTime getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(LocalDateTime ordertime) {
        this.ordertime = ordertime;
    }

    public String getTimerange() {
        return timerange;
    }

    public void setTimerange(String timerange) {
        this.timerange = timerange;
    }

    public String getPaymode() {
        return paymode;
    }

    public void setPaymode(String paymode) {
        this.paymode = paymode;
    }

    public String getPaystate() {
        return paystate;
    }

    public void setPaystate(String paystate) {
        this.paystate = paystate;
    }

    public String getMedicardid() {
        return medicardid;
    }

    public void setMedicardid(String medicardid) {
        this.medicardid = medicardid;
    }

    public String getMedicardtype() {
        return medicardtype;
    }

    public void setMedicardtype(String medicardtype) {
        this.medicardtype = medicardtype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public LocalDateTime getApplydate() {
        return applydate;
    }

    public void setApplydate(LocalDateTime applydate) {
        this.applydate = applydate;
    }

    public String getCanceldate() {
        return canceldate;
    }

    public void setCanceldate(String canceldate) {
        this.canceldate = canceldate;
    }

    @Override
    public String toString() {
        return "VQyylOrderlistInfo{" +
        "querypersontype=" + querypersontype +
        ", usercardtype=" + usercardtype +
        ", usercardid=" + usercardid +
        ", querydatetype=" + querydatetype +
        ", starttime=" + starttime +
        ", endtime=" + endtime +
        ", orderid=" + orderid +
        ", hosorgcode=" + hosorgcode +
        ", orderstatus=" + orderstatus +
        ", onedeptcode=" + onedeptcode +
        ", deptcode=" + deptcode +
        ", ordertype=" + ordertype +
        ", resourcecode=" + resourcecode +
        ", scheduleid=" + scheduleid +
        ", numsourceid=" + numsourceid +
        ", numsourcedetailid=" + numsourcedetailid +
        ", hosname=" + hosname +
        ", deptname=" + deptname +
        ", resourcename=" + resourcename +
        ", ordertime=" + ordertime +
        ", timerange=" + timerange +
        ", paymode=" + paymode +
        ", paystate=" + paystate +
        ", medicardid=" + medicardid +
        ", medicardtype=" + medicardtype +
        ", username=" + username +
        ", userphone=" + userphone +
        ", applydate=" + applydate +
        ", canceldate=" + canceldate +
        "}";
    }
}
