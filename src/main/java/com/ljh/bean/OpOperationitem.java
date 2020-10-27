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
public class OpOperationitem implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 手术序号
     */
    @TableId(value = "OPERATIONNO", type = IdType.AUTO)
    private String operationno;

    /**
     * 顺序号
     */
    private BigDecimal recordno;

    /**
     * 项目编码
     */
    private String opeItem;

    /**
     * 项目名称
     */
    private String opeName;

    /**
     * 数量
     */
    private Integer qty;

    /**
     * 手术规模
     */
    private String degree;

    /**
     * 切口类型
     */
    private String icniType;

    /**
     * 幕上幕下
     */
    private String screenup;

    /**
     * 有菌无菌
     */
    private String yngerm;

    /**
     * 褥疮有无
     */
    private String ynscar;

    private String opePos;

    private String danger;

    private String die;

    /**
     * 术前术后
     */
    private String before;

    /**
     * 是否加急
     */
    private String ynurgent;

    private BigDecimal price;

    private BigDecimal feeRate;

    private String mark;

    /**
     * 是否有效
     */
    private String ynvalid;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public String getOperationno() {
        return operationno;
    }

    public void setOperationno(String operationno) {
        this.operationno = operationno;
    }

    public BigDecimal getRecordno() {
        return recordno;
    }

    public void setRecordno(BigDecimal recordno) {
        this.recordno = recordno;
    }

    public String getOpeItem() {
        return opeItem;
    }

    public void setOpeItem(String opeItem) {
        this.opeItem = opeItem;
    }

    public String getOpeName() {
        return opeName;
    }

    public void setOpeName(String opeName) {
        this.opeName = opeName;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getIcniType() {
        return icniType;
    }

    public void setIcniType(String icniType) {
        this.icniType = icniType;
    }

    public String getScreenup() {
        return screenup;
    }

    public void setScreenup(String screenup) {
        this.screenup = screenup;
    }

    public String getYngerm() {
        return yngerm;
    }

    public void setYngerm(String yngerm) {
        this.yngerm = yngerm;
    }

    public String getYnscar() {
        return ynscar;
    }

    public void setYnscar(String ynscar) {
        this.ynscar = ynscar;
    }

    public String getOpePos() {
        return opePos;
    }

    public void setOpePos(String opePos) {
        this.opePos = opePos;
    }

    public String getDanger() {
        return danger;
    }

    public void setDanger(String danger) {
        this.danger = danger;
    }

    public String getDie() {
        return die;
    }

    public void setDie(String die) {
        this.die = die;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getYnurgent() {
        return ynurgent;
    }

    public void setYnurgent(String ynurgent) {
        this.ynurgent = ynurgent;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getYnvalid() {
        return ynvalid;
    }

    public void setYnvalid(String ynvalid) {
        this.ynvalid = ynvalid;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "OpOperationitem{" +
        "operationno=" + operationno +
        ", recordno=" + recordno +
        ", opeItem=" + opeItem +
        ", opeName=" + opeName +
        ", qty=" + qty +
        ", degree=" + degree +
        ", icniType=" + icniType +
        ", screenup=" + screenup +
        ", yngerm=" + yngerm +
        ", ynscar=" + ynscar +
        ", opePos=" + opePos +
        ", danger=" + danger +
        ", die=" + die +
        ", before=" + before +
        ", ynurgent=" + ynurgent +
        ", price=" + price +
        ", feeRate=" + feeRate +
        ", mark=" + mark +
        ", ynvalid=" + ynvalid +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
