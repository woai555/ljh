package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 绿色通道欠费患者记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class QfRecordGreen implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 患者卡号
     */
    private String cardNo;

    /**
     * 欠费时发票号
     */
    @TableId(value = "QF_INVOICENO", type = IdType.AUTO)
    private String qfInvoiceno;

    /**
     * 金额
     */
    private BigDecimal totCost;

    /**
     * 欠费操作员
     */
    private String qfOpercode;

    /**
     * 欠费时间
     */
    private LocalDateTime qfOperdate;

    /**
     * 是否补收
     */
    private String ynCharge;

    /**
     * 补收的发票号
     */
    private String chargeInvoiceno;

    /**
     * 补收操作员
     */
    private String chargeCode;

    /**
     * 补收时间
     */
    private LocalDateTime chargeDate;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getQfInvoiceno() {
        return qfInvoiceno;
    }

    public void setQfInvoiceno(String qfInvoiceno) {
        this.qfInvoiceno = qfInvoiceno;
    }

    public BigDecimal getTotCost() {
        return totCost;
    }

    public void setTotCost(BigDecimal totCost) {
        this.totCost = totCost;
    }

    public String getQfOpercode() {
        return qfOpercode;
    }

    public void setQfOpercode(String qfOpercode) {
        this.qfOpercode = qfOpercode;
    }

    public LocalDateTime getQfOperdate() {
        return qfOperdate;
    }

    public void setQfOperdate(LocalDateTime qfOperdate) {
        this.qfOperdate = qfOperdate;
    }

    public String getYnCharge() {
        return ynCharge;
    }

    public void setYnCharge(String ynCharge) {
        this.ynCharge = ynCharge;
    }

    public String getChargeInvoiceno() {
        return chargeInvoiceno;
    }

    public void setChargeInvoiceno(String chargeInvoiceno) {
        this.chargeInvoiceno = chargeInvoiceno;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public LocalDateTime getChargeDate() {
        return chargeDate;
    }

    public void setChargeDate(LocalDateTime chargeDate) {
        this.chargeDate = chargeDate;
    }

    @Override
    public String toString() {
        return "QfRecordGreen{" +
        "cardNo=" + cardNo +
        ", qfInvoiceno=" + qfInvoiceno +
        ", totCost=" + totCost +
        ", qfOpercode=" + qfOpercode +
        ", qfOperdate=" + qfOperdate +
        ", ynCharge=" + ynCharge +
        ", chargeInvoiceno=" + chargeInvoiceno +
        ", chargeCode=" + chargeCode +
        ", chargeDate=" + chargeDate +
        "}";
    }
}
