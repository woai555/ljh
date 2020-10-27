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
public class RConstantDeploy implements Serializable {

    private static final long serialVersionUID=1L;

    private String constantCode;

    private String constantName;

    private String constantValue;


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

    @Override
    public String toString() {
        return "RConstantDeploy{" +
        "constantCode=" + constantCode +
        ", constantName=" + constantName +
        ", constantValue=" + constantValue +
        "}";
    }
}
