package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医技统计报表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsrpt4 implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 统计日期
     */
    private LocalDateTime dateStat;

    /**
     * 统计大类
     */
    private String feeStatCate;

    /**
     * 统计大类名称
     */
    private String feeStatName;

    /**
     * 统计类型 门诊、急诊、住院三种
     */
    private String totalType;

    /**
     * 处方数
     */
    private Long invoiceSum;

    /**
     * 金额
     */
    private BigDecimal moneySum;

    /**
     * 执行科室
     */
    private String exeDept;


    public LocalDateTime getDateStat() {
        return dateStat;
    }

    public void setDateStat(LocalDateTime dateStat) {
        this.dateStat = dateStat;
    }

    public String getFeeStatCate() {
        return feeStatCate;
    }

    public void setFeeStatCate(String feeStatCate) {
        this.feeStatCate = feeStatCate;
    }

    public String getFeeStatName() {
        return feeStatName;
    }

    public void setFeeStatName(String feeStatName) {
        this.feeStatName = feeStatName;
    }

    public String getTotalType() {
        return totalType;
    }

    public void setTotalType(String totalType) {
        this.totalType = totalType;
    }

    public Long getInvoiceSum() {
        return invoiceSum;
    }

    public void setInvoiceSum(Long invoiceSum) {
        this.invoiceSum = invoiceSum;
    }

    public BigDecimal getMoneySum() {
        return moneySum;
    }

    public void setMoneySum(BigDecimal moneySum) {
        this.moneySum = moneySum;
    }

    public String getExeDept() {
        return exeDept;
    }

    public void setExeDept(String exeDept) {
        this.exeDept = exeDept;
    }

    @Override
    public String toString() {
        return "Mrmsrpt4{" +
        "dateStat=" + dateStat +
        ", feeStatCate=" + feeStatCate +
        ", feeStatName=" + feeStatName +
        ", totalType=" + totalType +
        ", invoiceSum=" + invoiceSum +
        ", moneySum=" + moneySum +
        ", exeDept=" + exeDept +
        "}";
    }
}
