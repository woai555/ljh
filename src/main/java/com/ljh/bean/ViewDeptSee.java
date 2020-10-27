package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class ViewDeptSee implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String deptName;

    private BigDecimal regNum;

    private LocalDateTime regDate;

    private BigDecimal regFee;

    private BigDecimal clinicIncome;


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

    public BigDecimal getRegNum() {
        return regNum;
    }

    public void setRegNum(BigDecimal regNum) {
        this.regNum = regNum;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public BigDecimal getRegFee() {
        return regFee;
    }

    public void setRegFee(BigDecimal regFee) {
        this.regFee = regFee;
    }

    public BigDecimal getClinicIncome() {
        return clinicIncome;
    }

    public void setClinicIncome(BigDecimal clinicIncome) {
        this.clinicIncome = clinicIncome;
    }

    @Override
    public String toString() {
        return "ViewDeptSee{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", regNum=" + regNum +
        ", regDate=" + regDate +
        ", regFee=" + regFee +
        ", clinicIncome=" + clinicIncome +
        "}";
    }
}
