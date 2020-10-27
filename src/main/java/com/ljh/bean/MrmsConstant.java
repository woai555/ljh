package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病案常数表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MrmsConstant implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 参数类型
     */
    @TableId(value = "PAR_CLASS", type = IdType.AUTO)
    private String parClass;

    /**
     * 参数名称
     */
    private String parClassname;

    /**
     * 常数代码
     */
    private String parCode;

    /**
     * 常数名称
     */
    private String parCodename;

    /**
     * 备注
     */
    private String remark;


    public String getParClass() {
        return parClass;
    }

    public void setParClass(String parClass) {
        this.parClass = parClass;
    }

    public String getParClassname() {
        return parClassname;
    }

    public void setParClassname(String parClassname) {
        this.parClassname = parClassname;
    }

    public String getParCode() {
        return parCode;
    }

    public void setParCode(String parCode) {
        this.parCode = parCode;
    }

    public String getParCodename() {
        return parCodename;
    }

    public void setParCodename(String parCodename) {
        this.parCodename = parCodename;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "MrmsConstant{" +
        "parClass=" + parClass +
        ", parClassname=" + parClassname +
        ", parCode=" + parCode +
        ", parCodename=" + parCodename +
        ", remark=" + remark +
        "}";
    }
}
