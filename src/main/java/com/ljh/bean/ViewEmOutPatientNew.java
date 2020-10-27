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
public class ViewEmOutPatientNew implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private BigDecimal visitId;

    private String inpNo;

    private String deptAdmissionTo;

    private LocalDateTime seeDate;

    private LocalDateTime admissionDateTime;

    private LocalDateTime dischargeDateTime;

    private BigDecimal ishlflag;

    private String state;

    private String stateTo;

    private String occupation;

    private String maritalStatus;

    private String armedServices;

    private String duty;

    private String workingStatus;

    private String insuranceType;

    private String insuranceNo;

    private String serviceAgency;

    private String hkzipCode;

    private String userPwd;

    private String bedno;

    private String opercode;

    private String opername;

    private String operdeptcode;

    private String operdeptname;

    private String patientNo;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public BigDecimal getVisitId() {
        return visitId;
    }

    public void setVisitId(BigDecimal visitId) {
        this.visitId = visitId;
    }

    public String getInpNo() {
        return inpNo;
    }

    public void setInpNo(String inpNo) {
        this.inpNo = inpNo;
    }

    public String getDeptAdmissionTo() {
        return deptAdmissionTo;
    }

    public void setDeptAdmissionTo(String deptAdmissionTo) {
        this.deptAdmissionTo = deptAdmissionTo;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
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

    public BigDecimal getIshlflag() {
        return ishlflag;
    }

    public void setIshlflag(BigDecimal ishlflag) {
        this.ishlflag = ishlflag;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateTo() {
        return stateTo;
    }

    public void setStateTo(String stateTo) {
        this.stateTo = stateTo;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getArmedServices() {
        return armedServices;
    }

    public void setArmedServices(String armedServices) {
        this.armedServices = armedServices;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getWorkingStatus() {
        return workingStatus;
    }

    public void setWorkingStatus(String workingStatus) {
        this.workingStatus = workingStatus;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public String getServiceAgency() {
        return serviceAgency;
    }

    public void setServiceAgency(String serviceAgency) {
        this.serviceAgency = serviceAgency;
    }

    public String getHkzipCode() {
        return hkzipCode;
    }

    public void setHkzipCode(String hkzipCode) {
        this.hkzipCode = hkzipCode;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getBedno() {
        return bedno;
    }

    public void setBedno(String bedno) {
        this.bedno = bedno;
    }

    public String getOpercode() {
        return opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    public String getOpername() {
        return opername;
    }

    public void setOpername(String opername) {
        this.opername = opername;
    }

    public String getOperdeptcode() {
        return operdeptcode;
    }

    public void setOperdeptcode(String operdeptcode) {
        this.operdeptcode = operdeptcode;
    }

    public String getOperdeptname() {
        return operdeptname;
    }

    public void setOperdeptname(String operdeptname) {
        this.operdeptname = operdeptname;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    @Override
    public String toString() {
        return "ViewEmOutPatientNew{" +
        "patientId=" + patientId +
        ", visitId=" + visitId +
        ", inpNo=" + inpNo +
        ", deptAdmissionTo=" + deptAdmissionTo +
        ", seeDate=" + seeDate +
        ", admissionDateTime=" + admissionDateTime +
        ", dischargeDateTime=" + dischargeDateTime +
        ", ishlflag=" + ishlflag +
        ", state=" + state +
        ", stateTo=" + stateTo +
        ", occupation=" + occupation +
        ", maritalStatus=" + maritalStatus +
        ", armedServices=" + armedServices +
        ", duty=" + duty +
        ", workingStatus=" + workingStatus +
        ", insuranceType=" + insuranceType +
        ", insuranceNo=" + insuranceNo +
        ", serviceAgency=" + serviceAgency +
        ", hkzipCode=" + hkzipCode +
        ", userPwd=" + userPwd +
        ", bedno=" + bedno +
        ", opercode=" + opercode +
        ", opername=" + opername +
        ", operdeptcode=" + operdeptcode +
        ", operdeptname=" + operdeptname +
        ", patientNo=" + patientNo +
        "}";
    }
}
