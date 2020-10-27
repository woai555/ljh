package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 统计科室信息
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class StatDept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 统计科室代码
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 统计科室名称
     */
    private String deptName;

    /**
     * 统计科室 层次
     */
    private Integer deptTier;

    private String deptType;


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

    public Integer getDeptTier() {
        return deptTier;
    }

    public void setDeptTier(Integer deptTier) {
        this.deptTier = deptTier;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    @Override
    public String toString() {
        return "StatDept{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", deptTier=" + deptTier +
        ", deptType=" + deptType +
        "}";
    }
}
