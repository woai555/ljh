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
public class ViewJiaheMzblws implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String name;

    private String namePhonetic;

    private String visitId;

    private LocalDateTime visitDate;

    private String visitNo;

    private String illnessDesc;

    private String anamnesis;

    private String familyIll;

    private String marrital;

    private String individual;

    private String menses;

    private String medHistory;

    private String bodyExam;

    private String diagDesc;

    private String advice;

    private String doctor;

    private String ordinal;

    private String operationRecord;

    private String medicalRecord;

    private String doctorNo;

    private String tooth;

    private String memo;

    private String cdiag;

    private String drugAllergy;

    private String bloodpressureh;

    private String bloodpressurel;

    private String pulse;

    private String temperature;

    private String breathFrequency;

    private String auxiliaryExam;

    private String denyTreatment;

    private String auxiliaryExamHospital;

    private String generalOrders;

    private String visitType;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePhonetic() {
        return namePhonetic;
    }

    public void setNamePhonetic(String namePhonetic) {
        this.namePhonetic = namePhonetic;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }

    public String getVisitNo() {
        return visitNo;
    }

    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo;
    }

    public String getIllnessDesc() {
        return illnessDesc;
    }

    public void setIllnessDesc(String illnessDesc) {
        this.illnessDesc = illnessDesc;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getFamilyIll() {
        return familyIll;
    }

    public void setFamilyIll(String familyIll) {
        this.familyIll = familyIll;
    }

    public String getMarrital() {
        return marrital;
    }

    public void setMarrital(String marrital) {
        this.marrital = marrital;
    }

    public String getIndividual() {
        return individual;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
    }

    public String getMenses() {
        return menses;
    }

    public void setMenses(String menses) {
        this.menses = menses;
    }

    public String getMedHistory() {
        return medHistory;
    }

    public void setMedHistory(String medHistory) {
        this.medHistory = medHistory;
    }

    public String getBodyExam() {
        return bodyExam;
    }

    public void setBodyExam(String bodyExam) {
        this.bodyExam = bodyExam;
    }

    public String getDiagDesc() {
        return diagDesc;
    }

    public void setDiagDesc(String diagDesc) {
        this.diagDesc = diagDesc;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(String ordinal) {
        this.ordinal = ordinal;
    }

    public String getOperationRecord() {
        return operationRecord;
    }

    public void setOperationRecord(String operationRecord) {
        this.operationRecord = operationRecord;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public String getDoctorNo() {
        return doctorNo;
    }

    public void setDoctorNo(String doctorNo) {
        this.doctorNo = doctorNo;
    }

    public String getTooth() {
        return tooth;
    }

    public void setTooth(String tooth) {
        this.tooth = tooth;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCdiag() {
        return cdiag;
    }

    public void setCdiag(String cdiag) {
        this.cdiag = cdiag;
    }

    public String getDrugAllergy() {
        return drugAllergy;
    }

    public void setDrugAllergy(String drugAllergy) {
        this.drugAllergy = drugAllergy;
    }

    public String getBloodpressureh() {
        return bloodpressureh;
    }

    public void setBloodpressureh(String bloodpressureh) {
        this.bloodpressureh = bloodpressureh;
    }

    public String getBloodpressurel() {
        return bloodpressurel;
    }

    public void setBloodpressurel(String bloodpressurel) {
        this.bloodpressurel = bloodpressurel;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getBreathFrequency() {
        return breathFrequency;
    }

    public void setBreathFrequency(String breathFrequency) {
        this.breathFrequency = breathFrequency;
    }

    public String getAuxiliaryExam() {
        return auxiliaryExam;
    }

    public void setAuxiliaryExam(String auxiliaryExam) {
        this.auxiliaryExam = auxiliaryExam;
    }

    public String getDenyTreatment() {
        return denyTreatment;
    }

    public void setDenyTreatment(String denyTreatment) {
        this.denyTreatment = denyTreatment;
    }

    public String getAuxiliaryExamHospital() {
        return auxiliaryExamHospital;
    }

    public void setAuxiliaryExamHospital(String auxiliaryExamHospital) {
        this.auxiliaryExamHospital = auxiliaryExamHospital;
    }

    public String getGeneralOrders() {
        return generalOrders;
    }

    public void setGeneralOrders(String generalOrders) {
        this.generalOrders = generalOrders;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzblws{" +
        "patientId=" + patientId +
        ", name=" + name +
        ", namePhonetic=" + namePhonetic +
        ", visitId=" + visitId +
        ", visitDate=" + visitDate +
        ", visitNo=" + visitNo +
        ", illnessDesc=" + illnessDesc +
        ", anamnesis=" + anamnesis +
        ", familyIll=" + familyIll +
        ", marrital=" + marrital +
        ", individual=" + individual +
        ", menses=" + menses +
        ", medHistory=" + medHistory +
        ", bodyExam=" + bodyExam +
        ", diagDesc=" + diagDesc +
        ", advice=" + advice +
        ", doctor=" + doctor +
        ", ordinal=" + ordinal +
        ", operationRecord=" + operationRecord +
        ", medicalRecord=" + medicalRecord +
        ", doctorNo=" + doctorNo +
        ", tooth=" + tooth +
        ", memo=" + memo +
        ", cdiag=" + cdiag +
        ", drugAllergy=" + drugAllergy +
        ", bloodpressureh=" + bloodpressureh +
        ", bloodpressurel=" + bloodpressurel +
        ", pulse=" + pulse +
        ", temperature=" + temperature +
        ", breathFrequency=" + breathFrequency +
        ", auxiliaryExam=" + auxiliaryExam +
        ", denyTreatment=" + denyTreatment +
        ", auxiliaryExamHospital=" + auxiliaryExamHospital +
        ", generalOrders=" + generalOrders +
        ", visitType=" + visitType +
        "}";
    }
}
