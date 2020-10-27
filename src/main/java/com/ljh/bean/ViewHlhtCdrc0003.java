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
public class ViewHlhtCdrc0003 implements Serializable {

    private static final long serialVersionUID=1L;

    private String outpatientNo;

    private String applyNo;

    private String idNo;

    private String name;

    private String sex;

    private LocalDateTime birthtime;

    private String age;

    private String sectionName;

    private String medicalCode;

    private String medicalName;

    private LocalDateTime recordDate;

    private String doctorName;

    private String organizationName;

    private String responsiblePhysicianDoctor;

    private String anaphylaxis;

    private String anaphylaxisCode;

    private String mainComplaint;

    private String historyOfPresentIllness;

    private String pastHistory;

    private String physicalExaminationResults;

    private String auxiliaryInspectionProject;

    private String auxiliaryExaminationResults;

    private String firstDiagnosisSignCode;

    private String zyszgcResults;

    private LocalDateTime operatortime;


    public String getOutpatientNo() {
        return outpatientNo;
    }

    public void setOutpatientNo(String outpatientNo) {
        this.outpatientNo = outpatientNo;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthtime() {
        return birthtime;
    }

    public void setBirthtime(LocalDateTime birthtime) {
        this.birthtime = birthtime;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getMedicalCode() {
        return medicalCode;
    }

    public void setMedicalCode(String medicalCode) {
        this.medicalCode = medicalCode;
    }

    public String getMedicalName() {
        return medicalName;
    }

    public void setMedicalName(String medicalName) {
        this.medicalName = medicalName;
    }

    public LocalDateTime getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDateTime recordDate) {
        this.recordDate = recordDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getResponsiblePhysicianDoctor() {
        return responsiblePhysicianDoctor;
    }

    public void setResponsiblePhysicianDoctor(String responsiblePhysicianDoctor) {
        this.responsiblePhysicianDoctor = responsiblePhysicianDoctor;
    }

    public String getAnaphylaxis() {
        return anaphylaxis;
    }

    public void setAnaphylaxis(String anaphylaxis) {
        this.anaphylaxis = anaphylaxis;
    }

    public String getAnaphylaxisCode() {
        return anaphylaxisCode;
    }

    public void setAnaphylaxisCode(String anaphylaxisCode) {
        this.anaphylaxisCode = anaphylaxisCode;
    }

    public String getMainComplaint() {
        return mainComplaint;
    }

    public void setMainComplaint(String mainComplaint) {
        this.mainComplaint = mainComplaint;
    }

    public String getHistoryOfPresentIllness() {
        return historyOfPresentIllness;
    }

    public void setHistoryOfPresentIllness(String historyOfPresentIllness) {
        this.historyOfPresentIllness = historyOfPresentIllness;
    }

    public String getPastHistory() {
        return pastHistory;
    }

    public void setPastHistory(String pastHistory) {
        this.pastHistory = pastHistory;
    }

    public String getPhysicalExaminationResults() {
        return physicalExaminationResults;
    }

    public void setPhysicalExaminationResults(String physicalExaminationResults) {
        this.physicalExaminationResults = physicalExaminationResults;
    }

    public String getAuxiliaryInspectionProject() {
        return auxiliaryInspectionProject;
    }

    public void setAuxiliaryInspectionProject(String auxiliaryInspectionProject) {
        this.auxiliaryInspectionProject = auxiliaryInspectionProject;
    }

    public String getAuxiliaryExaminationResults() {
        return auxiliaryExaminationResults;
    }

    public void setAuxiliaryExaminationResults(String auxiliaryExaminationResults) {
        this.auxiliaryExaminationResults = auxiliaryExaminationResults;
    }

    public String getFirstDiagnosisSignCode() {
        return firstDiagnosisSignCode;
    }

    public void setFirstDiagnosisSignCode(String firstDiagnosisSignCode) {
        this.firstDiagnosisSignCode = firstDiagnosisSignCode;
    }

    public String getZyszgcResults() {
        return zyszgcResults;
    }

    public void setZyszgcResults(String zyszgcResults) {
        this.zyszgcResults = zyszgcResults;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdrc0003{" +
        "outpatientNo=" + outpatientNo +
        ", applyNo=" + applyNo +
        ", idNo=" + idNo +
        ", name=" + name +
        ", sex=" + sex +
        ", birthtime=" + birthtime +
        ", age=" + age +
        ", sectionName=" + sectionName +
        ", medicalCode=" + medicalCode +
        ", medicalName=" + medicalName +
        ", recordDate=" + recordDate +
        ", doctorName=" + doctorName +
        ", organizationName=" + organizationName +
        ", responsiblePhysicianDoctor=" + responsiblePhysicianDoctor +
        ", anaphylaxis=" + anaphylaxis +
        ", anaphylaxisCode=" + anaphylaxisCode +
        ", mainComplaint=" + mainComplaint +
        ", historyOfPresentIllness=" + historyOfPresentIllness +
        ", pastHistory=" + pastHistory +
        ", physicalExaminationResults=" + physicalExaminationResults +
        ", auxiliaryInspectionProject=" + auxiliaryInspectionProject +
        ", auxiliaryExaminationResults=" + auxiliaryExaminationResults +
        ", firstDiagnosisSignCode=" + firstDiagnosisSignCode +
        ", zyszgcResults=" + zyszgcResults +
        ", operatortime=" + operatortime +
        "}";
    }
}
