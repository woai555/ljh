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
public class ViewYytPriceQuery implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugName;

    private String pinyin;

    private String spec;

    private String unit;

    private BigDecimal price;

    private String manufacturer;

    private String medCategory;

    private String drugType;


    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMedCategory() {
        return medCategory;
    }

    public void setMedCategory(String medCategory) {
        this.medCategory = medCategory;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    @Override
    public String toString() {
        return "ViewYytPriceQuery{" +
        "drugName=" + drugName +
        ", pinyin=" + pinyin +
        ", spec=" + spec +
        ", unit=" + unit +
        ", price=" + price +
        ", manufacturer=" + manufacturer +
        ", medCategory=" + medCategory +
        ", drugType=" + drugType +
        "}";
    }
}
