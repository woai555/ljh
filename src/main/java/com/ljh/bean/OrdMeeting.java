package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 会诊预约信息
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdMeeting implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 患者卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 挂号时间
     */
    private LocalDateTime regDate;

    /**
     * 挂号科室
     */
    private String deptCode;

    /**
     * 诊断
     */
    private String diagnose;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态:0预约确认,1已经挂号,2预约申请,3取消,4退号
     */
    private String flag;

    /**
     * 申请人
     */
    private String applyCode;

    /**
     * 申请时间
     */
    private LocalDateTime applyDate;

    /**
     * 会诊时间
     */
    private LocalDateTime meetingDate;

    /**
     * 专家
     */
    private String export;

    /**
     * 申请会诊时间
     */
    private LocalDateTime seeDate;

    /**
     * 星期
     */
    private String week;

    /**
     * 午别
     */
    private String noonCode;

    /**
     * 专家组号
     */
    private String regNo;

    /**
     * 会诊资料
     */
    private String meetingInfo;

    /**
     * 联系电话
     */
    private String linkTel;

    /**
     * 体温
     */
    private BigDecimal temperature;

    /**
     * 血压
     */
    private String bloodpressure;

    /**
     * 脉搏
     */
    private BigDecimal pulse;

    /**
     *  护士
     */
    private String nurseNo;

    /**
     * mac地址
     */
    private String mac;

    private String orderId;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public LocalDateTime getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(LocalDateTime applyDate) {
        this.applyDate = applyDate;
    }

    public LocalDateTime getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDateTime meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getMeetingInfo() {
        return meetingInfo;
    }

    public void setMeetingInfo(String meetingInfo) {
        this.meetingInfo = meetingInfo;
    }

    public String getLinkTel() {
        return linkTel;
    }

    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public BigDecimal getPulse() {
        return pulse;
    }

    public void setPulse(BigDecimal pulse) {
        this.pulse = pulse;
    }

    public String getNurseNo() {
        return nurseNo;
    }

    public void setNurseNo(String nurseNo) {
        this.nurseNo = nurseNo;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrdMeeting{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", deptCode=" + deptCode +
        ", diagnose=" + diagnose +
        ", remark=" + remark +
        ", flag=" + flag +
        ", applyCode=" + applyCode +
        ", applyDate=" + applyDate +
        ", meetingDate=" + meetingDate +
        ", export=" + export +
        ", seeDate=" + seeDate +
        ", week=" + week +
        ", noonCode=" + noonCode +
        ", regNo=" + regNo +
        ", meetingInfo=" + meetingInfo +
        ", linkTel=" + linkTel +
        ", temperature=" + temperature +
        ", bloodpressure=" + bloodpressure +
        ", pulse=" + pulse +
        ", nurseNo=" + nurseNo +
        ", mac=" + mac +
        ", orderId=" + orderId +
        "}";
    }
}
