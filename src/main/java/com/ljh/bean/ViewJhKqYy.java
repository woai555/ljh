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
public class ViewJhKqYy implements Serializable {

    private static final long serialVersionUID=1L;

    private String hospitalNo;

    private String patientid;

    private String name;

    private String sex;

    private String idNo;

    private String phoneNumberHome;

    private String phoneNumberBusiness;

    private BigDecimal vipIndicator;

    private LocalDateTime createDate;

    private String operator;

    private String appointmentCode;

    private String visitUniqueId;

    private BigDecimal registerTypeCode;

    private String microsopeCode;

    private String treatmentCode;

    private String apptDoctor;

    private String appointedPhone;

    private LocalDateTime startDatetime;

    private LocalDateTime endDatetime;

    private BigDecimal isOperating;

    private String bodyPart;

    private String operationTime;

    private String createUserKey;

    private LocalDateTime createDatetime;

    private String apptStatus;

    private String confirmedStatus;

    private String memo;

    private BigDecimal numberOfPrints;

    private String clinicRoomId;

    private String clinicChairId;

    private String apptDoctorId;

    private BigDecimal isBreak;

    private String appDept;

    private String diagnoseDepict;

    private BigDecimal isFirst;

    private BigDecimal isReturnVisit;

    private String hisApptCode;

    private String bakphone;

    private LocalDateTime dateOfBirth;

    private String ifReg;


    public String getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
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

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getPhoneNumberHome() {
        return phoneNumberHome;
    }

    public void setPhoneNumberHome(String phoneNumberHome) {
        this.phoneNumberHome = phoneNumberHome;
    }

    public String getPhoneNumberBusiness() {
        return phoneNumberBusiness;
    }

    public void setPhoneNumberBusiness(String phoneNumberBusiness) {
        this.phoneNumberBusiness = phoneNumberBusiness;
    }

    public BigDecimal getVipIndicator() {
        return vipIndicator;
    }

