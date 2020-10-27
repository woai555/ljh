package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 住院病人动态日报镜像
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsdymr implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 统计日期
     */
    @TableId(value = "DATE_STAT", type = IdType.AUTO)
    private LocalDateTime dateStat;

    /**
     * 病房代码
     */
    private String deptCode;

    /**
     * 编制内病床数
     */
    private Integer bedStand;

    /**
     * 编制外病床数
     */
    private Integer bedNonst;

    /**
     * 加床数
     */
    private Integer bedAdd;

    /**
     * 空床数
     */
    private Integer bedFree;

    /**
     * 原有病人数
     */
    private Integer remainYesterday;

    /**
     * 常规入院数
     */
    private Integer inNormal;

    /**
     * 急诊入院数
     */
    private Integer inEmc;

    /**
     * 转入数
     */
    private Integer inChange;

    /**
     * 常规出院数
     */
    private Integer outNormal;

    /**
     * 24小时内死亡数
     */
    private Integer deadIn24;

    /**
     * 24小时外死亡数
     */
    private Integer deadOut24;

    /**
     * 恶肿死
     */
    private Integer deadEzs;

    /**
     * 转出数
     */
    private Integer outChange;

    /**
     * 退院人数
     */
    private Integer withdrawal;

    /**
     * 病情一般患者
     */
    private Integer patientNormal;

    /**
     * 病重患者数
     */
    private Integer patientSerious;

    /**
     * 病危患者数
     */
    private Integer patientTerminally;

    /**
     * 病床使用率
     */
    private BigDecimal bedUserate;

    /**
     * 陪护数
     */
    private Integer tendNum;

    /**
     * 病理送检数
     */
    private Integer paNum;

    /**
     * 临床病理符合数
     */
    private Integer clpaNum;

    /**
     * 记录状态
     */
    private String recFlag;

    /**
     * 整理人
     */
    private String modiUsercd;

    /**
     * 整理日期
     */
    private LocalDateTime modiDate;

    private Integer bedGuding;

    private Integer todayinOutchange;

    private Integer todayinInchange;

    private Integer ybNum;

    /**
     * 陪护人数
     */
    private Integer accNum;

    /**
     * 期末实有人数
     */
    private Integer banPnum;


    public LocalDateTime getDateStat() {
        return dateStat;
    }

    public void setDateStat(LocalDateTime dateStat) {
        this.dateStat = dateStat;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Integer getBedStand() {
        return bedStand;
    }

    public void setBedStand(Integer bedStand) {
        this.bedStand = bedStand;
    }

    public Integer getBedNonst() {
        return bedNonst;
    }

    public void setBedNonst(Integer bedNonst) {
        this.bedNonst = bedNonst;
    }

    public Integer getBedAdd() {
        return bedAdd;
    }

    public void setBedAdd(Integer bedAdd) {
        this.bedAdd = bedAdd;
    }

    public Integer getBedFree() {
        return bedFree;
    }

    public void setBedFree(Integer bedFree) {
        this.bedFree = bedFree;
    }

    public Integer getRemainYesterday() {
        return remainYesterday;
    }

    public void setRemainYesterday(Integer remainYesterday) {
        this.remainYesterday = remainYesterday;
    }

    public Integer getInNormal() {
        return inNormal;
    }

    public void setInNormal(Integer inNormal) {
        this.inNormal = inNormal;
    }

    public Integer getInEmc() {
        return inEmc;
    }

    public void setInEmc(Integer inEmc) {
        this.inEmc = inEmc;
    }

    public Integer getInChange() {
        return inChange;
    }

    public void setInChange(Integer inChange) {
        this.inChange = inChange;
    }

    public Integer getOutNormal() {
        return outNormal;
    }

    public void setOutNormal(Integer outNormal) {
        this.outNormal = outNormal;
    }

    public Integer getDeadIn24() {
        return deadIn24;
    }

    public void setDeadIn24(Integer deadIn24) {
        this.deadIn24 = deadIn24;
    }

    public Integer getDeadOut24() {
        return deadOut24;
    }

    public void setDeadOut24(Integer deadOut24) {
        this.deadOut24 = deadOut24;
    }

    public Integer getDeadEzs() {
        return deadEzs;
    }

    public void setDeadEzs(Integer deadEzs) {
        this.deadEzs = deadEzs;
    }

    public Integer getOutChange() {
        return outChange;
    }

    public void setOutChange(Integer outChange) {
        this.outChange = outChange;
    }

    public Integer getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(Integer withdrawal) {
        this.withdrawal = withdrawal;
    }

    public Integer getPatientNormal() {
        return patientNormal;
    }

    public void setPatientNormal(Integer patientNormal) {
        this.patientNormal = patientNormal;
    }

    public Integer getPatientSerious() {
        return patientSerious;
    }

    public void setPatientSerious(Integer patientSerious) {
        this.patientSerious = patientSerious;
    }

    public Integer getPatientTerminally() {
        return patientTerminally;
    }

    public void setPatientTerminally(Integer patientTerminally) {
        this.patientTerminally = patientTerminally;
    }

    public BigDecimal getBedUserate() {
        return bedUserate;
    }

    public void setBedUserate(BigDecimal bedUserate) {
        this.bedUserate = bedUserate;
    }

    public Integer getTendNum() {
        return tendNum;
    }

    public void setTendNum(Integer tendNum) {
        this.tendNum = tendNum;
    }

    public Integer getPaNum() {
        return paNum;
    }

    public void setPaNum(Integer paNum) {
        this.paNum = paNum;
    }

    public Integer getClpaNum() {
        return clpaNum;
    }

    public void setClpaNum(Integer clpaNum) {
        this.clpaNum = clpaNum;
    }

    public String getRecFlag() {
        return recFlag;
    }

    public void setRecFlag(String recFlag) {
        this.recFlag = recFlag;
    }

    public String getModiUsercd() {
        return modiUsercd;
    }

    public void setModiUsercd(String modiUsercd) {
        this.modiUsercd = modiUsercd;
    }

    public LocalDateTime getModiDate() {
        return modiDate;
    }

    public void setModiDate(LocalDateTime modiDate) {
        this.modiDate = modiDate;
    }

    public Integer getBedGuding() {
        return bedGuding;
    }

    public void setBedGuding(Integer bedGuding) {
        this.bedGuding = bedGuding;
    }

    public Integer getTodayinOutchange() {
        return todayinOutchange;
    }

    public void setTodayinOutchange(Integer todayinOutchange) {
        this.todayinOutchange = todayinOutchange;
    }

    public Integer getTodayinInchange() {
        return todayinInchange;
    }

    public void setTodayinInchange(Integer todayinInchange) {
        this.todayinInchange = todayinInchange;
    }

    public Integer getYbNum() {
        return ybNum;
    }

    public void setYbNum(Integer ybNum) {
        this.ybNum = ybNum;
    }

    public Integer getAccNum() {
        return accNum;
    }

    public void setAccNum(Integer accNum) {
        this.accNum = accNum;
    }

    public Integer getBanPnum() {
        return banPnum;
    }

    public void setBanPnum(Integer banPnum) {
        this.banPnum = banPnum;
    }

    @Override
    public String toString() {
        return "Mrmsdymr{" +
        "dateStat=" + dateStat +
        ", deptCode=" + deptCode +
        ", bedStand=" + bedStand +
        ", bedNonst=" + bedNonst +
        ", bedAdd=" + bedAdd +
        ", bedFree=" + bedFree +
        ", remainYesterday=" + remainYesterday +
        ", inNormal=" + inNormal +
        ", inEmc=" + inEmc +
        ", inChange=" + inChange +
        ", outNormal=" + outNormal +
        ", deadIn24=" + deadIn24 +
        ", deadOut24=" + deadOut24 +
        ", deadEzs=" + deadEzs +
        ", outChange=" + outChange +
        ", withdrawal=" + withdrawal +
        ", patientNormal=" + patientNormal +
        ", patientSerious=" + patientSerious +
        ", patientTerminally=" + patientTerminally +
        ", bedUserate=" + bedUserate +
        ", tendNum=" + tendNum +
        ", paNum=" + paNum +
        ", clpaNum=" + clpaNum +
        ", recFlag=" + recFlag +
        ", modiUsercd=" + modiUsercd +
        ", modiDate=" + modiDate +
        ", bedGuding=" + bedGuding +
        ", todayinOutchange=" + todayinOutchange +
        ", todayinInchange=" + todayinInchange +
        ", ybNum=" + ybNum +
        ", accNum=" + accNum +
        ", banPnum=" + banPnum +
        "}";
    }
}
