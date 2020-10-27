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
public class ViewEmDepartment implements Serializable {

    private static final long serialVersionUID=1L;

    private String serial;

    private String deptCode;

    private String deptName;

    private String deptAlias;


    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

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

    public String getDeptAlias() {
        return deptAlias;
    }

    public void setDeptAlias(String deptAlias) {
        this.deptAlias = deptAlias;
    }

    @Override
    public String toString() {
        return "ViewEmDepartment{" +
        "serial=" + serial +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", deptAlias=" + deptAlias +
        "}";
    }
}
