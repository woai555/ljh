package com.ljh.bean;

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
public class VDoctorinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String doctorcode;

    private String doctorname;

    private String departmentcode;

    private String departmentname;

    private String isexpert;

    private String loginName;


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

    public String getIsexpert() {
        return isexpert;
    }

    public void setIsexpert(String isexpert) {
        this.isexpert = isexpert;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String toString() {
        return "VDoctorinfo{" +
        "doctorcode=" + doctorcode +
        ", doctorname=" + doctorname +
        ", departmentcode=" + departmentcode +
        ", departmentname=" + departmentname +
        ", isexpert=" + isexpert +
        ", loginName=" + loginName +
        "}";
    }
}
