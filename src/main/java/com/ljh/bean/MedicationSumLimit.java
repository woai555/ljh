package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用药金额限制
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MedicationSumLimit implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室代码
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 科室用药金额限额
     */
    private BigDecimal medicationSum;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getMedicationSum() {
        return medicationSum;
    }

    public void setMedicationSum(BigDecimal medicationSum) {
        this.medicationSum = medicationSum;
    }

    @Override
    public String toString() {
        return "MedicationSumLimit{" +
        "deptCode=" + deptCode +
        ", medicationSum=" + medicationSum +
        "}";
    }
}
