package com.ljh.bean;

import java.math.BigDecimal;
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
public class RYbDeptLimit implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类别
     */
    @TableId(value = "TYPE_ID", type = IdType.AUTO)
    private String typeId;

    /**
     * 科室编码
     */
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 每月限额
     */
    private BigDecimal ybLimit;

    /**
     * 年份
     */
    private BigDecimal yearNum;

    /**
     * 月份
     */
    private BigDecimal monthNum;


    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
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

    public BigDecimal getYbLimit() {
        return ybLimit;
    }

    public void setYbLimit(BigDecimal ybLimit) {
        this.ybLimit = ybLimit;
    }

    public BigDecimal getYearNum() {
        return yearNum;
    }

    public void setYearNum(BigDecimal yearNum) {
        this.yearNum = yearNum;
    }

    public BigDecimal getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(BigDecimal monthNum) {
        this.monthNum = monthNum;
    }

    @Override
    public String toString() {
        return "RYbDeptLimit{" +
        "typeId=" + typeId +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", ybLimit=" + ybLimit +
        ", yearNum=" + yearNum +
        ", monthNum=" + monthNum +
        "}";
    }
}
