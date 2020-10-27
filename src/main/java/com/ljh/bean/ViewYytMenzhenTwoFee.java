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
public class ViewYytMenzhenTwoFee implements Serializable {

    private static final long serialVersionUID=1L;

    private String fapiao;

    private String cardNo;

    private String ybCardNo;

    private String jytCardNo;

    private String shenfenzheng;

    private String name;

    private BigDecimal num;

    private BigDecimal price;

    private BigDecimal tatal;

    private String zhangdan;


    public String getFapiao() {
        return fapiao;
    }

    public void setFapiao(String fapiao) {
        this.fapiao = fapiao;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getYbCardNo() {
        return ybCardNo;
    }

    public void setYbCardNo(String ybCardNo) {
        this.ybCardNo = ybCardNo;
    }

    public String getJytCardNo() {
        return jytCardNo;
    }

    public void setJytCardNo(String jytCardNo) {
        this.jytCardNo = jytCardNo;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public BigDecimal getTatal() {
        return tatal;
    }

    public void setTatal(BigDecimal tatal) {
        this.tatal = tatal;
    }

    public String getZhangdan() {
        return zhangdan;
    }

    public void setZhangdan(String zhangdan) {
        this.zhangdan = zhangdan;
    }

    @Override
    public String toString() {
        return "ViewYytMenzhenTwoFee{" +
        "fapiao=" + fapiao +
        ", cardNo=" + cardNo +
        ", ybCardNo=" + ybCardNo +
        ", jytCardNo=" + jytCardNo +
        ", shenfenzheng=" + shenfenzheng +
        ", name=" + name +
        ", num=" + num +
        ", price=" + price +
        ", tatal=" + tatal +
        ", zhangdan=" + zhangdan +
        "}";
    }
}
