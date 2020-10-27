package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 对于价格为空的项目，记录其输入的价格
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpChargeRemeber implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ITEM_TYPE", type = IdType.AUTO)
    private String itemType;

    private String itemCode;

    private BigDecimal itemPrice;


    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "OpChargeRemeber{" +
        "itemType=" + itemType +
        ", itemCode=" + itemCode +
        ", itemPrice=" + itemPrice +
        "}";
    }
}
