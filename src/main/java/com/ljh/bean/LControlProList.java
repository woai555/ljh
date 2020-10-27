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
public class LControlProList implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CONTROLPROCODE", type = IdType.AUTO)
    private String controlprocode;

    private String proCode;

    private String proName;

    private Integer proOrder;

    private String operatorid;

    private LocalDateTime operatortime;


    public String getControlprocode() {
        return controlprocode;
    }

    public void setControlprocode(String controlprocode) {
        this.controlprocode = controlprocode;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Integer getProOrder() {
        return proOrder;
    }

    public void setProOrder(Integer proOrder) {
        this.proOrder = proOrder;
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
        return "LControlProList{" +
        "controlprocode=" + controlprocode +
        ", proCode=" + proCode +
        ", proName=" + proName +
        ", proOrder=" + proOrder +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}
