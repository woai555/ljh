package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 根据itemid控制
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class QfControl implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ITEMID", type = IdType.AUTO)
    private String itemid;

    /**
     * 限制金额
     */
    private BigDecimal money;


    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "QfControl{" +
        "itemid=" + itemid +
        ", money=" + money +
        "}";
    }
}
