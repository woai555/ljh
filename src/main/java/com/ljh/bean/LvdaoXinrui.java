package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
public class LvdaoXinrui implements Serializable {

    private static final long serialVersionUID=1L;

    private String hisregno;

    private String cardNo;

    private String c3;

    private String c4;

    private String itemcode;

    private String itemname;

    private BigDecimal price;

    private BigDecimal ownCost;


    public String getHisregno() {
        return hisregno;
    }

    public void setHisregno(String hisregno) {
        this.hisregno = hisregno;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public String getC4() {
        return c4;
    }

    public void setC4(String c4) {
        this.c4 = c4;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    @Override
    public String toString() {
        return "LvdaoXinrui{" +
        "hisregno=" + hisregno +
        ", cardNo=" + cardNo +
        ", c3=" + c3 +
        ", c4=" + c4 +
        ", itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", price=" + price +
        ", ownCost=" + ownCost +
        "}";
    }
}
