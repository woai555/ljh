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
public class LscYbTest implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String cardyb;

    private BigDecimal fee;

    private String dingdanType;

    private String jiesuanType;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardyb() {
        return cardyb;
    }

    public void setCardyb(String cardyb) {
        this.cardyb = cardyb;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getDingdanType() {
        return dingdanType;
    }

    public void setDingdanType(String dingdanType) {
        this.dingdanType = dingdanType;
    }

    public String getJiesuanType() {
        return jiesuanType;
    }

    public void setJiesuanType(String jiesuanType) {
        this.jiesuanType = jiesuanType;
    }

    @Override
    public String toString() {
        return "LscYbTest{" +
        "cardNo=" + cardNo +
        ", cardyb=" + cardyb +
        ", fee=" + fee +
        ", dingdanType=" + dingdanType +
        ", jiesuanType=" + jiesuanType +
        "}";
    }
}
