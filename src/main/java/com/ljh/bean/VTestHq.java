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
public class VTestHq implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientid;

    private String sex;

    private LocalDateTime birthday;

    private String bedno;

    private LocalDateTime listtime;

    private String doctorname;

    private String doctorcode;

    private String deptname;

    private String deptcode;

    private String itemcode;

    private String itemname;

    private String his;

    private String patienttype;


    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getBedno() {
        return bedno;
    }

    public void setBedno(String bedno) {
        this.bedno = bedno;
    }

    public LocalDateTime getListtime() {
        return listtime;
    }

    public void setListtime(LocalDateTime listtime) {
        this.listtime = listtime;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getDoctorcode() {
        return doctorcode;
    }

    public void setDoctorcode(String doctorcode) {
        this.doctorcode = doctorcode;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getHis() {
        return his;
    }

    public void setHis(String his) {
        this.his = his;
    }

    public String getPatienttype() {
        return patienttype;
    }

    public void setPatienttype(String patienttype) {
        this.patienttype = patienttype;
    }

    @Override
    public String toString() {
        return "VTestHq{" +
        "patientid=" + patientid +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", bedno=" + bedno +
        ", listtime=" + listtime +
        ", doctorname=" + doctorname +
        ", doctorcode=" + doctorcode +
        ", deptname=" + deptname +
        ", deptcode=" + deptcode +
        ", itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", his=" + his +
        ", patienttype=" + patienttype +
        "}";
    }
}
