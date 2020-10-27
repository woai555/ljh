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
public class Jyt2Bmdz implements Serializable {

    private static final long serialVersionUID=1L;

    private String orderid;

    private String status;

    private LocalDateTime payDate;

    private String cardnoJyt;

    private String alipaytradeno;

    private BigDecimal fee;


    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getPayDate() {
        return payDate;
    }

    public void setPayDate(LocalDateTime payDate) {
        this.payDate = payDate;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getAlipaytradeno() {
        return alipaytradeno;
    }

    public void setAlipaytradeno(String alipaytradeno) {
        this.alipaytradeno = alipaytradeno;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Jyt2Bmdz{" +
        "orderid=" + orderid +
        ", status=" + status +
        ", payDate=" + payDate +
        ", cardnoJyt=" + cardnoJyt +
        ", alipaytradeno=" + alipaytradeno +
        ", fee=" + fee +
        "}";
    }
}
