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
public class ViewJiaheMzItemdetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String actId;

    private String patientId;

    private String outpId;

    private String prescNo;

    private String applyPerson;

    private String applyPersonName;

    private String applyDepartment;

    private String applyDepartmentName;

    private String chargingItem;

    private String chargingItemName;

    private String chargingCategory;

    private String chargingCategoryName;

    private String chargingCategoryDl;

    private String chargingCategoryDlName;

    private BigDecimal chargingItemNum;

    private BigDecimal chargingItemFee;

    private LocalDateTime chargingItemTime;

    private String chargingType;

    private String chargingTypeName;

    private String visitType;


    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getOutpId() {
        return outpId;
    }

    public void setOutpId(String outpId) {
        this.outpId = outpId;
    }

    public String getPrescNo() {
        return prescNo;
    }

    public void setPrescNo(String prescNo) {
        this.prescNo = prescNo;
    }

    public String getApplyPerson() {
        return applyPerson;
    }

    public void setApplyPerson(String applyPerson) {
        this.applyPerson = applyPerson;
    }

    public String getApplyPersonName() {
        return applyPersonName;
    }

    public void setApplyPersonName(String applyPersonName) {
        this.applyPersonName = applyPersonName;
    }

    public String getApplyDepartment() {
        return applyDepartment;
    }

    public void setApplyDepartment(String applyDepartment) {
        this.applyDepartment = applyDepartment;
    }

    public String getApplyDepartmentName() {
        return applyDepartmentName;
    }

    public void setApplyDepartmentName(String applyDepartmentName) {
        this.applyDepartmentName = applyDepartmentName;
    }

    public String getChargingItem() {
        return chargingItem;
    }

    public void setChargingItem(String chargingItem) {
        this.chargingItem = chargingItem;
    }

    public String getChargingItemName() {
        return chargingItemName;
    }

    public void setChargingItemName(String chargingItemName) {
        this.chargingItemName = chargingItemName;
    }

    public String getChargingCategory() {
        return chargingCategory;
    }

    public void setChargingCategory(String chargingCategory) {
        this.chargingCategory = chargingCategory;
    }

    public String getChargingCategoryName() {
        return chargingCategoryName;
    }

    public void setChargingCategoryName(String chargingCategoryName) {
        this.chargingCategoryName = chargingCategoryName;
    }

    public String getChargingCategoryDl() {
        return chargingCategoryDl;
    }

    public void setChargingCategoryDl(String chargingCategoryDl) {
        this.chargingCategoryDl = chargingCategoryDl;
    }

    public String getChargingCategoryDlName() {
        return chargingCategoryDlName;
    }

    public void setChargingCategoryDlName(String chargingCategoryDlName) {
        this.chargingCategoryDlName = chargingCategoryDlName;
    }

    public BigDecimal getChargingItemNum() {
        return chargingItemNum;
    }

    public void setChargingItemNum(BigDecimal chargingItemNum) {
        this.chargingItemNum = chargingItemNum;
    }

    public BigDecimal getChargingItemFee() {
        return chargingItemFee;
    }

    public void setChargingItemFee(BigDecimal chargingItemFee) {
        this.chargingItemFee = chargingItemFee;
    }

    public LocalDateTime getChargingItemTime() {
        return chargingItemTime;
    }

    public void setChargingItemTime(LocalDateTime chargingItemTime) {
        this.chargingItemTime = chargingItemTime;
    }

    public String getChargingType() {
        return chargingType;
    }

    public void setChargingType(String chargingType) {
        this.chargingType = chargingType;
    }

    public String getChargingTypeName() {
        return chargingTypeName;
    }

    public void setChargingTypeName(String chargingTypeName) {
        this.chargingTypeName = chargingTypeName;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzItemdetail{" +
        "actId=" + actId +
        ", patientId=" + patientId +
        ", outpId=" + outpId +
        ", prescNo=" + prescNo +
        ", applyPerson=" + applyPerson +
        ", applyPersonName=" + applyPersonName +
        ", applyDepartment=" + applyDepartment +
        ", applyDepartmentName=" + applyDepartmentName +
        ", chargingItem=" + chargingItem +
        ", chargingItemName=" + chargingItemName +
        ", chargingCategory=" + chargingCategory +
        ", chargingCategoryName=" + chargingCategoryName +
        ", chargingCategoryDl=" + chargingCategoryDl +
        ", chargingCategoryDlName=" + chargingCategoryDlName +
        ", chargingItemNum=" + chargingItemNum +
        ", chargingItemFee=" + chargingItemFee +
        ", chargingItemTime=" + chargingItemTime +
        ", chargingType=" + chargingType +
        ", chargingTypeName=" + chargingTypeName +
        ", visitType=" + visitType +
        "}";
    }
}
