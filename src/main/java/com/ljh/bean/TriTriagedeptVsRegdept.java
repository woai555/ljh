package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 分诊科室与挂号科室的对应关系
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class TriTriagedeptVsRegdept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 挂号科室
     */
    @TableId(value = "REGDEPT_CODE", type = IdType.AUTO)
    private String regdeptCode;

    /**
     * 分诊科室
     */
    private String triagedeptCode;

    /**
     * 科室排序
     */
    private BigDecimal orderid;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public String getRegdeptCode() {
        return regdeptCode;
    }

    public void setRegdeptCode(String regdeptCode) {
        this.regdeptCode = regdeptCode;
    }

    public String getTriagedeptCode() {
        return triagedeptCode;
    }

    public void setTriagedeptCode(String triagedeptCode) {
        this.triagedeptCode = triagedeptCode;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "TriTriagedeptVsRegdept{" +
        "regdeptCode=" + regdeptCode +
        ", triagedeptCode=" + triagedeptCode +
        ", orderid=" + orderid +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
