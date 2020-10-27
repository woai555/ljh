package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
public class JytRobinPatients implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientName;

    private String hisRegNo;

    private String cardNo;

    private String cardType;

    private Integer indexNo;

    private Integer status;

    private String triage;

    private String waitingRoom;

    private String treatRoom;

    private BigDecimal treatRoomCode;

    private String doctorCode;

    private String treatTime;

    private String queueType;

    private String deptCode;


    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getHisRegNo() {
        return hisRegNo;
    }

    public void setHisRegNo(String hisRegNo) {
        this.hisRegNo = hisRegNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTriage() {
        return triage;
    }

    public void setTriage(String triage) {
        this.triage = triage;
    }

    public String getWaitingRoom() {
        return waitingRoom;
    }

    public void setWaitingRoom(String waitingRoom) {
        this.waitingRoom = waitingRoom;
    }

    public String getTreatRoom() {
        return treatRoom;
    }

    public void setTreatRoom(String treatRoom) {
        this.treatRoom = treatRoom;
    }

    public BigDecimal getTreatRoomCode() {
        return treatRoomCode;
    }

    public void setTreatRoomCode(BigDecimal treatRoomCode) {
        this.treatRoomCode = treatRoomCode;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getTreatTime() {
        return treatTime;
    }

    public void setTreatTime(String treatTime) {
        this.treatTime = treatTime;
    }

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Override
    public String toString() {
        return "JytRobinPatients{" +
        "patientName=" + patientName +
        ", hisRegNo=" + hisRegNo +
        ", cardNo=" + cardNo +
        ", cardType=" + cardType +
        ", indexNo=" + indexNo +
        ", status=" + status +
        ", triage=" + triage +
        ", waitingRoom=" + waitingRoom +
        ", treatRoom=" + treatRoom +
        ", treatRoomCode=" + treatRoomCode +
        ", doctorCode=" + doctorCode +
        ", treatTime=" + treatTime +
        ", queueType=" + queueType +
        ", deptCode=" + deptCode +
        "}";
    }
}
