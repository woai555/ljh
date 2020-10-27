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
public class LPermission implements Serializable {

    private static final long serialVersionUID=1L;

    private String employeeId;

    private String employeePermission;

    private String employeeGroup;


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeePermission() {
        return employeePermission;
    }

    public void setEmployeePermission(String employeePermission) {
        this.employeePermission = employeePermission;
    }

    public String getEmployeeGroup() {
        return employeeGroup;
    }

    public void setEmployeeGroup(String employeeGroup) {
        this.employeeGroup = employeeGroup;
    }

    @Override
    public String toString() {
        return "LPermission{" +
        "employeeId=" + employeeId +
        ", employeePermission=" + employeePermission +
        ", employeeGroup=" + employeeGroup +
        "}";
    }
}
