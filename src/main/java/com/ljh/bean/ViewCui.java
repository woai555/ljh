package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_CUI
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewCui implements Serializable {

    private static final long serialVersionUID=1L;

    private String itemCode;

    private BigDecimal rate;


    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "ViewCui{" +
        "itemCode=" + itemCode +
        ", rate=" + rate +
        "}";
    }
}
