package com.ljh.bean;

import java.math.BigDecimal;
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
public class RDepartmentXiny implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

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

    private String linkMzdept;

    private BigDecimal checkTotCost;

    private BigDecimal checkDrugCost;

    private String hosBranch;

    private String ybInterconnect;

    private String ifEnabledca;

    private String jcptno;

    private String deptNameAlias;


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

    public String getLinkMzdept() {
        return linkMzdept;
    }

    public void setLinkMzdept(String linkMzdept) {
        this.linkMzdept = linkMzdept;
    }

    public BigDecimal getCheckTotCost() {
        return checkTotCost;
    }

    public void setCheckTotCost(BigDecimal checkTotCost) {
        this.checkTotCost = checkTotCost;
    }

    public BigDecimal getCheckDrugCost() {
        return checkDrugCost;
    }

    public void setCheckDrugCost(BigDecimal checkDrugCost) {
        this.checkDrugCost = checkDrugCost;
    }

    public String getHosBranch() {
        return hosBranch;
    }

    public void setHosBranch(String hosBranch) {
        this.hosBranch = hosBranch;
    }

    public String getYbInterconnect() {
        return ybInterconnect;
    }

    public void setYbInterconnect(String ybInterconnect) {
        this.ybInterconnect = ybInterconnect;
    }

    public String getIfEnabledca() {
        return ifEnabledca;
    }

    public void setIfEnabledca(String ifEnabledca) {
        this.ifEnabledca = ifEnabledca;
    }

    public String getJcptno() {
        return jcptno;
    }

    public void setJcptno(String jcptno) {
        this.jcptno = jcptno;
    }

    public String getDeptNameAlias() {
        return deptNameAlias;
    }

    public void setDeptNameAlias(String deptNameAlias) {
        this.deptNameAlias = deptNameAlias;
    }

    @Override
    public String toString() {
        return "RDepartmentXiny{" +
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
        ", linkMzdept=" + linkMzdept +
        ", checkTotCost=" + checkTotCost +
        ", checkDrugCost=" + checkDrugCost +
        ", hosBranch=" + hosBranch +
        ", ybInterconnect=" + ybInterconnect +
        ", ifEnabledca=" + ifEnabledca +
        ", jcptno=" + jcptno +
        ", deptNameAlias=" + deptNameAlias +
        "}";
    }
}
