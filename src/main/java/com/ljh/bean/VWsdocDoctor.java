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
public class VWsdocDoctor implements Serializable {

    private static final long serialVersionUID=1L;

    private String emplCode;

    private String emplName;

    private String deptCode;

    private String levlCode;

    private String description;

    private String speciality;

    private String sorting;


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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getLevlCode() {
        return levlCode;
    }

    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSorting() {
        return sorting;
    }

    public void setSorting(String sorting) {
        this.sorting = sorting;
    }

    @Override
    public String toString() {
        return "VWsdocDoctor{" +
        "emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", deptCode=" + deptCode +
        ", levlCode=" + levlCode +
        ", description=" + description +
        ", speciality=" + speciality +
        ", sorting=" + sorting +
        "}";
    }
}
