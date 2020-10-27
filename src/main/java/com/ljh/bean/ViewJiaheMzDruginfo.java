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
public class ViewJiaheMzDruginfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugCode;

    private String tradeName;

    private String formalName;

    private BigDecimal baseDose;

    private String doseUnit;

    private String minUnit;

    private String packUnit;

    private Integer packQty;

    private String specs;

    private String antibioticType;

    private String antibioticTypeName;

    private Integer psyFlag;

    private String psyFlagName;

    private String drugType;

    private String drugTypeName;

    private String drugQuality;

    private String drugQualityName;


    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getFormalName() {
        return formalName;
    }

    public void setFormalName(String formalName) {
        this.formalName = formalName;
    }

    public BigDecimal getBaseDose() {
        return baseDose;
    }

    public void setBaseDose(BigDecimal baseDose) {
        this.baseDose = baseDose;
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit;
    }

    public String getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(String minUnit) {
        this.minUnit = minUnit;
    }

    public String getPackUnit() {
        return packUnit;
    }

    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit;
    }

    public Integer getPackQty() {
        return packQty;
    }

    public void setPackQty(Integer packQty) {
        this.packQty = packQty;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getAntibioticType() {
        return antibioticType;
    }

    public void setAntibioticType(String antibioticType) {
        this.antibioticType = antibioticType;
    }

    public String getAntibioticTypeName() {
        return antibioticTypeName;
    }

    public void setAntibioticTypeName(String antibioticTypeName) {
        this.antibioticTypeName = antibioticTypeName;
    }

    public Integer getPsyFlag() {
        return psyFlag;
    }

    public void setPsyFlag(Integer psyFlag) {
        this.psyFlag = psyFlag;
    }

    public String getPsyFlagName() {
        return psyFlagName;
    }

    public void setPsyFlagName(String psyFlagName) {
        this.psyFlagName = psyFlagName;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getDrugTypeName() {
        return drugTypeName;
    }

    public void setDrugTypeName(String drugTypeName) {
        this.drugTypeName = drugTypeName;
    }

    public String getDrugQuality() {
        return drugQuality;
    }

    public void setDrugQuality(String drugQuality) {
        this.drugQuality = drugQuality;
    }

    public String getDrugQualityName() {
        return drugQualityName;
    }

    public void setDrugQualityName(String drugQualityName) {
        this.drugQualityName = drugQualityName;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzDruginfo{" +
        "drugCode=" + drugCode +
        ", tradeName=" + tradeName +
        ", formalName=" + formalName +
        ", baseDose=" + baseDose +
        ", doseUnit=" + doseUnit +
        ", minUnit=" + minUnit +
        ", packUnit=" + packUnit +
        ", packQty=" + packQty +
        ", specs=" + specs +
        ", antibioticType=" + antibioticType +
        ", antibioticTypeName=" + antibioticTypeName +
        ", psyFlag=" + psyFlag +
        ", psyFlagName=" + psyFlagName +
        ", drugType=" + drugType +
        ", drugTypeName=" + drugTypeName +
        ", drugQuality=" + drugQuality +
        ", drugQualityName=" + drugQualityName +
        "}";
    }
}
