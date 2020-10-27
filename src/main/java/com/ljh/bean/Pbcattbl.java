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
public class Pbcattbl implements Serializable {

    private static final long serialVersionUID=1L;

    private String pbtTnam;

    private BigDecimal pbtTid;

    private String pbtOwnr;

    private BigDecimal pbdFhgt;

    private BigDecimal pbdFwgt;

    private String pbdFitl;

    private String pbdFunl;

    private BigDecimal pbdFchr;

    private BigDecimal pbdFptc;

    private String pbdFfce;

    private BigDecimal pbhFhgt;

    private BigDecimal pbhFwgt;

    private String pbhFitl;

    private String pbhFunl;

    private BigDecimal pbhFchr;

    private BigDecimal pbhFptc;

    private String pbhFfce;

    private BigDecimal pblFhgt;

    private BigDecimal pblFwgt;

    private String pblFitl;

    private String pblFunl;

    private BigDecimal pblFchr;

    private BigDecimal pblFptc;

    private String pblFfce;

    private String pbtCmnt;


    public String getPbtTnam() {
        return pbtTnam;
    }

    public void setPbtTnam(String pbtTnam) {
        this.pbtTnam = pbtTnam;
    }

    public BigDecimal getPbtTid() {
        return pbtTid;
    }

    public void setPbtTid(BigDecimal pbtTid) {
        this.pbtTid = pbtTid;
    }

    public String getPbtOwnr() {
        return pbtOwnr;
    }

    public void setPbtOwnr(String pbtOwnr) {
        this.pbtOwnr = pbtOwnr;
    }

    public BigDecimal getPbdFhgt() {
        return pbdFhgt;
    }

    public void setPbdFhgt(BigDecimal pbdFhgt) {
        this.pbdFhgt = pbdFhgt;
    }

    public BigDecimal getPbdFwgt() {
        return pbdFwgt;
    }

    public void setPbdFwgt(BigDecimal pbdFwgt) {
        this.pbdFwgt = pbdFwgt;
    }

    public String getPbdFitl() {
        return pbdFitl;
    }

    public void setPbdFitl(String pbdFitl) {
        this.pbdFitl = pbdFitl;
    }

    public String getPbdFunl() {
        return pbdFunl;
    }

    public void setPbdFunl(String pbdFunl) {
        this.pbdFunl = pbdFunl;
    }

    public BigDecimal getPbdFchr() {
        return pbdFchr;
    }

    public void setPbdFchr(BigDecimal pbdFchr) {
        this.pbdFchr = pbdFchr;
    }

    public BigDecimal getPbdFptc() {
        return pbdFptc;
    }

    public void setPbdFptc(BigDecimal pbdFptc) {
        this.pbdFptc = pbdFptc;
    }

    public String getPbdFfce() {
        return pbdFfce;
    }

    public void setPbdFfce(String pbdFfce) {
        this.pbdFfce = pbdFfce;
    }

    public BigDecimal getPbhFhgt() {
        return pbhFhgt;
    }

    public void setPbhFhgt(BigDecimal pbhFhgt) {
        this.pbhFhgt = pbhFhgt;
    }

    public BigDecimal getPbhFwgt() {
        return pbhFwgt;
    }

    public void setPbhFwgt(BigDecimal pbhFwgt) {
        this.pbhFwgt = pbhFwgt;
    }

    public String getPbhFitl() {
        return pbhFitl;
    }

    public void setPbhFitl(String pbhFitl) {
        this.pbhFitl = pbhFitl;
    }

    public String getPbhFunl() {
        return pbhFunl;
    }

    public void setPbhFunl(String pbhFunl) {
        this.pbhFunl = pbhFunl;
    }

    public BigDecimal getPbhFchr() {
        return pbhFchr;
    }

    public void setPbhFchr(BigDecimal pbhFchr) {
        this.pbhFchr = pbhFchr;
    }

    public BigDecimal getPbhFptc() {
        return pbhFptc;
    }

    public void setPbhFptc(BigDecimal pbhFptc) {
        this.pbhFptc = pbhFptc;
    }

    public String getPbhFfce() {
        return pbhFfce;
    }

    public void setPbhFfce(String pbhFfce) {
        this.pbhFfce = pbhFfce;
    }

    public BigDecimal getPblFhgt() {
        return pblFhgt;
    }

    public void setPblFhgt(BigDecimal pblFhgt) {
        this.pblFhgt = pblFhgt;
    }

    public BigDecimal getPblFwgt() {
        return pblFwgt;
    }

    public void setPblFwgt(BigDecimal pblFwgt) {
        this.pblFwgt = pblFwgt;
    }

    public String getPblFitl() {
        return pblFitl;
    }

    public void setPblFitl(String pblFitl) {
        this.pblFitl = pblFitl;
    }

    public String getPblFunl() {
        return pblFunl;
    }

    public void setPblFunl(String pblFunl) {
        this.pblFunl = pblFunl;
    }

    public BigDecimal getPblFchr() {
        return pblFchr;
    }

    public void setPblFchr(BigDecimal pblFchr) {
        this.pblFchr = pblFchr;
    }

    public BigDecimal getPblFptc() {
        return pblFptc;
    }

    public void setPblFptc(BigDecimal pblFptc) {
        this.pblFptc = pblFptc;
    }

    public String getPblFfce() {
        return pblFfce;
    }

    public void setPblFfce(String pblFfce) {
        this.pblFfce = pblFfce;
    }

    public String getPbtCmnt() {
        return pbtCmnt;
    }

    public void setPbtCmnt(String pbtCmnt) {
        this.pbtCmnt = pbtCmnt;
    }

    @Override
    public String toString() {
        return "Pbcattbl{" +
        "pbtTnam=" + pbtTnam +
        ", pbtTid=" + pbtTid +
        ", pbtOwnr=" + pbtOwnr +
        ", pbdFhgt=" + pbdFhgt +
        ", pbdFwgt=" + pbdFwgt +
        ", pbdFitl=" + pbdFitl +
        ", pbdFunl=" + pbdFunl +
        ", pbdFchr=" + pbdFchr +
        ", pbdFptc=" + pbdFptc +
        ", pbdFfce=" + pbdFfce +
        ", pbhFhgt=" + pbhFhgt +
        ", pbhFwgt=" + pbhFwgt +
        ", pbhFitl=" + pbhFitl +
        ", pbhFunl=" + pbhFunl +
        ", pbhFchr=" + pbhFchr +
        ", pbhFptc=" + pbhFptc +
        ", pbhFfce=" + pbhFfce +
        ", pblFhgt=" + pblFhgt +
        ", pblFwgt=" + pblFwgt +
        ", pblFitl=" + pblFitl +
        ", pblFunl=" + pblFunl +
        ", pblFchr=" + pblFchr +
        ", pblFptc=" + pblFptc +
        ", pblFfce=" + pblFfce +
        ", pbtCmnt=" + pbtCmnt +
        "}";
    }
}
