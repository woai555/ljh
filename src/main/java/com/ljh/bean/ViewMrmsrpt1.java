package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_MRMSRPT1
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewMrmsrpt1 implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String deptName;

    private Integer deptOrder;

    private Integer bedAvgopen;

    private BigDecimal ratioRtn1;

    private BigDecimal ratioRtn4;

    private BigDecimal bedTrtimes;

    private BigDecimal ratioBeduse;

    private BigDecimal bedAvgdays;

    private BigDecimal avgDaysop;

    private Integer patientOut;

    private Integer accordCepi;

    private BigDecimal ratioCepi;

    private Integer patientOper;

    private Integer accordOpba;

    private BigDecimal ratioOpba;

    private Integer nickNum;

    private Integer cicaNum3;

    private BigDecimal ratioCica3;

    private Integer sumClpa;

    private Integer accordClpa;

    private BigDecimal ratioClpa;

    private BigDecimal ratioRtn2;

    private Integer paOut;

    private Integer diagOknum;

    private BigDecimal ratioDiagok;

    private Integer nickNum2;

    private Integer cicaNum6;

    private BigDecimal ratioCica6;

    private Integer salvNum;

    private Integer succNum;

    private BigDecimal ratioSucc;

    private Integer accordPipo;

    private BigDecimal ratioPipo;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getDeptOrder() {
        return deptOrder;
    }

    public void setDeptOrder(Integer deptOrder) {
        this.deptOrder = deptOrder;
    }

    public Integer getBedAvgopen() {
        return bedAvgopen;
    }

    public void setBedAvgopen(Integer bedAvgopen) {
        this.bedAvgopen = bedAvgopen;
    }

    public BigDecimal getRatioRtn1() {
        return ratioRtn1;
    }

    public void setRatioRtn1(BigDecimal ratioRtn1) {
        this.ratioRtn1 = ratioRtn1;
    }

    public BigDecimal getRatioRtn4() {
        return ratioRtn4;
    }

    public void setRatioRtn4(BigDecimal ratioRtn4) {
        this.ratioRtn4 = ratioRtn4;
    }

    public BigDecimal getBedTrtimes() {
        return bedTrtimes;
    }

    public void setBedTrtimes(BigDecimal bedTrtimes) {
        this.bedTrtimes = bedTrtimes;
    }

    public BigDecimal getRatioBeduse() {
        return ratioBeduse;
    }

    public void setRatioBeduse(BigDecimal ratioBeduse) {
        this.ratioBeduse = ratioBeduse;
    }

    public BigDecimal getBedAvgdays() {
        return bedAvgdays;
    }

    public void setBedAvgdays(BigDecimal bedAvgdays) {
        this.bedAvgdays = bedAvgdays;
    }

    public BigDecimal getAvgDaysop() {
        return avgDaysop;
    }

    public void setAvgDaysop(BigDecimal avgDaysop) {
        this.avgDaysop = avgDaysop;
    }

    public Integer getPatientOut() {
        return patientOut;
    }

    public void setPatientOut(Integer patientOut) {
        this.patientOut = patientOut;
    }

    public Integer getAccordCepi() {
        return accordCepi;
    }

    public void setAccordCepi(Integer accordCepi) {
        this.accordCepi = accordCepi;
    }

    public BigDecimal getRatioCepi() {
        return ratioCepi;
    }

    public void setRatioCepi(BigDecimal ratioCepi) {
        this.ratioCepi = ratioCepi;
    }

    public Integer getPatientOper() {
        return patientOper;
    }

    public void setPatientOper(Integer patientOper) {
        this.patientOper = patientOper;
    }

    public Integer getAccordOpba() {
        return accordOpba;
    }

    public void setAccordOpba(Integer accordOpba) {
        this.accordOpba = accordOpba;
    }

    public BigDecimal getRatioOpba() {
        return ratioOpba;
    }

    public void setRatioOpba(BigDecimal ratioOpba) {
        this.ratioOpba = ratioOpba;
    }

    public Integer getNickNum() {
        return nickNum;
    }

    public void setNickNum(Integer nickNum) {
        this.nickNum = nickNum;
    }

    public Integer getCicaNum3() {
        return cicaNum3;
    }

    public void setCicaNum3(Integer cicaNum3) {
        this.cicaNum3 = cicaNum3;
    }

    public BigDecimal getRatioCica3() {
        return ratioCica3;
    }

    public void setRatioCica3(BigDecimal ratioCica3) {
        this.ratioCica3 = ratioCica3;
    }

    public Integer getSumClpa() {
        return sumClpa;
    }

    public void setSumClpa(Integer sumClpa) {
        this.sumClpa = sumClpa;
    }

    public Integer getAccordClpa() {
        return accordClpa;
    }

    public void setAccordClpa(Integer accordClpa) {
        this.accordClpa = accordClpa;
    }

    public BigDecimal getRatioClpa() {
        return ratioClpa;
    }

    public void setRatioClpa(BigDecimal ratioClpa) {
        this.ratioClpa = ratioClpa;
    }

    public BigDecimal getRatioRtn2() {
        return ratioRtn2;
    }

    public void setRatioRtn2(BigDecimal ratioRtn2) {
        this.ratioRtn2 = ratioRtn2;
    }

    public Integer getPaOut() {
        return paOut;
    }

    public void setPaOut(Integer paOut) {
        this.paOut = paOut;
    }

    public Integer getDiagOknum() {
        return diagOknum;
    }

    public void setDiagOknum(Integer diagOknum) {
        this.diagOknum = diagOknum;
    }

    public BigDecimal getRatioDiagok() {
        return ratioDiagok;
    }

    public void setRatioDiagok(BigDecimal ratioDiagok) {
        this.ratioDiagok = ratioDiagok;
    }

    public Integer getNickNum2() {
        return nickNum2;
    }

    public void setNickNum2(Integer nickNum2) {
        this.nickNum2 = nickNum2;
    }

    public Integer getCicaNum6() {
        return cicaNum6;
    }

    public void setCicaNum6(Integer cicaNum6) {
        this.cicaNum6 = cicaNum6;
    }

    public BigDecimal getRatioCica6() {
        return ratioCica6;
    }

    public void setRatioCica6(BigDecimal ratioCica6) {
        this.ratioCica6 = ratioCica6;
    }

    public Integer getSalvNum() {
        return salvNum;
    }

    public void setSalvNum(Integer salvNum) {
        this.salvNum = salvNum;
    }

    public Integer getSuccNum() {
        return succNum;
    }

    public void setSuccNum(Integer succNum) {
        this.succNum = succNum;
    }

    public BigDecimal getRatioSucc() {
        return ratioSucc;
    }

    public void setRatioSucc(BigDecimal ratioSucc) {
        this.ratioSucc = ratioSucc;
    }

    public Integer getAccordPipo() {
        return accordPipo;
    }

    public void setAccordPipo(Integer accordPipo) {
        this.accordPipo = accordPipo;
    }

    public BigDecimal getRatioPipo() {
        return ratioPipo;
    }

    public void setRatioPipo(BigDecimal ratioPipo) {
        this.ratioPipo = ratioPipo;
    }

    @Override
    public String toString() {
        return "ViewMrmsrpt1{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", deptOrder=" + deptOrder +
        ", bedAvgopen=" + bedAvgopen +
        ", ratioRtn1=" + ratioRtn1 +
        ", ratioRtn4=" + ratioRtn4 +
        ", bedTrtimes=" + bedTrtimes +
        ", ratioBeduse=" + ratioBeduse +
        ", bedAvgdays=" + bedAvgdays +
        ", avgDaysop=" + avgDaysop +
        ", patientOut=" + patientOut +
        ", accordCepi=" + accordCepi +
        ", ratioCepi=" + ratioCepi +
        ", patientOper=" + patientOper +
        ", accordOpba=" + accordOpba +
        ", ratioOpba=" + ratioOpba +
        ", nickNum=" + nickNum +
        ", cicaNum3=" + cicaNum3 +
        ", ratioCica3=" + ratioCica3 +
        ", sumClpa=" + sumClpa +
        ", accordClpa=" + accordClpa +
        ", ratioClpa=" + ratioClpa +
        ", ratioRtn2=" + ratioRtn2 +
        ", paOut=" + paOut +
        ", diagOknum=" + diagOknum +
        ", ratioDiagok=" + ratioDiagok +
        ", nickNum2=" + nickNum2 +
        ", cicaNum6=" + cicaNum6 +
        ", ratioCica6=" + ratioCica6 +
        ", salvNum=" + salvNum +
        ", succNum=" + succNum +
        ", ratioSucc=" + ratioSucc +
        ", accordPipo=" + accordPipo +
        ", ratioPipo=" + ratioPipo +
        "}";
    }
}
