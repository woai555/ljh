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
public class VJhEmpatient implements Serializable {

    private static final long serialVersionUID=1L;

    private String emergencyNo;

    private String cardNo;

    private LocalDateTime regDate;

    private String deptCode;

    private String roomCode;

    private String bedNo;

    private String status;

    private String applyOper;

    private LocalDateTime applyDate;

    private String inOper;

    private LocalDateTime inDate;

    private String outOper;

    private BigDecimal outType;

    private LocalDateTime outDate;

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

    public String getInOper() {
        return inOper;
    }

    public void setInOper(String inOper) {
        this.inOper = inOper;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
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

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
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
        return "VJhEmpatient{" +
        "emergencyNo=" + emergencyNo +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", deptCode=" + deptCode +
        ", roomCode=" + roomCode +
        ", bedNo=" + bedNo +
        ", status=" + status +
        ", applyOper=" + applyOper +
        ", applyDate=" + applyDate +
        ", inOper=" + inOper +
        ", inDate=" + inDate +
        ", outOper=" + outOper +
        ", outType=" + outType +
        ", outDate=" + outDate +
        ", invalidCode=" + invalidCode +
        ", invalidDate=" + invalidDate +
        ", seeNo=" + seeNo +
        ", bedInfo=" + bedInfo +
        "}";
    }
}
