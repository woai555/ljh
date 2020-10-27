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
public class ViewMovenurseEmOutHospital implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String visitId;

    private String name;

    private String wardCode;

    private String deptCode;

    private String bedNo;

    private LocalDateTime admissionDateTime;

    private LocalDateTime dischargeDateTime;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public LocalDateTime getAdmissionDateTime() {
        return admissionDateTime;
    }

    public void setAdmissionDateTime(LocalDateTime admissionDateTime) {
        this.admissionDateTime = admissionDateTime;
    }

    public LocalDateTime getDischargeDateTime() {
        return dischargeDateTime;
    }

    public void setDischargeDateTime(LocalDateTime dischargeDateTime) {
        this.dischargeDateTime = dischargeDateTime;
    }

    @Override
    public String toString() {
        return "ViewMovenurseEmOutHospital{" +
        "patientId=" + patientId +
        ", visitId=" + visitId +
        ", name=" + name +
        ", wardCode=" + wardCode +
        ", deptCode=" + deptCode +
        ", bedNo=" + bedNo +
        ", admissionDateTime=" + admissionDateTime +
        ", dischargeDateTime=" + dischargeDateTime +
        "}";
    }
}
