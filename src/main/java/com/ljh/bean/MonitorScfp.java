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
public class MonitorScfp implements Serializable {

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
     * 门诊医疗收入(万元)
     */
    private BigDecimal mMedCst;

    /**
     * 门诊药品收入(万元)
     */
    private BigDecimal mPharmCst;

    /**
     * 门诊耗材收入(万元)
     */
    private BigDecimal mMatCst;

    /**
     * 门诊病人次均医疗费用(元)
     */
    private BigDecimal mAvgMedCst;

    /**
     * 门诊病人次均药品费用(元)
     */
    private BigDecimal mAvgPharmCst;

    /**
     * 门诊病人次均耗材费用(元)
     */
    private BigDecimal mAvgMatCst;

    /**
     * 门诊医保病人医疗收入(万元)
     */
    private BigDecimal mMcMedCst;

    /**
     * 门诊医保病人药品收入(万元)
     */
    private BigDecimal mMcPharmCst;

    /**
     * 门诊医保病人耗材收入(万元)
     */
    private BigDecimal mMcMatCst;

    /**
     * 门诊医保病人病人次均医疗费用(元)
     */
    private BigDecimal mMcAvgMedCst;

    /**
     * 门诊医保病人病人次均药品费用(元)
     */
    private BigDecimal mMcAvgPharmCst;

    /**
     * 门诊医保病人病人次均耗材费用(元)
     */
    private BigDecimal mMcAvgMatCst;

    /**
     * 门诊医保病人病人自付费用(万元)
     */
    private BigDecimal mMcSelfCst;

    /**
     * 门诊医保病人病人次均自付费用(元)
     */
    private BigDecimal mMcAvgSelfCst;

    /**
     * 出院医疗收入(万元)  dept_type = 1 住院病人 dept_type = 0  留观病人
     */
    private BigDecimal zOMedCst;

    /**
     * 出院药品收入(万元)  dept_type = 1 住院病人 dept_type = 0  留观病人
     */
    private BigDecimal zOPharmCst;

    /**
     * 出院耗材收入(万元)  dept_type = 1 住院病人 dept_type = 0  留观病人
     */
    private BigDecimal zOMatCst;

    /**
     * 出院(观)人数  dept_type = 1 住院病人 dept_type = 0  留观病人
     */
    private Integer zONum;

    /**
     * 实际占用总床日数
     */
    private Integer zOBedDays;

    /**
     * 出院例均医疗收入(元)  dept_type = 1 住院病人 dept_type = 0  留观病人
     */
    private BigDecimal zOAvgMedCst;

    /**
     * 出院例均药品收入(元)  dept_type = 1 住院病人 dept_type = 0  留观病人
     */
    private BigDecimal zOAvgPharmCst;

    /**
     * 出院例均耗材收入(元)  dept_type = 1 住院病人 dept_type = 0  留观病人
     */
    private BigDecimal zOAvgMatCst;

    /**
     * 出院医保病人医疗收入(万元)  dept_type = 1 住院医保病人 dept_type = 0  留观医保病人
     */
    private BigDecimal zOMcMedCst;

    /**
     * 出院医保病人药品收入(万元)  dept_type = 1 住院医保病人 dept_type = 0  留观医保病人
     */
    private BigDecimal zOMcPharmCst;

    /**
     * 出院医保病人耗材收入(万元)  dept_type = 1 住院医保病人 dept_type = 0  留观医保病人
     */
    private BigDecimal zOMcMatCst;

    /**
     * 出院(观)医保病人人数  dept_type = 1 住院医保病人 dept_type = 0  留观医保病人
     */
    private Integer zOMcNum;

    /**
     * 出院医保病人例均医疗收入(元)  dept_type = 1 住院医保病人 dept_type = 0  留观医保病人
     */
    private BigDecimal zOMcAvgMedCst;

    /**
     * 出院医保病人例均药品收入(元)  dept_type = 1 住院医保病人 dept_type = 0  留观医保病人
     */
    private BigDecimal zOMcAvgPharmCst;

    /**
     * 出院医保病人例均耗材收入(元)  dept_type = 1 住院医保病人 dept_type = 0  留观医保病人
     */
    private BigDecimal zOMcAvgMatCst;

    /**
     * 出院医保病人自费费用(万元)  dept_type = 1 住院医保病人 dept_type = 0  留观医保病人
     */
    private BigDecimal zOMcSelfCst;

