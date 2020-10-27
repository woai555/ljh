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
public class LscBenmu implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal no;

    private String hisno;

    private String yncancel;

    private String ynsee;

    private String quhao;

    private BigDecimal bxFee;

    private String operCode;

    private String cancelOperCode;

    private BigDecimal cost;

    private BigDecimal pubCost;

    private BigDecimal ownCost;


    public BigDecimal getNo() {
        return no;
    }

    public void setNo(BigDecimal no) {
        this.no = no;
    }

    public String getHisno() {
        return hisno;
    }

    public void setHisno(String hisno) {
        this.hisno = hisno;
    }

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

    public String getQuhao() {
        return quhao;
    }

    public void setQuhao(String quhao) {
        this.quhao = quhao;
    }

    public BigDecimal getBxFee() {
        return bxFee;
    }

    public void setBxFee(BigDecimal bxFee) {
        this.bxFee = bxFee;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
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
        return "LscBenmu{" +
        "no=" + no +
        ", hisno=" + hisno +
        ", yncancel=" + yncancel +
        ", ynsee=" + ynsee +
        ", quhao=" + quhao +
        ", bxFee=" + bxFee +
        ", operCode=" + operCode +
        ", cancelOperCode=" + cancelOperCode +
        ", cost=" + cost +
        ", pubCost=" + pubCost +
        ", ownCost=" + ownCost +
        "}";
    }
}
