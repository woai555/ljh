package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 物品出库表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SupOut implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 出库单号
     */
    @TableId(value = "OUTBILL_CODE", type = IdType.AUTO)
    private String outbillCode;

    /**
     * 物品编号
     */
    private String goodsCode;

    /**
     * 物品名称
     */
    private String goodsName;

    /**
     * 出库时间
     */
    private LocalDateTime outDate;

    /**
     * 出库数量
     */
    private BigDecimal outCount;

    /**
     * 出库单位
     */
    private String unitCode;

    /**
     * 出库规格
     */
    private String specsCode;

    /**
     * 出库类别
     */
    private String outKind;

    /**
     * 出库金额
     */
    private BigDecimal currentTotal;

    /**
     * 操作员编码
     */
    private String operCode;

    /**
     * 备注
     */
    private String memo;


    public String getOutbillCode() {
        return outbillCode;
    }

    public void setOutbillCode(String outbillCode) {
        this.outbillCode = outbillCode;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    public BigDecimal getOutCount() {
        return outCount;
    }

    public void setOutCount(BigDecimal outCount) {
        this.outCount = outCount;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getSpecsCode() {
        return specsCode;
    }

    public void setSpecsCode(String specsCode) {
        this.specsCode = specsCode;
    }

    public String getOutKind() {
        return outKind;
    }

    public void setOutKind(String outKind) {
        this.outKind = outKind;
    }

    public BigDecimal getCurrentTotal() {
        return currentTotal;
    }

    public void setCurrentTotal(BigDecimal currentTotal) {
        this.currentTotal = currentTotal;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "SupOut{" +
        "outbillCode=" + outbillCode +
        ", goodsCode=" + goodsCode +
        ", goodsName=" + goodsName +
        ", outDate=" + outDate +
        ", outCount=" + outCount +
        ", unitCode=" + unitCode +
        ", specsCode=" + specsCode +
        ", outKind=" + outKind +
        ", currentTotal=" + currentTotal +
        ", operCode=" + operCode +
        ", memo=" + memo +
        "}";
    }
}
