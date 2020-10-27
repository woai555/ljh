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
public class ViewJiaheClinicDiagnosis2 implements Serializable {

    private static final long serialVersionUID=1L;

    private String diagnosisFlagName;

    private String diagnosisTypeName;

    private BigDecimal diagnosisNum;

    private BigDecimal diagnosisSubNum;

    private String diagnosisName;

    private String diagnosisDesc;

    private String diagnosisCode;

    private LocalDateTime diagnosisTime;

    private BigDecimal diagnosisTypeCode;

    private String patientId;

    private BigDecimal visitId;

    private String fileUniqueId;


    public String getDiagnosisFlagName() {
        return diagnosisFlagName;
    }

    public void setDiagnosisFlagName(String diagnosisFlagName) {
        this.diagnosisFlagName = diagnosisFlagName;
    }

    public String getDiagnosisTypeName() {
        return diagnosisTypeName;
    }

    public void setDiagnosisTypeName(String diagnosisTypeName) {
        this.diagnosisTypeName = diagnosisTypeName;
    }

    public BigDecimal getDiagnosisNum() {
        return diagnosisNum;
    }

    public void setDiagnosisNum(BigDecimal diagnosisNum) {
        this.diagnosisNum = diagnosisNum;
    }

    public BigDecimal getDiagnosisSubNum() {
        return diagnosisSubNum;
    }

    public void setDiagnosisSubNum(BigDecimal diagnosisSubNum) {
        this.diagnosisSubNum = diagnosisSubNum;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public String getDiagnosisDesc() {
        return diagnosisDesc;
    }

    public void setDiagnosisDesc(String diagnosisDesc) {
        this.diagnosisDesc = diagnosisDesc;
    }

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public LocalDateTime getDiagnosisTime() {
        return diagnosisTime;
    }

    public void setDiagnosisTime(LocalDateTime diagnosisTime) {
        this.diagnosisTime = diagnosisTime;
    }

    public BigDecimal getDiagnosisTypeCode() {
        return diagnosisTypeCode;
    }

    public void setDiagnosisTypeCode(BigDecimal diagnosisTypeCode) {
        this.diagnosisTypeCode = diagnosisTypeCode;
    }

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

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
    }

    @Override
    public String toString() {
        return "ViewJiaheClinicDiagnosis2{" +
        "diagnosisFlagName=" + diagnosisFlagName +
        ", diagnosisTypeName=" + diagnosisTypeName +
        ", diagnosisNum=" + diagnosisNum +
        ", diagnosisSubNum=" + diagnosisSubNum +
        ", diagnosisName=" + diagnosisName +
        ", diagnosisDesc=" + diagnosisDesc +
        ", diagnosisCode=" + diagnosisCode +
        ", diagnosisTime=" + diagnosisTime +
        ", diagnosisTypeCode=" + diagnosisTypeCode +
        ", patientId=" + patientId +
        ", visitId=" + visitId +
        ", fileUniqueId=" + fileUniqueId +
        "}";
    }
}
