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
public class ViewJiaheOrdersDocIndex implements Serializable {

    private static final long serialVersionUID=1L;

    private String reportNo;

    private String clinicVisitId;

    private String itemName;

    private String patientId;

    private String reportClass;

    private LocalDateTime reportDate;

    private LocalDateTime reportDateTime;

    private LocalDateTime visitDateTime;

    private String reqPhysician;

    private String reqDept;

    private String cysj;


    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo;
    }

    public String getClinicVisitId() {
        return clinicVisitId;
    }

    public void setClinicVisitId(String clinicVisitId) {
        this.clinicVisitId = clinicVisitId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getReportClass() {
        return reportClass;
    }

    public void setReportClass(String reportClass) {
        this.reportClass = reportClass;
    }

    public LocalDateTime getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDateTime reportDate) {
        this.reportDate = reportDate;
    }

    public LocalDateTime getReportDateTime() {
        return reportDateTime;
    }

    public void setReportDateTime(LocalDateTime reportDateTime) {
        this.reportDateTime = reportDateTime;
    }

    public LocalDateTime getVisitDateTime() {
        return visitDateTime;
    }

    public void setVisitDateTime(LocalDateTime visitDateTime) {
        this.visitDateTime = visitDateTime;
    }

    public String getReqPhysician() {
        return reqPhysician;
    }

    public void setReqPhysician(String reqPhysician) {
        this.reqPhysician = reqPhysician;
    }

    public String getReqDept() {
        return reqDept;
    }

    public void setReqDept(String reqDept) {
        this.reqDept = reqDept;
    }

    public String getCysj() {
        return cysj;
    }

    public void setCysj(String cysj) {
        this.cysj = cysj;
    }

    @Override
    public String toString() {
        return "ViewJiaheOrdersDocIndex{" +
        "reportNo=" + reportNo +
        ", clinicVisitId=" + clinicVisitId +
        ", itemName=" + itemName +
        ", patientId=" + patientId +
        ", reportClass=" + reportClass +
        ", reportDate=" + reportDate +
        ", reportDateTime=" + reportDateTime +
        ", visitDateTime=" + visitDateTime +
        ", reqPhysician=" + reqPhysician +
        ", reqDept=" + reqDept +
        ", cysj=" + cysj +
        "}";
    }
}
