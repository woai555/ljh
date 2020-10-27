package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 住院情况统计报表模板档MRMSRPT1
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsrpt1 implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室代码
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 科室序号
     */
    private Integer deptOrder;

    /**
     * 期末实有病床数
     */
    private Integer bedReal;

    /**
     * 期初原有病人数
     */
    private Integer patientOrign;

    /**
     * 期内门诊入院数
     */
    private Integer patientClin;

    /**
     * 期内急诊入院数
     */
    private Integer patientEmin;

    /**
     * 他科转入数
     */
    private Integer patientTrin;

    /**
     * 期内出院人数
     */
    private Integer manOut;

    /**
     * 期内出院病人数
     */
    private Integer patientOut;

    /**
     * 治愈数
     */
    private Integer patientRtn1;

    /**
     * 好转数
     */
    private Integer patientRtn2;

    /**
     * 未愈数
     */
    private Integer patientRtn3;

    /**
     * 死亡数
     */
    private Integer patientRtn4;

    /**
     * 转出数
     */
    private Integer patientTrout;

    /**
     * 期末实有数
     */
    private Integer patientReal;

    /**
     * 期内实际开放总床日数
     */
    private Integer bedDaysopen;

    /**
     * 期内实际占用总床日数
     */
    private Integer bedDaysuse;

    /**
     * 出院者占用总床日数
     */
    private Integer bedDaysop;

    /**
     * 平均开放床数
     */
    private Integer bedAvgopen;

    /**
     * 手术人次
     */
    private Integer patientOper;

    /**
     * 三日确诊数
     */
    private Integer diagOknum;

    /**
     * 确诊天数
     */
    private Integer diagAvgday;

    /**
     * 无菌手术数
     */
    private Integer nickNum;

    /**
     * 甲级愈合数
     */
    private Integer cicaNum1;

    /**
     * 感染数
     */
    private Integer cicaNum3;

    /**
     * 有菌手术数
     */
    private Integer nickNum2;

    /**
     * 有菌甲级愈合数
     */
    private Integer cicaNum4;

    /**
     * 有菌化脓数
     */
    private Integer cicaNum6;

    /**
     * 手术合并症数
     */
    private Integer sndaNum;

    /**
     * 门诊住院符合数
     */
    private Integer accordCepi;

    /**
     * 入院出院符合数
     */
    private Integer accordPipo;

    /**
     * 术前后符合数
     */
    private Integer accordOpba;

    /**
     * 临床X光符合数
     */
    private Integer accordClx;

    /**
     * 临床X光数
     */
    private Integer sumClx;

    /**
     * 临床CT符合数
     */
    private Integer accordClct;

    /**
     * 临床CT数
     */
    private Integer sumClct;

    /**
     * 临床MRI符合数
     */
    private Integer accordClmr;

    /**
     * 临床MRI数
     */
    private Integer sumClmr;

    /**
     * 临床病理符合数
     */
    private Integer accordClpa;

    /**
     * 临床病理数
     */
    private Integer sumClpa;

    /**
     * 病案合格数
     */
    private Integer mrElignum;

    /**
     * 甲级病案数
     */
    private Integer mrQual1;

    /**
     * 乙级病案数
     */
    private Integer mrQual2;

    /**
     * 抢救次数
     */
    private Integer salvNum;

    /**
     * 成功次数
     */
    private Integer succNum;

    /**
     * 尸检数
     */
    private Integer bodyChknum;

    /**
     * 二次入院数
     */
    private Integer secoInnum;

    /**
     * 本区出院人数
     */
    private Integer inSorc1;

    /**
     * 本市出院人数
     */
    private Integer inSorc2;

    /**
     * 本省出院人数
     */
    private Integer inSorc3;

    /**
     * 外省出院人数
     */
    private Integer inSorc4;

    /**
     * 国外出院人数
     */
    private Integer inSorc5;

    /**
     * 今天入今天转
     */
    private Integer todayinInchange;

    /**
     * 统计天数
     */
    private Integer statDays;

    /**
     * 今天入今天出
     */
    private Integer todayinOutchange;


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

    public Integer getBedReal() {
        return bedReal;
    }

    public void setBedReal(Integer bedReal) {
        this.bedReal = bedReal;
    }

    public Integer getPatientOrign() {
        return patientOrign;
    }

    public void setPatientOrign(Integer patientOrign) {
        this.patientOrign = patientOrign;
    }

    public Integer getPatientClin() {
        return patientClin;
    }

    public void setPatientClin(Integer patientClin) {
        this.patientClin = patientClin;
    }

    public Integer getPatientEmin() {
        return patientEmin;
    }

    public void setPatientEmin(Integer patientEmin) {
        this.patientEmin = patientEmin;
    }

    public Integer getPatientTrin() {
        return patientTrin;
    }

    public void setPatientTrin(Integer patientTrin) {
        this.patientTrin = patientTrin;
    }

    public Integer getManOut() {
        return manOut;
    }

    public void setManOut(Integer manOut) {
        this.manOut = manOut;
    }

    public Integer getPatientOut() {
        return patientOut;
    }

    public void setPatientOut(Integer patientOut) {
        this.patientOut = patientOut;
    }

    public Integer getPatientRtn1() {
        return patientRtn1;
    }

    public void setPatientRtn1(Integer patientRtn1) {
        this.patientRtn1 = patientRtn1;
    }

    public Integer getPatientRtn2() {
        return patientRtn2;
    }

    public void setPatientRtn2(Integer patientRtn2) {
        this.patientRtn2 = patientRtn2;
    }

    public Integer getPatientRtn3() {
        return patientRtn3;
    }

    public void setPatientRtn3(Integer patientRtn3) {
        this.patientRtn3 = patientRtn3;
    }

    public Integer getPatientRtn4() {
        return patientRtn4;
    }

    public void setPatientRtn4(Integer patientRtn4) {
        this.patientRtn4 = patientRtn4;
    }

    public Integer getPatientTrout() {
        return patientTrout;
    }

    public void setPatientTrout(Integer patientTrout) {
        this.patientTrout = patientTrout;
    }

    public Integer getPatientReal() {
        return patientReal;
    }

    public void setPatientReal(Integer patientReal) {
        this.patientReal = patientReal;
    }

    public Integer getBedDaysopen() {
        return bedDaysopen;
    }

    public void setBedDaysopen(Integer bedDaysopen) {
        this.bedDaysopen = bedDaysopen;
    }

    public Integer getBedDaysuse() {
        return bedDaysuse;
    }

    public void setBedDaysuse(Integer bedDaysuse) {
        this.bedDaysuse = bedDaysuse;
    }

    public Integer getBedDaysop() {
        return bedDaysop;
    }

    public void setBedDaysop(Integer bedDaysop) {
        this.bedDaysop = bedDaysop;
    }

    public Integer getBedAvgopen() {
        return bedAvgopen;
    }

    public void setBedAvgopen(Integer bedAvgopen) {
        this.bedAvgopen = bedAvgopen;
    }

    public Integer getPatientOper() {
        return patientOper;
    }

    public void setPatientOper(Integer patientOper) {
        this.patientOper = patientOper;
    }

    public Integer getDiagOknum() {
        return diagOknum;
    }

    public void setDiagOknum(Integer diagOknum) {
        this.diagOknum = diagOknum;
    }

    public Integer getDiagAvgday() {
        return diagAvgday;
    }

    public void setDiagAvgday(Integer diagAvgday) {
        this.diagAvgday = diagAvgday;
    }

    public Integer getNickNum() {
        return nickNum;
    }

    public void setNickNum(Integer nickNum) {
        this.nickNum = nickNum;
    }

    public Integer getCicaNum1() {
        return cicaNum1;
    }

    public void setCicaNum1(Integer cicaNum1) {
        this.cicaNum1 = cicaNum1;
    }

    public Integer getCicaNum3() {
        return cicaNum3;
    }

    public void setCicaNum3(Integer cicaNum3) {
        this.cicaNum3 = cicaNum3;
    }

    public Integer getNickNum2() {
        return nickNum2;
    }

    public void setNickNum2(Integer nickNum2) {
        this.nickNum2 = nickNum2;
    }

    public Integer getCicaNum4() {
        return cicaNum4;
    }

    public void setCicaNum4(Integer cicaNum4) {
        this.cicaNum4 = cicaNum4;
    }

    public Integer getCicaNum6() {
        return cicaNum6;
    }

    public void setCicaNum6(Integer cicaNum6) {
        this.cicaNum6 = cicaNum6;
    }

    public Integer getSndaNum() {
        return sndaNum;
    }

    public void setSndaNum(Integer sndaNum) {
        this.sndaNum = sndaNum;
    }

    public Integer getAccordCepi() {
        return accordCepi;
    }

    public void setAccordCepi(Integer accordCepi) {
        this.accordCepi = accordCepi;
    }

    public Integer getAccordPipo() {
        return accordPipo;
    }

    public void setAccordPipo(Integer accordPipo) {
        this.accordPipo = accordPipo;
    }

    public Integer getAccordOpba() {
        return accordOpba;
    }

    public void setAccordOpba(Integer accordOpba) {
        this.accordOpba = accordOpba;
    }

    public Integer getAccordClx() {
        return accordClx;
    }

    public void setAccordClx(Integer accordClx) {
        this.accordClx = accordClx;
    }

    public Integer getSumClx() {
        return sumClx;
    }

    public void setSumClx(Integer sumClx) {
        this.sumClx = sumClx;
    }

    public Integer getAccordClct() {
        return accordClct;
    }

    public void setAccordClct(Integer accordClct) {
        this.accordClct = accordClct;
    }

    public Integer getSumClct() {
        return sumClct;
    }

    public void setSumClct(Integer sumClct) {
        this.sumClct = sumClct;
    }

    public Integer getAccordClmr() {
        return accordClmr;
    }

    public void setAccordClmr(Integer accordClmr) {
        this.accordClmr = accordClmr;
    }

    public Integer getSumClmr() {
        return sumClmr;
    }

    public void setSumClmr(Integer sumClmr) {
        this.sumClmr = sumClmr;
    }

    public Integer getAccordClpa() {
        return accordClpa;
    }

    public void setAccordClpa(Integer accordClpa) {
        this.accordClpa = accordClpa;
    }

    public Integer getSumClpa() {
        return sumClpa;
    }

    public void setSumClpa(Integer sumClpa) {
        this.sumClpa = sumClpa;
    }

    public Integer getMrElignum() {
        return mrElignum;
    }

    public void setMrElignum(Integer mrElignum) {
        this.mrElignum = mrElignum;
    }

    public Integer getMrQual1() {
        return mrQual1;
    }

    public void setMrQual1(Integer mrQual1) {
        this.mrQual1 = mrQual1;
    }

    public Integer getMrQual2() {
        return mrQual2;
    }

    public void setMrQual2(Integer mrQual2) {
        this.mrQual2 = mrQual2;
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

    public Integer getBodyChknum() {
        return bodyChknum;
    }

    public void setBodyChknum(Integer bodyChknum) {
        this.bodyChknum = bodyChknum;
    }

    public Integer getSecoInnum() {
        return secoInnum;
    }

    public void setSecoInnum(Integer secoInnum) {
        this.secoInnum = secoInnum;
    }

    public Integer getInSorc1() {
        return inSorc1;
    }

    public void setInSorc1(Integer inSorc1) {
        this.inSorc1 = inSorc1;
    }

    public Integer getInSorc2() {
        return inSorc2;
    }

    public void setInSorc2(Integer inSorc2) {
        this.inSorc2 = inSorc2;
    }

    public Integer getInSorc3() {
        return inSorc3;
    }

    public void setInSorc3(Integer inSorc3) {
        this.inSorc3 = inSorc3;
    }

    public Integer getInSorc4() {
        return inSorc4;
    }

    public void setInSorc4(Integer inSorc4) {
        this.inSorc4 = inSorc4;
    }

    public Integer getInSorc5() {
        return inSorc5;
    }

    public void setInSorc5(Integer inSorc5) {
        this.inSorc5 = inSorc5;
    }

    public Integer getTodayinInchange() {
        return todayinInchange;
    }

    public void setTodayinInchange(Integer todayinInchange) {
        this.todayinInchange = todayinInchange;
    }

    public Integer getStatDays() {
        return statDays;
    }

    public void setStatDays(Integer statDays) {
        this.statDays = statDays;
    }

    public Integer getTodayinOutchange() {
        return todayinOutchange;
    }

    public void setTodayinOutchange(Integer todayinOutchange) {
        this.todayinOutchange = todayinOutchange;
    }

    @Override
    public String toString() {
        return "Mrmsrpt1{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", deptOrder=" + deptOrder +
        ", bedReal=" + bedReal +
        ", patientOrign=" + patientOrign +
        ", patientClin=" + patientClin +
        ", patientEmin=" + patientEmin +
        ", patientTrin=" + patientTrin +
        ", manOut=" + manOut +
        ", patientOut=" + patientOut +
        ", patientRtn1=" + patientRtn1 +
        ", patientRtn2=" + patientRtn2 +
        ", patientRtn3=" + patientRtn3 +
        ", patientRtn4=" + patientRtn4 +
        ", patientTrout=" + patientTrout +
        ", patientReal=" + patientReal +
        ", bedDaysopen=" + bedDaysopen +
        ", bedDaysuse=" + bedDaysuse +
        ", bedDaysop=" + bedDaysop +
        ", bedAvgopen=" + bedAvgopen +
        ", patientOper=" + patientOper +
        ", diagOknum=" + diagOknum +
        ", diagAvgday=" + diagAvgday +
        ", nickNum=" + nickNum +
        ", cicaNum1=" + cicaNum1 +
        ", cicaNum3=" + cicaNum3 +
        ", nickNum2=" + nickNum2 +
        ", cicaNum4=" + cicaNum4 +
        ", cicaNum6=" + cicaNum6 +
        ", sndaNum=" + sndaNum +
        ", accordCepi=" + accordCepi +
        ", accordPipo=" + accordPipo +
        ", accordOpba=" + accordOpba +
        ", accordClx=" + accordClx +
        ", sumClx=" + sumClx +
        ", accordClct=" + accordClct +
        ", sumClct=" + sumClct +
        ", accordClmr=" + accordClmr +
        ", sumClmr=" + sumClmr +
        ", accordClpa=" + accordClpa +
        ", sumClpa=" + sumClpa +
        ", mrElignum=" + mrElignum +
        ", mrQual1=" + mrQual1 +
        ", mrQual2=" + mrQual2 +
        ", salvNum=" + salvNum +
        ", succNum=" + succNum +
        ", bodyChknum=" + bodyChknum +
        ", secoInnum=" + secoInnum +
        ", inSorc1=" + inSorc1 +
        ", inSorc2=" + inSorc2 +
        ", inSorc3=" + inSorc3 +
        ", inSorc4=" + inSorc4 +
        ", inSorc5=" + inSorc5 +
        ", todayinInchange=" + todayinInchange +
        ", statDays=" + statDays +
        ", todayinOutchange=" + todayinOutchange +
        "}";
    }
}
