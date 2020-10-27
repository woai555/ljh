package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * lis检验项目与门急诊病案化验项目对照
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LisVsMzbalis implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * his项目代码
     */
    private String itemCode;

    /**
     * his项目名称
     */
    private String itemName;

    /**
     * 单价
     */
    private String price;

    /**
     * 单位
     */
    private String unit;

    /**
     * 项目类别
     */
    private String itemClass;

    /**
     * 病案项目类别
     */
    private String itemClassBa;

    /**
     * 文号
     */
    private String chargeAccording;

    /**
     * 备注
     */
    private String bz;

    /**
     * lis项目代码
     */
    private String lisItemCode;

    /**
     * lis项目名称
     */
    private String lisItemName;

    /**
     * 拼音
     */
    private String spell;

    /**
     * lis简称
     */
    private String spell1;

    private BigDecimal xh;


    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getItemClass() {
        return itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    public String getItemClassBa() {
        return itemClassBa;
    }

    public void setItemClassBa(String itemClassBa) {
        this.itemClassBa = itemClassBa;
    }

    public String getChargeAccording() {
        return chargeAccording;
    }

    public void setChargeAccording(String chargeAccording) {
        this.chargeAccording = chargeAccording;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getLisItemCode() {
        return lisItemCode;
    }

    public void setLisItemCode(String lisItemCode) {
        this.lisItemCode = lisItemCode;
    }

    public String getLisItemName() {
        return lisItemName;
    }

    public void setLisItemName(String lisItemName) {
        this.lisItemName = lisItemName;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getSpell1() {
        return spell1;
    }

    public void setSpell1(String spell1) {
        this.spell1 = spell1;
    }

    public BigDecimal getXh() {
        return xh;
    }

    public void setXh(BigDecimal xh) {
        this.xh = xh;
    }

    @Override
    public String toString() {
        return "LisVsMzbalis{" +
        "itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", price=" + price +
        ", unit=" + unit +
        ", itemClass=" + itemClass +
        ", itemClassBa=" + itemClassBa +
        ", chargeAccording=" + chargeAccording +
        ", bz=" + bz +
        ", lisItemCode=" + lisItemCode +
        ", lisItemName=" + lisItemName +
        ", spell=" + spell +
        ", spell1=" + spell1 +
        ", xh=" + xh +
        "}";
    }
}
