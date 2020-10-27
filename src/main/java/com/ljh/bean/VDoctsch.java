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
public class VDoctsch implements Serializable {

    private static final long serialVersionUID=1L;

    private String departmentcode;

    private String departmentname;

    private String doctorcode;

    private String doctorname;

    private LocalDateTime dutydate;

    private String am;

    private BigDecimal regmaxcount;

    private String isregtype;

    private String optcode;

    private String optname;

    private String roomno;

    private String roomname;

    private String diagnosisdeskno;

    private String diagnosisdeskname;


    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDoctorcode() {
        return doctorcode;
    }

    public void setDoctorcode(String doctorcode) {
        this.doctorcode = doctorcode;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public LocalDateTime getDutydate() {
        return dutydate;
    }

    public void setDutydate(LocalDateTime dutydate) {
        this.dutydate = dutydate;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public BigDecimal getRegmaxcount() {
        return regmaxcount;
    }

    public void setRegmaxcount(BigDecimal regmaxcount) {
        this.regmaxcount = regmaxcount;
    }

    public String getIsregtype() {
        return isregtype;
    }

    public void setIsregtype(String isregtype) {
        this.isregtype = isregtype;
    }

    public String getOptcode() {
        return optcode;
    }

    public void setOptcode(String optcode) {
        this.optcode = optcode;
    }

    public String getOptname() {
        return optname;
    }

    public void setOptname(String optname) {
        this.optname = optname;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getDiagnosisdeskno() {
        return diagnosisdeskno;
    }

    public void setDiagnosisdeskno(String diagnosisdeskno) {
        this.diagnosisdeskno = diagnosisdeskno;
    }

    public String getDiagnosisdeskname() {
        return diagnosisdeskname;
    }

    public void setDiagnosisdeskname(String diagnosisdeskname) {
        this.diagnosisdeskname = diagnosisdeskname;
    }

    @Override
    public String toString() {
        return "VDoctsch{" +
        "departmentcode=" + departmentcode +
        ", departmentname=" + departmentname +
        ", doctorcode=" + doctorcode +
        ", doctorname=" + doctorname +
        ", dutydate=" + dutydate +
        ", am=" + am +
        ", regmaxcount=" + regmaxcount +
        ", isregtype=" + isregtype +
        ", optcode=" + optcode +
        ", optname=" + optname +
        ", roomno=" + roomno +
        ", roomname=" + roomname +
        ", diagnosisdeskno=" + diagnosisdeskno +
        ", diagnosisdeskname=" + diagnosisdeskname +
        "}";
    }
}