    /**
     * 出院医保病人例均自费费用(元)  dept_type = 1 住院医保病人 dept_type = 0  留观医保病人
     */
    private BigDecimal zOMcAvgSelfCst;

    /**
     * 住院医疗收入(万元)  dept_type = 1 住院病人 dept_type = 0  留观病人
     */
    private BigDecimal zIMedCst;

    /**
     * 住院药品收入(万元)  dept_type = 1 住院病人 dept_type = 0  留观病人
     */
    private BigDecimal zIPharmCst;

    /**
     * 住院医保病人医疗收入(万元)  dept_type = 1 住院医保病人 dept_type = 0  留观医保病人
     */
    private BigDecimal zIMcMedCst;

    /**
     * 住院医保病人药品收入(万元)  dept_type = 1 住院医保病人 dept_type = 0  留观医保病人
     */
    private BigDecimal zIMcPharmCst;

    /**
     * X光检查人数
     */
    private Integer numRayX;

    /**
     * CT检查人数
     */
    private Integer numRayCt;

    /**
     * 核磁检查人数
     */
    private Integer numRayMri;

    /**
     * B超检查人数
     */
    private Integer numRayB;

    /**
     * 全血细胞分析(五分类)人数
     */
    private Integer analyBlood;

    /**
     * 医保病人X光检查人数--暂时不用
     */
    private Integer mcNumRayX;

    /**
     * 医保病人CT检查人数--暂时不用
     */
    private Integer mcNumRayCt;

    /**
     * 医保病人核磁检查人数--暂时不用
     */
    private Integer mcNumRayMri;

    /**
     * 医保病人B超检查人数--暂时不用
     */
    private Integer mcNumRayB;

    /**
     * 医保病人全血细胞分析(五分类)人数--暂时不用
     */
    private Integer mcAnalyBlood;

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
     * 医保副主任医生号源挂号率--暂时不用
     */
    private BigDecimal rMcRegSourceV;

    /**
     * 医保主任医生号源挂号率--暂时不用
     */
    private BigDecimal rMcRegSourceD;

    /**
     * 医保知名专家号源挂号率--暂时不用
     */
    private BigDecimal rMcRegSourceF;

    /**
     * 医事服务费-门诊(万元)
     */
    private BigDecimal medServiceCstO;

    /**
     * 医事服务费-急诊(万元)
     */
    private BigDecimal medServiceCstE;

    /**
     * 医事服务费-住院(万元)
     */
    private BigDecimal medServiceCstI;

    /**
     * 医保医事服务费-门诊(万元)
     */
    private BigDecimal mcMedServiceCstO;

    /**
     * 医保医事服务费-急诊(万元)
     */
    private BigDecimal mcMedServiceCstE;

    /**
     * 医保医事服务费-住院(万元)
     */
    private BigDecimal mcMedServiceCstI;


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

    public BigDecimal getmMedCst() {
        return mMedCst;
    }

    public void setmMedCst(BigDecimal mMedCst) {
        this.mMedCst = mMedCst;
    }

    public BigDecimal getmPharmCst() {
        return mPharmCst;
    }

    public void setmPharmCst(BigDecimal mPharmCst) {
        this.mPharmCst = mPharmCst;
    }

    public BigDecimal getmMatCst() {
        return mMatCst;
    }

    public void setmMatCst(BigDecimal mMatCst) {
        this.mMatCst = mMatCst;
    }

    public BigDecimal getmAvgMedCst() {
        return mAvgMedCst;
    }

    public void setmAvgMedCst(BigDecimal mAvgMedCst) {
        this.mAvgMedCst = mAvgMedCst;
    }

    public BigDecimal getmAvgPharmCst() {
        return mAvgPharmCst;
    }

    public void setmAvgPharmCst(BigDecimal mAvgPharmCst) {
        this.mAvgPharmCst = mAvgPharmCst;
    }

    public BigDecimal getmAvgMatCst() {
        return mAvgMatCst;
    }

    public void setmAvgMatCst(BigDecimal mAvgMatCst) {
        this.mAvgMatCst = mAvgMatCst;
    }

    public BigDecimal getmMcMedCst() {
        return mMcMedCst;
    }

    public void setmMcMedCst(BigDecimal mMcMedCst) {
        this.mMcMedCst = mMcMedCst;
    }

