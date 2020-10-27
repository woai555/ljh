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
public class JytPrivatecloudDepartRwzb implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode1;

    private String deptName1;

    private BigDecimal level1Order;

    private String deptCode2;

    private String deptName2;

    private BigDecimal level2Order;


    public String getDeptCode1() {
        return deptCode1;
    }

    public void setDeptCode1(String deptCode1) {
        this.deptCode1 = deptCode1;
    }

    public String getDeptName1() {
        return deptName1;
    }

    public void setDeptName1(String deptName1) {
        this.deptName1 = deptName1;
    }

    public BigDecimal getLevel1Order() {
        return level1Order;
    }

    public void setLevel1Order(BigDecimal level1Order) {
        this.level1Order = level1Order;
    }

    public String getDeptCode2() {
        return deptCode2;
    }

    public void setDeptCode2(String deptCode2) {
        this.deptCode2 = deptCode2;
    }

    public String getDeptName2() {
        return deptName2;
    }

    public void setDeptName2(String deptName2) {
        this.deptName2 = deptName2;
    }

    public BigDecimal getLevel2Order() {
        return level2Order;
    }

    public void setLevel2Order(BigDecimal level2Order) {
        this.level2Order = level2Order;
    }

    @Override
    public String toString() {
        return "JytPrivatecloudDepartRwzb{" +
        "deptCode1=" + deptCode1 +
        ", deptName1=" + deptName1 +
        ", level1Order=" + level1Order +
        ", deptCode2=" + deptCode2 +
        ", deptName2=" + deptName2 +
        ", level2Order=" + level2Order +
        "}";
    }
}
