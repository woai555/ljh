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
public class ViewMovenurseEmInHospital implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String visitId;

    private String name;

    private String wardCode;

    private String deptCode;

    private String bedNo;

    private LocalDateTime admissionDateTime;

    private LocalDateTime admWardDateTime;

    private String diagnosis;

    private String patientCondition;

    private String nursingClass;

    private String doctorInCharge;

    private String prepayments;

    private String totalCharges;

    private String canDo;

    private String attend;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public LocalDateTime getAdmissionDateTime() {
        return admissionDateTime;
    }

    public void setAdmissionDateTime(LocalDateTime admissionDateTime) {
        this.admissionDateTime = admissionDateTime;
    }

    public LocalDateTime getAdmWardDateTime() {
        return admWardDateTime;
    }

    public void setAdmWardDateTime(LocalDateTime admWardDateTime) {
        this.admWardDateTime = admWardDateTime;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPatientCondition() {
        return patientCondition;
    }

    public void setPatientCondition(String patientCondition) {
        this.patientCondition = patientCondition;
    }

    public String getNursingClass() {
        return nursingClass;
    }

    public void setNursingClass(String nursingClass) {
        this.nursingClass = nursingClass;
    }

    public String getDoctorInCharge() {
        return doctorInCharge;
    }

    public void setDoctorInCharge(String doctorInCharge) {
        this.doctorInCharge = doctorInCharge;
    }

    public String getPrepayments() {
        return prepayments;
    }

    public void setPrepayments(String prepayments) {
        this.prepayments = prepayments;
    }

    public String getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(String totalCharges) {
        this.totalCharges = totalCharges;
    }

    public String getCanDo() {
        return canDo;
    }

    public void setCanDo(String canDo) {
        this.canDo = canDo;
    }

    public String getAttend() {
        return attend;
    }

    public void setAttend(String attend) {
        this.attend = attend;
    }

    @Override
    public String toString() {
        return "ViewMovenurseEmInHospital{" +
        "patientId=" + patientId +
        ", visitId=" + visitId +
        ", name=" + name +
        ", wardCode=" + wardCode +
        ", deptCode=" + deptCode +
        ", bedNo=" + bedNo +
        ", admissionDateTime=" + admissionDateTime +
        ", admWardDateTime=" + admWardDateTime +
        ", diagnosis=" + diagnosis +
        ", patientCondition=" + patientCondition +
        ", nursingClass=" + nursingClass +
        ", doctorInCharge=" + doctorInCharge +
        ", prepayments=" + prepayments +
        ", totalCharges=" + totalCharges +
        ", canDo=" + canDo +
        ", attend=" + attend +
        "}";
    }
}
