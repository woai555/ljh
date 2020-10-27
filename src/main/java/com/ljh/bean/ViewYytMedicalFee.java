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
public class ViewYytMedicalFee implements Serializable {

    private static final long serialVersionUID=1L;

    private String name;

    private String pinyin;

    private BigDecimal price;

    private String unit;

    private String standardEncoding;

    private String yiju;

    private String text;

    private String eventMeaning;


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

    public String getStandardEncoding() {
        return standardEncoding;
    }

    public void setStandardEncoding(String standardEncoding) {
        this.standardEncoding = standardEncoding;
    }

    public String getYiju() {
        return yiju;
    }

    public void setYiju(String yiju) {
        this.yiju = yiju;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEventMeaning() {
        return eventMeaning;
    }

    public void setEventMeaning(String eventMeaning) {
        this.eventMeaning = eventMeaning;
    }

    @Override
    public String toString() {
        return "ViewYytMedicalFee{" +
        "name=" + name +
        ", pinyin=" + pinyin +
        ", price=" + price +
        ", unit=" + unit +
        ", standardEncoding=" + standardEncoding +
        ", yiju=" + yiju +
        ", text=" + text +
        ", eventMeaning=" + eventMeaning +
        "}";
    }
}
