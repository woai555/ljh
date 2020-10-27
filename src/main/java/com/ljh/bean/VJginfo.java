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
public class VJginfo implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal zdjs;

    private BigDecimal jfgl;

    private BigDecimal qkjjyjsqk;

    private BigDecimal qzjh;

    private BigDecimal jxhff;

    private String fw;

    private BigDecimal rksl;

    private String tdmc;

    private LocalDateTime staticDate;


    public BigDecimal getZdjs() {
        return zdjs;
    }

    public void setZdjs(BigDecimal zdjs) {
        this.zdjs = zdjs;
    }

    public BigDecimal getJfgl() {
        return jfgl;
    }

    public void setJfgl(BigDecimal jfgl) {
        this.jfgl = jfgl;
    }

    public BigDecimal getQkjjyjsqk() {
        return qkjjyjsqk;
    }

    public void setQkjjyjsqk(BigDecimal qkjjyjsqk) {
        this.qkjjyjsqk = qkjjyjsqk;
    }

    public BigDecimal getQzjh() {
        return qzjh;
    }

    public void setQzjh(BigDecimal qzjh) {
        this.qzjh = qzjh;
    }

    public BigDecimal getJxhff() {
        return jxhff;
    }

    public void setJxhff(BigDecimal jxhff) {
        this.jxhff = jxhff;
    }

    public String getFw() {
        return fw;
    }

    public void setFw(String fw) {
        this.fw = fw;
    }

    public BigDecimal getRksl() {
        return rksl;
    }

    public void setRksl(BigDecimal rksl) {
        this.rksl = rksl;
    }

    public String getTdmc() {
        return tdmc;
    }

    public void setTdmc(String tdmc) {
        this.tdmc = tdmc;
    }

    public LocalDateTime getStaticDate() {
        return staticDate;
    }

    public void setStaticDate(LocalDateTime staticDate) {
        this.staticDate = staticDate;
    }

    @Override
    public String toString() {
        return "VJginfo{" +
        "zdjs=" + zdjs +
        ", jfgl=" + jfgl +
        ", qkjjyjsqk=" + qkjjyjsqk +
        ", qzjh=" + qzjh +
        ", jxhff=" + jxhff +
        ", fw=" + fw +
        ", rksl=" + rksl +
        ", tdmc=" + tdmc +
        ", staticDate=" + staticDate +
        "}";
    }
}
