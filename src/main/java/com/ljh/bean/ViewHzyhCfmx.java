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
public class ViewHzyhCfmx implements Serializable {

    private static final long serialVersionUID=1L;

    private String cfhm;

    private String ypxh;

    private String ypmc;

    private String gg;

    private BigDecimal jlsl;

    private String jldw;

    private String pc;

    private String yf;

    private String zb;

    private LocalDateTime zxrq;

    private BigDecimal ypsl;

    private String pspb;

    private String psjg;

    private String notes;


    public String getCfhm() {
        return cfhm;
    }

    public void setCfhm(String cfhm) {
        this.cfhm = cfhm;
    }

    public String getYpxh() {
        return ypxh;
    }

    public void setYpxh(String ypxh) {
        this.ypxh = ypxh;
    }

    public String getYpmc() {
        return ypmc;
    }

    public void setYpmc(String ypmc) {
        this.ypmc = ypmc;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }

    public BigDecimal getJlsl() {
        return jlsl;
    }

    public void setJlsl(BigDecimal jlsl) {
        this.jlsl = jlsl;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getYf() {
        return yf;
    }

    public void setYf(String yf) {
        this.yf = yf;
    }

    public String getZb() {
        return zb;
    }

    public void setZb(String zb) {
        this.zb = zb;
    }

    public LocalDateTime getZxrq() {
        return zxrq;
    }

    public void setZxrq(LocalDateTime zxrq) {
        this.zxrq = zxrq;
    }

    public BigDecimal getYpsl() {
        return ypsl;
    }

    public void setYpsl(BigDecimal ypsl) {
        this.ypsl = ypsl;
    }

    public String getPspb() {
        return pspb;
    }

    public void setPspb(String pspb) {
        this.pspb = pspb;
    }

    public String getPsjg() {
        return psjg;
    }

    public void setPsjg(String psjg) {
        this.psjg = psjg;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "ViewHzyhCfmx{" +
        "cfhm=" + cfhm +
        ", ypxh=" + ypxh +
        ", ypmc=" + ypmc +
        ", gg=" + gg +
        ", jlsl=" + jlsl +
        ", jldw=" + jldw +
        ", pc=" + pc +
        ", yf=" + yf +
        ", zb=" + zb +
        ", zxrq=" + zxrq +
        ", ypsl=" + ypsl +
        ", pspb=" + pspb +
        ", psjg=" + psjg +
        ", notes=" + notes +
        "}";
    }
}
