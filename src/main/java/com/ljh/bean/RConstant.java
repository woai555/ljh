package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 常数表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RConstant implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 常数代码
     */
    @TableId(value = "CONSTANT_CODE", type = IdType.AUTO)
    private String constantCode;

    /**
     * 常数名称
     */
    private String constantName;

    /**
     * 常数值
     */
    private String constantValue;

    /**
     * 时间
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 函数对于常数值-gf_getpara
     */
    private String consistantDefault;


    public String getConstantCode() {
        return constantCode;
    }

    public void setConstantCode(String constantCode) {
        this.constantCode = constantCode;
    }

    public String getConstantName() {
        return constantName;
    }

    public void setConstantName(String constantName) {
        this.constantName = constantName;
    }

    public String getConstantValue() {
        return constantValue;
    }

    public void setConstantValue(String constantValue) {
        this.constantValue = constantValue;
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

    public String getConsistantDefault() {
        return consistantDefault;
    }

    public void setConsistantDefault(String consistantDefault) {
        this.consistantDefault = consistantDefault;
    }

    @Override
    public String toString() {
        return "RConstant{" +
        "constantCode=" + constantCode +
        ", constantName=" + constantName +
        ", constantValue=" + constantValue +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", consistantDefault=" + consistantDefault +
        "}";
    }
}
