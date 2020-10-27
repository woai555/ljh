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
public class VAppInspectionappquerydetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String mcardNo;

    private String cardnoJyt;

    private String idCardType;

    private String idCard;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String inspectionId;

    private String inspectionNo;

    private String itemName;

    private String inspectionDeptName;

    private String inspectionDeptId;

    private String inspectionPlace;

    private LocalDateTime appPrintTime;

    private String deptNo;

    private String mainDes;

    private String nowMedHistory;

    private String beforeMedHistory;

    private String checkReceptor;

    private String inspectResult;

    private String clinicalDiagnosis;

    private String requirementsPurpose;

    private String note;

    private String docId;

    private String docName;

    private String patId;

    private String patName;

    private String gender;

    private BigDecimal age;

    private String machineType;

    private String pacsname;

    private String beizhu;

    private String yyDate;

    private String blZysx;


    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId;
    }

    public String getInspectionNo() {
        return inspectionNo;
    }

    public void setInspectionNo(String inspectionNo) {
        this.inspectionNo = inspectionNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getInspectionDeptName() {
        return inspectionDeptName;
    }

    public void setInspectionDeptName(String inspectionDeptName) {
        this.inspectionDeptName = inspectionDeptName;
    }

    public String getInspectionDeptId() {
        return inspectionDeptId;
    }

    public void setInspectionDeptId(String inspectionDeptId) {
        this.inspectionDeptId = inspectionDeptId;
    }

    public String getInspectionPlace() {
        return inspectionPlace;
    }

    public void setInspectionPlace(String inspectionPlace) {
        this.inspectionPlace = inspectionPlace;
    }

    public LocalDateTime getAppPrintTime() {
        return appPrintTime;
    }

    public void setAppPrintTime(LocalDateTime appPrintTime) {
        this.appPrintTime = appPrintTime;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getMainDes() {
        return mainDes;
    }

    public void setMainDes(String mainDes) {
        this.mainDes = mainDes;
    }

    public String getNowMedHistory() {
        return nowMedHistory;
    }

    public void setNowMedHistory(String nowMedHistory) {
        this.nowMedHistory = nowMedHistory;
    }

    public String getBeforeMedHistory() {
        return beforeMedHistory;
    }

    public void setBeforeMedHistory(String beforeMedHistory) {
        this.beforeMedHistory = beforeMedHistory;
    }

    public String getCheckReceptor() {
        return checkReceptor;
    }

    public void setCheckReceptor(String checkReceptor) {
        this.checkReceptor = checkReceptor;
    }

    public String getInspectResult() {
        return inspectResult;
    }

    public void setInspectResult(String inspectResult) {
        this.inspectResult = inspectResult;
    }

    public String getClinicalDiagnosis() {
        return clinicalDiagnosis;
    }

    public void setClinicalDiagnosis(String clinicalDiagnosis) {
        this.clinicalDiagnosis = clinicalDiagnosis;
    }

    public String getRequirementsPurpose() {
        return requirementsPurpose;
    }

    public void setRequirementsPurpose(String requirementsPurpose) {
        this.requirementsPurpose = requirementsPurpose;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getPatId() {
        return patId;
    }

    public void setPatId(String patId) {
        this.patId = patId;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getPacsname() {
        return pacsname;
    }

    public void setPacsname(String pacsname) {
        this.pacsname = pacsname;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public String getYyDate() {
        return yyDate;
    }

    public void setYyDate(String yyDate) {
        this.yyDate = yyDate;
    }

    public String getBlZysx() {
        return blZysx;
    }

    public void setBlZysx(String blZysx) {
        this.blZysx = blZysx;
    }

    @Override
    public String toString() {
        return "VAppInspectionappquerydetail{" +
        "mcardNo=" + mcardNo +
        ", cardnoJyt=" + cardnoJyt +
        ", idCardType=" + idCardType +
        ", idCard=" + idCard +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", inspectionId=" + inspectionId +
        ", inspectionNo=" + inspectionNo +
        ", itemName=" + itemName +
        ", inspectionDeptName=" + inspectionDeptName +
        ", inspectionDeptId=" + inspectionDeptId +
        ", inspectionPlace=" + inspectionPlace +
        ", appPrintTime=" + appPrintTime +
        ", deptNo=" + deptNo +
        ", mainDes=" + mainDes +
        ", nowMedHistory=" + nowMedHistory +
        ", beforeMedHistory=" + beforeMedHistory +
        ", checkReceptor=" + checkReceptor +
        ", inspectResult=" + inspectResult +
        ", clinicalDiagnosis=" + clinicalDiagnosis +
        ", requirementsPurpose=" + requirementsPurpose +
        ", note=" + note +
        ", docId=" + docId +
        ", docName=" + docName +
        ", patId=" + patId +
        ", patName=" + patName +
        ", gender=" + gender +
        ", age=" + age +
        ", machineType=" + machineType +
        ", pacsname=" + pacsname +
        ", beizhu=" + beizhu +
        ", yyDate=" + yyDate +
        ", blZysx=" + blZysx +
        "}";
    }
}
