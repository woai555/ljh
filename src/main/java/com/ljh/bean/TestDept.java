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
public class TestDept implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "DEPT_ID", type = IdType.AUTO)
    private BigDecimal deptId;

    private String deptName;


    public BigDecimal getDeptId() {
        return deptId;
    }

    public void setDeptId(BigDecimal deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "TestDept{" +
        "deptId=" + deptId +
        ", deptName=" + deptName +
        "}";
    }
}
