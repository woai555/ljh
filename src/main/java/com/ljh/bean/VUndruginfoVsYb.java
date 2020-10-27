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
public class VUndruginfoVsYb implements Serializable {

    private static final long serialVersionUID=1L;

    private String undrugCode;

    private String itemcode;

    private String hiscode;

    private String ybcode;

    private String itemname;

    private String itemtype;

    private BigDecimal unitprice;

    private String unit;

    private String itemgrade;

    private BigDecimal quantity;


    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getHiscode() {
        return hiscode;
    }

    public void setHiscode(String hiscode) {
        this.hiscode = hiscode;
    }

    public String getYbcode() {
        return ybcode;
    }

    public void setYbcode(String ybcode) {
        this.ybcode = ybcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getItemgrade() {
        return itemgrade;
    }

    public void setItemgrade(String itemgrade) {
        this.itemgrade = itemgrade;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "VUndruginfoVsYb{" +
        "undrugCode=" + undrugCode +
        ", itemcode=" + itemcode +
        ", hiscode=" + hiscode +
        ", ybcode=" + ybcode +
        ", itemname=" + itemname +
        ", itemtype=" + itemtype +
        ", unitprice=" + unitprice +
        ", unit=" + unit +
        ", itemgrade=" + itemgrade +
        ", quantity=" + quantity +
        "}";
    }
}
