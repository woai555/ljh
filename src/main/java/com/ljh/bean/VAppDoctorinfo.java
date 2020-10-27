package com.ljh.bean;

import com.alibaba.fastjson.annotation.JSONType;
import com.baomidou.mybatisplus.annotation.IdType;
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
@JSONType(orders = {"doctorname","doctorid","deptid","deptname","medilevel","titleshown","sex"})
public class VAppDoctorinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String doctorname;

    private String doctorid;

    private String deptid;

    private String deptname;

    private String medilevel;

    private String titleshown;

    private String sex;


    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getMedilevel() {
        return medilevel;
    }

    public void setMedilevel(String medilevel) {
        this.medilevel = medilevel;
    }

    public String getTitleshown() {
        return titleshown;
    }

    public void setTitleshown(String titleshown) {
        this.titleshown = titleshown;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "VAppDoctorinfo{" +
        "doctorname=" + doctorname +
        ", doctorid=" + doctorid +
        ", deptid=" + deptid +
        ", deptname=" + deptname +
        ", medilevel=" + medilevel +
        ", titleshown=" + titleshown +
        ", sex=" + sex +
        "}";
    }
}
