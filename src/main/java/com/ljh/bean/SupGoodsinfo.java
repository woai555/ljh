package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 物品基本信息表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SupGoodsinfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 物品代码
     */
    @TableId(value = "GOODS_CODE", type = IdType.AUTO)
    private String goodsCode;

    /**
     * 物品拼音码
     */
    private String spellCode;

    /**
     * 物品名称
     */
    private String goodsName;

    /**
     * 物品英文名
     */
    private String englishName;

    /**
     * 物品规格
     */
    private String specs;

    /**
     * 物品单位
     */
    private String unit;

    /**
     * 供货单位
     */
    private String payDept;

    /**
     * 物品种类
     */
    private String kind;

    /**
     * 所有权
     */
    private String owner;

    /**
     * 收费金额
     */
    private BigDecimal cost;

    /**
     * 包装数
     */
    private BigDecimal packCount;

    /**
     * 备注
     */
    private String memo;

    /**
     * 物品单价
     */
    private BigDecimal goodsPrice;


    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPayDept() {
        return payDept;
    }

    public void setPayDept(String payDept) {
        this.payDept = payDept;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getPackCount() {
        return packCount;
    }

    public void setPackCount(BigDecimal packCount) {
        this.packCount = packCount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Override
    public String toString() {
        return "SupGoodsinfo{" +
        "goodsCode=" + goodsCode +
        ", spellCode=" + spellCode +
        ", goodsName=" + goodsName +
        ", englishName=" + englishName +
        ", specs=" + specs +
        ", unit=" + unit +
        ", payDept=" + payDept +
        ", kind=" + kind +
        ", owner=" + owner +
        ", cost=" + cost +
        ", packCount=" + packCount +
        ", memo=" + memo +
        ", goodsPrice=" + goodsPrice +
        "}";
    }
}
