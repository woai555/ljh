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
public class JytTradeinfoSxtest implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 交易流水号
     */
    @TableId(value = "TRADENO", type = IdType.AUTO)
    private String tradeno;

    /**
     * 交易类型
     */
    private String tradesubclass;

    /**
     * 交易发生时间
     */
    private LocalDateTime tradestrdate;

    /**
     * 交易时间
     */
    private LocalDateTime tradedate;

    /**
     * 京医通卡号
     */
    private String cardnoJyt;

    /**
     * 姓名
     */
    private String name;

    /**
     * 费用总金额
     */
    private BigDecimal feeall;

    /**
     * 操作员
     */
    private String opername;

    /**
     * 交易状态
     */
    private String tradeStatus;

    /**
     * 结账状态
     */
    private String accountStatus;

    /**
     * 结账编号
     */
    private String accountno;

    /**
     * 申报状态
     */
    private String decStatus;

    /**
     * 申报批号
     */
    private String decNo;


    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public String getTradesubclass() {
        return tradesubclass;
    }

    public void setTradesubclass(String tradesubclass) {
        this.tradesubclass = tradesubclass;
    }

    public LocalDateTime getTradestrdate() {
        return tradestrdate;
    }

    public void setTradestrdate(LocalDateTime tradestrdate) {
        this.tradestrdate = tradestrdate;
    }

    public LocalDateTime getTradedate() {
        return tradedate;
    }

    public void setTradedate(LocalDateTime tradedate) {
        this.tradedate = tradedate;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getFeeall() {
        return feeall;
    }

    public void setFeeall(BigDecimal feeall) {
        this.feeall = feeall;
    }

    public String getOpername() {
        return opername;
    }

    public void setOpername(String opername) {
        this.opername = opername;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getDecStatus() {
        return decStatus;
    }

    public void setDecStatus(String decStatus) {
        this.decStatus = decStatus;
    }

    public String getDecNo() {
        return decNo;
    }

    public void setDecNo(String decNo) {
        this.decNo = decNo;
    }

    @Override
    public String toString() {
        return "JytTradeinfoSxtest{" +
        "tradeno=" + tradeno +
        ", tradesubclass=" + tradesubclass +
        ", tradestrdate=" + tradestrdate +
        ", tradedate=" + tradedate +
        ", cardnoJyt=" + cardnoJyt +
        ", name=" + name +
        ", feeall=" + feeall +
        ", opername=" + opername +
        ", tradeStatus=" + tradeStatus +
        ", accountStatus=" + accountStatus +
        ", accountno=" + accountno +
        ", decStatus=" + decStatus +
        ", decNo=" + decNo +
        "}";
    }
}
