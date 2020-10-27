package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 非药品调价记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class UndrugAdjustPrice implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 调价序号
     */
    @TableId(value = "SEQUENCE_ADJUST", type = IdType.AUTO)
    private Long sequenceAdjust;

    /**
     * 非药品代码
     */
    private String undrugCode;

    /**
     * 调前单价
     */
    private BigDecimal unitPriceOld;

    /**
     * 调后单价
     */
    private BigDecimal unitPrice;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 操作员姓名
     */
    private String operName;


    public Long getSequenceAdjust() {
        return sequenceAdjust;
    }

    public void setSequenceAdjust(Long sequenceAdjust) {
        this.sequenceAdjust = sequenceAdjust;
    }

    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public BigDecimal getUnitPriceOld() {
        return unitPriceOld;
    }

    public void setUnitPriceOld(BigDecimal unitPriceOld) {
        this.unitPriceOld = unitPriceOld;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    @Override
    public String toString() {
        return "UndrugAdjustPrice{" +
        "sequenceAdjust=" + sequenceAdjust +
        ", undrugCode=" + undrugCode +
        ", unitPriceOld=" + unitPriceOld +
        ", unitPrice=" + unitPrice +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", operName=" + operName +
        "}";
    }
}
