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
public class LControlKind implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CONTROLKIND", type = IdType.AUTO)
    private Integer controlkind;

    private String controlkindname;

    private String operatorid;

    private LocalDateTime operatortime;


    public Integer getControlkind() {
        return controlkind;
    }

    public void setControlkind(Integer controlkind) {
        this.controlkind = controlkind;
    }

    public String getControlkindname() {
        return controlkindname;
    }

    public void setControlkindname(String controlkindname) {
        this.controlkindname = controlkindname;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "LControlKind{" +
        "controlkind=" + controlkind +
        ", controlkindname=" + controlkindname +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}
