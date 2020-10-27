package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 护理诊断档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NrsDiag implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科常用:1全院/2科室
     */
    @TableId(value = "DIAG_RNGE", type = IdType.AUTO)
    private String diagRnge;

    /**
     * 科室代码
     */
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 诊断名称
     */
    private String diagName;

    /**
     * 护理类别:1相关因素2目标3措施
     */
    private String nrsType;

    /**
     * 护理代码
     */
    private String nrsCode;


    public String getDiagRnge() {
        return diagRnge;
    }

    public void setDiagRnge(String diagRnge) {
        this.diagRnge = diagRnge;
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

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    public String getNrsType() {
        return nrsType;
    }

    public void setNrsType(String nrsType) {
        this.nrsType = nrsType;
    }

    public String getNrsCode() {
        return nrsCode;
    }

    public void setNrsCode(String nrsCode) {
        this.nrsCode = nrsCode;
    }

    @Override
    public String toString() {
        return "NrsDiag{" +
        "diagRnge=" + diagRnge +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", diagName=" + diagName +
        ", nrsType=" + nrsType +
        ", nrsCode=" + nrsCode +
        "}";
    }
}
