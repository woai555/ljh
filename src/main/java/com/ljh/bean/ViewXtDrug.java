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
public class ViewXtDrug implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugtermid;

    private String tradename;

    private BigDecimal priceref;

    private String doseunit;

    private String minunit;

    private BigDecimal basedose;

    private String specs;

    private String termclassid;

    private String termclassname;

    private String dosemodel;

    private String usagecode;

    private String frequencycode;

    private String bakdoseunit;

    private String bakbasedose;

    private String hypoflag;

    private String validflag;

    private String tradeename;

    private String spellcode;

    private String wbcode;

    private String customcode;

    private LocalDateTime operTime;


    public String getDrugtermid() {
        return drugtermid;
    }

    public void setDrugtermid(String drugtermid) {
        this.drugtermid = drugtermid;
    }

    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    public BigDecimal getPriceref() {
        return priceref;
    }

    public void setPriceref(BigDecimal priceref) {
        this.priceref = priceref;
    }

    public String getDoseunit() {
        return doseunit;
    }

    public void setDoseunit(String doseunit) {
        this.doseunit = doseunit;
    }

    public String getMinunit() {
        return minunit;
    }

    public void setMinunit(String minunit) {
        this.minunit = minunit;
    }

    public BigDecimal getBasedose() {
        return basedose;
    }

    public void setBasedose(BigDecimal basedose) {
        this.basedose = basedose;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getTermclassid() {
        return termclassid;
    }

    public void setTermclassid(String termclassid) {
        this.termclassid = termclassid;
    }

    public String getTermclassname() {
        return termclassname;
    }

    public void setTermclassname(String termclassname) {
        this.termclassname = termclassname;
    }

    public String getDosemodel() {
        return dosemodel;
    }

    public void setDosemodel(String dosemodel) {
        this.dosemodel = dosemodel;
    }

    public String getUsagecode() {
        return usagecode;
    }

    public void setUsagecode(String usagecode) {
        this.usagecode = usagecode;
    }

    public String getFrequencycode() {
        return frequencycode;
    }

    public void setFrequencycode(String frequencycode) {
        this.frequencycode = frequencycode;
    }

    public String getBakdoseunit() {
        return bakdoseunit;
    }

    public void setBakdoseunit(String bakdoseunit) {
        this.bakdoseunit = bakdoseunit;
    }

    public String getBakbasedose() {
        return bakbasedose;
    }

    public void setBakbasedose(String bakbasedose) {
        this.bakbasedose = bakbasedose;
    }

    public String getHypoflag() {
        return hypoflag;
    }

    public void setHypoflag(String hypoflag) {
        this.hypoflag = hypoflag;
    }

    public String getValidflag() {
        return validflag;
    }

    public void setValidflag(String validflag) {
        this.validflag = validflag;
    }

    public String getTradeename() {
        return tradeename;
    }

    public void setTradeename(String tradeename) {
        this.tradeename = tradeename;
    }

    public String getSpellcode() {
        return spellcode;
    }

    public void setSpellcode(String spellcode) {
        this.spellcode = spellcode;
    }

    public String getWbcode() {
        return wbcode;
    }

    public void setWbcode(String wbcode) {
        this.wbcode = wbcode;
    }

    public String getCustomcode() {
        return customcode;
    }

    public void setCustomcode(String customcode) {
        this.customcode = customcode;
    }

    public LocalDateTime getOperTime() {
        return operTime;
    }

    public void setOperTime(LocalDateTime operTime) {
        this.operTime = operTime;
    }

    @Override
    public String toString() {
        return "ViewXtDrug{" +
        "drugtermid=" + drugtermid +
        ", tradename=" + tradename +
        ", priceref=" + priceref +
        ", doseunit=" + doseunit +
        ", minunit=" + minunit +
        ", basedose=" + basedose +
        ", specs=" + specs +
        ", termclassid=" + termclassid +
        ", termclassname=" + termclassname +
        ", dosemodel=" + dosemodel +
        ", usagecode=" + usagecode +
        ", frequencycode=" + frequencycode +
        ", bakdoseunit=" + bakdoseunit +
        ", bakbasedose=" + bakbasedose +
        ", hypoflag=" + hypoflag +
        ", validflag=" + validflag +
        ", tradeename=" + tradeename +
        ", spellcode=" + spellcode +
        ", wbcode=" + wbcode +
        ", customcode=" + customcode +
        ", operTime=" + operTime +
        "}";
    }
}