    public void setVipIndicator(BigDecimal vipIndicator) {
        this.vipIndicator = vipIndicator;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getAppointmentCode() {
        return appointmentCode;
    }

    public void setAppointmentCode(String appointmentCode) {
        this.appointmentCode = appointmentCode;
    }

    public String getVisitUniqueId() {
        return visitUniqueId;
    }

    public void setVisitUniqueId(String visitUniqueId) {
        this.visitUniqueId = visitUniqueId;
    }

    public BigDecimal getRegisterTypeCode() {
        return registerTypeCode;
    }

    public void setRegisterTypeCode(BigDecimal registerTypeCode) {
        this.registerTypeCode = registerTypeCode;
    }

    public String getMicrosopeCode() {
        return microsopeCode;
    }

    public void setMicrosopeCode(String microsopeCode) {
        this.microsopeCode = microsopeCode;
    }

    public String getTreatmentCode() {
        return treatmentCode;
    }

    public void setTreatmentCode(String treatmentCode) {
        this.treatmentCode = treatmentCode;
    }

    public String getApptDoctor() {
        return apptDoctor;
    }

    public void setApptDoctor(String apptDoctor) {
        this.apptDoctor = apptDoctor;
    }

    public String getAppointedPhone() {
        return appointedPhone;
    }

    public void setAppointedPhone(String appointedPhone) {
        this.appointedPhone = appointedPhone;
    }

    public LocalDateTime getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(LocalDateTime startDatetime) {
        this.startDatetime = startDatetime;
    }

    public LocalDateTime getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(LocalDateTime endDatetime) {
        this.endDatetime = endDatetime;
    }

    public BigDecimal getIsOperating() {
        return isOperating;
    }

    public void setIsOperating(BigDecimal isOperating) {
        this.isOperating = isOperating;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public String getCreateUserKey() {
        return createUserKey;
    }

    public void setCreateUserKey(String createUserKey) {
        this.createUserKey = createUserKey;
    }

    public LocalDateTime getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(LocalDateTime createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getApptStatus() {
        return apptStatus;
    }

    public void setApptStatus(String apptStatus) {
        this.apptStatus = apptStatus;
    }

    public String getConfirmedStatus() {
        return confirmedStatus;
    }

    public void setConfirmedStatus(String confirmedStatus) {
        this.confirmedStatus = confirmedStatus;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public BigDecimal getNumberOfPrints() {
        return numberOfPrints;
    }

    public void setNumberOfPrints(BigDecimal numberOfPrints) {
        this.numberOfPrints = numberOfPrints;
    }

    public String getClinicRoomId() {
        return clinicRoomId;
    }

    public void setClinicRoomId(String clinicRoomId) {
        this.clinicRoomId = clinicRoomId;
    }

    public String getClinicChairId() {
        return clinicChairId;
    }

    public void setClinicChairId(String clinicChairId) {
        this.clinicChairId = clinicChairId;
    }

    public String getApptDoctorId() {
        return apptDoctorId;
    }

    public void setApptDoctorId(String apptDoctorId) {
        this.apptDoctorId = apptDoctorId;
    }

    public BigDecimal getIsBreak() {
        return isBreak;
    }

    public void setIsBreak(BigDecimal isBreak) {
        this.isBreak = isBreak;
    }

    public String getAppDept() {
        return appDept;
    }

    public void setAppDept(String appDept) {
        this.appDept = appDept;
    }

    public String getDiagnoseDepict() {
        return diagnoseDepict;
    }

    public void setDiagnoseDepict(String diagnoseDepict) {
        this.diagnoseDepict = diagnoseDepict;
    }

    public BigDecimal getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(BigDecimal isFirst) {
        this.isFirst = isFirst;
    }

    public BigDecimal getIsReturnVisit() {
        return isReturnVisit;
    }

    public void setIsReturnVisit(BigDecimal isReturnVisit) {
        this.isReturnVisit = isReturnVisit;
    }

    public String getHisApptCode() {
        return hisApptCode;
    }

    public void setHisApptCode(String hisApptCode) {
        this.hisApptCode = hisApptCode;
    }

    public String getBakphone() {
        return bakphone;
    }

    public void setBakphone(String bakphone) {
        this.bakphone = bakphone;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIfReg() {
        return ifReg;
    }

    public void setIfReg(String ifReg) {
        this.ifReg = ifReg;
    }

    @Override
    public String toString() {
        return "ViewJhKqYy{" +
        "hospitalNo=" + hospitalNo +
        ", patientid=" + patientid +
        ", name=" + name +
        ", sex=" + sex +
        ", idNo=" + idNo +
        ", phoneNumberHome=" + phoneNumberHome +
        ", phoneNumberBusiness=" + phoneNumberBusiness +
        ", vipIndicator=" + vipIndicator +
        ", createDate=" + createDate +
        ", operator=" + operator +
        ", appointmentCode=" + appointmentCode +
        ", visitUniqueId=" + visitUniqueId +
        ", registerTypeCode=" + registerTypeCode +
        ", microsopeCode=" + microsopeCode +
        ", treatmentCode=" + treatmentCode +
        ", apptDoctor=" + apptDoctor +
        ", appointedPhone=" + appointedPhone +
        ", startDatetime=" + startDatetime +
        ", endDatetime=" + endDatetime +
        ", isOperating=" + isOperating +
        ", bodyPart=" + bodyPart +
        ", operationTime=" + operationTime +
        ", createUserKey=" + createUserKey +
        ", createDatetime=" + createDatetime +
        ", apptStatus=" + apptStatus +
        ", confirmedStatus=" + confirmedStatus +
        ", memo=" + memo +
        ", numberOfPrints=" + numberOfPrints +
        ", clinicRoomId=" + clinicRoomId +
        ", clinicChairId=" + clinicChairId +
        ", apptDoctorId=" + apptDoctorId +
        ", isBreak=" + isBreak +
        ", appDept=" + appDept +
        ", diagnoseDepict=" + diagnoseDepict +
        ", isFirst=" + isFirst +
        ", isReturnVisit=" + isReturnVisit +
        ", hisApptCode=" + hisApptCode +
        ", bakphone=" + bakphone +
        ", dateOfBirth=" + dateOfBirth +
        ", ifReg=" + ifReg +
        "}";
    }
}
