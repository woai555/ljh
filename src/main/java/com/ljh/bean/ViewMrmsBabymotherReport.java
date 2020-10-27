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
public class ViewMrmsBabymotherReport implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal babyCount;

    private BigDecimal motherCount;

    private BigDecimal modePf;

    private BigDecimal modeXy;

    private BigDecimal modeTq;

    private BigDecimal modeQc;

    private BigDecimal modeSc;

    private BigDecimal endLive;

    private BigDecimal endDie;

    private BigDecimal endSt;

    private BigDecimal lowweighCount;

    private BigDecimal manCount;

    private BigDecimal womanCount;

    private BigDecimal salvCount;

    private BigDecimal succCount;

    private BigDecimal zg04;

    private BigDecimal zg05;

    private BigDecimal infectCount;


    public BigDecimal getBabyCount() {
        return babyCount;
    }

    public void setBabyCount(BigDecimal babyCount) {
        this.babyCount = babyCount;
    }

    public BigDecimal getMotherCount() {
        return motherCount;
    }

    public void setMotherCount(BigDecimal motherCount) {
        this.motherCount = motherCount;
    }

    public BigDecimal getModePf() {
        return modePf;
    }

    public void setModePf(BigDecimal modePf) {
        this.modePf = modePf;
    }

    public BigDecimal getModeXy() {
        return modeXy;
    }

    public void setModeXy(BigDecimal modeXy) {
        this.modeXy = modeXy;
    }

    public BigDecimal getModeTq() {
        return modeTq;
    }

    public void setModeTq(BigDecimal modeTq) {
        this.modeTq = modeTq;
    }

    public BigDecimal getModeQc() {
        return modeQc;
    }

    public void setModeQc(BigDecimal modeQc) {
        this.modeQc = modeQc;
    }

    public BigDecimal getModeSc() {
        return modeSc;
    }

    public void setModeSc(BigDecimal modeSc) {
        this.modeSc = modeSc;
    }

    public BigDecimal getEndLive() {
        return endLive;
    }

    public void setEndLive(BigDecimal endLive) {
        this.endLive = endLive;
    }

    public BigDecimal getEndDie() {
        return endDie;
    }

    public void setEndDie(BigDecimal endDie) {
        this.endDie = endDie;
    }

    public BigDecimal getEndSt() {
        return endSt;
    }

    public void setEndSt(BigDecimal endSt) {
        this.endSt = endSt;
    }

    public BigDecimal getLowweighCount() {
        return lowweighCount;
    }

    public void setLowweighCount(BigDecimal lowweighCount) {
        this.lowweighCount = lowweighCount;
    }

    public BigDecimal getManCount() {
        return manCount;
    }

    public void setManCount(BigDecimal manCount) {
        this.manCount = manCount;
    }

    public BigDecimal getWomanCount() {
        return womanCount;
    }

    public void setWomanCount(BigDecimal womanCount) {
        this.womanCount = womanCount;
    }

    public BigDecimal getSalvCount() {
        return salvCount;
    }

    public void setSalvCount(BigDecimal salvCount) {
        this.salvCount = salvCount;
    }

    public BigDecimal getSuccCount() {
        return succCount;
    }

    public void setSuccCount(BigDecimal succCount) {
        this.succCount = succCount;
    }

    public BigDecimal getZg04() {
        return zg04;
    }

    public void setZg04(BigDecimal zg04) {
        this.zg04 = zg04;
    }

    public BigDecimal getZg05() {
        return zg05;
    }

    public void setZg05(BigDecimal zg05) {
        this.zg05 = zg05;
    }

    public BigDecimal getInfectCount() {
        return infectCount;
    }

    public void setInfectCount(BigDecimal infectCount) {
        this.infectCount = infectCount;
    }

    @Override
    public String toString() {
        return "ViewMrmsBabymotherReport{" +
        "babyCount=" + babyCount +
        ", motherCount=" + motherCount +
        ", modePf=" + modePf +
        ", modeXy=" + modeXy +
        ", modeTq=" + modeTq +
        ", modeQc=" + modeQc +
        ", modeSc=" + modeSc +
        ", endLive=" + endLive +
        ", endDie=" + endDie +
        ", endSt=" + endSt +
        ", lowweighCount=" + lowweighCount +
        ", manCount=" + manCount +
        ", womanCount=" + womanCount +
        ", salvCount=" + salvCount +
        ", succCount=" + succCount +
        ", zg04=" + zg04 +
        ", zg05=" + zg05 +
        ", infectCount=" + infectCount +
        "}";
    }
}
