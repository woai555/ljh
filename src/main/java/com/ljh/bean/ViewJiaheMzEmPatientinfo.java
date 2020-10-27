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
public class ViewJiaheMzEmPatientinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String emergencyNo;

    private String outpId;

    private LocalDateTime regDate;

    private String observationDept;

    private String roomCode;

    private String bedNo;

    private String status;

    private String applyOper;

    private LocalDateTime applyDate;

    private String doctorName;

    private LocalDateTime beginTime;

    private String outOper;

    private BigDecimal outType;

    private LocalDateTime endTime;

    private String invalidCode;

    private LocalDateTime invalidDate;

    private String seeNo;

    private String bedInfo;


    public String getEmergencyNo() {
        return emergencyNo;
    }

    public void setEmergencyNo(String emergencyNo) {
        this.emergencyNo = emergencyNo;
    }

    public String getOutpId() {
        return outpId;
    }

    public void setOutpId(String outpId) {
        this.outpId = outpId;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getObservationDept() {
        return observationDept;
    }

    public void setObservationDept(String observationDept) {
        this.observationDept = observationDept;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApplyOper() {
        return applyOper;
    }

    public void setApplyOper(String applyOper) {
        this.applyOper = applyOper;
    }

    public LocalDateTime getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(LocalDateTime applyDate) {
        this.applyDate = applyDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public String getOutOper() {
        return outOper;
    }

    public void setOutOper(String outOper) {
        this.outOper = outOper;
    }

    public BigDecimal getOutType() {
        return outType;
    }

    public void setOutType(BigDecimal outType) {
        this.outType = outType;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getInvalidCode() {
        return invalidCode;
    }

    public void setInvalidCode(String invalidCode) {
        this.invalidCode = invalidCode;
    }

    public LocalDateTime getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(LocalDateTime invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzEmPatientinfo{" +
        "emergencyNo=" + emergencyNo +
        ", outpId=" + outpId +
        ", regDate=" + regDate +
        ", observationDept=" + observationDept +
        ", roomCode=" + roomCode +
        ", bedNo=" + bedNo +
        ", status=" + status +
        ", applyOper=" + applyOper +
        ", applyDate=" + applyDate +
        ", doctorName=" + doctorName +
        ", beginTime=" + beginTime +
        ", outOper=" + outOper +
        ", outType=" + outType +
        ", endTime=" + endTime +
        ", invalidCode=" + invalidCode +
        ", invalidDate=" + invalidDate +
        ", seeNo=" + seeNo +
        ", bedInfo=" + bedInfo +
        "}";
    }
}
