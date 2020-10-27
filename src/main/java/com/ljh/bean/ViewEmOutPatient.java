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
public class ViewEmOutPatient implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private Integer visitId;

    private String deptAdmissionTo;

    private LocalDateTime admissionDateTime;

    private LocalDateTime dischargeDateTime;

    private String chargeType;

    private String job;

    private String totalCosts;

    private String totalPayments;

    private String emergencyNo;

    private String seeNo;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    public String getDeptAdmissionTo() {
        return deptAdmissionTo;
    }

    public void setDeptAdmissionTo(String deptAdmissionTo) {
        this.deptAdmissionTo = deptAdmissionTo;
    }

    public LocalDateTime getAdmissionDateTime() {
        return admissionDateTime;
    }

    public void setAdmissionDateTime(LocalDateTime admissionDateTime) {
        this.admissionDateTime = admissionDateTime;
    }

    public LocalDateTime getDischargeDateTime() {
        return dischargeDateTime;
    }

    public void setDischargeDateTime(LocalDateTime dischargeDateTime) {
        this.dischargeDateTime = dischargeDateTime;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(String totalCosts) {
        this.totalCosts = totalCosts;
    }

    public String getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(String totalPayments) {
        this.totalPayments = totalPayments;
    }

    public String getEmergencyNo() {
        return emergencyNo;
    }

    public void setEmergencyNo(String emergencyNo) {
        this.emergencyNo = emergencyNo;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    @Override
    public String toString() {
        return "ViewEmOutPatient{" +
        "patientId=" + patientId +
        ", visitId=" + visitId +
        ", deptAdmissionTo=" + deptAdmissionTo +
        ", admissionDateTime=" + admissionDateTime +
        ", dischargeDateTime=" + dischargeDateTime +
        ", chargeType=" + chargeType +
        ", job=" + job +
        ", totalCosts=" + totalCosts +
        ", totalPayments=" + totalPayments +
        ", emergencyNo=" + emergencyNo +
        ", seeNo=" + seeNo +
        "}";
    }
}
