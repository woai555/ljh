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
public class ViewInpatient implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private BigDecimal inpatientNum;

    private BigDecimal cityInsurNum;

    private BigDecimal proInsurNum;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getInpatientNum() {
        return inpatientNum;
    }

    public void setInpatientNum(BigDecimal inpatientNum) {
        this.inpatientNum = inpatientNum;
    }

    public BigDecimal getCityInsurNum() {
        return cityInsurNum;
    }

    public void setCityInsurNum(BigDecimal cityInsurNum) {
        this.cityInsurNum = cityInsurNum;
    }

    public BigDecimal getProInsurNum() {
        return proInsurNum;
    }

    public void setProInsurNum(BigDecimal proInsurNum) {
        this.proInsurNum = proInsurNum;
    }

    @Override
    public String toString() {
        return "ViewInpatient{" +
        "deptCode=" + deptCode +
        ", inpatientNum=" + inpatientNum +
        ", cityInsurNum=" + cityInsurNum +
        ", proInsurNum=" + proInsurNum +
        "}";
    }
}
