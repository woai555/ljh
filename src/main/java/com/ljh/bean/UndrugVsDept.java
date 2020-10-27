package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 收费项目执行科室对照表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class UndrugVsDept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 非药品院内代码
     */
    @TableId(value = "UNDRUG_CODE", type = IdType.AUTO)
    private String undrugCode;

    /**
     * 非药品名称
     */
    private String undrugName;

    /**
     * 所属科室代码
     */
    private String deptCode;

    /**
     * 所属科室名称
     */
    private String deptName;


    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getUndrugName() {
        return undrugName;
    }

    public void setUndrugName(String undrugName) {
        this.undrugName = undrugName;
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

    @Override
    public String toString() {
        return "UndrugVsDept{" +
        "undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        "}";
    }
}
