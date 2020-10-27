package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_DEPARTMENT
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewDepartment implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal deptCode;

    private String deptName;

    private String deptPy;

    private String deptEname;

    private String sdeptCode;

    private String hosdeptCode;

    private String emplCode;

    private String ynstatdept;

    private String ynregdept;

    private String deptType;

    private LocalDateTime operDate;

    private String operCode;


    public BigDecimal getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(BigDecimal deptCode) {
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

    public String getDeptEname() {
        return deptEname;
    }

    public void setDeptEname(String deptEname) {
        this.deptEname = deptEname;
    }

    public String getSdeptCode() {
        return sdeptCode;
    }

    public void setSdeptCode(String sdeptCode) {
        this.sdeptCode = sdeptCode;
    }

    public String getHosdeptCode() {
        return hosdeptCode;
    }

    public void setHosdeptCode(String hosdeptCode) {
        this.hosdeptCode = hosdeptCode;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getYnstatdept() {
        return ynstatdept;
    }

    public void setYnstatdept(String ynstatdept) {
        this.ynstatdept = ynstatdept;
    }

    public String getYnregdept() {
        return ynregdept;
    }

    public void setYnregdept(String ynregdept) {
        this.ynregdept = ynregdept;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
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
        return "ViewDepartment{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", deptPy=" + deptPy +
        ", deptEname=" + deptEname +
        ", sdeptCode=" + sdeptCode +
        ", hosdeptCode=" + hosdeptCode +
        ", emplCode=" + emplCode +
        ", ynstatdept=" + ynstatdept +
        ", ynregdept=" + ynregdept +
        ", deptType=" + deptType +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}
