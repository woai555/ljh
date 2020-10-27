package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 穿包耗材明细表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SupPackin implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 穿包编号
     */
    @TableId(value = "PACK_CODE", type = IdType.AUTO)
    private String packCode;

    /**
     * 穿包名称
     */
    private String packName;

    /**
     * 所包括物品编号
     */
    private String goodsCode;

    /**
     * 所包括物品名称
     */
    private String goodsName;

    /**
     * 所包括物品数量
     */
    private BigDecimal incCount;


    public String getPackCode() {
        return packCode;
    }

    public void setPackCode(String packCode) {
        this.packCode = packCode;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
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

    public BigDecimal getIncCount() {
        return incCount;
    }

    public void setIncCount(BigDecimal incCount) {
        this.incCount = incCount;
    }

    @Override
    public String toString() {
        return "SupPackin{" +
        "packCode=" + packCode +
        ", packName=" + packName +
        ", goodsCode=" + goodsCode +
        ", goodsName=" + goodsName +
        ", incCount=" + incCount +
        "}";
    }
}
