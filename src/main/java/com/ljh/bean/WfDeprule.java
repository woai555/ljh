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
public class WfDeprule implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "KINDCODE", type = IdType.AUTO)
    private String kindcode;

    private BigDecimal depno;

    private BigDecimal instockdep;

    private BigDecimal inusedep;

    private BigDecimal returndep;

    private BigDecimal overvalue;

    private BigDecimal overdep;

    private LocalDateTime registdate;

    private String operator;


    public String getKindcode() {
        return kindcode;
    }

    public void setKindcode(String kindcode) {
        this.kindcode = kindcode;
    }

    public BigDecimal getDepno() {
        return depno;
    }

    public void setDepno(BigDecimal depno) {
        this.depno = depno;
    }

    public BigDecimal getInstockdep() {
        return instockdep;
    }

    public void setInstockdep(BigDecimal instockdep) {
        this.instockdep = instockdep;
    }

    public BigDecimal getInusedep() {
        return inusedep;
    }

    public void setInusedep(BigDecimal inusedep) {
        this.inusedep = inusedep;
    }

    public BigDecimal getReturndep() {
        return returndep;
    }

    public void setReturndep(BigDecimal returndep) {
        this.returndep = returndep;
    }

    public BigDecimal getOvervalue() {
        return overvalue;
    }

    public void setOvervalue(BigDecimal overvalue) {
        this.overvalue = overvalue;
    }

    public BigDecimal getOverdep() {
        return overdep;
    }

    public void setOverdep(BigDecimal overdep) {
        this.overdep = overdep;
    }

    public LocalDateTime getRegistdate() {
        return registdate;
    }

    public void setRegistdate(LocalDateTime registdate) {
        this.registdate = registdate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "WfDeprule{" +
        "kindcode=" + kindcode +
        ", depno=" + depno +
        ", instockdep=" + instockdep +
        ", inusedep=" + inusedep +
        ", returndep=" + returndep +
        ", overvalue=" + overvalue +
        ", overdep=" + overdep +
        ", registdate=" + registdate +
        ", operator=" + operator +
        "}";
    }
}
