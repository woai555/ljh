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
public class ViewRwzbConsisConstantset implements Serializable {

    private static final long serialVersionUID=1L;

    private String constantCode;

    private String constantName;

    private String consistantDefault;

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

    public String getConsistantDefault() {
        return consistantDefault;
    }

    public void setConsistantDefault(String consistantDefault) {
        this.consistantDefault = consistantDefault;
    }

    public String getConstantValue() {
        return constantValue;
    }

    public void setConstantValue(String constantValue) {
        this.constantValue = constantValue;
    }

    @Override
    public String toString() {
        return "ViewRwzbConsisConstantset{" +
        "constantCode=" + constantCode +
        ", constantName=" + constantName +
        ", consistantDefault=" + consistantDefault +
        ", constantValue=" + constantValue +
        "}";
    }
}
