package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊单机版基本常数设置
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RMzdjbRon implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 一组设置是否有效 TRUE有效FALSE无效
     */
    private String type;

    /**
     * 常数值(执行状态)
     */
    private String constantCode;

    /**
     * 常数名称
     */
    private String constantName;

    /**
     * 常数值[]
     */
    private String constantValue;

    /**
     * 操作人
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
        return "RMzdjbRon{" +
        "type=" + type +
        ", constantCode=" + constantCode +
        ", constantName=" + constantName +
        ", constantValue=" + constantValue +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
