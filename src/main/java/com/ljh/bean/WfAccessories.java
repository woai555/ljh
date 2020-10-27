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
public class WfAccessories implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "YEARCODE", type = IdType.AUTO)
    private String yearcode;

    private Integer acceno;

    private String facilityname;

    private String name;

    private String spellcode;

    private String officename;

    private String model;

    private String engname;

    private String contractcode;

    private String imcopany;

    private String imcountry;

    private Integer facinum;

    private String faciunit;

    private BigDecimal price;

    private BigDecimal money;

    private LocalDateTime purchasedate;

    private String notation;

    private String operator;

    private LocalDateTime registdate;


    public String getYearcode() {
        return yearcode;
    }

    public void setYearcode(String yearcode) {
        this.yearcode = yearcode;
    }

    public Integer getAcceno() {
        return acceno;
    }

    public void setAcceno(Integer acceno) {
        this.acceno = acceno;
    }

    public String getFacilityname() {
        return facilityname;
    }

    public void setFacilityname(String facilityname) {
        this.facilityname = facilityname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpellcode() {
        return spellcode;
    }

    public void setSpellcode(String spellcode) {
        this.spellcode = spellcode;
    }

    public String getOfficename() {
        return officename;
    }

    public void setOfficename(String officename) {
        this.officename = officename;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname;
    }

    public String getContractcode() {
        return contractcode;
    }

    public void setContractcode(String contractcode) {
        this.contractcode = contractcode;
    }

    public String getImcopany() {
        return imcopany;
    }

    public void setImcopany(String imcopany) {
        this.imcopany = imcopany;
    }

    public String getImcountry() {
        return imcountry;
    }

    public void setImcountry(String imcountry) {
        this.imcountry = imcountry;
    }

    public Integer getFacinum() {
        return facinum;
    }

    public void setFacinum(Integer facinum) {
        this.facinum = facinum;
    }

    public String getFaciunit() {
        return faciunit;
    }

    public void setFaciunit(String faciunit) {
        this.faciunit = faciunit;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public LocalDateTime getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(LocalDateTime purchasedate) {
        this.purchasedate = purchasedate;
    }

    public String getNotation() {
        return notation;
    }

    public void setNotation(String notation) {
        this.notation = notation;
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
        return "WfAccessories{" +
        "yearcode=" + yearcode +
        ", acceno=" + acceno +
        ", facilityname=" + facilityname +
        ", name=" + name +
        ", spellcode=" + spellcode +
        ", officename=" + officename +
        ", model=" + model +
        ", engname=" + engname +
        ", contractcode=" + contractcode +
        ", imcopany=" + imcopany +
        ", imcountry=" + imcountry +
        ", facinum=" + facinum +
        ", faciunit=" + faciunit +
        ", price=" + price +
        ", money=" + money +
        ", purchasedate=" + purchasedate +
        ", notation=" + notation +
        ", operator=" + operator +
        ", registdate=" + registdate +
        "}";
    }
}
