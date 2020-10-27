package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 绩效查询门诊挂号选择的科室代码表(R_DEPARTMENT_query)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RDepartmentQuery implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室号
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 排序
     */
    private Integer sortId;

    /**
     * 备注
     */
    private String bz;


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

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    public String toString() {
        return "RDepartmentQuery{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", sortId=" + sortId +
        ", bz=" + bz +
        "}";
    }
}
