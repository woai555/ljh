package com.ljh.bean;

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
public class JytPrivatecloudDeptlevel11 implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode1;

    private String deptName1;


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

    @Override
    public String toString() {
        return "JytPrivatecloudDeptlevel11{" +
        "deptCode1=" + deptCode1 +
        ", deptName1=" + deptName1 +
        "}";
    }
}
