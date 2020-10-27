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
public class VAppInspectionappquerylist implements Serializable {

    private static final long serialVersionUID=1L;

    private String mcardNo;

    private String cardnoJyt;

    private String name;

    private String idCardType;

    private String idCard;

    private LocalDateTime operDate;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String itemName;

    private String inspectionDeptName;

    private String inspectionDeptId;

    private String inspectionPlace;

    private LocalDateTime appPrintTime;

    private String inspectionNo;

    private String visitId;

    private String inspectionId;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
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

    public String getInspectionNo() {
        return inspectionNo;
    }

    public void setInspectionNo(String inspectionNo) {
        this.inspectionNo = inspectionNo;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId;
    }

    @Override
    public String toString() {
        return "VAppInspectionappquerylist{" +
        "mcardNo=" + mcardNo +
        ", cardnoJyt=" + cardnoJyt +
        ", name=" + name +
        ", idCardType=" + idCardType +
        ", idCard=" + idCard +
        ", operDate=" + operDate +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", itemName=" + itemName +
        ", inspectionDeptName=" + inspectionDeptName +
        ", inspectionDeptId=" + inspectionDeptId +
        ", inspectionPlace=" + inspectionPlace +
        ", appPrintTime=" + appPrintTime +
        ", inspectionNo=" + inspectionNo +
        ", visitId=" + visitId +
        ", inspectionId=" + inspectionId +
        "}";
    }
}
