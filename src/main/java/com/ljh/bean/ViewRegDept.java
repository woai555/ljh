package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_REG_DEPT
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewRegDept implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String deptName;


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

    @Override
    public String toString() {
        return "ViewRegDept{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        "}";
    }
}
