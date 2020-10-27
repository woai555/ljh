package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 职能部门代码表R_BRANCH
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RBranch implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 职能部门代号
     */
    @TableId(value = "BRANCH_CODE", type = IdType.AUTO)
    private String branchCode;

    /**
     * 职能部门拼音
     */
    private String branchPy;

    /**
     * 职能部门名称
     */
    private String branchName;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;


    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchPy() {
        return branchPy;
    }

    public void setBranchPy(String branchPy) {
        this.branchPy = branchPy;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
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
        return "RBranch{" +
        "branchCode=" + branchCode +
        ", branchPy=" + branchPy +
        ", branchName=" + branchName +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}
