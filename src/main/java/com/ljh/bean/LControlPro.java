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
public class LControlPro implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CONTROLPROCODE", type = IdType.AUTO)
    private String controlprocode;

    private String controlproname;

    private String operatorid;

    private LocalDateTime operatortime;


    public String getControlprocode() {
        return controlprocode;
    }

    public void setControlprocode(String controlprocode) {
        this.controlprocode = controlprocode;
    }

    public String getControlproname() {
        return controlproname;
    }

    public void setControlproname(String controlproname) {
        this.controlproname = controlproname;
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
        return "LControlPro{" +
        "controlprocode=" + controlprocode +
        ", controlproname=" + controlproname +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}
