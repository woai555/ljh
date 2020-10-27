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
public class ViewJiaheMzDeptment implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String deptName;

    private String deptPy;

    private BigDecimal ynemergency;


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

    public String getDeptPy() {
        return deptPy;
    }

    public void setDeptPy(String deptPy) {
        this.deptPy = deptPy;
    }

    public BigDecimal getYnemergency() {
        return ynemergency;
    }

    public void setYnemergency(BigDecimal ynemergency) {
        this.ynemergency = ynemergency;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzDeptment{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", deptPy=" + deptPy +
        ", ynemergency=" + ynemergency +
        "}";
    }
}
