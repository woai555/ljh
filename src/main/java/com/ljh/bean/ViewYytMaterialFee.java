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
public class ViewYytMaterialFee implements Serializable {

    private static final long serialVersionUID=1L;

    private String name;

    private String pinyin;

    private BigDecimal price;

    private String unit;

    private String guige;

    private String medCategory;

    private String manufacturer;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getGuige() {
        return guige;
    }

    public void setGuige(String guige) {
        this.guige = guige;
    }

    public String getMedCategory() {
        return medCategory;
    }

    public void setMedCategory(String medCategory) {
        this.medCategory = medCategory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "ViewYytMaterialFee{" +
        "name=" + name +
        ", pinyin=" + pinyin +
        ", price=" + price +
        ", unit=" + unit +
        ", guige=" + guige +
        ", medCategory=" + medCategory +
        ", manufacturer=" + manufacturer +
        "}";
    }
}
