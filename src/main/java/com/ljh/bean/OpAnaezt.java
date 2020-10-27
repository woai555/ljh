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
public class OpAnaezt implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    private String ztCode;

    private String ztName;

    private String ztSpell;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getZtCode() {
        return ztCode;
    }

    public void setZtCode(String ztCode) {
        this.ztCode = ztCode;
    }

    public String getZtName() {
        return ztName;
    }

    public void setZtName(String ztName) {
        this.ztName = ztName;
    }

    public String getZtSpell() {
        return ztSpell;
    }

    public void setZtSpell(String ztSpell) {
        this.ztSpell = ztSpell;
    }

    @Override
    public String toString() {
        return "OpAnaezt{" +
        "deptCode=" + deptCode +
        ", ztCode=" + ztCode +
        ", ztName=" + ztName +
        ", ztSpell=" + ztSpell +
        "}";
    }
}
