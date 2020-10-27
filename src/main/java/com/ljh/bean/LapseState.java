package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 转归表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LapseState implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 转归代码
     */
    @TableId(value = "STATE_CODE", type = IdType.AUTO)
    private String stateCode;

    /**
     * 转归名称
     */
    private String stateName;


    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return "LapseState{" +
        "stateCode=" + stateCode +
        ", stateName=" + stateName +
        "}";
    }
}
