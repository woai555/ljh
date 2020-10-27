package com.ljh.bean;

import java.math.BigDecimal;
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
public class LscBenmu1 implements Serializable {

    private static final long serialVersionUID=1L;

    private String yncancel;

    private String ynsee;

    private String tradenoBakbx;

    private String operCode;

    private BigDecimal bxFee;

    private String hisregno;

    private String cancelOperCode;

    private BigDecimal cost;

    private BigDecimal pubCost;

    private BigDecimal ownCost;


    public String getYncancel() {
        return yncancel;
    }

    public void setYncancel(String yncancel) {
        this.yncancel = yncancel;
    }

    public String getYnsee() {
        return ynsee;
    }

    public void setYnsee(String ynsee) {
        this.ynsee = ynsee;
    }

    public String getTradenoBakbx() {
        return tradenoBakbx;
    }

    public void setTradenoBakbx(String tradenoBakbx) {
        this.tradenoBakbx = tradenoBakbx;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public BigDecimal getBxFee() {
        return bxFee;
    }

    public void setBxFee(BigDecimal bxFee) {
        this.bxFee = bxFee;
    }

    public String getHisregno() {
        return hisregno;
    }

    public void setHisregno(String hisregno) {
        this.hisregno = hisregno;
    }

    public String getCancelOperCode() {
        return cancelOperCode;
    }

    public void setCancelOperCode(String cancelOperCode) {
        this.cancelOperCode = cancelOperCode;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    @Override
    public String toString() {
        return "LscBenmu1{" +
        "yncancel=" + yncancel +
        ", ynsee=" + ynsee +
        ", tradenoBakbx=" + tradenoBakbx +
        ", operCode=" + operCode +
        ", bxFee=" + bxFee +
        ", hisregno=" + hisregno +
        ", cancelOperCode=" + cancelOperCode +
        ", cost=" + cost +
        ", pubCost=" + pubCost +
        ", ownCost=" + ownCost +
        "}";
    }
}
