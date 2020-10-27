package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医药分开试点工作指标监测表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MonitorScfpDept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 统计开始时间
     */
    private LocalDateTime begDate;

    /**
     * 统计结束时间
     */
    private LocalDateTime endDate;

    /**
     * 是否平均值
     */
    private String ifAvg;

    /**
     * 0门诊，1住院
     */
    private String deptType;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 门诊总诊疗人次
     */
    private Integer mManTime;

    /**
     * 普通门诊人次
     */
    private Integer mCManTime;

    /**
     * 副主任医师门诊人次
     */
    private Integer mVManTime;

    /**
     * 主任医师门诊人次
     */
    private Integer mDManTime;

    /**
     * 知名专家门诊人次
     */
    private Integer mFManTime;

    /**
     * 急诊人次
     */
    private Integer mEManTime;

    /**
     * 本市病人人次
     */
    private Integer mManTimeNative;

    /**
     * 本市病人比例
     */
    private Integer mNativeRate;

    /**
     * 外阜病人比例
     */
    private Integer mNonlocalRate;

    /**
     * 门诊医保病人总诊疗人次
     */
    private Integer mMcManTime;

    /**
     * 普通门诊医保病人人次
     */
    private Integer mMcCManTime;

    /**
     * 副主任医师门诊医保病人人次
     */
    private Integer mMcVManTime;

    /**
     * 主任医师门诊医保病人人次
     */
    private Integer mMcDManTime;

    /**
     * 知名专家门诊医保病人人次
     */
    private Integer mMcFManTime;

    /**
     * 医保病人急诊人次
     */
    private Integer mMcEManTime;

    /**
     * 副主任医生号源挂号率
     */
    private BigDecimal rRegSourceV;

    /**
     * 主任医生号源挂号率
     */
    private BigDecimal rRegSourceD;

    /**
     * 知名专家号源挂号率
     */
    private BigDecimal rRegSourceF;

    /**
     * 医保副主任医生号源挂号率-暂时不用
     */
    private BigDecimal rMcRegSourceV;

    /**
     * 医保主任医生号源挂号率-暂时不用
     */
    private BigDecimal rMcRegSourceD;

    /**
     * 医保知名专家号源挂号率-暂时不用
     */
    private BigDecimal rMcRegSourceF;


    public LocalDateTime getBegDate() {
        return begDate;
    }

    public void setBegDate(LocalDateTime begDate) {
        this.begDate = begDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getIfAvg() {
        return ifAvg;
    }

    public void setIfAvg(String ifAvg) {
        this.ifAvg = ifAvg;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getmManTime() {
        return mManTime;
    }

    public void setmManTime(Integer mManTime) {
        this.mManTime = mManTime;
    }

    public Integer getmCManTime() {
        return mCManTime;
    }

    public void setmCManTime(Integer mCManTime) {
        this.mCManTime = mCManTime;
    }

    public Integer getmVManTime() {
        return mVManTime;
    }

    public void setmVManTime(Integer mVManTime) {
        this.mVManTime = mVManTime;
    }

    public Integer getmDManTime() {
        return mDManTime;
    }

    public void setmDManTime(Integer mDManTime) {
        this.mDManTime = mDManTime;
    }

    public Integer getmFManTime() {
        return mFManTime;
    }

    public void setmFManTime(Integer mFManTime) {
        this.mFManTime = mFManTime;
    }

    public Integer getmEManTime() {
        return mEManTime;
    }

    public void setmEManTime(Integer mEManTime) {
        this.mEManTime = mEManTime;
    }

    public Integer getmManTimeNative() {
        return mManTimeNative;
    }

    public void setmManTimeNative(Integer mManTimeNative) {
        this.mManTimeNative = mManTimeNative;
    }

    public Integer getmNativeRate() {
        return mNativeRate;
    }

    public void setmNativeRate(Integer mNativeRate) {
        this.mNativeRate = mNativeRate;
    }

    public Integer getmNonlocalRate() {
        return mNonlocalRate;
    }

    public void setmNonlocalRate(Integer mNonlocalRate) {
        this.mNonlocalRate = mNonlocalRate;
    }

    public Integer getmMcManTime() {
        return mMcManTime;
    }

    public void setmMcManTime(Integer mMcManTime) {
        this.mMcManTime = mMcManTime;
    }

    public Integer getmMcCManTime() {
        return mMcCManTime;
    }

    public void setmMcCManTime(Integer mMcCManTime) {
        this.mMcCManTime = mMcCManTime;
    }

    public Integer getmMcVManTime() {
        return mMcVManTime;
    }

    public void setmMcVManTime(Integer mMcVManTime) {
        this.mMcVManTime = mMcVManTime;
    }

    public Integer getmMcDManTime() {
        return mMcDManTime;
    }

    public void setmMcDManTime(Integer mMcDManTime) {
        this.mMcDManTime = mMcDManTime;
    }

    public Integer getmMcFManTime() {
        return mMcFManTime;
    }

    public void setmMcFManTime(Integer mMcFManTime) {
        this.mMcFManTime = mMcFManTime;
    }

    public Integer getmMcEManTime() {
        return mMcEManTime;
    }

    public void setmMcEManTime(Integer mMcEManTime) {
        this.mMcEManTime = mMcEManTime;
    }

    public BigDecimal getrRegSourceV() {
        return rRegSourceV;
    }

    public void setrRegSourceV(BigDecimal rRegSourceV) {
        this.rRegSourceV = rRegSourceV;
    }

    public BigDecimal getrRegSourceD() {
        return rRegSourceD;
    }

    public void setrRegSourceD(BigDecimal rRegSourceD) {
        this.rRegSourceD = rRegSourceD;
    }

    public BigDecimal getrRegSourceF() {
        return rRegSourceF;
    }

    public void setrRegSourceF(BigDecimal rRegSourceF) {
        this.rRegSourceF = rRegSourceF;
    }

    public BigDecimal getrMcRegSourceV() {
        return rMcRegSourceV;
    }

    public void setrMcRegSourceV(BigDecimal rMcRegSourceV) {
        this.rMcRegSourceV = rMcRegSourceV;
    }

    public BigDecimal getrMcRegSourceD() {
        return rMcRegSourceD;
    }

    public void setrMcRegSourceD(BigDecimal rMcRegSourceD) {
        this.rMcRegSourceD = rMcRegSourceD;
    }

    public BigDecimal getrMcRegSourceF() {
        return rMcRegSourceF;
    }

    public void setrMcRegSourceF(BigDecimal rMcRegSourceF) {
        this.rMcRegSourceF = rMcRegSourceF;
    }

    @Override
    public String toString() {
        return "MonitorScfpDept{" +
        "begDate=" + begDate +
        ", endDate=" + endDate +
        ", ifAvg=" + ifAvg +
        ", deptType=" + deptType +
        ", deptName=" + deptName +
        ", mManTime=" + mManTime +
        ", mCManTime=" + mCManTime +
        ", mVManTime=" + mVManTime +
        ", mDManTime=" + mDManTime +
        ", mFManTime=" + mFManTime +
        ", mEManTime=" + mEManTime +
        ", mManTimeNative=" + mManTimeNative +
        ", mNativeRate=" + mNativeRate +
        ", mNonlocalRate=" + mNonlocalRate +
        ", mMcManTime=" + mMcManTime +
        ", mMcCManTime=" + mMcCManTime +
        ", mMcVManTime=" + mMcVManTime +
        ", mMcDManTime=" + mMcDManTime +
        ", mMcFManTime=" + mMcFManTime +
        ", mMcEManTime=" + mMcEManTime +
        ", rRegSourceV=" + rRegSourceV +
        ", rRegSourceD=" + rRegSourceD +
        ", rRegSourceF=" + rRegSourceF +
        ", rMcRegSourceV=" + rMcRegSourceV +
        ", rMcRegSourceD=" + rMcRegSourceD +
        ", rMcRegSourceF=" + rMcRegSourceF +
        "}";
    }
}
