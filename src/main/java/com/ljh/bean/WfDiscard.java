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
public class WfDiscard implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "DISCODE", type = IdType.AUTO)
    private String discode;

    private BigDecimal disno;

    private String facinamecode;

    private String facilityname;

    private String speci;

    private String spellcode;

    private BigDecimal lifespan;

    private Integer facilitysource;

    private LocalDateTime purchasedate;

    private String country;

    private String factory;

    private String storeman;

    private String deptcode;

    private Integer use;

    private String contractcode;

    private String faciunit;

    private BigDecimal money;

    private LocalDateTime disdate;

    private String aging;

    private String ratifier;

    private Integer treatwith;

    private String notation;

    private BigDecimal scrapvalue;

    private String productioncode;

    private Integer keeplevel;

    private Integer fundssource;

    private String withacces;

    private String inhospitalcode;

    private BigDecimal monthdepre;

    /**
     * 1有效   2无效
     */
    private BigDecimal isvalid;

    private String operator;

    private LocalDateTime registdate;


    public String getDiscode() {
        return discode;
    }

    public void setDiscode(String discode) {
        this.discode = discode;
    }

    public BigDecimal getDisno() {
        return disno;
    }

    public void setDisno(BigDecimal disno) {
        this.disno = disno;
    }

    public String getFacinamecode() {
        return facinamecode;
    }

    public void setFacinamecode(String facinamecode) {
        this.facinamecode = facinamecode;
    }

    public String getFacilityname() {
        return facilityname;
    }

    public void setFacilityname(String facilityname) {
        this.facilityname = facilityname;
    }

    public String getSpeci() {
        return speci;
    }

    public void setSpeci(String speci) {
        this.speci = speci;
    }

    public String getSpellcode() {
        return spellcode;
    }

    public void setSpellcode(String spellcode) {
        this.spellcode = spellcode;
    }

    public BigDecimal getLifespan() {
        return lifespan;
    }

    public void setLifespan(BigDecimal lifespan) {
        this.lifespan = lifespan;
    }

    public Integer getFacilitysource() {
        return facilitysource;
    }

    public void setFacilitysource(Integer facilitysource) {
        this.facilitysource = facilitysource;
    }

    public LocalDateTime getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(LocalDateTime purchasedate) {
        this.purchasedate = purchasedate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getStoreman() {
        return storeman;
    }

    public void setStoreman(String storeman) {
        this.storeman = storeman;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public Integer getUse() {
        return use;
    }

    public void setUse(Integer use) {
        this.use = use;
    }

    public String getContractcode() {
        return contractcode;
    }

    public void setContractcode(String contractcode) {
        this.contractcode = contractcode;
    }

    public String getFaciunit() {
        return faciunit;
    }

    public void setFaciunit(String faciunit) {
        this.faciunit = faciunit;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public LocalDateTime getDisdate() {
        return disdate;
    }

    public void setDisdate(LocalDateTime disdate) {
        this.disdate = disdate;
    }

    public String getAging() {
        return aging;
    }

    public void setAging(String aging) {
        this.aging = aging;
    }

    public String getRatifier() {
        return ratifier;
    }

    public void setRatifier(String ratifier) {
        this.ratifier = ratifier;
    }

    public Integer getTreatwith() {
        return treatwith;
    }

    public void setTreatwith(Integer treatwith) {
        this.treatwith = treatwith;
    }

    public String getNotation() {
        return notation;
    }

    public void setNotation(String notation) {
        this.notation = notation;
    }

    public BigDecimal getScrapvalue() {
        return scrapvalue;
    }

    public void setScrapvalue(BigDecimal scrapvalue) {
        this.scrapvalue = scrapvalue;
    }

    public String getProductioncode() {
        return productioncode;
    }

    public void setProductioncode(String productioncode) {
        this.productioncode = productioncode;
    }

    public Integer getKeeplevel() {
        return keeplevel;
    }

    public void setKeeplevel(Integer keeplevel) {
        this.keeplevel = keeplevel;
    }

    public Integer getFundssource() {
        return fundssource;
    }

    public void setFundssource(Integer fundssource) {
        this.fundssource = fundssource;
    }

    public String getWithacces() {
        return withacces;
    }

    public void setWithacces(String withacces) {
        this.withacces = withacces;
    }

    public String getInhospitalcode() {
        return inhospitalcode;
    }

    public void setInhospitalcode(String inhospitalcode) {
        this.inhospitalcode = inhospitalcode;
    }

    public BigDecimal getMonthdepre() {
        return monthdepre;
    }

    public void setMonthdepre(BigDecimal monthdepre) {
        this.monthdepre = monthdepre;
    }

    public BigDecimal getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(BigDecimal isvalid) {
        this.isvalid = isvalid;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LocalDateTime getRegistdate() {
        return registdate;
    }

    public void setRegistdate(LocalDateTime registdate) {
        this.registdate = registdate;
    }

    @Override
    public String toString() {
        return "WfDiscard{" +
        "discode=" + discode +
        ", disno=" + disno +
        ", facinamecode=" + facinamecode +
        ", facilityname=" + facilityname +
        ", speci=" + speci +
        ", spellcode=" + spellcode +
        ", lifespan=" + lifespan +
        ", facilitysource=" + facilitysource +
        ", purchasedate=" + purchasedate +
        ", country=" + country +
        ", factory=" + factory +
        ", storeman=" + storeman +
        ", deptcode=" + deptcode +
        ", use=" + use +
        ", contractcode=" + contractcode +
        ", faciunit=" + faciunit +
        ", money=" + money +
        ", disdate=" + disdate +
        ", aging=" + aging +
        ", ratifier=" + ratifier +
        ", treatwith=" + treatwith +
        ", notation=" + notation +
        ", scrapvalue=" + scrapvalue +
        ", productioncode=" + productioncode +
        ", keeplevel=" + keeplevel +
        ", fundssource=" + fundssource +
        ", withacces=" + withacces +
        ", inhospitalcode=" + inhospitalcode +
        ", monthdepre=" + monthdepre +
        ", isvalid=" + isvalid +
        ", operator=" + operator +
        ", registdate=" + registdate +
        "}";
    }
}
