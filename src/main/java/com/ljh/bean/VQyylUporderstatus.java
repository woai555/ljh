package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class VQyylUporderstatus implements Serializable {

    private static final long serialVersionUID=1L;

    private String hosorgcode;

    private String orderid;

    private String orderstatus;

    private String paystate;

    private String canceldate;

    private String replacedoctorid;

    private String replacedoctorname;


    public String getHosorgcode() {
        return hosorgcode;
    }

    public void setHosorgcode(String hosorgcode) {
        this.hosorgcode = hosorgcode;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getPaystate() {
        return paystate;
    }

    public void setPaystate(String paystate) {
        this.paystate = paystate;
    }

    public String getCanceldate() {
        return canceldate;
    }

    public void setCanceldate(String canceldate) {
        this.canceldate = canceldate;
    }

    public String getReplacedoctorid() {
        return replacedoctorid;
    }

    public void setReplacedoctorid(String replacedoctorid) {
        this.replacedoctorid = replacedoctorid;
    }

    public String getReplacedoctorname() {
        return replacedoctorname;
    }

    public void setReplacedoctorname(String replacedoctorname) {
        this.replacedoctorname = replacedoctorname;
    }

    @Override
    public String toString() {
        return "VQyylUporderstatus{" +
        "hosorgcode=" + hosorgcode +
        ", orderid=" + orderid +
        ", orderstatus=" + orderstatus +
        ", paystate=" + paystate +
        ", canceldate=" + canceldate +
        ", replacedoctorid=" + replacedoctorid +
        ", replacedoctorname=" + replacedoctorname +
        "}";
    }
}
