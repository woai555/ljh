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
public class SUnitstatic implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "TABNO", type = IdType.AUTO)
    private BigDecimal tabno;

    private String tabnocode;

    private BigDecimal unittype;

    private String unittypename;

    private String unittypecode;

    private BigDecimal orderid;

    private String unitid;

    private String unitname;

    private String unitcode;

    private BigDecimal ifenable;

    private BigDecimal ifamend;

    private String operatorid;

    private LocalDateTime operatortime;


    public BigDecimal getTabno() {
        return tabno;
    }

    public void setTabno(BigDecimal tabno) {
        this.tabno = tabno;
    }

    public String getTabnocode() {
        return tabnocode;
    }

    public void setTabnocode(String tabnocode) {
        this.tabnocode = tabnocode;
    }

    public BigDecimal getUnittype() {
        return unittype;
    }

    public void setUnittype(BigDecimal unittype) {
        this.unittype = unittype;
    }

    public String getUnittypename() {
        return unittypename;
    }

    public void setUnittypename(String unittypename) {
        this.unittypename = unittypename;
    }

    public String getUnittypecode() {
        return unittypecode;
    }

    public void setUnittypecode(String unittypecode) {
        this.unittypecode = unittypecode;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    public BigDecimal getIfenable() {
        return ifenable;
    }

    public void setIfenable(BigDecimal ifenable) {
        this.ifenable = ifenable;
    }

    public BigDecimal getIfamend() {
        return ifamend;
    }

    public void setIfamend(BigDecimal ifamend) {
        this.ifamend = ifamend;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "SUnitstatic{" +
        "tabno=" + tabno +
        ", tabnocode=" + tabnocode +
        ", unittype=" + unittype +
        ", unittypename=" + unittypename +
        ", unittypecode=" + unittypecode +
        ", orderid=" + orderid +
        ", unitid=" + unitid +
        ", unitname=" + unitname +
        ", unitcode=" + unitcode +
        ", ifenable=" + ifenable +
        ", ifamend=" + ifamend +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}
