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
public class ViewHlhtCdrvisitoprn implements Serializable {

    private static final long serialVersionUID=1L;

    private String outPatientId;

    private String healthCardNo;

    private String patientType;

    private String visitId;

    private String visitType;

    private String personName;

    private String sex;

    private String dateOfBirth;

    private BigDecimal age;

    private String idCardType;

    private String idCardNo;

    private String phoneNumber;

    private String chargeType;

    private String orderNo;

    private String chargeNo;

    private String orderItem;

    private String applyNo;

    private String applyDoctor;

    private String applyDept;

    private String applyTime;

    private String applyMemo;

    private String diagnosis;

    private String diagnosisDesc;

    private String height;

    private String weight;

    private String applyMatters;

    private String examPart;

    private String examClas;

    private String examSubClass;

    private String examItem;

    private String metalFlag;

    private String enhanceFlag;

    private String planExamTime;

    private String liverKidneyLack;

    private String doseAllergic;

    private String sampleNo;

    private String sampleRequire;

    private String labType;

    private String sampleNurse;

    private String specimanType;

    private String samplingPosition;

    private String sampleMethod;

    private String sampleVolume;

    private String planSampleTime;

    private String planSampleWindow;

    private String orderStatus;

    private String operateType;

    private LocalDateTime operatortime;


    public String getOutPatientId() {
        return outPatientId;
    }

    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getChargeNo() {
        return chargeNo;
    }

    public void setChargeNo(String chargeNo) {
        this.chargeNo = chargeNo;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getApplyDoctor() {
        return applyDoctor;
    }

    public void setApplyDoctor(String applyDoctor) {
        this.applyDoctor = applyDoctor;
    }

    public String getApplyDept() {
        return applyDept;
    }

    public void setApplyDept(String applyDept) {
        this.applyDept = applyDept;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyMemo() {
        return applyMemo;
    }

    public void setApplyMemo(String applyMemo) {
        this.applyMemo = applyMemo;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosisDesc() {
        return diagnosisDesc;
    }

    public void setDiagnosisDesc(String diagnosisDesc) {
        this.diagnosisDesc = diagnosisDesc;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getApplyMatters() {
        return applyMatters;
    }

    public void setApplyMatters(String applyMatters) {
        this.applyMatters = applyMatters;
    }

    public String getExamPart() {
        return examPart;
    }

    public void setExamPart(String examPart) {
        this.examPart = examPart;
    }

    public String getExamClas() {
        return examClas;
    }

    public void setExamClas(String examClas) {
        this.examClas = examClas;
    }

    public String getExamSubClass() {
        return examSubClass;
    }

    public void setExamSubClass(String examSubClass) {
        this.examSubClass = examSubClass;
    }

    public String getExamItem() {
        return examItem;
    }

    public void setExamItem(String examItem) {
        this.examItem = examItem;
    }

    public String getMetalFlag() {
        return metalFlag;
    }

    public void setMetalFlag(String metalFlag) {
        this.metalFlag = metalFlag;
    }

    public String getEnhanceFlag() {
        return enhanceFlag;
    }

    public void setEnhanceFlag(String enhanceFlag) {
        this.enhanceFlag = enhanceFlag;
    }

    public String getPlanExamTime() {
        return planExamTime;
    }

    public void setPlanExamTime(String planExamTime) {
        this.planExamTime = planExamTime;
    }

    public String getLiverKidneyLack() {
        return liverKidneyLack;
    }

    public void setLiverKidneyLack(String liverKidneyLack) {
        this.liverKidneyLack = liverKidneyLack;
    }

    public String getDoseAllergic() {
        return doseAllergic;
    }

    public void setDoseAllergic(String doseAllergic) {
        this.doseAllergic = doseAllergic;
    }

    public String getSampleNo() {
        return sampleNo;
    }

    public void setSampleNo(String sampleNo) {
        this.sampleNo = sampleNo;
    }

    public String getSampleRequire() {
        return sampleRequire;
    }

    public void setSampleRequire(String sampleRequire) {
        this.sampleRequire = sampleRequire;
    }

    public String getLabType() {
        return labType;
    }

    public void setLabType(String labType) {
        this.labType = labType;
    }

    public String getSampleNurse() {
        return sampleNurse;
    }

    public void setSampleNurse(String sampleNurse) {
        this.sampleNurse = sampleNurse;
    }

    public String getSpecimanType() {
        return specimanType;
    }

    public void setSpecimanType(String specimanType) {
        this.specimanType = specimanType;
    }

    public String getSamplingPosition() {
        return samplingPosition;
    }

    public void setSamplingPosition(String samplingPosition) {
        this.samplingPosition = samplingPosition;
    }

    public String getSampleMethod() {
        return sampleMethod;
    }

    public void setSampleMethod(String sampleMethod) {
        this.sampleMethod = sampleMethod;
    }

    public String getSampleVolume() {
        return sampleVolume;
    }

    public void setSampleVolume(String sampleVolume) {
        this.sampleVolume = sampleVolume;
    }

    public String getPlanSampleTime() {
        return planSampleTime;
    }

    public void setPlanSampleTime(String planSampleTime) {
        this.planSampleTime = planSampleTime;
    }

    public String getPlanSampleWindow() {
        return planSampleWindow;
    }

    public void setPlanSampleWindow(String planSampleWindow) {
        this.planSampleWindow = planSampleWindow;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdrvisitoprn{" +
        "outPatientId=" + outPatientId +
        ", healthCardNo=" + healthCardNo +
        ", patientType=" + patientType +
        ", visitId=" + visitId +
        ", visitType=" + visitType +
        ", personName=" + personName +
        ", sex=" + sex +
        ", dateOfBirth=" + dateOfBirth +
        ", age=" + age +
        ", idCardType=" + idCardType +
        ", idCardNo=" + idCardNo +
        ", phoneNumber=" + phoneNumber +
        ", chargeType=" + chargeType +
        ", orderNo=" + orderNo +
        ", chargeNo=" + chargeNo +
        ", orderItem=" + orderItem +
        ", applyNo=" + applyNo +
        ", applyDoctor=" + applyDoctor +
        ", applyDept=" + applyDept +
        ", applyTime=" + applyTime +
        ", applyMemo=" + applyMemo +
        ", diagnosis=" + diagnosis +
        ", diagnosisDesc=" + diagnosisDesc +
        ", height=" + height +
        ", weight=" + weight +
        ", applyMatters=" + applyMatters +
        ", examPart=" + examPart +
        ", examClas=" + examClas +
        ", examSubClass=" + examSubClass +
        ", examItem=" + examItem +
        ", metalFlag=" + metalFlag +
        ", enhanceFlag=" + enhanceFlag +
        ", planExamTime=" + planExamTime +
        ", liverKidneyLack=" + liverKidneyLack +
        ", doseAllergic=" + doseAllergic +
        ", sampleNo=" + sampleNo +
        ", sampleRequire=" + sampleRequire +
        ", labType=" + labType +
        ", sampleNurse=" + sampleNurse +
        ", specimanType=" + specimanType +
        ", samplingPosition=" + samplingPosition +
        ", sampleMethod=" + sampleMethod +
        ", sampleVolume=" + sampleVolume +
        ", planSampleTime=" + planSampleTime +
        ", planSampleWindow=" + planSampleWindow +
        ", orderStatus=" + orderStatus +
        ", operateType=" + operateType +
        ", operatortime=" + operatortime +
        "}";
    }
}
