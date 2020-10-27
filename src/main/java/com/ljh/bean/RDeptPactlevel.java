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
public class RDeptPactlevel implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private BigDecimal lvlCost;

    private String operCode;

    private LocalDateTime operDate;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getLvlCost() {
        return lvlCost;
    }

    public void setLvlCost(BigDecimal lvlCost) {
        this.lvlCost = lvlCost;
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
        return "RDeptPactlevel{" +
        "deptCode=" + deptCode +
        ", lvlCost=" + lvlCost +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
