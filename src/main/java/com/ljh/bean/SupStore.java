package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 物品库存表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SupStore implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 物品编号
     */
    @TableId(value = "GOODS_CODE", type = IdType.AUTO)
    private String goodsCode;

    /**
     * 物品名称
     */
    private String goodsName;

    /**
     * 库存数量
     */
    private BigDecimal nowCount;

    /**
     * 库存金额
     */
    private BigDecimal currentTotal;


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

    public BigDecimal getNowCount() {
        return nowCount;
    }

    public void setNowCount(BigDecimal nowCount) {
        this.nowCount = nowCount;
    }

    public BigDecimal getCurrentTotal() {
        return currentTotal;
    }

    public void setCurrentTotal(BigDecimal currentTotal) {
        this.currentTotal = currentTotal;
    }

    @Override
    public String toString() {
        return "SupStore{" +
        "goodsCode=" + goodsCode +
        ", goodsName=" + goodsName +
        ", nowCount=" + nowCount +
        ", currentTotal=" + currentTotal +
        "}";
    }
}
