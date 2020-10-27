package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 挂号员控制挂号科室维护
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RegisterVsDept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 挂号员编码
     */
    @TableId(value = "REGISTER", type = IdType.AUTO)
    private String register;

    /**
     * 科室编码
     */
    private String deptCode;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
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
        return "RegisterVsDept{" +
        "register=" + register +
        ", deptCode=" + deptCode +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
