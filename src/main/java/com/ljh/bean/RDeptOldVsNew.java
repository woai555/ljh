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
public class RDeptOldVsNew implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String deptName;

    private String deptCodeNew;

    private String deptNameNew;


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

    public String getDeptCodeNew() {
        return deptCodeNew;
    }

    public void setDeptCodeNew(String deptCodeNew) {
        this.deptCodeNew = deptCodeNew;
    }

    public String getDeptNameNew() {
        return deptNameNew;
    }

    public void setDeptNameNew(String deptNameNew) {
        this.deptNameNew = deptNameNew;
    }

    @Override
    public String toString() {
        return "RDeptOldVsNew{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", deptCodeNew=" + deptCodeNew +
        ", deptNameNew=" + deptNameNew +
        "}";
    }
}