    public BigDecimal getmMcPharmCst() {
        return mMcPharmCst;
    }

    public void setmMcPharmCst(BigDecimal mMcPharmCst) {
        this.mMcPharmCst = mMcPharmCst;
    }

    public BigDecimal getmMcMatCst() {
        return mMcMatCst;
    }

    public void setmMcMatCst(BigDecimal mMcMatCst) {
        this.mMcMatCst = mMcMatCst;
    }

    public BigDecimal getmMcAvgMedCst() {
        return mMcAvgMedCst;
    }

    public void setmMcAvgMedCst(BigDecimal mMcAvgMedCst) {
        this.mMcAvgMedCst = mMcAvgMedCst;
    }

    public BigDecimal getmMcAvgPharmCst() {
        return mMcAvgPharmCst;
    }

    public void setmMcAvgPharmCst(BigDecimal mMcAvgPharmCst) {
        this.mMcAvgPharmCst = mMcAvgPharmCst;
    }

    public BigDecimal getmMcAvgMatCst() {
        return mMcAvgMatCst;
    }

    public void setmMcAvgMatCst(BigDecimal mMcAvgMatCst) {
        this.mMcAvgMatCst = mMcAvgMatCst;
    }

    public BigDecimal getmMcSelfCst() {
        return mMcSelfCst;
    }

    public void setmMcSelfCst(BigDecimal mMcSelfCst) {
        this.mMcSelfCst = mMcSelfCst;
    }

    public BigDecimal getmMcAvgSelfCst() {
        return mMcAvgSelfCst;
    }

    public void setmMcAvgSelfCst(BigDecimal mMcAvgSelfCst) {
        this.mMcAvgSelfCst = mMcAvgSelfCst;
    }

    public BigDecimal getzOMedCst() {
        return zOMedCst;
    }

    public void setzOMedCst(BigDecimal zOMedCst) {
        this.zOMedCst = zOMedCst;
    }

    public BigDecimal getzOPharmCst() {
        return zOPharmCst;
    }

    public void setzOPharmCst(BigDecimal zOPharmCst) {
        this.zOPharmCst = zOPharmCst;
    }

    public BigDecimal getzOMatCst() {
        return zOMatCst;
    }

    public void setzOMatCst(BigDecimal zOMatCst) {
        this.zOMatCst = zOMatCst;
    }

    public Integer getzONum() {
        return zONum;
    }

    public void setzONum(Integer zONum) {
        this.zONum = zONum;
    }

    public Integer getzOBedDays() {
        return zOBedDays;
    }

    public void setzOBedDays(Integer zOBedDays) {
        this.zOBedDays = zOBedDays;
    }

    public BigDecimal getzOAvgMedCst() {
        return zOAvgMedCst;
    }

    public void setzOAvgMedCst(BigDecimal zOAvgMedCst) {
        this.zOAvgMedCst = zOAvgMedCst;
    }

    public BigDecimal getzOAvgPharmCst() {
        return zOAvgPharmCst;
    }

    public void setzOAvgPharmCst(BigDecimal zOAvgPharmCst) {
        this.zOAvgPharmCst = zOAvgPharmCst;
    }

    public BigDecimal getzOAvgMatCst() {
        return zOAvgMatCst;
    }

    public void setzOAvgMatCst(BigDecimal zOAvgMatCst) {
        this.zOAvgMatCst = zOAvgMatCst;
    }

    public BigDecimal getzOMcMedCst() {
        return zOMcMedCst;
    }

    public void setzOMcMedCst(BigDecimal zOMcMedCst) {
        this.zOMcMedCst = zOMcMedCst;
    }

    public BigDecimal getzOMcPharmCst() {
        return zOMcPharmCst;
    }

    public void setzOMcPharmCst(BigDecimal zOMcPharmCst) {
        this.zOMcPharmCst = zOMcPharmCst;
    }

    public BigDecimal getzOMcMatCst() {
        return zOMcMatCst;
    }

    public void setzOMcMatCst(BigDecimal zOMcMatCst) {
        this.zOMcMatCst = zOMcMatCst;
    }

    public Integer getzOMcNum() {
        return zOMcNum;
    }

    public void setzOMcNum(Integer zOMcNum) {
        this.zOMcNum = zOMcNum;
    }

    public BigDecimal getzOMcAvgMedCst() {
        return zOMcAvgMedCst;
    }

