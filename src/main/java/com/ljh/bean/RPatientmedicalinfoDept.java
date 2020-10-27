package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病人病历流转科室(R_PATIENTMEDICALINFO_DEPT)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPatientmedicalinfoDept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 序号
     */
    private BigDecimal serialno;

    /**
     * 科室代码
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 输入码
     */
    private String inputCode;


    public BigDecimal getSerialno() {
        return serialno;
    }

    public void setSerialno(BigDecimal serialno) {
        this.serialno = serialno;
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

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    @Override
    public String toString() {
        return "RPatientmedicalinfoDept{" +
        "serialno=" + serialno +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", inputCode=" + inputCode +
        "}";
    }
}
