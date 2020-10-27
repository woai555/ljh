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
public class ViewBlDepartment implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String deptName;

    private String deptPym;

    private String wardCode;

    private String wardName;

    private String isoperating;

    private String isstart;

    private String groupwork;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptPym() {
        return deptPym;
    }

    public void setDeptPym(String deptPym) {
        this.deptPym = deptPym;
    }

    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public String getIsoperating() {
        return isoperating;
    }

    public void setIsoperating(String isoperating) {
        this.isoperating = isoperating;
    }

    public String getIsstart() {
        return isstart;
    }

    public void setIsstart(String isstart) {
        this.isstart = isstart;
    }

    public String getGroupwork() {
        return groupwork;
    }

    public void setGroupwork(String groupwork) {
        this.groupwork = groupwork;
    }

    @Override
    public String toString() {
        return "ViewBlDepartment{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", deptPym=" + deptPym +
        ", wardCode=" + wardCode +
        ", wardName=" + wardName +
        ", isoperating=" + isoperating +
        ", isstart=" + isstart +
        ", groupwork=" + groupwork +
        "}";
    }
}
