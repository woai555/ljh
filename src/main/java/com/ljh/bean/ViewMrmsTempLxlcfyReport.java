package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_MRMS_TEMP_LXLCFY_REPORT
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewMrmsTempLxlcfyReport implements Serializable {

    private static final long serialVersionUID=1L;

    private String statKind;

    private String statName;

    private String deptCode;

    private BigDecimal zg01;

    private BigDecimal zg02;

    private BigDecimal zg03;

    private BigDecimal zg04;

    private BigDecimal zg05;

    private BigDecimal zg06;

    private BigDecimal sIndays;

    private BigDecimal sPatientIndays;

    private BigDecimal sZg01Indays;


    public String getStatKind() {
        return statKind;
    }

    public void setStatKind(String statKind) {
        this.statKind = statKind;
    }

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getZg01() {
        return zg01;
    }

    public void setZg01(BigDecimal zg01) {
        this.zg01 = zg01;
    }

    public BigDecimal getZg02() {
        return zg02;
    }

    public void setZg02(BigDecimal zg02) {
        this.zg02 = zg02;
    }

    public BigDecimal getZg03() {
        return zg03;
    }

    public void setZg03(BigDecimal zg03) {
        this.zg03 = zg03;
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

    public BigDecimal getZg06() {
        return zg06;
    }

    public void setZg06(BigDecimal zg06) {
        this.zg06 = zg06;
    }

    public BigDecimal getsIndays() {
        return sIndays;
    }

    public void setsIndays(BigDecimal sIndays) {
        this.sIndays = sIndays;
    }

    public BigDecimal getsPatientIndays() {
        return sPatientIndays;
    }

    public void setsPatientIndays(BigDecimal sPatientIndays) {
        this.sPatientIndays = sPatientIndays;
    }

    public BigDecimal getsZg01Indays() {
        return sZg01Indays;
    }

    public void setsZg01Indays(BigDecimal sZg01Indays) {
        this.sZg01Indays = sZg01Indays;
    }

    @Override
    public String toString() {
        return "ViewMrmsTempLxlcfyReport{" +
        "statKind=" + statKind +
        ", statName=" + statName +
        ", deptCode=" + deptCode +
        ", zg01=" + zg01 +
        ", zg02=" + zg02 +
        ", zg03=" + zg03 +
        ", zg04=" + zg04 +
        ", zg05=" + zg05 +
        ", zg06=" + zg06 +
        ", sIndays=" + sIndays +
        ", sPatientIndays=" + sPatientIndays +
        ", sZg01Indays=" + sZg01Indays +
        "}";
    }
}
