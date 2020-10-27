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
public class PrConsantSet implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CONSTANTCODE", type = IdType.AUTO)
    private String constantcode;

    private String constantname;

    private BigDecimal constanttype;

    private BigDecimal orderid;

    private String back;

    private String operatorno;

    private LocalDateTime operatortime;


    public String getConstantcode() {
        return constantcode;
    }

    public void setConstantcode(String constantcode) {
        this.constantcode = constantcode;
    }

    public String getConstantname() {
        return constantname;
    }

    public void setConstantname(String constantname) {
        this.constantname = constantname;
    }

    public BigDecimal getConstanttype() {
        return constanttype;
    }

    public void setConstanttype(BigDecimal constanttype) {
        this.constanttype = constanttype;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public String getOperatorno() {
        return operatorno;
    }

    public void setOperatorno(String operatorno) {
        this.operatorno = operatorno;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "PrConsantSet{" +
        "constantcode=" + constantcode +
        ", constantname=" + constantname +
        ", constanttype=" + constanttype +
        ", orderid=" + orderid +
        ", back=" + back +
        ", operatorno=" + operatorno +
        ", operatortime=" + operatortime +
        "}";
    }
}
