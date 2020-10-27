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
public class VEmployee implements Serializable {

    private static final long serialVersionUID=1L;

    private String emplCode;

    private String emplName;

    private String emplEname;

    private String sexCode;

    private String deptCode;

    private String ynexpert;

    private String groupName;


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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getYnexpert() {
        return ynexpert;
    }

    public void setYnexpert(String ynexpert) {
        this.ynexpert = ynexpert;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "VEmployee{" +
        "emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", emplEname=" + emplEname +
        ", sexCode=" + sexCode +
        ", deptCode=" + deptCode +
        ", ynexpert=" + ynexpert +
        ", groupName=" + groupName +
        "}";
    }
}
