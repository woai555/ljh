package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术仪器设备维护表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpApparatus implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CODE", type = IdType.AUTO)
    private String code;

    private String name;

    private String trademark;

    private String source;

    private String characteristic;

    private String keepsite;

    private LocalDateTime buytime;

    private BigDecimal price;

    private String unit;

    private BigDecimal status;

    private String producer;

    private String saler;

    /**
     * 1.贵重  2.普通
     */
    private BigDecimal type;

    private String illustration;

    private String wbCode;

    private String selfCode;

    private String spell;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getKeepsite() {
        return keepsite;
    }

    public void setKeepsite(String keepsite) {
        this.keepsite = keepsite;
    }

    public LocalDateTime getBuytime() {
        return buytime;
    }

    public void setBuytime(LocalDateTime buytime) {
        this.buytime = buytime;
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

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSaler() {
        return saler;
    }

    public void setSaler(String saler) {
        this.saler = saler;
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public String getIllustration() {
        return illustration;
    }

    public void setIllustration(String illustration) {
        this.illustration = illustration;
    }

    public String getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode = wbCode;
    }

    public String getSelfCode() {
        return selfCode;
    }

    public void setSelfCode(String selfCode) {
        this.selfCode = selfCode;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    @Override
    public String toString() {
        return "OpApparatus{" +
        "code=" + code +
        ", name=" + name +
        ", trademark=" + trademark +
        ", source=" + source +
        ", characteristic=" + characteristic +
        ", keepsite=" + keepsite +
        ", buytime=" + buytime +
        ", price=" + price +
        ", unit=" + unit +
        ", status=" + status +
        ", producer=" + producer +
        ", saler=" + saler +
        ", type=" + type +
        ", illustration=" + illustration +
        ", wbCode=" + wbCode +
        ", selfCode=" + selfCode +
        ", spell=" + spell +
        "}";
    }
}
