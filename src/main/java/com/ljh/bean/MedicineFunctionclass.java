package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 药品功能大类表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MedicineFunctionclass implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 功能编码
     */
    @TableId(value = "FUNCTION_CODE", type = IdType.AUTO)
    private String functionCode;

    /**
     * 功能名称
     */
    private String functionName;

    /**
     * 在用状态
     */
    private Integer useStatus;

    /**
     * 备注
     */
    private String remark;

    /**
     * 提示方式: 1.提示完仍然继续  2.提示完直接退出 3.提示完给选项
     */
    private Integer type;


    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MedicineFunctionclass{" +
        "functionCode=" + functionCode +
        ", functionName=" + functionName +
        ", useStatus=" + useStatus +
        ", remark=" + remark +
        ", type=" + type +
        "}";
    }
}
