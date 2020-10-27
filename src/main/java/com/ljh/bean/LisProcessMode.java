package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 检验危急值 处理方式维护表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LisProcessMode implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室编码
     */
    @TableId(value = "UNITID", type = IdType.AUTO)
    private String unitid;

    /**
     * 科室名称
     */
    private String unitname;

    /**
     * 序号
     */
    private BigDecimal orderNo;

    /**
     * 处理方式
     */
    private String processMode;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 操作时间
     */
    private LocalDateTime opertime;


    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public BigDecimal getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(BigDecimal orderNo) {
        this.orderNo = orderNo;
    }

    public String getProcessMode() {
        return processMode;
    }

    public void setProcessMode(String processMode) {
        this.processMode = processMode;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LocalDateTime getOpertime() {
        return opertime;
    }

    public void setOpertime(LocalDateTime opertime) {
        this.opertime = opertime;
    }

    @Override
    public String toString() {
        return "LisProcessMode{" +
        "unitid=" + unitid +
        ", unitname=" + unitname +
        ", orderNo=" + orderNo +
        ", processMode=" + processMode +
        ", operator=" + operator +
        ", opertime=" + opertime +
        "}";
    }
}
