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
public class VRegdept implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String deptName;

    private String deptPy;

    private String hosBranch;

    private String ybdept;


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

    public String getDeptPy() {
        return deptPy;
    }

    public void setDeptPy(String deptPy) {
        this.deptPy = deptPy;
    }

    public String getHosBranch() {
        return hosBranch;
    }

    public void setHosBranch(String hosBranch) {
        this.hosBranch = hosBranch;
    }

    public String getYbdept() {
        return ybdept;
    }

    public void setYbdept(String ybdept) {
        this.ybdept = ybdept;
    }

    @Override
    public String toString() {
        return "VRegdept{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", deptPy=" + deptPy +
        ", hosBranch=" + hosBranch +
        ", ybdept=" + ybdept +
        "}";
    }
}
