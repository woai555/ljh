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
public class ViewHlhtAddactrequest implements Serializable {

    private static final long serialVersionUID=1L;

    private String msgId;

    private String jcptNo;

    private String applyId;

    private String inPatientId;

    private String itemCode;

    private String itemName;

    private String startTime;

    private String endTime;

    private String priorityCode;

    private String specimenId;

    private String specimenCode;

    private String specimenZt;

    private String specimenZtDesc;

    private String specimenGdy;

    private String specimenPrdtime;

    private String specimenAcsntime;

    private String patientFlag;

    private String operDate;

    private String operSign;

    private String doctId;

    private String doctName;

    private String hospitalid;

    private String deptName;

    private String checkDate;

    private String verifierSign;

    private String operId;

    private String verifierName;

    private String purpose;

    private String reason;

    private String reasonCode;

    private String reasonDisplay;

    private String remark;

    private String applyDoctId;

    private String applyDoctName;

    private String hospitalId;

    private String applyDeptName;

    private String encounterId;

    private String patientId;

    private String inpatientNo;

    private String telecom;

    private String statuscode;

    private String idenno;

    private String patientName;

    private String sexCode;

    private String sex;

    private String birthday;

    private String mcardNo;

    private String mcardId;

    private String healthArchivesNo;

    private String healthCardNo;

    private LocalDateTime operdate;


    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getJcptNo() {
        return jcptNo;
    }

    public void setJcptNo(String jcptNo) {
        this.jcptNo = jcptNo;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getInPatientId() {
        return inPatientId;
    }

    public void setInPatientId(String inPatientId) {
        this.inPatientId = inPatientId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPriorityCode() {
        return priorityCode;
    }

    public void setPriorityCode(String priorityCode) {
        this.priorityCode = priorityCode;
    }

    public String getSpecimenId() {
        return specimenId;
    }

    public void setSpecimenId(String specimenId) {
        this.specimenId = specimenId;
    }

    public String getSpecimenCode() {
        return specimenCode;
    }

    public void setSpecimenCode(String specimenCode) {
        this.specimenCode = specimenCode;
    }

    public String getSpecimenZt() {
        return specimenZt;
    }

    public void setSpecimenZt(String specimenZt) {
        this.specimenZt = specimenZt;
    }

    public String getSpecimenZtDesc() {
        return specimenZtDesc;
    }

    public void setSpecimenZtDesc(String specimenZtDesc) {
        this.specimenZtDesc = specimenZtDesc;
    }

    public String getSpecimenGdy() {
        return specimenGdy;
    }

    public void setSpecimenGdy(String specimenGdy) {
        this.specimenGdy = specimenGdy;
    }

    public String getSpecimenPrdtime() {
        return specimenPrdtime;
    }

    public void setSpecimenPrdtime(String specimenPrdtime) {
        this.specimenPrdtime = specimenPrdtime;
    }

    public String getSpecimenAcsntime() {
        return specimenAcsntime;
    }

    public void setSpecimenAcsntime(String specimenAcsntime) {
        this.specimenAcsntime = specimenAcsntime;
    }

    public String getPatientFlag() {
        return patientFlag;
    }

    public void setPatientFlag(String patientFlag) {
        this.patientFlag = patientFlag;
    }

    public String getOperDate() {
        return operDate;
    }

    public void setOperDate(String operDate) {
        this.operDate = operDate;
    }

    public String getOperSign() {
        return operSign;
    }

    public void setOperSign(String operSign) {
        this.operSign = operSign;
    }

    public String getDoctId() {
        return doctId;
    }

    public void setDoctId(String doctId) {
        this.doctId = doctId;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public String getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(String hospitalid) {
        this.hospitalid = hospitalid;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }

    public String getVerifierSign() {
        return verifierSign;
    }

    public void setVerifierSign(String verifierSign) {
        this.verifierSign = verifierSign;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public String getVerifierName() {
        return verifierName;
    }

    public void setVerifierName(String verifierName) {
        this.verifierName = verifierName;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonDisplay() {
        return reasonDisplay;
    }

    public void setReasonDisplay(String reasonDisplay) {
        this.reasonDisplay = reasonDisplay;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getApplyDoctId() {
        return applyDoctId;
    }

    public void setApplyDoctId(String applyDoctId) {
        this.applyDoctId = applyDoctId;
    }

    public String getApplyDoctName() {
        return applyDoctName;
    }

    public void setApplyDoctName(String applyDoctName) {
        this.applyDoctName = applyDoctName;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getApplyDeptName() {
        return applyDeptName;
    }

    public void setApplyDeptName(String applyDeptName) {
        this.applyDeptName = applyDeptName;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getTelecom() {
        return telecom;
    }

    public void setTelecom(String telecom) {
        this.telecom = telecom;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getMcardId() {
        return mcardId;
    }

    public void setMcardId(String mcardId) {
        this.mcardId = mcardId;
    }

    public String getHealthArchivesNo() {
        return healthArchivesNo;
    }

    public void setHealthArchivesNo(String healthArchivesNo) {
        this.healthArchivesNo = healthArchivesNo;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    @Override
    public String toString() {
        return "ViewHlhtAddactrequest{" +
        "msgId=" + msgId +
        ", jcptNo=" + jcptNo +
        ", applyId=" + applyId +
        ", inPatientId=" + inPatientId +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", priorityCode=" + priorityCode +
        ", specimenId=" + specimenId +
        ", specimenCode=" + specimenCode +
        ", specimenZt=" + specimenZt +
        ", specimenZtDesc=" + specimenZtDesc +
        ", specimenGdy=" + specimenGdy +
        ", specimenPrdtime=" + specimenPrdtime +
        ", specimenAcsntime=" + specimenAcsntime +
        ", patientFlag=" + patientFlag +
        ", operDate=" + operDate +
        ", operSign=" + operSign +
        ", doctId=" + doctId +
        ", doctName=" + doctName +
        ", hospitalid=" + hospitalid +
        ", deptName=" + deptName +
        ", checkDate=" + checkDate +
        ", verifierSign=" + verifierSign +
        ", operId=" + operId +
        ", verifierName=" + verifierName +
        ", purpose=" + purpose +
        ", reason=" + reason +
        ", reasonCode=" + reasonCode +
        ", reasonDisplay=" + reasonDisplay +
        ", remark=" + remark +
        ", applyDoctId=" + applyDoctId +
        ", applyDoctName=" + applyDoctName +
        ", hospitalId=" + hospitalId +
        ", applyDeptName=" + applyDeptName +
        ", encounterId=" + encounterId +
        ", patientId=" + patientId +
        ", inpatientNo=" + inpatientNo +
        ", telecom=" + telecom +
        ", statuscode=" + statuscode +
        ", idenno=" + idenno +
        ", patientName=" + patientName +
        ", sexCode=" + sexCode +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", mcardNo=" + mcardNo +
        ", mcardId=" + mcardId +
        ", healthArchivesNo=" + healthArchivesNo +
        ", healthCardNo=" + healthCardNo +
        ", operdate=" + operdate +
        "}";
    }
}
