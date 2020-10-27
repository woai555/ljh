package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_DEPT_REG
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewDeptReg implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String deptName;

    private BigDecimal regNum;

    private BigDecimal regFee;

    private LocalDateTime regDate;


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

    public BigDecimal getRegFee() {
        return regFee;
    }

    public void setRegFee(BigDecimal regFee) {
        this.regFee = regFee;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "ViewDeptReg{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", regNum=" + regNum +
        ", regFee=" + regFee +
        ", regDate=" + regDate +
        "}";
    }
}
