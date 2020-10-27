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
public class ViewPatientRegistration implements Serializable {

    private static final long serialVersionUID=1L;

    private String regId;

    private String treatCardNo;

    private String jytCardNo;

    private String patCode;

    private String patName;

    private String patSex;

    private String doctorCode;

    private String doctorName;

    private String deptCode;

    private String deptName;

    private String profCode;

    private String profName;

    private String regType;

    private String regGrade;

    private BigDecimal regFee;

    private Integer regSeqNo;

    private LocalDateTime regTime;

    private String status;

    private String noonFlag;

    private String withdrawFlag;


    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getTreatCardNo() {
        return treatCardNo;
    }

    public void setTreatCardNo(String treatCardNo) {
        this.treatCardNo = treatCardNo;
    }

    public String getJytCardNo() {
        return jytCardNo;
    }

    public void setJytCardNo(String jytCardNo) {
        this.jytCardNo = jytCardNo;
    }

    public String getPatCode() {
        return patCode;
    }

    public void setPatCode(String patCode) {
        this.patCode = patCode;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getPatSex() {
        return patSex;
    }

    public void setPatSex(String patSex) {
        this.patSex = patSex;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getRegGrade() {
        return regGrade;
    }

    public void setRegGrade(String regGrade) {
        this.regGrade = regGrade;
    }

    public BigDecimal getRegFee() {
        return regFee;
    }

    public void setRegFee(BigDecimal regFee) {
        this.regFee = regFee;
    }

    public Integer getRegSeqNo() {
        return regSeqNo;
    }

    public void setRegSeqNo(Integer regSeqNo) {
        this.regSeqNo = regSeqNo;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public void setRegTime(LocalDateTime regTime) {
        this.regTime = regTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNoonFlag() {
        return noonFlag;
    }

    public void setNoonFlag(String noonFlag) {
        this.noonFlag = noonFlag;
    }

    public String getWithdrawFlag() {
        return withdrawFlag;
    }

    public void setWithdrawFlag(String withdrawFlag) {
        this.withdrawFlag = withdrawFlag;
    }

    @Override
    public String toString() {
        return "ViewPatientRegistration{" +
        "regId=" + regId +
        ", treatCardNo=" + treatCardNo +
        ", jytCardNo=" + jytCardNo +
        ", patCode=" + patCode +
        ", patName=" + patName +
        ", patSex=" + patSex +
        ", doctorCode=" + doctorCode +
        ", doctorName=" + doctorName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", profCode=" + profCode +
        ", profName=" + profName +
        ", regType=" + regType +
        ", regGrade=" + regGrade +
        ", regFee=" + regFee +
        ", regSeqNo=" + regSeqNo +
        ", regTime=" + regTime +
        ", status=" + status +
        ", noonFlag=" + noonFlag +
        ", withdrawFlag=" + withdrawFlag +
        "}";
    }
}
