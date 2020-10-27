package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 诊间医生常用诊断表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdDeptdiag implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 诊断科室
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 诊断类型
     */
    private String diagType;

    /**
     * 诊断代码
     */
    private String diagCode;

    /**
     * 诊断名称
     */
    private String diagName;

    /**
     * 诊断拼音码
     */
    private String diagSpell;

    /**
     * 诊断助记名称
     */
    private String diagChname;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDiagType() {
        return diagType;
    }

    public void setDiagType(String diagType) {
        this.diagType = diagType;
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode;
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    public String getDiagSpell() {
        return diagSpell;
    }

    public void setDiagSpell(String diagSpell) {
        this.diagSpell = diagSpell;
    }

    public String getDiagChname() {
        return diagChname;
    }

    public void setDiagChname(String diagChname) {
        this.diagChname = diagChname;
    }

    @Override
    public String toString() {
        return "OrdDeptdiag{" +
        "deptCode=" + deptCode +
        ", diagType=" + diagType +
        ", diagCode=" + diagCode +
        ", diagName=" + diagName +
        ", diagSpell=" + diagSpell +
        ", diagChname=" + diagChname +
        "}";
    }
}
