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
public class VMyd implements Serializable {

    private static final long serialVersionUID=1L;

    private String tdmc;

    private BigDecimal fwhdg;

    private BigDecimal lymyd;

    private BigDecimal qyjmmyd;

    private BigDecimal yyjzmyd;

    private BigDecimal fwhdgdf;

    private BigDecimal lymyddf;

    private BigDecimal qyjmmyddf;

    private BigDecimal yyjzmyddf;

    private BigDecimal qyfwrzd;

    private BigDecimal qyfwrzddf;

    private BigDecimal jtystdmyd;

    private BigDecimal jtystdmyddf;

    private BigDecimal mydzf;

    private LocalDateTime staticDate;


    public String getTdmc() {
        return tdmc;
    }

    public void setTdmc(String tdmc) {
        this.tdmc = tdmc;
    }

    public BigDecimal getFwhdg() {
        return fwhdg;
    }

    public void setFwhdg(BigDecimal fwhdg) {
        this.fwhdg = fwhdg;
    }

    public BigDecimal getLymyd() {
        return lymyd;
    }

    public void setLymyd(BigDecimal lymyd) {
        this.lymyd = lymyd;
    }

    public BigDecimal getQyjmmyd() {
        return qyjmmyd;
    }

    public void setQyjmmyd(BigDecimal qyjmmyd) {
        this.qyjmmyd = qyjmmyd;
    }

    public BigDecimal getYyjzmyd() {
        return yyjzmyd;
    }

    public void setYyjzmyd(BigDecimal yyjzmyd) {
        this.yyjzmyd = yyjzmyd;
    }

    public BigDecimal getFwhdgdf() {
        return fwhdgdf;
    }

    public void setFwhdgdf(BigDecimal fwhdgdf) {
        this.fwhdgdf = fwhdgdf;
    }

    public BigDecimal getLymyddf() {
        return lymyddf;
    }

    public void setLymyddf(BigDecimal lymyddf) {
        this.lymyddf = lymyddf;
    }

    public BigDecimal getQyjmmyddf() {
        return qyjmmyddf;
    }

    public void setQyjmmyddf(BigDecimal qyjmmyddf) {
        this.qyjmmyddf = qyjmmyddf;
    }

    public BigDecimal getYyjzmyddf() {
        return yyjzmyddf;
    }

    public void setYyjzmyddf(BigDecimal yyjzmyddf) {
        this.yyjzmyddf = yyjzmyddf;
    }

    public BigDecimal getQyfwrzd() {
        return qyfwrzd;
    }

    public void setQyfwrzd(BigDecimal qyfwrzd) {
        this.qyfwrzd = qyfwrzd;
    }

    public BigDecimal getQyfwrzddf() {
        return qyfwrzddf;
    }

    public void setQyfwrzddf(BigDecimal qyfwrzddf) {
        this.qyfwrzddf = qyfwrzddf;
    }

    public BigDecimal getJtystdmyd() {
        return jtystdmyd;
    }

    public void setJtystdmyd(BigDecimal jtystdmyd) {
        this.jtystdmyd = jtystdmyd;
    }

    public BigDecimal getJtystdmyddf() {
        return jtystdmyddf;
    }

    public void setJtystdmyddf(BigDecimal jtystdmyddf) {
        this.jtystdmyddf = jtystdmyddf;
    }

    public BigDecimal getMydzf() {
        return mydzf;
    }

    public void setMydzf(BigDecimal mydzf) {
        this.mydzf = mydzf;
    }

    public LocalDateTime getStaticDate() {
        return staticDate;
    }

    public void setStaticDate(LocalDateTime staticDate) {
        this.staticDate = staticDate;
    }

    @Override
    public String toString() {
        return "VMyd{" +
        "tdmc=" + tdmc +
        ", fwhdg=" + fwhdg +
        ", lymyd=" + lymyd +
        ", qyjmmyd=" + qyjmmyd +
        ", yyjzmyd=" + yyjzmyd +
        ", fwhdgdf=" + fwhdgdf +
        ", lymyddf=" + lymyddf +
        ", qyjmmyddf=" + qyjmmyddf +
        ", yyjzmyddf=" + yyjzmyddf +
        ", qyfwrzd=" + qyfwrzd +
        ", qyfwrzddf=" + qyfwrzddf +
        ", jtystdmyd=" + jtystdmyd +
        ", jtystdmyddf=" + jtystdmyddf +
        ", mydzf=" + mydzf +
        ", staticDate=" + staticDate +
        "}";
    }
}
