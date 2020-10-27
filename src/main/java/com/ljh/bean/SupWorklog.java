package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 日常工作纪录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SupWorklog implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 流水号
     */
    @TableId(value = "N_CODE", type = IdType.AUTO)
    private String nCode;

    /**
     * 交付科室
     */
    private String inDept;

    /**
     * 交付人
     */
    private String inPerson;

    /**
     * 交付时间
     */
    private LocalDateTime inDate;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 接收时间
     */
    private LocalDateTime acceptDate;

    /**
     * 发生费用
     */
    private BigDecimal appendCost;


    public String getnCode() {
        return nCode;
    }

    public void setnCode(String nCode) {
        this.nCode = nCode;
    }

    public String getInDept() {
        return inDept;
    }

    public void setInDept(String inDept) {
        this.inDept = inDept;
    }

    public String getInPerson() {
        return inPerson;
    }

    public void setInPerson(String inPerson) {
        this.inPerson = inPerson;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(LocalDateTime acceptDate) {
        this.acceptDate = acceptDate;
    }

    public BigDecimal getAppendCost() {
        return appendCost;
    }

    public void setAppendCost(BigDecimal appendCost) {
        this.appendCost = appendCost;
    }

    @Override
    public String toString() {
        return "SupWorklog{" +
        "nCode=" + nCode +
        ", inDept=" + inDept +
        ", inPerson=" + inPerson +
        ", inDate=" + inDate +
        ", operCode=" + operCode +
        ", acceptDate=" + acceptDate +
        ", appendCost=" + appendCost +
        "}";
    }
}
