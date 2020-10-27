package com.ljh.bean;

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
public class RegisterVsDeptUnnecessary implements Serializable {

    private static final long serialVersionUID=1L;

    private String register;

    private String deptCode;

    private String operCode;

    private LocalDateTime operDate;


    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "RegisterVsDeptUnnecessary{" +
        "register=" + register +
        ", deptCode=" + deptCode +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
