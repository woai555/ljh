package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class SmsHqlisDetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 危急值序列号
     */
    @TableId(value = "IPM_SQN", type = IdType.AUTO)
    private BigDecimal ipmSqn;

    /**
     * 床号
     */
    private String bedno;

    /**
     * 病案号
     */
    private String patientid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 科室名称
     */
    private String roomname;

    /**
     * 危急值信息
     */
    private String contect;

    /**
     * 科室ID
     */
    private String roomid;

    /**
     * 发送时间
     */
    private LocalDateTime sendtime;

    /**
     * 护士是否处理 1是 0否
     */
    private BigDecimal ynNurse;

    /**
     * 处理护士ID
     */
    private String nurseid;

    /**
     * 被护士指定的处理医生ID
     */
    private String nurseToDoctor;

    /**
     * 医生是否已收到提示 1是 0否
     */
    private BigDecimal ynDoctorSee;

    /**
     * 收到提示医生ID
     */
    private String doctoridSee;

    /**
     * 提示医生时间
     */
    private LocalDateTime doctorSeeTime;

    /**
     * 医生是否已处理 1是 0否
     */
    private BigDecimal ynDoctorDeal;

    /**
     * 处理医生ID
     */
    private String doctoridDeal;

    /**
     * 医生处理时间
     */
    private LocalDateTime doctorDealTime;

    /**
     * 病案流水号
     */
    private String inpatientno;

    /**
     * 最近一次护士处理时间
     */
    private LocalDateTime nurseTime;

    /**
     * LIS信息
     */
    private BigDecimal ndate;

    /**
     * LIS信息
     */
    private BigDecimal specimenno;

    /**
     * LIS信息
     */
    private BigDecimal testindex;

    /**
     * 医嘱号
     */
    private String moOrder;

    /**
     * 处理方式
     */
    private String processMode;

    /**
     * 首次处理护士ID
     */
    private String firstNurseid;

    /**
     * 护士首次处理时间
     */
    private LocalDateTime firstNurseTime;

    /**
     * 被护士指定的处理医生姓名
     */
    private String nurseToDocname;

    /**
     * 推送科室
     */
    private String smsType;

    /**
     * 服务器时间
     */
    private LocalDateTime realTime;


    public BigDecimal getIpmSqn() {
        return ipmSqn;
    }

    public void setIpmSqn(BigDecimal ipmSqn) {
        this.ipmSqn = ipmSqn;
    }

    public String getBedno() {
        return bedno;
    }

    public void setBedno(String bedno) {
        this.bedno = bedno;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getContect() {
        return contect;
    }

    public void setContect(String contect) {
        this.contect = contect;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public LocalDateTime getSendtime() {
        return sendtime;
    }

    public void setSendtime(LocalDateTime sendtime) {
        this.sendtime = sendtime;
    }

    public BigDecimal getYnNurse() {
        return ynNurse;
    }

    public void setYnNurse(BigDecimal ynNurse) {
        this.ynNurse = ynNurse;
    }

    public String getNurseid() {
        return nurseid;
    }

    public void setNurseid(String nurseid) {
        this.nurseid = nurseid;
    }

    public String getNurseToDoctor() {
        return nurseToDoctor;
    }

    public void setNurseToDoctor(String nurseToDoctor) {
        this.nurseToDoctor = nurseToDoctor;
    }

    public BigDecimal getYnDoctorSee() {
        return ynDoctorSee;
    }

    public void setYnDoctorSee(BigDecimal ynDoctorSee) {
        this.ynDoctorSee = ynDoctorSee;
    }

    public String getDoctoridSee() {
        return doctoridSee;
    }

    public void setDoctoridSee(String doctoridSee) {
        this.doctoridSee = doctoridSee;
    }

    public LocalDateTime getDoctorSeeTime() {
        return doctorSeeTime;
    }

    public void setDoctorSeeTime(LocalDateTime doctorSeeTime) {
        this.doctorSeeTime = doctorSeeTime;
    }

    public BigDecimal getYnDoctorDeal() {
        return ynDoctorDeal;
    }

    public void setYnDoctorDeal(BigDecimal ynDoctorDeal) {
        this.ynDoctorDeal = ynDoctorDeal;
    }

    public String getDoctoridDeal() {
        return doctoridDeal;
    }

    public void setDoctoridDeal(String doctoridDeal) {
        this.doctoridDeal = doctoridDeal;
    }

    public LocalDateTime getDoctorDealTime() {
        return doctorDealTime;
    }

    public void setDoctorDealTime(LocalDateTime doctorDealTime) {
        this.doctorDealTime = doctorDealTime;
    }

    public String getInpatientno() {
        return inpatientno;
    }

    public void setInpatientno(String inpatientno) {
        this.inpatientno = inpatientno;
    }

    public LocalDateTime getNurseTime() {
        return nurseTime;
    }

    public void setNurseTime(LocalDateTime nurseTime) {
        this.nurseTime = nurseTime;
    }

    public BigDecimal getNdate() {
        return ndate;
    }

    public void setNdate(BigDecimal ndate) {
        this.ndate = ndate;
    }

    public BigDecimal getSpecimenno() {
        return specimenno;
    }

    public void setSpecimenno(BigDecimal specimenno) {
        this.specimenno = specimenno;
    }

    public BigDecimal getTestindex() {
        return testindex;
    }

    public void setTestindex(BigDecimal testindex) {
        this.testindex = testindex;
    }

    public String getMoOrder() {
        return moOrder;
    }

    public void setMoOrder(String moOrder) {
        this.moOrder = moOrder;
    }

    public String getProcessMode() {
        return processMode;
    }

    public void setProcessMode(String processMode) {
        this.processMode = processMode;
    }

    public String getFirstNurseid() {
        return firstNurseid;
    }

    public void setFirstNurseid(String firstNurseid) {
        this.firstNurseid = firstNurseid;
    }

    public LocalDateTime getFirstNurseTime() {
        return firstNurseTime;
    }

    public void setFirstNurseTime(LocalDateTime firstNurseTime) {
        this.firstNurseTime = firstNurseTime;
    }

    public String getNurseToDocname() {
        return nurseToDocname;
    }

    public void setNurseToDocname(String nurseToDocname) {
        this.nurseToDocname = nurseToDocname;
    }

    public String getSmsType() {
        return smsType;
    }

    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    public LocalDateTime getRealTime() {
        return realTime;
    }

    public void setRealTime(LocalDateTime realTime) {
        this.realTime = realTime;
    }

    @Override
    public String toString() {
        return "SmsHqlisDetail{" +
        "ipmSqn=" + ipmSqn +
        ", bedno=" + bedno +
        ", patientid=" + patientid +
        ", name=" + name +
        ", roomname=" + roomname +
        ", contect=" + contect +
        ", roomid=" + roomid +
        ", sendtime=" + sendtime +
        ", ynNurse=" + ynNurse +
        ", nurseid=" + nurseid +
        ", nurseToDoctor=" + nurseToDoctor +
        ", ynDoctorSee=" + ynDoctorSee +
        ", doctoridSee=" + doctoridSee +
        ", doctorSeeTime=" + doctorSeeTime +
        ", ynDoctorDeal=" + ynDoctorDeal +
        ", doctoridDeal=" + doctoridDeal +
        ", doctorDealTime=" + doctorDealTime +
        ", inpatientno=" + inpatientno +
        ", nurseTime=" + nurseTime +
        ", ndate=" + ndate +
        ", specimenno=" + specimenno +
        ", testindex=" + testindex +
        ", moOrder=" + moOrder +
        ", processMode=" + processMode +
        ", firstNurseid=" + firstNurseid +
        ", firstNurseTime=" + firstNurseTime +
        ", nurseToDocname=" + nurseToDocname +
        ", smsType=" + smsType +
        ", realTime=" + realTime +
        "}";
    }
}
