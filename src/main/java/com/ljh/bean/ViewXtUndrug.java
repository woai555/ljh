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
public class ViewXtUndrug implements Serializable {

    private static final long serialVersionUID=1L;

    private String termid;

    private String termname;

    private BigDecimal priceref;

    private String specs;

    private String termclassid;

    private String termclassname;

    private String mappingcode;

    private String validflag;

    private String tradeename;

    private String spellcode;

    private String wbcode;

    private String customcode;

    private LocalDateTime operTime;


    public String getTermid() {
        return termid;
    }

    public void setTermid(String termid) {
        this.termid = termid;
    }

    public String getTermname() {
        return termname;
    }

    public void setTermname(String termname) {
        this.termname = termname;
    }

    public BigDecimal getPriceref() {
        return priceref;
    }

    public void setPriceref(BigDecimal priceref) {
        this.priceref = priceref;
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

    public String getMappingcode() {
        return mappingcode;
    }

    public void setMappingcode(String mappingcode) {
        this.mappingcode = mappingcode;
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
        return "ViewXtUndrug{" +
        "termid=" + termid +
        ", termname=" + termname +
        ", priceref=" + priceref +
        ", specs=" + specs +
        ", termclassid=" + termclassid +
        ", termclassname=" + termclassname +
        ", mappingcode=" + mappingcode +
        ", validflag=" + validflag +
        ", tradeename=" + tradeename +
        ", spellcode=" + spellcode +
        ", wbcode=" + wbcode +
        ", customcode=" + customcode +
        ", operTime=" + operTime +
        "}";
    }
}
