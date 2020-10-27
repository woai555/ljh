package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 模板控件属性常数明细表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class PrControlProList implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "PRO_TYPE_CODE", type = IdType.AUTO)
    private String proTypeCode;

    private BigDecimal proOrder;

    private String pbProCode;

    private String proName;

    private String operatorno;

    private LocalDateTime operatortime;


    public String getProTypeCode() {
        return proTypeCode;
    }

    public void setProTypeCode(String proTypeCode) {
        this.proTypeCode = proTypeCode;
    }

    public BigDecimal getProOrder() {
        return proOrder;
    }

    public void setProOrder(BigDecimal proOrder) {
        this.proOrder = proOrder;
    }

    public String getPbProCode() {
        return pbProCode;
    }

    public void setPbProCode(String pbProCode) {
        this.pbProCode = pbProCode;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
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
        return "PrControlProList{" +
        "proTypeCode=" + proTypeCode +
        ", proOrder=" + proOrder +
        ", pbProCode=" + pbProCode +
        ", proName=" + proName +
        ", operatorno=" + operatorno +
        ", operatortime=" + operatortime +
        "}";
    }
}
