package com.ljh.bean;

import java.math.BigDecimal;
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
public class PrControlPro implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "PRO_TYPE_CODE", type = IdType.AUTO)
    private String proTypeCode;

    private String proTypeName;

    private BigDecimal orderid;

    private String operatorno;

    private LocalDateTime operatortime;


    public String getProTypeCode() {
        return proTypeCode;
    }

    public void setProTypeCode(String proTypeCode) {
        this.proTypeCode = proTypeCode;
    }

    public String getProTypeName() {
        return proTypeName;
    }

    public void setProTypeName(String proTypeName) {
        this.proTypeName = proTypeName;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
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
        return "PrControlPro{" +
        "proTypeCode=" + proTypeCode +
        ", proTypeName=" + proTypeName +
        ", orderid=" + orderid +
        ", operatorno=" + operatorno +
        ", operatortime=" + operatortime +
        "}";
    }
}
