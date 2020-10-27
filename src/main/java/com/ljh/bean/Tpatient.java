package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病历主表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Tpatient implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 任务编码
     */
    @TableId(value = "MISSION_CODE", type = IdType.AUTO)
    private String missionCode;

    /**
     * 分中心名称
     */
    private String branchName;

    /**
     * 来电时间
     */
    private String callTime;

    /**
     * 接令时间
     */
    private String orderTime;

    /**
     * 出发时间
     */
    private String departTime;

    /**
     * 到场时间
     */
    private String arriveTime;

    /**
     * 离场时间
     */
    private String leaveTime;

    /**
     * 到目的地时间
     */
    private String reachTime;

    /**
     * 完成任务时间
     */
    private String completeTime;

    /**
     * 现场地址
     */
    private String sceneAddress;

    /**
     * 呼救电话
     */
    private String callNumber;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 性别  男/女/不详
     */
    private String sex;

    /**
     * 年龄
     */
    private String age;

    /**
     * 民族国籍
     */
    private String nationality;

    /**
     * 婚姻状况 已婚/未婚
     */
    private String marriage;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 送达地址
     */
    private String deliveryAddress;

    /**
     * 身份证号
     */
    private String idcardno;

    /**
     * 主诉
     */
    private String chiefComplaint;

    /**
     * 现病史
     */
    private String hpi;

    /**
     * 卒中 是/否
     */
    private String apoplexy;

    /**
     * 面部
     */
    private String face;

    /**
     * 上肢
     */
    private String upperLimb;

    /**
     * 言语
     */
    private String speech;

    /**
     * 心脏病 是/否
     */
    private String heartDisease;

    /**
     * 心脏病类型
     */
    private String typeOfHeartDisease;

    /**
     * 高血压 是/否
     */
    private String hypertension;

    /**
     * 高血压史
     */
    private String hypertensionHistory;

    /**
     * 高血压史单位
     */
    private String hypertensionHistoryUnit;

    /**
     * 糖尿病 是/否
     */
    private String diabetes;

    /**
     * 糖尿病史
     */
    private String diabetesHistory;

    /**
     * 糖尿病史单位  年/月/日
     */
    private String diabetesHistoryUnit;

    /**
     * BP1
     */
    private String bp1;

    /**
     * BP2
     */
    private String bp2;

    /**
     * P
     */
    private String p;

    /**
     * R
     */
    private String r;

    /**
     * HR
     */
    private String hr;

    /**
     * T
     */
    private String t;

    /**
     * 心电图
     */
    private String electrocardiogram;

    /**
     * 血糖快速检测
     */
    private String bloodSugar;

    /**
     * 血糖时间
     */
    private String bloodSugarTime;

    /**
     * 指测血氧饱和度
     */
    private String bloodOxygenSaturation;

    /**
     * 血氧时间
     */
    private String bloodOxygenTime;

    /**
     * 脉搏碳氧血红蛋白
     */
    private String hemoglobin;

    /**
     * 血红蛋白时间
     */
    private String hemoglobinTime;

    /**
     * IsCopyFromPad  0/1
     */
    private BigDecimal iscopyfrompad;

    /**
     * IsCopyFromCenter  0/1
     */
    private BigDecimal iscopyfromcenter;

    /**
     * LastUpdateTime
     */
    private LocalDateTime lastupdatetime;

    /**
     * 患者入院后是否关注标志
     */
    private String ynDealed;

    /**
     * 关注人
     */
    private String dealedCode;

    /**
     * 关注时间
     */
    private LocalDateTime dealedDate;

    /**
     * 门诊卡号
     */
    private String cardNo;


    public String getMissionCode() {
        return missionCode;
    }

    public void setMissionCode(String missionCode) {
        this.missionCode = missionCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCallTime() {
        return callTime;
    }

    public void setCallTime(String callTime) {
        this.callTime = callTime;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getReachTime() {
        return reachTime;
    }

    public void setReachTime(String reachTime) {
        this.reachTime = reachTime;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public String getSceneAddress() {
        return sceneAddress;
    }

    public void setSceneAddress(String sceneAddress) {
        this.sceneAddress = sceneAddress;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public String getHpi() {
        return hpi;
    }

    public void setHpi(String hpi) {
        this.hpi = hpi;
    }

    public String getApoplexy() {
        return apoplexy;
    }

    public void setApoplexy(String apoplexy) {
        this.apoplexy = apoplexy;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getUpperLimb() {
        return upperLimb;
    }

    public void setUpperLimb(String upperLimb) {
        this.upperLimb = upperLimb;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getHeartDisease() {
        return heartDisease;
    }

    public void setHeartDisease(String heartDisease) {
        this.heartDisease = heartDisease;
    }

    public String getTypeOfHeartDisease() {
        return typeOfHeartDisease;
    }

    public void setTypeOfHeartDisease(String typeOfHeartDisease) {
        this.typeOfHeartDisease = typeOfHeartDisease;
    }

    public String getHypertension() {
        return hypertension;
    }

    public void setHypertension(String hypertension) {
        this.hypertension = hypertension;
    }

    public String getHypertensionHistory() {
        return hypertensionHistory;
    }

    public void setHypertensionHistory(String hypertensionHistory) {
        this.hypertensionHistory = hypertensionHistory;
    }

    public String getHypertensionHistoryUnit() {
        return hypertensionHistoryUnit;
    }

    public void setHypertensionHistoryUnit(String hypertensionHistoryUnit) {
        this.hypertensionHistoryUnit = hypertensionHistoryUnit;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getDiabetesHistory() {
        return diabetesHistory;
    }

    public void setDiabetesHistory(String diabetesHistory) {
        this.diabetesHistory = diabetesHistory;
    }

    public String getDiabetesHistoryUnit() {
        return diabetesHistoryUnit;
    }

    public void setDiabetesHistoryUnit(String diabetesHistoryUnit) {
        this.diabetesHistoryUnit = diabetesHistoryUnit;
    }

    public String getBp1() {
        return bp1;
    }

    public void setBp1(String bp1) {
        this.bp1 = bp1;
    }

    public String getBp2() {
        return bp2;
    }

    public void setBp2(String bp2) {
        this.bp2 = bp2;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getElectrocardiogram() {
        return electrocardiogram;
    }

    public void setElectrocardiogram(String electrocardiogram) {
        this.electrocardiogram = electrocardiogram;
    }

    public String getBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(String bloodSugar) {
        this.bloodSugar = bloodSugar;
    }

    public String getBloodSugarTime() {
        return bloodSugarTime;
    }

    public void setBloodSugarTime(String bloodSugarTime) {
        this.bloodSugarTime = bloodSugarTime;
    }

    public String getBloodOxygenSaturation() {
        return bloodOxygenSaturation;
    }

    public void setBloodOxygenSaturation(String bloodOxygenSaturation) {
        this.bloodOxygenSaturation = bloodOxygenSaturation;
    }

    public String getBloodOxygenTime() {
        return bloodOxygenTime;
    }

    public void setBloodOxygenTime(String bloodOxygenTime) {
        this.bloodOxygenTime = bloodOxygenTime;
    }

    public String getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(String hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public String getHemoglobinTime() {
        return hemoglobinTime;
    }

    public void setHemoglobinTime(String hemoglobinTime) {
        this.hemoglobinTime = hemoglobinTime;
    }

    public BigDecimal getIscopyfrompad() {
        return iscopyfrompad;
    }

    public void setIscopyfrompad(BigDecimal iscopyfrompad) {
        this.iscopyfrompad = iscopyfrompad;
    }

    public BigDecimal getIscopyfromcenter() {
        return iscopyfromcenter;
    }

    public void setIscopyfromcenter(BigDecimal iscopyfromcenter) {
        this.iscopyfromcenter = iscopyfromcenter;
    }

    public LocalDateTime getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(LocalDateTime lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getYnDealed() {
        return ynDealed;
    }

    public void setYnDealed(String ynDealed) {
        this.ynDealed = ynDealed;
    }

    public String getDealedCode() {
        return dealedCode;
    }

    public void setDealedCode(String dealedCode) {
        this.dealedCode = dealedCode;
    }

    public LocalDateTime getDealedDate() {
        return dealedDate;
    }

    public void setDealedDate(LocalDateTime dealedDate) {
        this.dealedDate = dealedDate;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "Tpatient{" +
        "missionCode=" + missionCode +
        ", branchName=" + branchName +
        ", callTime=" + callTime +
        ", orderTime=" + orderTime +
        ", departTime=" + departTime +
        ", arriveTime=" + arriveTime +
        ", leaveTime=" + leaveTime +
        ", reachTime=" + reachTime +
        ", completeTime=" + completeTime +
        ", sceneAddress=" + sceneAddress +
        ", callNumber=" + callNumber +
        ", contactNumber=" + contactNumber +
        ", patientName=" + patientName +
        ", sex=" + sex +
        ", age=" + age +
        ", nationality=" + nationality +
        ", marriage=" + marriage +
        ", occupation=" + occupation +
        ", deliveryAddress=" + deliveryAddress +
        ", idcardno=" + idcardno +
        ", chiefComplaint=" + chiefComplaint +
        ", hpi=" + hpi +
        ", apoplexy=" + apoplexy +
        ", face=" + face +
        ", upperLimb=" + upperLimb +
        ", speech=" + speech +
        ", heartDisease=" + heartDisease +
        ", typeOfHeartDisease=" + typeOfHeartDisease +
        ", hypertension=" + hypertension +
        ", hypertensionHistory=" + hypertensionHistory +
        ", hypertensionHistoryUnit=" + hypertensionHistoryUnit +
        ", diabetes=" + diabetes +
        ", diabetesHistory=" + diabetesHistory +
        ", diabetesHistoryUnit=" + diabetesHistoryUnit +
        ", bp1=" + bp1 +
        ", bp2=" + bp2 +
        ", p=" + p +
        ", r=" + r +
        ", hr=" + hr +
        ", t=" + t +
        ", electrocardiogram=" + electrocardiogram +
        ", bloodSugar=" + bloodSugar +
        ", bloodSugarTime=" + bloodSugarTime +
        ", bloodOxygenSaturation=" + bloodOxygenSaturation +
        ", bloodOxygenTime=" + bloodOxygenTime +
        ", hemoglobin=" + hemoglobin +
        ", hemoglobinTime=" + hemoglobinTime +
        ", iscopyfrompad=" + iscopyfrompad +
        ", iscopyfromcenter=" + iscopyfromcenter +
        ", lastupdatetime=" + lastupdatetime +
        ", ynDealed=" + ynDealed +
        ", dealedCode=" + dealedCode +
        ", dealedDate=" + dealedDate +
        ", cardNo=" + cardNo +
        "}";
    }
}
