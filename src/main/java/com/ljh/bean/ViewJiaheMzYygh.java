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
public class ViewJiaheMzYygh implements Serializable {

    private static final long serialVersionUID=1L;

    private String actId;

    private String patientId;

    private String appointmentId;

    private String name;

    private String idTypeName;

    private String idNo;

    private LocalDateTime dateOfBirth;

    private String staffEmployee;

    private String staffEmployeeName;

    private String staffDepartment;

    private String staffDepartmentName;

    private LocalDateTime operationTime;

    private BigDecimal appointmentSource;

    private String appointmentSourceName;

    private String appointmentStatus;

    private String appointmentStatusName;

    private String appointmentDept;

    private String appointmentDeptName;

    private String doctorLevel;

    private String doctorLevelName;

    private String doctorTitle;

    private LocalDateTime inspectionAppointmentTime;

    private String dayPart;

    private String dayPartName;


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

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdTypeName() {
        return idTypeName;
    }

    public void setIdTypeName(String idTypeName) {
        this.idTypeName = idTypeName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStaffEmployee() {
        return staffEmployee;
    }

    public void setStaffEmployee(String staffEmployee) {
        this.staffEmployee = staffEmployee;
    }

    public String getStaffEmployeeName() {
        return staffEmployeeName;
    }

    public void setStaffEmployeeName(String staffEmployeeName) {
        this.staffEmployeeName = staffEmployeeName;
    }

    public String getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(String staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    public String getStaffDepartmentName() {
        return staffDepartmentName;
    }

    public void setStaffDepartmentName(String staffDepartmentName) {
        this.staffDepartmentName = staffDepartmentName;
    }

    public LocalDateTime getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(LocalDateTime operationTime) {
        this.operationTime = operationTime;
    }

    public BigDecimal getAppointmentSource() {
        return appointmentSource;
    }

    public void setAppointmentSource(BigDecimal appointmentSource) {
        this.appointmentSource = appointmentSource;
    }

    public String getAppointmentSourceName() {
        return appointmentSourceName;
    }

    public void setAppointmentSourceName(String appointmentSourceName) {
        this.appointmentSourceName = appointmentSourceName;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public String getAppointmentStatusName() {
        return appointmentStatusName;
    }

    public void setAppointmentStatusName(String appointmentStatusName) {
        this.appointmentStatusName = appointmentStatusName;
    }

    public String getAppointmentDept() {
        return appointmentDept;
    }

    public void setAppointmentDept(String appointmentDept) {
        this.appointmentDept = appointmentDept;
    }

    public String getAppointmentDeptName() {
        return appointmentDeptName;
    }

    public void setAppointmentDeptName(String appointmentDeptName) {
        this.appointmentDeptName = appointmentDeptName;
    }

    public String getDoctorLevel() {
        return doctorLevel;
    }

    public void setDoctorLevel(String doctorLevel) {
        this.doctorLevel = doctorLevel;
    }

    public String getDoctorLevelName() {
        return doctorLevelName;
    }

    public void setDoctorLevelName(String doctorLevelName) {
        this.doctorLevelName = doctorLevelName;
    }

    public String getDoctorTitle() {
        return doctorTitle;
    }

    public void setDoctorTitle(String doctorTitle) {
        this.doctorTitle = doctorTitle;
    }

    public LocalDateTime getInspectionAppointmentTime() {
        return inspectionAppointmentTime;
    }

    public void setInspectionAppointmentTime(LocalDateTime inspectionAppointmentTime) {
        this.inspectionAppointmentTime = inspectionAppointmentTime;
    }

    public String getDayPart() {
        return dayPart;
    }

    public void setDayPart(String dayPart) {
        this.dayPart = dayPart;
    }

    public String getDayPartName() {
        return dayPartName;
    }

    public void setDayPartName(String dayPartName) {
        this.dayPartName = dayPartName;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzYygh{" +
        "actId=" + actId +
        ", patientId=" + patientId +
        ", appointmentId=" + appointmentId +
        ", name=" + name +
        ", idTypeName=" + idTypeName +
        ", idNo=" + idNo +
        ", dateOfBirth=" + dateOfBirth +
        ", staffEmployee=" + staffEmployee +
        ", staffEmployeeName=" + staffEmployeeName +
        ", staffDepartment=" + staffDepartment +
        ", staffDepartmentName=" + staffDepartmentName +
        ", operationTime=" + operationTime +
        ", appointmentSource=" + appointmentSource +
        ", appointmentSourceName=" + appointmentSourceName +
        ", appointmentStatus=" + appointmentStatus +
        ", appointmentStatusName=" + appointmentStatusName +
        ", appointmentDept=" + appointmentDept +
        ", appointmentDeptName=" + appointmentDeptName +
        ", doctorLevel=" + doctorLevel +
        ", doctorLevelName=" + doctorLevelName +
        ", doctorTitle=" + doctorTitle +
        ", inspectionAppointmentTime=" + inspectionAppointmentTime +
        ", dayPart=" + dayPart +
        ", dayPartName=" + dayPartName +
        "}";
    }
}
