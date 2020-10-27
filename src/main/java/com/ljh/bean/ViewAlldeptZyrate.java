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
public class ViewAlldeptZyrate implements Serializable {

    private static final long serialVersionUID=1L;

    private String nurseCellCode;

    private String deptCode;

    private BigDecimal patientNum;

    private BigDecimal rate;

    private BigDecimal nullbedNum;

    private BigDecimal bedAllnum;


    public String getNurseCellCode() {
        return nurseCellCode;
    }

    public void setNurseCellCode(String nurseCellCode) {
        this.nurseCellCode = nurseCellCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getPatientNum() {
        return patientNum;
    }

    public void setPatientNum(BigDecimal patientNum) {
        this.patientNum = patientNum;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getNullbedNum() {
        return nullbedNum;
    }

    public void setNullbedNum(BigDecimal nullbedNum) {
        this.nullbedNum = nullbedNum;
    }

    public BigDecimal getBedAllnum() {
        return bedAllnum;
    }

    public void setBedAllnum(BigDecimal bedAllnum) {
        this.bedAllnum = bedAllnum;
    }

    @Override
    public String toString() {
        return "ViewAlldeptZyrate{" +
        "nurseCellCode=" + nurseCellCode +
        ", deptCode=" + deptCode +
        ", patientNum=" + patientNum +
        ", rate=" + rate +
        ", nullbedNum=" + nullbedNum +
        ", bedAllnum=" + bedAllnum +
        "}";
    }
}
