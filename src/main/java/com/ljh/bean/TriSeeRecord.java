package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊患者看诊记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class TriSeeRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 患者就诊卡号
     */
    private String cardNo;

    /**
     * 患者挂号时间
     */
    private LocalDateTime regDate;

    /**
     * 看诊流水号
     */
    @TableId(value = "SEE_SEQUENCE", type = IdType.AUTO)
    private BigDecimal seeSequence;

    /**
     * 看诊序号
     */
    private BigDecimal seeNo;

    /**
     * 看诊状态
     */
    private String seeKind;

    /**
     * 看诊日期
     */
    private LocalDateTime seeDate;

    /**
     * 是否预约
     */
    private String ynbook;

    /**
     * 分诊科室
     */
    private String triageCode;

    /**
     * 看诊科室
     */
    private String deptCode;

    /**
     * 队列类别
     */
    private String queueCode;

    /**
     * 看诊诊室
     */
    private String roomCode;

    /**
     * 看诊医师
     */
    private String doctCode;

    /**
     * 分诊时间
     */
    private LocalDateTime triageDate;

    /**
     * 进诊时间
     */
    private LocalDateTime inDate;

    /**
     * 诊出时间
     */
    private LocalDateTime outDate;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 门诊号
     */
    private String clinicCode;


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

    public BigDecimal getSeeSequence() {
        return seeSequence;
    }

    public void setSeeSequence(BigDecimal seeSequence) {
        this.seeSequence = seeSequence;
    }

    public BigDecimal getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(BigDecimal seeNo) {
        this.seeNo = seeNo;
    }

    public String getSeeKind() {
        return seeKind;
    }

    public void setSeeKind(String seeKind) {
        this.seeKind = seeKind;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getYnbook() {
        return ynbook;
    }

    public void setYnbook(String ynbook) {
        this.ynbook = ynbook;
    }

    public String getTriageCode() {
        return triageCode;
    }

    public void setTriageCode(String triageCode) {
        this.triageCode = triageCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getQueueCode() {
        return queueCode;
    }

    public void setQueueCode(String queueCode) {
        this.queueCode = queueCode;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public LocalDateTime getTriageDate() {
        return triageDate;
    }

    public void setTriageDate(LocalDateTime triageDate) {
        this.triageDate = triageDate;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
    }

    @Override
    public String toString() {
        return "TriSeeRecord{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", seeSequence=" + seeSequence +
        ", seeNo=" + seeNo +
        ", seeKind=" + seeKind +
        ", seeDate=" + seeDate +
        ", ynbook=" + ynbook +
        ", triageCode=" + triageCode +
        ", deptCode=" + deptCode +
        ", queueCode=" + queueCode +
        ", roomCode=" + roomCode +
        ", doctCode=" + doctCode +
        ", triageDate=" + triageDate +
        ", inDate=" + inDate +
        ", outDate=" + outDate +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", clinicCode=" + clinicCode +
        "}";
    }
}
