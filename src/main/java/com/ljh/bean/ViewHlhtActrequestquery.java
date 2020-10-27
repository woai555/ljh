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
public class ViewHlhtActrequestquery implements Serializable {

    private static final long serialVersionUID=1L;

    private String msgId;

    private LocalDateTime creationTime;

    private String resultFlag;

    private String targetmessageId;

    private String resultdetail;

    private String status;

    private String applyId;

    private String itemCode;

    private String itemName;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String priorityCode;

    private String specimenId;

    private String patientId;

    private LocalDateTime operDate;

    private String operSign;

    private String doctCode;

    private String doctName;

    private String deptCode;

    private String deptName;

    private LocalDateTime checkDate;

    private String checkSign;

    private String checkCode;

    private String checkName;

    private String purpose;

    private String reason;

    private String remark;

    private String applyDoctId;

    private String applyDoctName;

    private String hospitalId;

    private String applyDeptName;

    private String queryresponsecode;


    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getResultFlag() {
        return resultFlag;
    }

    public void setResultFlag(String resultFlag) {
        this.resultFlag = resultFlag;
    }

    public String getTargetmessageId() {
        return targetmessageId;
    }

    public void setTargetmessageId(String targetmessageId) {
        this.targetmessageId = targetmessageId;
    }

    public String getResultdetail() {
        return resultdetail;
    }

    public void setResultdetail(String resultdetail) {
        this.resultdetail = resultdetail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
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

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperSign() {
        return operSign;
    }

    public void setOperSign(String operSign) {
        this.operSign = operSign;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public LocalDateTime getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(LocalDateTime checkDate) {
        this.checkDate = checkDate;
    }

    public String getCheckSign() {
        return checkSign;
    }

    public void setCheckSign(String checkSign) {
        this.checkSign = checkSign;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
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

    public String getQueryresponsecode() {
        return queryresponsecode;
    }

    public void setQueryresponsecode(String queryresponsecode) {
        this.queryresponsecode = queryresponsecode;
    }

    @Override
    public String toString() {
        return "ViewHlhtActrequestquery{" +
        "msgId=" + msgId +
        ", creationTime=" + creationTime +
        ", resultFlag=" + resultFlag +
        ", targetmessageId=" + targetmessageId +
        ", resultdetail=" + resultdetail +
        ", status=" + status +
        ", applyId=" + applyId +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", priorityCode=" + priorityCode +
        ", specimenId=" + specimenId +
        ", patientId=" + patientId +
        ", operDate=" + operDate +
        ", operSign=" + operSign +
        ", doctCode=" + doctCode +
        ", doctName=" + doctName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", checkDate=" + checkDate +
        ", checkSign=" + checkSign +
        ", checkCode=" + checkCode +
        ", checkName=" + checkName +
        ", purpose=" + purpose +
        ", reason=" + reason +
        ", remark=" + remark +
        ", applyDoctId=" + applyDoctId +
        ", applyDoctName=" + applyDoctName +
        ", hospitalId=" + hospitalId +
        ", applyDeptName=" + applyDeptName +
        ", queryresponsecode=" + queryresponsecode +
        "}";
    }
}
