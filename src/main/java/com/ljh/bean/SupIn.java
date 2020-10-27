package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 物品入库表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SupIn implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 入库单号
     */
    @TableId(value = "INBILL_CODE", type = IdType.AUTO)
    private String inbillCode;

    /**
     * 物品编号
     */
    private String goodsCode;

    /**
     * 物品名称
     */
    private String goodsName;

    /**
     * 物品单价
     */
    private BigDecimal goodsPrice;

    /**
     * 入库时间
     */
    private LocalDateTime inDate;

    /**
     * 入库数量
     */
    private BigDecimal inCount;

    /**
     * 入库单位
     */
    private String unitCode;

    /**
     * 入库规格
     */
    private String specsCode;

    /**
     * 入库金额
     */
    private BigDecimal currentTotal;

    /**
     * 操作员编码
     */
    private String operCode;


    public String getInbillCode() {
        return inbillCode;
    }

    public void setInbillCode(String inbillCode) {
        this.inbillCode = inbillCode;
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

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public BigDecimal getInCount() {
        return inCount;
    }

    public void setInCount(BigDecimal inCount) {
        this.inCount = inCount;
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

    @Override
    public String toString() {
        return "SupIn{" +
        "inbillCode=" + inbillCode +
        ", goodsCode=" + goodsCode +
        ", goodsName=" + goodsName +
        ", goodsPrice=" + goodsPrice +
        ", inDate=" + inDate +
        ", inCount=" + inCount +
        ", unitCode=" + unitCode +
        ", specsCode=" + specsCode +
        ", currentTotal=" + currentTotal +
        ", operCode=" + operCode +
        "}";
    }
}
