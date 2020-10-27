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
public class LSingleitem20190612 implements Serializable {

    private static final long serialVersionUID=1L;

    private String itemcode;

    private String itemname;

    private String itempin;

    private Integer checkdeptid;

    private String symbol;

    private BigDecimal fee;

    private String color;

    private Integer checktype;

    private Integer operatorid;

    private LocalDateTime modifydate;

    private String spec;

    private String ybdm;

    private String itemno;

    private Integer ifwipe;

    private BigDecimal feeitemcode;

    private String introduct;

    private String hhCode;

    private String newmrmsclass;


    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItempin() {
        return itempin;
    }

    public void setItempin(String itempin) {
        this.itempin = itempin;
    }

    public Integer getCheckdeptid() {
        return checkdeptid;
    }

    public void setCheckdeptid(Integer checkdeptid) {
        this.checkdeptid = checkdeptid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getChecktype() {
        return checktype;
    }

    public void setChecktype(Integer checktype) {
        this.checktype = checktype;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getModifydate() {
        return modifydate;
    }

    public void setModifydate(LocalDateTime modifydate) {
        this.modifydate = modifydate;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getYbdm() {
        return ybdm;
    }

    public void setYbdm(String ybdm) {
        this.ybdm = ybdm;
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno;
    }

    public Integer getIfwipe() {
        return ifwipe;
    }

    public void setIfwipe(Integer ifwipe) {
        this.ifwipe = ifwipe;
    }

    public BigDecimal getFeeitemcode() {
        return feeitemcode;
    }

    public void setFeeitemcode(BigDecimal feeitemcode) {
        this.feeitemcode = feeitemcode;
    }

    public String getIntroduct() {
        return introduct;
    }

    public void setIntroduct(String introduct) {
        this.introduct = introduct;
    }

    public String getHhCode() {
        return hhCode;
    }

    public void setHhCode(String hhCode) {
        this.hhCode = hhCode;
    }

    public String getNewmrmsclass() {
        return newmrmsclass;
    }

    public void setNewmrmsclass(String newmrmsclass) {
        this.newmrmsclass = newmrmsclass;
    }

    @Override
    public String toString() {
        return "LSingleitem20190612{" +
        "itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", itempin=" + itempin +
        ", checkdeptid=" + checkdeptid +
        ", symbol=" + symbol +
        ", fee=" + fee +
        ", color=" + color +
        ", checktype=" + checktype +
        ", operatorid=" + operatorid +
        ", modifydate=" + modifydate +
        ", spec=" + spec +
        ", ybdm=" + ybdm +
        ", itemno=" + itemno +
        ", ifwipe=" + ifwipe +
        ", feeitemcode=" + feeitemcode +
        ", introduct=" + introduct +
        ", hhCode=" + hhCode +
        ", newmrmsclass=" + newmrmsclass +
        "}";
    }
}
