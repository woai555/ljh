package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class ViewYytChargeFee implements Serializable {

    private static final long serialVersionUID=1L;

    private String zhuyuanHao;

    private Integer times;

    private String name;

    private String specs;

    private BigDecimal num;

    private BigDecimal price;

    private LocalDateTime jizhang;

    private BigDecimal total;


    public String getZhuyuanHao() {
        return zhuyuanHao;
    }

    public void setZhuyuanHao(String zhuyuanHao) {
        this.zhuyuanHao = zhuyuanHao;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getJizhang() {
        return jizhang;
    }

    public void setJizhang(LocalDateTime jizhang) {
        this.jizhang = jizhang;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ViewYytChargeFee{" +
        "zhuyuanHao=" + zhuyuanHao +
        ", times=" + times +
        ", name=" + name +
        ", specs=" + specs +
        ", num=" + num +
        ", price=" + price +
        ", jizhang=" + jizhang +
        ", total=" + total +
        "}";
    }
}
