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
public class TtmzData implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal patientQty;

    private BigDecimal regQty;

    private BigDecimal chargeCost;

    private BigDecimal senddrugCost;

    private BigDecimal drugDetail;

    private BigDecimal undrugDetail;


    public BigDecimal getPatientQty() {
        return patientQty;
    }

    public void setPatientQty(BigDecimal patientQty) {
        this.patientQty = patientQty;
    }

    public BigDecimal getRegQty() {
        return regQty;
    }

    public void setRegQty(BigDecimal regQty) {
        this.regQty = regQty;
    }

    public BigDecimal getChargeCost() {
        return chargeCost;
    }

    public void setChargeCost(BigDecimal chargeCost) {
        this.chargeCost = chargeCost;
    }

    public BigDecimal getSenddrugCost() {
        return senddrugCost;
    }

    public void setSenddrugCost(BigDecimal senddrugCost) {
        this.senddrugCost = senddrugCost;
    }

    public BigDecimal getDrugDetail() {
        return drugDetail;
    }

    public void setDrugDetail(BigDecimal drugDetail) {
        this.drugDetail = drugDetail;
    }

    public BigDecimal getUndrugDetail() {
        return undrugDetail;
    }

    public void setUndrugDetail(BigDecimal undrugDetail) {
        this.undrugDetail = undrugDetail;
    }

    @Override
    public String toString() {
        return "TtmzData{" +
        "patientQty=" + patientQty +
        ", regQty=" + regQty +
        ", chargeCost=" + chargeCost +
        ", senddrugCost=" + senddrugCost +
        ", drugDetail=" + drugDetail +
        ", undrugDetail=" + undrugDetail +
        "}";
    }
}
