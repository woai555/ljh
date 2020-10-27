package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊科室限制开立诊断维护表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdDiagDept implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    private String icdCode;

    private String icdName;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    @Override
    public String toString() {
        return "OrdDiagDept{" +
        "deptCode=" + deptCode +
        ", icdCode=" + icdCode +
        ", icdName=" + icdName +
        "}";
    }
}