    public void setzOMcAvgMedCst(BigDecimal zOMcAvgMedCst) {
        this.zOMcAvgMedCst = zOMcAvgMedCst;
    }

    public BigDecimal getzOMcAvgPharmCst() {
        return zOMcAvgPharmCst;
    }

    public void setzOMcAvgPharmCst(BigDecimal zOMcAvgPharmCst) {
        this.zOMcAvgPharmCst = zOMcAvgPharmCst;
    }

    public BigDecimal getzOMcAvgMatCst() {
        return zOMcAvgMatCst;
    }

    public void setzOMcAvgMatCst(BigDecimal zOMcAvgMatCst) {
        this.zOMcAvgMatCst = zOMcAvgMatCst;
    }

    public BigDecimal getzOMcSelfCst() {
        return zOMcSelfCst;
    }

    public void setzOMcSelfCst(BigDecimal zOMcSelfCst) {
        this.zOMcSelfCst = zOMcSelfCst;
    }

    public BigDecimal getzOMcAvgSelfCst() {
        return zOMcAvgSelfCst;
    }

    public void setzOMcAvgSelfCst(BigDecimal zOMcAvgSelfCst) {
        this.zOMcAvgSelfCst = zOMcAvgSelfCst;
    }

    public BigDecimal getzIMedCst() {
        return zIMedCst;
    }

    public void setzIMedCst(BigDecimal zIMedCst) {
        this.zIMedCst = zIMedCst;
    }

    public BigDecimal getzIPharmCst() {
        return zIPharmCst;
    }

    public void setzIPharmCst(BigDecimal zIPharmCst) {
        this.zIPharmCst = zIPharmCst;
    }

    public BigDecimal getzIMcMedCst() {
        return zIMcMedCst;
    }

    public void setzIMcMedCst(BigDecimal zIMcMedCst) {
        this.zIMcMedCst = zIMcMedCst;
    }

    public BigDecimal getzIMcPharmCst() {
        return zIMcPharmCst;
    }

    public void setzIMcPharmCst(BigDecimal zIMcPharmCst) {
        this.zIMcPharmCst = zIMcPharmCst;
    }

    public Integer getNumRayX() {
        return numRayX;
    }

    public void setNumRayX(Integer numRayX) {
        this.numRayX = numRayX;
    }

    public Integer getNumRayCt() {
        return numRayCt;
    }

    public void setNumRayCt(Integer numRayCt) {
        this.numRayCt = numRayCt;
    }

    public Integer getNumRayMri() {
        return numRayMri;
    }

    public void setNumRayMri(Integer numRayMri) {
        this.numRayMri = numRayMri;
    }

    public Integer getNumRayB() {
        return numRayB;
    }

    public void setNumRayB(Integer numRayB) {
        this.numRayB = numRayB;
    }

    public Integer getAnalyBlood() {
        return analyBlood;
    }

    public void setAnalyBlood(Integer analyBlood) {
        this.analyBlood = analyBlood;
    }

    public Integer getMcNumRayX() {
        return mcNumRayX;
    }

    public void setMcNumRayX(Integer mcNumRayX) {
        this.mcNumRayX = mcNumRayX;
    }

    public Integer getMcNumRayCt() {
        return mcNumRayCt;
    }

    public void setMcNumRayCt(Integer mcNumRayCt) {
        this.mcNumRayCt = mcNumRayCt;
    }

    public Integer getMcNumRayMri() {
        return mcNumRayMri;
    }

    public void setMcNumRayMri(Integer mcNumRayMri) {
        this.mcNumRayMri = mcNumRayMri;
    }

    public Integer getMcNumRayB() {
        return mcNumRayB;
    }

    public void setMcNumRayB(Integer mcNumRayB) {
        this.mcNumRayB = mcNumRayB;
    }

    public Integer getMcAnalyBlood() {
        return mcAnalyBlood;
    }

