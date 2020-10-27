package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_DS_DRUGAPPLY
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewDsDrugapply implements Serializable {

    private static final long serialVersionUID=1L;

    private String tradeName;

    private String tradeCode;

    private String formalName;

    private String formalCode;

    private String englishName;

    private String userCode;

    private String packUnit;

    private Integer packQty;

    private String specs;

    private String drugQuality;


    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getFormalName() {
        return formalName;
    }

    public void setFormalName(String formalName) {
        this.formalName = formalName;
    }

    public String getFormalCode() {
        return formalCode;
    }

    public void setFormalCode(String formalCode) {
        this.formalCode = formalCode;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
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

    public String getDrugQuality() {
        return drugQuality;
    }

    public void setDrugQuality(String drugQuality) {
        this.drugQuality = drugQuality;
    }

    @Override
    public String toString() {
        return "ViewDsDrugapply{" +
        "tradeName=" + tradeName +
        ", tradeCode=" + tradeCode +
        ", formalName=" + formalName +
        ", formalCode=" + formalCode +
        ", englishName=" + englishName +
        ", userCode=" + userCode +
        ", packUnit=" + packUnit +
        ", packQty=" + packQty +
        ", specs=" + specs +
        ", drugQuality=" + drugQuality +
        "}";
    }
}
