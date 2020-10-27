package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术管理－开关表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpSwitch implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "SWITCH_NO", type = IdType.AUTO)
    private String switchNo;

    private String switchName;

    private String switchValue;


    public String getSwitchNo() {
        return switchNo;
    }

    public void setSwitchNo(String switchNo) {
        this.switchNo = switchNo;
    }

    public String getSwitchName() {
        return switchName;
    }

    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    public String getSwitchValue() {
        return switchValue;
    }

    public void setSwitchValue(String switchValue) {
        this.switchValue = switchValue;
    }

    @Override
    public String toString() {
        return "OpSwitch{" +
        "switchNo=" + switchNo +
        ", switchName=" + switchName +
        ", switchValue=" + switchValue +
        "}";
    }
}
