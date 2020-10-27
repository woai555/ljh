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
public class LHisControl implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CONTROLCODE", type = IdType.AUTO)
    private String controlcode;

    private String controlname;

    private String operatorid;

    private Integer operatortime;


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

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public Integer getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(Integer operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "LHisControl{" +
        "controlcode=" + controlcode +
        ", controlname=" + controlname +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}
