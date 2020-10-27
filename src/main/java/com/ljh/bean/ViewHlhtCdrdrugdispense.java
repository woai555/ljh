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
public class ViewHlhtCdrdrugdispense implements Serializable {

    private static final long serialVersionUID=1L;

    private String pattientNo;

    private String visitNo;

    private String visitNum;

    private String visitType;

    private String healthCardNo;

    private String auditCareproviderCode;

    private String auditCareproviderName;

    private String auditDatetime;

    private String dispensingCareproviderCode;

    private String dispensingCareproviderName;

    private String dispensingDatetime;

    private String checkCareproviderCode;

    private String checkCareproviderName;

    private String checkDatetime;

    private String dispensedCareproviderCode;

    private String dispensedCareproviderName;

    private String dispensedDatetime;

    private String formNo;

    private String dispensingNo;

    private String pharmacyStore;

    private String dispensingWindow;

    private String presCommentPerson;

    private String presCommentTime;

    private String presComment;

    private String entityCode;

    private LocalDateTime operatortime;

    private String operateType;

    private String recipeNo;


    public String getPattientNo() {
        return pattientNo;
    }

    public void setPattientNo(String pattientNo) {
        this.pattientNo = pattientNo;
    }

    public String getVisitNo() {
        return visitNo;
    }

    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo;
    }

    public String getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(String visitNum) {
        this.visitNum = visitNum;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public String getAuditCareproviderCode() {
        return auditCareproviderCode;
    }

    public void setAuditCareproviderCode(String auditCareproviderCode) {
        this.auditCareproviderCode = auditCareproviderCode;
    }

    public String getAuditCareproviderName() {
        return auditCareproviderName;
    }

    public void setAuditCareproviderName(String auditCareproviderName) {
        this.auditCareproviderName = auditCareproviderName;
    }

    public String getAuditDatetime() {
        return auditDatetime;
    }

    public void setAuditDatetime(String auditDatetime) {
        this.auditDatetime = auditDatetime;
    }

    public String getDispensingCareproviderCode() {
        return dispensingCareproviderCode;
    }

    public void setDispensingCareproviderCode(String dispensingCareproviderCode) {
        this.dispensingCareproviderCode = dispensingCareproviderCode;
    }

    public String getDispensingCareproviderName() {
        return dispensingCareproviderName;
    }

    public void setDispensingCareproviderName(String dispensingCareproviderName) {
        this.dispensingCareproviderName = dispensingCareproviderName;
    }

    public String getDispensingDatetime() {
        return dispensingDatetime;
    }

    public void setDispensingDatetime(String dispensingDatetime) {
        this.dispensingDatetime = dispensingDatetime;
    }

    public String getCheckCareproviderCode() {
        return checkCareproviderCode;
    }

    public void setCheckCareproviderCode(String checkCareproviderCode) {
        this.checkCareproviderCode = checkCareproviderCode;
    }

    public String getCheckCareproviderName() {
        return checkCareproviderName;
    }

    public void setCheckCareproviderName(String checkCareproviderName) {
        this.checkCareproviderName = checkCareproviderName;
    }

    public String getCheckDatetime() {
        return checkDatetime;
    }

    public void setCheckDatetime(String checkDatetime) {
        this.checkDatetime = checkDatetime;
    }

    public String getDispensedCareproviderCode() {
        return dispensedCareproviderCode;
    }

    public void setDispensedCareproviderCode(String dispensedCareproviderCode) {
        this.dispensedCareproviderCode = dispensedCareproviderCode;
    }

    public String getDispensedCareproviderName() {
        return dispensedCareproviderName;
    }

    public void setDispensedCareproviderName(String dispensedCareproviderName) {
        this.dispensedCareproviderName = dispensedCareproviderName;
    }

    public String getDispensedDatetime() {
        return dispensedDatetime;
    }

    public void setDispensedDatetime(String dispensedDatetime) {
        this.dispensedDatetime = dispensedDatetime;
    }

    public String getFormNo() {
        return formNo;
    }

    public void setFormNo(String formNo) {
        this.formNo = formNo;
    }

    public String getDispensingNo() {
        return dispensingNo;
    }

    public void setDispensingNo(String dispensingNo) {
        this.dispensingNo = dispensingNo;
    }

    public String getPharmacyStore() {
        return pharmacyStore;
    }

    public void setPharmacyStore(String pharmacyStore) {
        this.pharmacyStore = pharmacyStore;
    }

    public String getDispensingWindow() {
        return dispensingWindow;
    }

    public void setDispensingWindow(String dispensingWindow) {
        this.dispensingWindow = dispensingWindow;
    }

    public String getPresCommentPerson() {
        return presCommentPerson;
    }

    public void setPresCommentPerson(String presCommentPerson) {
        this.presCommentPerson = presCommentPerson;
    }

    public String getPresCommentTime() {
        return presCommentTime;
    }

    public void setPresCommentTime(String presCommentTime) {
        this.presCommentTime = presCommentTime;
    }

    public String getPresComment() {
        return presComment;
    }

    public void setPresComment(String presComment) {
        this.presComment = presComment;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdrdrugdispense{" +
        "pattientNo=" + pattientNo +
        ", visitNo=" + visitNo +
        ", visitNum=" + visitNum +
        ", visitType=" + visitType +
        ", healthCardNo=" + healthCardNo +
        ", auditCareproviderCode=" + auditCareproviderCode +
        ", auditCareproviderName=" + auditCareproviderName +
        ", auditDatetime=" + auditDatetime +
        ", dispensingCareproviderCode=" + dispensingCareproviderCode +
        ", dispensingCareproviderName=" + dispensingCareproviderName +
        ", dispensingDatetime=" + dispensingDatetime +
        ", checkCareproviderCode=" + checkCareproviderCode +
        ", checkCareproviderName=" + checkCareproviderName +
        ", checkDatetime=" + checkDatetime +
        ", dispensedCareproviderCode=" + dispensedCareproviderCode +
        ", dispensedCareproviderName=" + dispensedCareproviderName +
        ", dispensedDatetime=" + dispensedDatetime +
        ", formNo=" + formNo +
        ", dispensingNo=" + dispensingNo +
        ", pharmacyStore=" + pharmacyStore +
        ", dispensingWindow=" + dispensingWindow +
        ", presCommentPerson=" + presCommentPerson +
        ", presCommentTime=" + presCommentTime +
        ", presComment=" + presComment +
        ", entityCode=" + entityCode +
        ", operatortime=" + operatortime +
        ", operateType=" + operateType +
        ", recipeNo=" + recipeNo +
        "}";
    }
}
