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
public class JytPrivatecloudDeptlevelXy implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode1;

    private String deptName1;

    private String deptCode;

    private String name;

    private BigDecimal orderid;


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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "JytPrivatecloudDeptlevelXy{" +
        "deptCode1=" + deptCode1 +
        ", deptName1=" + deptName1 +
        ", deptCode=" + deptCode +
        ", name=" + name +
        ", orderid=" + orderid +
        "}";
    }
}
