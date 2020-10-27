package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 非药品系统类别
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class UndrugSysClass implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类别代码
     */
    @TableId(value = "CLASS_CODE", type = IdType.AUTO)
    private String classCode;

    /**
     * 类别名称
     */
    private String className;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;


    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    @Override
    public String toString() {
        return "UndrugSysClass{" +
        "classCode=" + classCode +
        ", className=" + className +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}
