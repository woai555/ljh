package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_YZ_REPORT
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewYzReport implements Serializable {

    private static final long serialVersionUID=1L;

    private String feeStatCate;

    private String feeStatName;

    private String exeDept;

    private BigDecimal jzInvoice;

    private BigDecimal jzMoney;

    private BigDecimal mzInvoice;

    private BigDecimal mzMoney;

    private BigDecimal zyInvoice;

    private BigDecimal zyMoney;


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

    public String getExeDept() {
        return exeDept;
    }

    public void setExeDept(String exeDept) {
        this.exeDept = exeDept;
    }

    public BigDecimal getJzInvoice() {
        return jzInvoice;
    }

    public void setJzInvoice(BigDecimal jzInvoice) {
        this.jzInvoice = jzInvoice;
    }

    public BigDecimal getJzMoney() {
        return jzMoney;
    }

    public void setJzMoney(BigDecimal jzMoney) {
        this.jzMoney = jzMoney;
    }

    public BigDecimal getMzInvoice() {
        return mzInvoice;
    }

    public void setMzInvoice(BigDecimal mzInvoice) {
        this.mzInvoice = mzInvoice;
    }

    public BigDecimal getMzMoney() {
        return mzMoney;
    }

    public void setMzMoney(BigDecimal mzMoney) {
        this.mzMoney = mzMoney;
    }

    public BigDecimal getZyInvoice() {
        return zyInvoice;
    }

    public void setZyInvoice(BigDecimal zyInvoice) {
        this.zyInvoice = zyInvoice;
    }

    public BigDecimal getZyMoney() {
        return zyMoney;
    }

    public void setZyMoney(BigDecimal zyMoney) {
        this.zyMoney = zyMoney;
    }

    @Override
    public String toString() {
        return "ViewYzReport{" +
        "feeStatCate=" + feeStatCate +
        ", feeStatName=" + feeStatName +
        ", exeDept=" + exeDept +
        ", jzInvoice=" + jzInvoice +
        ", jzMoney=" + jzMoney +
        ", mzInvoice=" + mzInvoice +
        ", mzMoney=" + mzMoney +
        ", zyInvoice=" + zyInvoice +
        ", zyMoney=" + zyMoney +
        "}";
    }
}
