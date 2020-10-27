package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 大科代码表(R_SupDepartment)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RSupdepartment implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 大科代号
     */
    @TableId(value = "SDEPT_CODE", type = IdType.AUTO)
    private String sdeptCode;

    /**
     * 大科名称
     */
    private String sdeptName;

    /**
     * 大科拼音
     */
    private String sdeptPy;

    /**
     * 大科英文名称
     */
    private String sdeptEname;

    /**
     * 所属职能部门
     */
    private String branchCode;

    /**
     * 负责人代号
     */
    private String emplCode;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;


    public String getSdeptCode() {
        return sdeptCode;
    }

    public void setSdeptCode(String sdeptCode) {
        this.sdeptCode = sdeptCode;
    }

    public String getSdeptName() {
        return sdeptName;
    }

    public void setSdeptName(String sdeptName) {
        this.sdeptName = sdeptName;
    }

    public String getSdeptPy() {
        return sdeptPy;
    }

    public void setSdeptPy(String sdeptPy) {
        this.sdeptPy = sdeptPy;
    }

    public String getSdeptEname() {
        return sdeptEname;
    }

    public void setSdeptEname(String sdeptEname) {
        this.sdeptEname = sdeptEname;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
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
        return "RSupdepartment{" +
        "sdeptCode=" + sdeptCode +
        ", sdeptName=" + sdeptName +
        ", sdeptPy=" + sdeptPy +
        ", sdeptEname=" + sdeptEname +
        ", branchCode=" + branchCode +
        ", emplCode=" + emplCode +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}
