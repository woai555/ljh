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
public class RevolutionDayHos implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime begindate;

    private LocalDateTime enddate;

    private LocalDateTime opertime;

    private Long rc;

    private BigDecimal allcost;

    private BigDecimal ypcost;

    private BigDecimal ctcost;

    private BigDecimal mrcost;

    private BigDecimal zlcost;

    private BigDecimal sscost;

    private BigDecimal clcost;

    private BigDecimal allavg;

    private BigDecimal ypavg;

    private BigDecimal ctavg;

    private BigDecimal mravg;

    private BigDecimal zlavg;

    private BigDecimal ssavg;

    private BigDecimal clavg;

    private String ynmz;

    private Long yprc;

    private Long ctrc;

    private Long mrrc;

    private Long zlrc;

    private Long ssrc;

    private Long clrc;


    public LocalDateTime getBegindate() {
        return begindate;
    }

    public void setBegindate(LocalDateTime begindate) {
        this.begindate = begindate;
    }

    public LocalDateTime getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        this.enddate = enddate;
    }

    public LocalDateTime getOpertime() {
        return opertime;
    }

    public void setOpertime(LocalDateTime opertime) {
        this.opertime = opertime;
    }

    public Long getRc() {
        return rc;
    }

    public void setRc(Long rc) {
        this.rc = rc;
    }

    public BigDecimal getAllcost() {
        return allcost;
    }

    public void setAllcost(BigDecimal allcost) {
        this.allcost = allcost;
    }

    public BigDecimal getYpcost() {
        return ypcost;
    }

    public void setYpcost(BigDecimal ypcost) {
        this.ypcost = ypcost;
    }

    public BigDecimal getCtcost() {
        return ctcost;
    }

    public void setCtcost(BigDecimal ctcost) {
        this.ctcost = ctcost;
    }

    public BigDecimal getMrcost() {
        return mrcost;
    }

    public void setMrcost(BigDecimal mrcost) {
        this.mrcost = mrcost;
    }

    public BigDecimal getZlcost() {
        return zlcost;
    }

    public void setZlcost(BigDecimal zlcost) {
        this.zlcost = zlcost;
    }

    public BigDecimal getSscost() {
        return sscost;
    }

    public void setSscost(BigDecimal sscost) {
        this.sscost = sscost;
    }

    public BigDecimal getClcost() {
        return clcost;
    }

    public void setClcost(BigDecimal clcost) {
        this.clcost = clcost;
    }

    public BigDecimal getAllavg() {
        return allavg;
    }

    public void setAllavg(BigDecimal allavg) {
        this.allavg = allavg;
    }

    public BigDecimal getYpavg() {
        return ypavg;
    }

    public void setYpavg(BigDecimal ypavg) {
        this.ypavg = ypavg;
    }

    public BigDecimal getCtavg() {
        return ctavg;
    }

    public void setCtavg(BigDecimal ctavg) {
        this.ctavg = ctavg;
    }

    public BigDecimal getMravg() {
        return mravg;
    }

    public void setMravg(BigDecimal mravg) {
        this.mravg = mravg;
    }

    public BigDecimal getZlavg() {
        return zlavg;
    }

    public void setZlavg(BigDecimal zlavg) {
        this.zlavg = zlavg;
    }

    public BigDecimal getSsavg() {
        return ssavg;
    }

    public void setSsavg(BigDecimal ssavg) {
        this.ssavg = ssavg;
    }

    public BigDecimal getClavg() {
        return clavg;
    }

    public void setClavg(BigDecimal clavg) {
        this.clavg = clavg;
    }

    public String getYnmz() {
        return ynmz;
    }

    public void setYnmz(String ynmz) {
        this.ynmz = ynmz;
    }

    public Long getYprc() {
        return yprc;
    }

    public void setYprc(Long yprc) {
        this.yprc = yprc;
    }

    public Long getCtrc() {
        return ctrc;
    }

    public void setCtrc(Long ctrc) {
        this.ctrc = ctrc;
    }

    public Long getMrrc() {
        return mrrc;
    }

    public void setMrrc(Long mrrc) {
        this.mrrc = mrrc;
    }

    public Long getZlrc() {
        return zlrc;
    }

    public void setZlrc(Long zlrc) {
        this.zlrc = zlrc;
    }

    public Long getSsrc() {
        return ssrc;
    }

    public void setSsrc(Long ssrc) {
        this.ssrc = ssrc;
    }

    public Long getClrc() {
        return clrc;
    }

    public void setClrc(Long clrc) {
        this.clrc = clrc;
    }

    @Override
    public String toString() {
        return "RevolutionDayHos{" +
        "begindate=" + begindate +
        ", enddate=" + enddate +
        ", opertime=" + opertime +
        ", rc=" + rc +
        ", allcost=" + allcost +
        ", ypcost=" + ypcost +
        ", ctcost=" + ctcost +
        ", mrcost=" + mrcost +
        ", zlcost=" + zlcost +
        ", sscost=" + sscost +
        ", clcost=" + clcost +
        ", allavg=" + allavg +
        ", ypavg=" + ypavg +
        ", ctavg=" + ctavg +
        ", mravg=" + mravg +
        ", zlavg=" + zlavg +
        ", ssavg=" + ssavg +
        ", clavg=" + clavg +
        ", ynmz=" + ynmz +
        ", yprc=" + yprc +
        ", ctrc=" + ctrc +
        ", mrrc=" + mrrc +
        ", zlrc=" + zlrc +
        ", ssrc=" + ssrc +
        ", clrc=" + clrc +
        "}";
    }
}
