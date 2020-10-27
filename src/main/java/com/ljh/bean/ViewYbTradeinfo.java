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
public class ViewYbTradeinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String fundtype;

    private BigDecimal fund;

    private BigDecimal personcountpay;

    private LocalDateTime tradedate;

    private String cancelFlag;


    public String getFundtype() {
        return fundtype;
    }

    public void setFundtype(String fundtype) {
        this.fundtype = fundtype;
    }

    public BigDecimal getFund() {
        return fund;
    }

    public void setFund(BigDecimal fund) {
        this.fund = fund;
    }

    public BigDecimal getPersoncountpay() {
        return personcountpay;
    }

    public void setPersoncountpay(BigDecimal personcountpay) {
        this.personcountpay = personcountpay;
    }

    public LocalDateTime getTradedate() {
        return tradedate;
    }

    public void setTradedate(LocalDateTime tradedate) {
        this.tradedate = tradedate;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    @Override
    public String toString() {
        return "ViewYbTradeinfo{" +
        "fundtype=" + fundtype +
        ", fund=" + fund +
        ", personcountpay=" + personcountpay +
        ", tradedate=" + tradedate +
        ", cancelFlag=" + cancelFlag +
        "}";
    }
}
