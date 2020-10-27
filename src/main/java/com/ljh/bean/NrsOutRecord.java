package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病人出院记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NrsOutRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院号
     */
    @TableId(value = "INPATIENT_NO", type = IdType.AUTO)
    private String inpatientNo;

    /**
     * 出院诊断
     */
    private String outDiagnose;

    /**
     * 护理诊断数
     */
    private BigDecimal countTend;

    /**
     * 护理问题数
     */
    private BigDecimal countQues;

    /**
     * 潜在问题
     */
    private String tendQues;

    /**
     * 健康指导
     */
    private String healthGuide;

    /**
     * 膳食_普食
     */
    private String meal;

    /**
     * 膳食_软食
     */
    private String mealR;

    /**
     * 膳食_半流
     */
    private String mealB;

    /**
     * 膳食_流汁
     */
    private String mealL;

    /**
     * 膳食_低盐
     */
    private String mealD;

    /**
     * 膳食_低脂
     */
    private String mealDz;

    /**
     * 膳食_糖尿病饮食
     */
    private String mealT;

    /**
     * 膳食_高维生素
     */
    private String mealG;

    /**
     * 膳食_高碳水化合物
     */
    private String mealGt;

    /**
     * 膳食其他
     */
    private String mealRemark;

    /**
     * 限制_烟
     */
    private String restrict;

    /**
     * 限制_酒
     */
    private String restrictJ;

    /**
     * 限制_浓茶
     */
    private String restrictC;

    /**
     * 限制_咖啡
     */
    private String restrictCf;

    /**
     * 限制_槟榔
     */
    private String restrictB;

    /**
     * 限制_刺激性食物
     */
    private String restrictCj;

    /**
     * 限制其他
     */
    private String restrictRe;

    /**
     * 活动和休息
     */
    private String actionRest;

    /**
     * 特殊指导
     */
    private String specialG;

    /**
     * 责任护士编码
     */
    private String nrsCode;

    /**
     * 护士名称
     */
    private String nrsName;

    /**
     * 护士长编码
     */
    private String nrsChief;

    /**
     * 护士长名称
     */
    private String chiefName;

    /**
     * 记录日期
     */
    private LocalDateTime recordDate;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getOutDiagnose() {
        return outDiagnose;
    }

    public void setOutDiagnose(String outDiagnose) {
        this.outDiagnose = outDiagnose;
    }

    public BigDecimal getCountTend() {
        return countTend;
    }

    public void setCountTend(BigDecimal countTend) {
        this.countTend = countTend;
    }

    public BigDecimal getCountQues() {
        return countQues;
    }

    public void setCountQues(BigDecimal countQues) {
        this.countQues = countQues;
    }

    public String getTendQues() {
        return tendQues;
    }

    public void setTendQues(String tendQues) {
        this.tendQues = tendQues;
    }

    public String getHealthGuide() {
        return healthGuide;
    }

    public void setHealthGuide(String healthGuide) {
        this.healthGuide = healthGuide;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getMealR() {
        return mealR;
    }

    public void setMealR(String mealR) {
        this.mealR = mealR;
    }

    public String getMealB() {
        return mealB;
    }

    public void setMealB(String mealB) {
        this.mealB = mealB;
    }

    public String getMealL() {
        return mealL;
    }

    public void setMealL(String mealL) {
        this.mealL = mealL;
    }

    public String getMealD() {
        return mealD;
    }

    public void setMealD(String mealD) {
        this.mealD = mealD;
    }

    public String getMealDz() {
        return mealDz;
    }

    public void setMealDz(String mealDz) {
        this.mealDz = mealDz;
    }

    public String getMealT() {
        return mealT;
    }

    public void setMealT(String mealT) {
        this.mealT = mealT;
    }

    public String getMealG() {
        return mealG;
    }

    public void setMealG(String mealG) {
        this.mealG = mealG;
    }

    public String getMealGt() {
        return mealGt;
    }

    public void setMealGt(String mealGt) {
        this.mealGt = mealGt;
    }

    public String getMealRemark() {
        return mealRemark;
    }

    public void setMealRemark(String mealRemark) {
        this.mealRemark = mealRemark;
    }

    public String getRestrict() {
        return restrict;
    }

    public void setRestrict(String restrict) {
        this.restrict = restrict;
    }

    public String getRestrictJ() {
        return restrictJ;
    }

    public void setRestrictJ(String restrictJ) {
        this.restrictJ = restrictJ;
    }

    public String getRestrictC() {
        return restrictC;
    }

    public void setRestrictC(String restrictC) {
        this.restrictC = restrictC;
    }

    public String getRestrictCf() {
        return restrictCf;
    }

    public void setRestrictCf(String restrictCf) {
        this.restrictCf = restrictCf;
    }

    public String getRestrictB() {
        return restrictB;
    }

    public void setRestrictB(String restrictB) {
        this.restrictB = restrictB;
    }

    public String getRestrictCj() {
        return restrictCj;
    }

    public void setRestrictCj(String restrictCj) {
        this.restrictCj = restrictCj;
    }

    public String getRestrictRe() {
        return restrictRe;
    }

    public void setRestrictRe(String restrictRe) {
        this.restrictRe = restrictRe;
    }

    public String getActionRest() {
        return actionRest;
    }

    public void setActionRest(String actionRest) {
        this.actionRest = actionRest;
    }

    public String getSpecialG() {
        return specialG;
    }

    public void setSpecialG(String specialG) {
        this.specialG = specialG;
    }

    public String getNrsCode() {
        return nrsCode;
    }

    public void setNrsCode(String nrsCode) {
        this.nrsCode = nrsCode;
    }

    public String getNrsName() {
        return nrsName;
    }

    public void setNrsName(String nrsName) {
        this.nrsName = nrsName;
    }

    public String getNrsChief() {
        return nrsChief;
    }

    public void setNrsChief(String nrsChief) {
        this.nrsChief = nrsChief;
    }

    public String getChiefName() {
        return chiefName;
    }

    public void setChiefName(String chiefName) {
        this.chiefName = chiefName;
    }

    public LocalDateTime getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDateTime recordDate) {
        this.recordDate = recordDate;
    }

    @Override
    public String toString() {
        return "NrsOutRecord{" +
        "inpatientNo=" + inpatientNo +
        ", outDiagnose=" + outDiagnose +
        ", countTend=" + countTend +
        ", countQues=" + countQues +
        ", tendQues=" + tendQues +
        ", healthGuide=" + healthGuide +
        ", meal=" + meal +
        ", mealR=" + mealR +
        ", mealB=" + mealB +
        ", mealL=" + mealL +
        ", mealD=" + mealD +
        ", mealDz=" + mealDz +
        ", mealT=" + mealT +
        ", mealG=" + mealG +
        ", mealGt=" + mealGt +
        ", mealRemark=" + mealRemark +
        ", restrict=" + restrict +
        ", restrictJ=" + restrictJ +
        ", restrictC=" + restrictC +
        ", restrictCf=" + restrictCf +
        ", restrictB=" + restrictB +
        ", restrictCj=" + restrictCj +
        ", restrictRe=" + restrictRe +
        ", actionRest=" + actionRest +
        ", specialG=" + specialG +
        ", nrsCode=" + nrsCode +
        ", nrsName=" + nrsName +
        ", nrsChief=" + nrsChief +
        ", chiefName=" + chiefName +
        ", recordDate=" + recordDate +
        "}";
    }
}
