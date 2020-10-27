package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class LCustconstant implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MACHINECODE", type = IdType.AUTO)
    private String machinecode;

    private String itemcode;

    private Float constantorder;

    private String constantname;

    private Float operatorid;

    private LocalDateTime operatortime;

    /**
     * 是否默认值，1默认，2不默认
     */
    private String isdefault;


    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public Float getConstantorder() {
        return constantorder;
    }

    public void setConstantorder(Float constantorder) {
        this.constantorder = constantorder;
    }

    public String getConstantname() {
        return constantname;
    }

    public void setConstantname(String constantname) {
        this.constantname = constantname;
    }

    public Float getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Float operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
    }

    @Override
    public String toString() {
        return "LCustconstant{" +
        "machinecode=" + machinecode +
        ", itemcode=" + itemcode +
        ", constantorder=" + constantorder +
        ", constantname=" + constantname +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        ", isdefault=" + isdefault +
        "}";
    }
}
