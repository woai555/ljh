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
public class RRegYbfalseYb implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private LocalDateTime regDate;

    private String tradeNo;

    private BigDecimal messNo;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public BigDecimal getMessNo() {
        return messNo;
    }

    public void setMessNo(BigDecimal messNo) {
        this.messNo = messNo;
    }

    @Override
    public String toString() {
        return "RRegYbfalseYb{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", tradeNo=" + tradeNo +
        ", messNo=" + messNo +
        "}";
    }
}
