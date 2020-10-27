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
public class Lsk0 implements Serializable {

    private static final long serialVersionUID=1L;

    private String fph;

    private String blh;

    private String xm;

    private String mc;

    private String gg;

    private String dw;

    private BigDecimal dj;

    private BigDecimal sl;

    private BigDecimal je;

    private String lb;

    private String lx;

    private LocalDateTime rq;

    private String ry;

    private Integer bl;

    private BigDecimal bxje;

    private Integer zfbl;

    private BigDecimal zfje;

    private LocalDateTime lrrq;


    public String getFph() {
        return fph;
    }

    public void setFph(String fph) {
        this.fph = fph;
    }

    public String getBlh() {
        return blh;
    }

    public void setBlh(String blh) {
        this.blh = blh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw;
    }

    public BigDecimal getDj() {
        return dj;
    }

    public void setDj(BigDecimal dj) {
        this.dj = dj;
    }

    public BigDecimal getSl() {
        return sl;
    }

    public void setSl(BigDecimal sl) {
        this.sl = sl;
    }

    public BigDecimal getJe() {
        return je;
    }

    public void setJe(BigDecimal je) {
        this.je = je;
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public LocalDateTime getRq() {
        return rq;
    }

    public void setRq(LocalDateTime rq) {
        this.rq = rq;
    }

    public String getRy() {
        return ry;
    }

    public void setRy(String ry) {
        this.ry = ry;
    }

    public Integer getBl() {
        return bl;
    }

    public void setBl(Integer bl) {
        this.bl = bl;
    }

    public BigDecimal getBxje() {
        return bxje;
    }

    public void setBxje(BigDecimal bxje) {
        this.bxje = bxje;
    }

    public Integer getZfbl() {
        return zfbl;
    }

    public void setZfbl(Integer zfbl) {
        this.zfbl = zfbl;
    }

    public BigDecimal getZfje() {
        return zfje;
    }

    public void setZfje(BigDecimal zfje) {
        this.zfje = zfje;
    }

    public LocalDateTime getLrrq() {
        return lrrq;
    }

    public void setLrrq(LocalDateTime lrrq) {
        this.lrrq = lrrq;
    }

    @Override
    public String toString() {
        return "Lsk0{" +
        "fph=" + fph +
        ", blh=" + blh +
        ", xm=" + xm +
        ", mc=" + mc +
        ", gg=" + gg +
        ", dw=" + dw +
        ", dj=" + dj +
        ", sl=" + sl +
        ", je=" + je +
        ", lb=" + lb +
        ", lx=" + lx +
        ", rq=" + rq +
        ", ry=" + ry +
        ", bl=" + bl +
        ", bxje=" + bxje +
        ", zfbl=" + zfbl +
        ", zfje=" + zfje +
        ", lrrq=" + lrrq +
        "}";
    }
}
