package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 模板用户定义控件表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class PrUserControlSet implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CONTROLCODE", type = IdType.AUTO)
    private String controlcode;

    private String controlname;

    private BigDecimal controltype;

    private String controlinfo;

    private String constantcode;

    private String dataType;

    private String back;

    private String operatorno;

    private LocalDateTime operatortime;


    public String getControlcode() {
        return controlcode;
    }

    public void setControlcode(String controlcode) {
        this.controlcode = controlcode;
    }

    public String getControlname() {
        return controlname;
    }

    public void setControlname(String controlname) {
        this.controlname = controlname;
    }

    public BigDecimal getControltype() {
        return controltype;
    }

    public void setControltype(BigDecimal controltype) {
        this.controltype = controltype;
    }

    public String getControlinfo() {
        return controlinfo;
    }

    public void setControlinfo(String controlinfo) {
        this.controlinfo = controlinfo;
    }

    public String getConstantcode() {
        return constantcode;
    }

    public void setConstantcode(String constantcode) {
        this.constantcode = constantcode;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public String getOperatorno() {
        return operatorno;
    }

    public void setOperatorno(String operatorno) {
        this.operatorno = operatorno;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "PrUserControlSet{" +
        "controlcode=" + controlcode +
        ", controlname=" + controlname +
        ", controltype=" + controltype +
        ", controlinfo=" + controlinfo +
        ", constantcode=" + constantcode +
        ", dataType=" + dataType +
        ", back=" + back +
        ", operatorno=" + operatorno +
        ", operatortime=" + operatortime +
        "}";
    }
}
