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
public class REmployeeMrmbase implements Serializable {

    private static final long serialVersionUID=1L;

    private String emplCode;

    private String emplName;

    private String emplEname;

    private String sexCode;

    private Integer age;

    private String posiCode;

    private String levlCode;

    private String idenno;

    private String deptCode;

    private String nurseCellCode;

    private String speciality;

    private String ynexpert;

    private String emplType;

    private String ynlistdrug;

    private LocalDateTime operDate;

    private String operCode;


    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getEmplEname() {
        return emplEname;
    }

    public void setEmplEname(String emplEname) {
        this.emplEname = emplEname;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosiCode() {
        return posiCode;
    }

    public void setPosiCode(String posiCode) {
        this.posiCode = posiCode;
    }

    public String getLevlCode() {
        return levlCode;
    }

    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getNurseCellCode() {
        return nurseCellCode;
    }

    public void setNurseCellCode(String nurseCellCode) {
        this.nurseCellCode = nurseCellCode;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getYnexpert() {
        return ynexpert;
    }

    public void setYnexpert(String ynexpert) {
        this.ynexpert = ynexpert;
    }

    public String getEmplType() {
        return emplType;
    }

    public void setEmplType(String emplType) {
        this.emplType = emplType;
    }

    public String getYnlistdrug() {
        return ynlistdrug;
    }

    public void setYnlistdrug(String ynlistdrug) {
        this.ynlistdrug = ynlistdrug;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    @Override
    public String toString() {
        return "REmployeeMrmbase{" +
        "emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", emplEname=" + emplEname +
        ", sexCode=" + sexCode +
        ", age=" + age +
        ", posiCode=" + posiCode +
        ", levlCode=" + levlCode +
        ", idenno=" + idenno +
        ", deptCode=" + deptCode +
        ", nurseCellCode=" + nurseCellCode +
        ", speciality=" + speciality +
        ", ynexpert=" + ynexpert +
        ", emplType=" + emplType +
        ", ynlistdrug=" + ynlistdrug +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}
