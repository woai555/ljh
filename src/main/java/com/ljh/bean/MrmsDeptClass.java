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
public class MrmsDeptClass implements Serializable {

    private static final long serialVersionUID=1L;

    private String classCode;

    private String className;

    private String classDeptcode;

    private String classDeptname;

    private String deptCode;

    private String officeDept;

    private Long sortNumber;

    private String parType;

    private String ynvalid;

    private String deptName;

    private Integer bedStand;

    private String ifhand;

    private String ifshow;


    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassDeptcode() {
        return classDeptcode;
    }

    public void setClassDeptcode(String classDeptcode) {
        this.classDeptcode = classDeptcode;
    }

    public String getClassDeptname() {
        return classDeptname;
    }

    public void setClassDeptname(String classDeptname) {
        this.classDeptname = classDeptname;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getOfficeDept() {
        return officeDept;
    }

    public void setOfficeDept(String officeDept) {
        this.officeDept = officeDept;
    }

    public Long getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Long sortNumber) {
        this.sortNumber = sortNumber;
    }

    public String getParType() {
        return parType;
    }

    public void setParType(String parType) {
        this.parType = parType;
    }

    public String getYnvalid() {
        return ynvalid;
    }

    public void setYnvalid(String ynvalid) {
        this.ynvalid = ynvalid;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getBedStand() {
        return bedStand;
    }

    public void setBedStand(Integer bedStand) {
        this.bedStand = bedStand;
    }

    public String getIfhand() {
        return ifhand;
    }

    public void setIfhand(String ifhand) {
        this.ifhand = ifhand;
    }

    public String getIfshow() {
        return ifshow;
    }

    public void setIfshow(String ifshow) {
        this.ifshow = ifshow;
    }

    @Override
    public String toString() {
        return "MrmsDeptClass{" +
        "classCode=" + classCode +
        ", className=" + className +
        ", classDeptcode=" + classDeptcode +
        ", classDeptname=" + classDeptname +
        ", deptCode=" + deptCode +
        ", officeDept=" + officeDept +
        ", sortNumber=" + sortNumber +
        ", parType=" + parType +
        ", ynvalid=" + ynvalid +
        ", deptName=" + deptName +
        ", bedStand=" + bedStand +
        ", ifhand=" + ifhand +
        ", ifshow=" + ifshow +
        "}";
    }
}
