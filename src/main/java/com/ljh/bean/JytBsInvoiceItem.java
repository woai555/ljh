package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class JytBsInvoiceItem implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("fserialNo")
    private String fserialNo;

    @TableField("fpitemName")
    private String fpitemName;

    @TableField("fitemName")
    private String fitemName;

    private BigDecimal fprice;

    private BigDecimal fnumber;

    private BigDecimal fmoney;

    private String flevel;


    public String getFserialNo() {
        return fserialNo;
    }

    public void setFserialNo(String fserialNo) {
        this.fserialNo = fserialNo;
    }

    public String getFpitemName() {
        return fpitemName;
    }

    public void setFpitemName(String fpitemName) {
        this.fpitemName = fpitemName;
    }

    public String getFitemName() {
        return fitemName;
    }

    public void setFitemName(String fitemName) {
        this.fitemName = fitemName;
    }

    public BigDecimal getFprice() {
        return fprice;
    }

    public void setFprice(BigDecimal fprice) {
        this.fprice = fprice;
    }

    public BigDecimal getFnumber() {
        return fnumber;
    }

    public void setFnumber(BigDecimal fnumber) {
        this.fnumber = fnumber;
    }

    public BigDecimal getFmoney() {
        return fmoney;
    }

    public void setFmoney(BigDecimal fmoney) {
        this.fmoney = fmoney;
    }

    public String getFlevel() {
        return flevel;
    }

    public void setFlevel(String flevel) {
        this.flevel = flevel;
    }

    @Override
    public String toString() {
        return "JytBsInvoiceItem{" +
        "fserialNo=" + fserialNo +
        ", fpitemName=" + fpitemName +
        ", fitemName=" + fitemName +
        ", fprice=" + fprice +
        ", fnumber=" + fnumber +
        ", fmoney=" + fmoney +
        ", flevel=" + flevel +
        "}";
    }
}
