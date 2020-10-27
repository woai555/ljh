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
public class VQyylUpordermedicin implements Serializable {

    private static final long serialVersionUID=1L;

    private String hosorgcode;

    private String orderid;

    private String jzzdbm;

    private String jzzdmc;

    private String bmlx;

    private String jzysgh;

    private String jzysxm;


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

    public String getJzzdbm() {
        return jzzdbm;
    }

    public void setJzzdbm(String jzzdbm) {
        this.jzzdbm = jzzdbm;
    }

    public String getJzzdmc() {
        return jzzdmc;
    }

    public void setJzzdmc(String jzzdmc) {
        this.jzzdmc = jzzdmc;
    }

    public String getBmlx() {
        return bmlx;
    }

    public void setBmlx(String bmlx) {
        this.bmlx = bmlx;
    }

    public String getJzysgh() {
        return jzysgh;
    }

    public void setJzysgh(String jzysgh) {
        this.jzysgh = jzysgh;
    }

    public String getJzysxm() {
        return jzysxm;
    }

    public void setJzysxm(String jzysxm) {
        this.jzysxm = jzysxm;
    }

    @Override
    public String toString() {
        return "VQyylUpordermedicin{" +
        "hosorgcode=" + hosorgcode +
        ", orderid=" + orderid +
        ", jzzdbm=" + jzzdbm +
        ", jzzdmc=" + jzzdmc +
        ", bmlx=" + bmlx +
        ", jzysgh=" + jzysgh +
        ", jzysxm=" + jzysxm +
        "}";
    }
}
