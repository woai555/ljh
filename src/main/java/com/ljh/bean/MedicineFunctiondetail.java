package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 药品功能明细
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MedicineFunctiondetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 功能编码
     */
    @TableId(value = "FUNCTION_CODE", type = IdType.AUTO)
    private String functionCode;

    /**
     * 药品编码
     */
    private String medicinecode;

    /**
     * 药品名称
     */
    private String medicinename;

    /**
     * 备注
     */
    private String remark;


    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getMedicinecode() {
        return medicinecode;
    }

    public void setMedicinecode(String medicinecode) {
        this.medicinecode = medicinecode;
    }

    public String getMedicinename() {
        return medicinename;
    }

    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "MedicineFunctiondetail{" +
        "functionCode=" + functionCode +
        ", medicinecode=" + medicinecode +
        ", medicinename=" + medicinename +
        ", remark=" + remark +
        "}";
    }
}
