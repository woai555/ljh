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
public class ViewMrmsFee2 implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private BigDecimal sumPeople;

    private BigDecimal zyCount;

    private BigDecimal hzCount;

    private BigDecimal wyCount;

    private BigDecimal swCount;

    private BigDecimal age0;

    private BigDecimal age1;

    private BigDecimal age15;

    private BigDecimal age45;

    private BigDecimal age65;

    private BigDecimal age75;

    private BigDecimal sumDays;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getSumPeople() {
        return sumPeople;
    }

    public void setSumPeople(BigDecimal sumPeople) {
        this.sumPeople = sumPeople;
    }

    public BigDecimal getZyCount() {
        return zyCount;
    }

    public void setZyCount(BigDecimal zyCount) {
        this.zyCount = zyCount;
    }

    public BigDecimal getHzCount() {
        return hzCount;
    }

    public void setHzCount(BigDecimal hzCount) {
        this.hzCount = hzCount;
    }

    public BigDecimal getWyCount() {
        return wyCount;
    }

    public void setWyCount(BigDecimal wyCount) {
        this.wyCount = wyCount;
    }

    public BigDecimal getSwCount() {
        return swCount;
    }

    public void setSwCount(BigDecimal swCount) {
        this.swCount = swCount;
    }

    public BigDecimal getAge0() {
        return age0;
    }

    public void setAge0(BigDecimal age0) {
        this.age0 = age0;
    }

    public BigDecimal getAge1() {
        return age1;
    }

    public void setAge1(BigDecimal age1) {
        this.age1 = age1;
    }

    public BigDecimal getAge15() {
        return age15;
    }

    public void setAge15(BigDecimal age15) {
        this.age15 = age15;
    }

    public BigDecimal getAge45() {
        return age45;
    }

    public void setAge45(BigDecimal age45) {
        this.age45 = age45;
    }

    public BigDecimal getAge65() {
        return age65;
    }

    public void setAge65(BigDecimal age65) {
        this.age65 = age65;
    }

    public BigDecimal getAge75() {
        return age75;
    }

    public void setAge75(BigDecimal age75) {
        this.age75 = age75;
    }

    public BigDecimal getSumDays() {
        return sumDays;
    }

    public void setSumDays(BigDecimal sumDays) {
        this.sumDays = sumDays;
    }

    @Override
    public String toString() {
        return "ViewMrmsFee2{" +
        "deptCode=" + deptCode +
        ", sumPeople=" + sumPeople +
        ", zyCount=" + zyCount +
        ", hzCount=" + hzCount +
        ", wyCount=" + wyCount +
        ", swCount=" + swCount +
        ", age0=" + age0 +
        ", age1=" + age1 +
        ", age15=" + age15 +
        ", age45=" + age45 +
        ", age65=" + age65 +
        ", age75=" + age75 +
        ", sumDays=" + sumDays +
        "}";
    }
}
