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
public class ViewJiaheMzReceivepat implements Serializable {

    private static final long serialVersionUID=1L;

    private String actId;

    private String patientId;

    private String outpId;

    private LocalDateTime visitTime;

    private String visitDept;

    private String visitDeptName;

    private String doctor;

    private String doctorName;

    private LocalDateTime arriveTime;


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

    public LocalDateTime getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(LocalDateTime visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitDept() {
        return visitDept;
    }

    public void setVisitDept(String visitDept) {
        this.visitDept = visitDept;
    }

    public String getVisitDeptName() {
        return visitDeptName;
    }

    public void setVisitDeptName(String visitDeptName) {
        this.visitDeptName = visitDeptName;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public LocalDateTime getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(LocalDateTime arriveTime) {
        this.arriveTime = arriveTime;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzReceivepat{" +
        "actId=" + actId +
        ", patientId=" + patientId +
        ", outpId=" + outpId +
        ", visitTime=" + visitTime +
        ", visitDept=" + visitDept +
        ", visitDeptName=" + visitDeptName +
        ", doctor=" + doctor +
        ", doctorName=" + doctorName +
        ", arriveTime=" + arriveTime +
        "}";
    }
}
