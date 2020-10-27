package com.ljh.bean;

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
public class ViewHzyhCfxx2 implements Serializable {

    private static final long serialVersionUID=1L;

    private String rxCode;

    private String patientId;

    private String visitId;

    private String rcptCode;

    private String doctorCode;

    private String doctorName;

    private String deptCode;

    private String deptName;

    private LocalDateTime rxTime;

    private String rxType;

    private String diagnosis;

    private String status;

    private String remark;


    public String getRxCode() {
        return rxCode;
    }

    public void setRxCode(String rxCode) {
        this.rxCode = rxCode;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getRcptCode() {
        return rcptCode;
    }

    public void setRcptCode(String rcptCode) {
        this.rcptCode = rcptCode;
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

    public LocalDateTime getRxTime() {
        return rxTime;
    }

    public void setRxTime(LocalDateTime rxTime) {
        this.rxTime = rxTime;
    }

    public String getRxType() {
        return rxType;
    }

    public void setRxType(String rxType) {
        this.rxType = rxType;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ViewHzyhCfxx2{" +
        "rxCode=" + rxCode +
        ", patientId=" + patientId +
        ", visitId=" + visitId +
        ", rcptCode=" + rcptCode +
        ", doctorCode=" + doctorCode +
        ", doctorName=" + doctorName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", rxTime=" + rxTime +
        ", rxType=" + rxType +
        ", diagnosis=" + diagnosis +
        ", status=" + status +
        ", remark=" + remark +
        "}";
    }
}
