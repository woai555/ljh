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
public class UndrugTestInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 化验编码
     */
    @TableId(value = "UNDRUG_CODE", type = IdType.AUTO)
    private String undrugCode;

    /**
     * 化验名称
     */
    private String undrugName;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 单位
     */
    private String stockUnit;

    /**
     * 执行科室
     */
    private String deptCode;

    /**
     * 操作员
     */
    private String operName;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getUndrugName() {
        return undrugName;
    }

    public void setUndrugName(String undrugName) {
        this.undrugName = undrugName;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getStockUnit() {
        return stockUnit;
    }

    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "UndrugTestInfo{" +
        "undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        ", unitPrice=" + unitPrice +
        ", stockUnit=" + stockUnit +
        ", deptCode=" + deptCode +
        ", operName=" + operName +
        ", operDate=" + operDate +
        "}";
    }
}
