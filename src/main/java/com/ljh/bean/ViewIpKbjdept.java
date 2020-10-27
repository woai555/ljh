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
public class ViewIpKbjdept implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String deptName;

    private String officeDept;


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

    public String getOfficeDept() {
        return officeDept;
    }

    public void setOfficeDept(String officeDept) {
        this.officeDept = officeDept;
    }

    @Override
    public String toString() {
        return "ViewIpKbjdept{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", officeDept=" + officeDept +
        "}";
    }
}
