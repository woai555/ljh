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
public class PrControlSysSource implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal orderid;

    @TableId(value = "SOURCECODE", type = IdType.AUTO)
    private String sourcecode;

    private String sourcename;

    private String datawindow;

    private String back;

    private String operatorno;

    private LocalDateTime operatortime;

    private BigDecimal ynprescription;


    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getSourcecode() {
        return sourcecode;
    }

    public void setSourcecode(String sourcecode) {
        this.sourcecode = sourcecode;
    }

    public String getSourcename() {
        return sourcename;
    }

    public void setSourcename(String sourcename) {
        this.sourcename = sourcename;
    }

    public String getDatawindow() {
        return datawindow;
    }

    public void setDatawindow(String datawindow) {
        this.datawindow = datawindow;
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

    public BigDecimal getYnprescription() {
        return ynprescription;
    }

    public void setYnprescription(BigDecimal ynprescription) {
        this.ynprescription = ynprescription;
    }

    @Override
    public String toString() {
        return "PrControlSysSource{" +
        "orderid=" + orderid +
        ", sourcecode=" + sourcecode +
        ", sourcename=" + sourcename +
        ", datawindow=" + datawindow +
        ", back=" + back +
        ", operatorno=" + operatorno +
        ", operatortime=" + operatortime +
        ", ynprescription=" + ynprescription +
        "}";
    }
}
