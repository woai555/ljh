package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 京医通患者交易信息（导出的数据）
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class JytTradeinfoSx implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 交易流水号
     */
    private String tradeno;

    /**
     * 交易子类型0701正常缴费0702 预存金提取0703退卡预存金提取
     */
    private String tradesubclass;

    /**
     * 客户端类型1HIS2自助客户端3首信客户端
     */
    private String clienttype;

    /**
     * 首信系统交易日期
     */
    private LocalDateTime tradedate;

    /**
     * 费用总金额
     */
    private BigDecimal feeall;

    /**
     * 京医通卡号
     */
    private String cardnoJyt;

    /**
     * 操作员姓名
     */
    private String opername;


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

    public String getClienttype() {
        return clienttype;
    }

    public void setClienttype(String clienttype) {
        this.clienttype = clienttype;
    }

    public LocalDateTime getTradedate() {
        return tradedate;
    }

    public void setTradedate(LocalDateTime tradedate) {
        this.tradedate = tradedate;
    }

    public BigDecimal getFeeall() {
        return feeall;
    }

    public void setFeeall(BigDecimal feeall) {
        this.feeall = feeall;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getOpername() {
        return opername;
    }

    public void setOpername(String opername) {
        this.opername = opername;
    }

    @Override
    public String toString() {
        return "JytTradeinfoSx{" +
        "tradeno=" + tradeno +
        ", tradesubclass=" + tradesubclass +
        ", clienttype=" + clienttype +
        ", tradedate=" + tradedate +
        ", feeall=" + feeall +
        ", cardnoJyt=" + cardnoJyt +
        ", opername=" + opername +
        "}";
    }
}
