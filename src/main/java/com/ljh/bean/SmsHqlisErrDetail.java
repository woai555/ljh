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
public class SmsHqlisErrDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "IPM_SQN", type = IdType.AUTO)
    private BigDecimal ipmSqn;

    private String bedno;

    private String patientid;

    private String name;

    private String roomname;

    private String contect;

    private BigDecimal roomid;

    private LocalDateTime sendtime;

    /**
     * 是否点击已知 1是 0否
     */
    private BigDecimal ynNurse;

    /**
     * 点击已知护士
     */
    private BigDecimal nurseid;

    private String inpatientno;

    /**
     * 点击已知时间
     */
    private LocalDateTime nurseTime;

    private BigDecimal ndate;

    private BigDecimal specimenno;

    private BigDecimal testindex;

    /**
     * 第一次阅读护士
     */
    private BigDecimal firstNurseid;

    /**
     * 第一次阅读时间
     */
    private LocalDateTime firstNurseTime;

    /**
     * 处理方式
     */
    private String handleRemark;


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

    public BigDecimal getRoomid() {
        return roomid;
    }

    public void setRoomid(BigDecimal roomid) {
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

    public BigDecimal getNurseid() {
        return nurseid;
    }

    public void setNurseid(BigDecimal nurseid) {
        this.nurseid = nurseid;
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

    public BigDecimal getFirstNurseid() {
        return firstNurseid;
    }

    public void setFirstNurseid(BigDecimal firstNurseid) {
        this.firstNurseid = firstNurseid;
    }

    public LocalDateTime getFirstNurseTime() {
        return firstNurseTime;
    }

    public void setFirstNurseTime(LocalDateTime firstNurseTime) {
        this.firstNurseTime = firstNurseTime;
    }

    public String getHandleRemark() {
        return handleRemark;
    }

    public void setHandleRemark(String handleRemark) {
        this.handleRemark = handleRemark;
    }

    @Override
    public String toString() {
        return "SmsHqlisErrDetail{" +
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
        ", inpatientno=" + inpatientno +
        ", nurseTime=" + nurseTime +
        ", ndate=" + ndate +
        ", specimenno=" + specimenno +
        ", testindex=" + testindex +
        ", firstNurseid=" + firstNurseid +
        ", firstNurseTime=" + firstNurseTime +
        ", handleRemark=" + handleRemark +
        "}";
    }
}
