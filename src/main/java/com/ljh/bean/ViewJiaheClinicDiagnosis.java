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
public class ViewJiaheClinicDiagnosis implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String visitId;

    private String inpNo;

    private BigDecimal diagnosisNo;

    private BigDecimal diagnosisSubNo;

    private String diagnosisName;

    private String diagnosisCode;

    private String isMain;

    private String hospitalNo;

    private String synchTimeStamp;


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

    public String getInpNo() {
        return inpNo;
    }

    public void setInpNo(String inpNo) {
        this.inpNo = inpNo;
    }

    public BigDecimal getDiagnosisNo() {
        return diagnosisNo;
    }

    public void setDiagnosisNo(BigDecimal diagnosisNo) {
        this.diagnosisNo = diagnosisNo;
    }

    public BigDecimal getDiagnosisSubNo() {
        return diagnosisSubNo;
    }

    public void setDiagnosisSubNo(BigDecimal diagnosisSubNo) {
        this.diagnosisSubNo = diagnosisSubNo;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public String getIsMain() {
        return isMain;
    }

    public void setIsMain(String isMain) {
        this.isMain = isMain;
    }

    public String getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    public String getSynchTimeStamp() {
        return synchTimeStamp;
    }

    public void setSynchTimeStamp(String synchTimeStamp) {
        this.synchTimeStamp = synchTimeStamp;
    }

    @Override
    public String toString() {
        return "ViewJiaheClinicDiagnosis{" +
        "patientId=" + patientId +
        ", visitId=" + visitId +
        ", inpNo=" + inpNo +
        ", diagnosisNo=" + diagnosisNo +
        ", diagnosisSubNo=" + diagnosisSubNo +
        ", diagnosisName=" + diagnosisName +
        ", diagnosisCode=" + diagnosisCode +
        ", isMain=" + isMain +
        ", hospitalNo=" + hospitalNo +
        ", synchTimeStamp=" + synchTimeStamp +
        "}";
    }
}
