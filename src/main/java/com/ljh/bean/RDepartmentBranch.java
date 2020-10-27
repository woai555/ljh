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
public class RDepartmentBranch implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "BRANCH_CODE", type = IdType.AUTO)
    private String branchCode;

    private String deptCode;

    private String branch;

    private Integer initialvalue;


    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Integer getInitialvalue() {
        return initialvalue;
    }

    public void setInitialvalue(Integer initialvalue) {
        this.initialvalue = initialvalue;
    }

    @Override
    public String toString() {
        return "RDepartmentBranch{" +
        "branchCode=" + branchCode +
        ", deptCode=" + deptCode +
        ", branch=" + branch +
        ", initialvalue=" + initialvalue +
        "}";
    }
}