    public void setMcAnalyBlood(Integer mcAnalyBlood) {
        this.mcAnalyBlood = mcAnalyBlood;
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

    public BigDecimal getMedServiceCstO() {
        return medServiceCstO;
    }

    public void setMedServiceCstO(BigDecimal medServiceCstO) {
        this.medServiceCstO = medServiceCstO;
    }

    public BigDecimal getMedServiceCstE() {
        return medServiceCstE;
    }

    public void setMedServiceCstE(BigDecimal medServiceCstE) {
        this.medServiceCstE = medServiceCstE;
    }

    public BigDecimal getMedServiceCstI() {
        return medServiceCstI;
    }

    public void setMedServiceCstI(BigDecimal medServiceCstI) {
        this.medServiceCstI = medServiceCstI;
    }

    public BigDecimal getMcMedServiceCstO() {
        return mcMedServiceCstO;
    }

    public void setMcMedServiceCstO(BigDecimal mcMedServiceCstO) {
        this.mcMedServiceCstO = mcMedServiceCstO;
    }

    public BigDecimal getMcMedServiceCstE() {
        return mcMedServiceCstE;
    }

    public void setMcMedServiceCstE(BigDecimal mcMedServiceCstE) {
        this.mcMedServiceCstE = mcMedServiceCstE;
    }

    public BigDecimal getMcMedServiceCstI() {
        return mcMedServiceCstI;
    }

    public void setMcMedServiceCstI(BigDecimal mcMedServiceCstI) {
        this.mcMedServiceCstI = mcMedServiceCstI;
    }

    @Override
    public String toString() {
        return "MonitorScfp{" +
        "begDate=" + begDate +
        ", endDate=" + endDate +
        ", ifAvg=" + ifAvg +
        ", deptType=" + deptType +
        ", mMedCst=" + mMedCst +
        ", mPharmCst=" + mPharmCst +
        ", mMatCst=" + mMatCst +
        ", mAvgMedCst=" + mAvgMedCst +
        ", mAvgPharmCst=" + mAvgPharmCst +
        ", mAvgMatCst=" + mAvgMatCst +
        ", mMcMedCst=" + mMcMedCst +
        ", mMcPharmCst=" + mMcPharmCst +
        ", mMcMatCst=" + mMcMatCst +
        ", mMcAvgMedCst=" + mMcAvgMedCst +
        ", mMcAvgPharmCst=" + mMcAvgPharmCst +
        ", mMcAvgMatCst=" + mMcAvgMatCst +
        ", mMcSelfCst=" + mMcSelfCst +
        ", mMcAvgSelfCst=" + mMcAvgSelfCst +
        ", zOMedCst=" + zOMedCst +
        ", zOPharmCst=" + zOPharmCst +
        ", zOMatCst=" + zOMatCst +
        ", zONum=" + zONum +
        ", zOBedDays=" + zOBedDays +
        ", zOAvgMedCst=" + zOAvgMedCst +
        ", zOAvgPharmCst=" + zOAvgPharmCst +
        ", zOAvgMatCst=" + zOAvgMatCst +
        ", zOMcMedCst=" + zOMcMedCst +
        ", zOMcPharmCst=" + zOMcPharmCst +
        ", zOMcMatCst=" + zOMcMatCst +
        ", zOMcNum=" + zOMcNum +
        ", zOMcAvgMedCst=" + zOMcAvgMedCst +
        ", zOMcAvgPharmCst=" + zOMcAvgPharmCst +
        ", zOMcAvgMatCst=" + zOMcAvgMatCst +
        ", zOMcSelfCst=" + zOMcSelfCst +
        ", zOMcAvgSelfCst=" + zOMcAvgSelfCst +
        ", zIMedCst=" + zIMedCst +
        ", zIPharmCst=" + zIPharmCst +
        ", zIMcMedCst=" + zIMcMedCst +
        ", zIMcPharmCst=" + zIMcPharmCst +
        ", numRayX=" + numRayX +
        ", numRayCt=" + numRayCt +
        ", numRayMri=" + numRayMri +
        ", numRayB=" + numRayB +
        ", analyBlood=" + analyBlood +
        ", mcNumRayX=" + mcNumRayX +
        ", mcNumRayCt=" + mcNumRayCt +
        ", mcNumRayMri=" + mcNumRayMri +
        ", mcNumRayB=" + mcNumRayB +
        ", mcAnalyBlood=" + mcAnalyBlood +
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
        ", medServiceCstO=" + medServiceCstO +
        ", medServiceCstE=" + medServiceCstE +
        ", medServiceCstI=" + medServiceCstI +
        ", mcMedServiceCstO=" + mcMedServiceCstO +
        ", mcMedServiceCstE=" + mcMedServiceCstE +
        ", mcMedServiceCstI=" + mcMedServiceCstI +
        "}";
    }
}
