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
public class ViewSingleitem implements Serializable {

    private static final long serialVersionUID=1L;

    private String itemcode;

    private String itemname;

    private BigDecimal fee;

    private String feeitemcode;

    private Integer ifwipe;


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

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getFeeitemcode() {
        return feeitemcode;
    }

    public void setFeeitemcode(String feeitemcode) {
        this.feeitemcode = feeitemcode;
    }

    public Integer getIfwipe() {
        return ifwipe;
    }

    public void setIfwipe(Integer ifwipe) {
        this.ifwipe = ifwipe;
    }

    @Override
    public String toString() {
        return "ViewSingleitem{" +
        "itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", fee=" + fee +
        ", feeitemcode=" + feeitemcode +
        ", ifwipe=" + ifwipe +
        "}";
    }
}
