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
public class VAppRegisterYy implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String cardType;

    private String patName;

    private String phone;

    private String idCardNo;

    private String idCardType;

    private String accessPatId;

    private String deptName;

    private String accessRegId;

    private String regStatus;

    private String payStatus;

    private BigDecimal medicalServiceCharge;

    private LocalDateTime orderTime;

    private String payBy;

    private LocalDateTime expectDate;

    private String expectStime;

    private String expectEtime;

    private String expectAddr;

    private BigDecimal regFee;

    private BigDecimal dayType;

    private String docId;

    private String mediLevel;

    private String docVirtualName;

    private String takePassword;

    private String waitAddr;


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

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

    public String getAccessPatId() {
        return accessPatId;
    }

    public void setAccessPatId(String accessPatId) {
        this.accessPatId = accessPatId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getAccessRegId() {
        return accessRegId;
    }

    public void setAccessRegId(String accessRegId) {
        this.accessRegId = accessRegId;
    }

    public String getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public BigDecimal getMedicalServiceCharge() {
        return medicalServiceCharge;
    }

    public void setMedicalServiceCharge(BigDecimal medicalServiceCharge) {
        this.medicalServiceCharge = medicalServiceCharge;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getPayBy() {
        return payBy;
    }

    public void setPayBy(String payBy) {
        this.payBy = payBy;
    }

    public LocalDateTime getExpectDate() {
        return expectDate;
    }

    public void setExpectDate(LocalDateTime expectDate) {
        this.expectDate = expectDate;
    }

    public String getExpectStime() {
        return expectStime;
    }

    public void setExpectStime(String expectStime) {
        this.expectStime = expectStime;
    }

    public String getExpectEtime() {
        return expectEtime;
    }

    public void setExpectEtime(String expectEtime) {
        this.expectEtime = expectEtime;
    }

    public String getExpectAddr() {
        return expectAddr;
    }

    public void setExpectAddr(String expectAddr) {
        this.expectAddr = expectAddr;
    }

    public BigDecimal getRegFee() {
        return regFee;
    }

    public void setRegFee(BigDecimal regFee) {
        this.regFee = regFee;
    }

    public BigDecimal getDayType() {
        return dayType;
    }

    public void setDayType(BigDecimal dayType) {
        this.dayType = dayType;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getMediLevel() {
        return mediLevel;
    }

    public void setMediLevel(String mediLevel) {
        this.mediLevel = mediLevel;
    }

    public String getDocVirtualName() {
        return docVirtualName;
    }

    public void setDocVirtualName(String docVirtualName) {
        this.docVirtualName = docVirtualName;
    }

    public String getTakePassword() {
        return takePassword;
    }

    public void setTakePassword(String takePassword) {
        this.takePassword = takePassword;
    }

    public String getWaitAddr() {
        return waitAddr;
    }

    public void setWaitAddr(String waitAddr) {
        this.waitAddr = waitAddr;
    }

    @Override
    public String toString() {
        return "VAppRegisterYy{" +
        "cardNo=" + cardNo +
        ", cardType=" + cardType +
        ", patName=" + patName +
        ", phone=" + phone +
        ", idCardNo=" + idCardNo +
        ", idCardType=" + idCardType +
        ", accessPatId=" + accessPatId +
        ", deptName=" + deptName +
        ", accessRegId=" + accessRegId +
        ", regStatus=" + regStatus +
        ", payStatus=" + payStatus +
        ", medicalServiceCharge=" + medicalServiceCharge +
        ", orderTime=" + orderTime +
        ", payBy=" + payBy +
        ", expectDate=" + expectDate +
        ", expectStime=" + expectStime +
        ", expectEtime=" + expectEtime +
        ", expectAddr=" + expectAddr +
        ", regFee=" + regFee +
        ", dayType=" + dayType +
        ", docId=" + docId +
        ", mediLevel=" + mediLevel +
        ", docVirtualName=" + docVirtualName +
        ", takePassword=" + takePassword +
        ", waitAddr=" + waitAddr +
        "}";
    }
}
