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
public class OpAnaedruginfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 当不表示组套时编码为AAAA
     */
    @TableId(value = "ZT_CODE", type = IdType.AUTO)
    private String ztCode;

    private String ztName;

    private String ztSpell;

    private String drugCode;

    private String drugName;

    private String specs;

    private BigDecimal salePrice;

    private BigDecimal drugRate;


    public String getZtCode() {
        return ztCode;
    }

    public void setZtCode(String ztCode) {
        this.ztCode = ztCode;
    }

    public String getZtName() {
        return ztName;
    }

    public void setZtName(String ztName) {
        this.ztName = ztName;
    }

    public String getZtSpell() {
        return ztSpell;
    }

    public void setZtSpell(String ztSpell) {
        this.ztSpell = ztSpell;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getDrugRate() {
        return drugRate;
    }

    public void setDrugRate(BigDecimal drugRate) {
        this.drugRate = drugRate;
    }

    @Override
    public String toString() {
        return "OpAnaedruginfo{" +
        "ztCode=" + ztCode +
        ", ztName=" + ztName +
        ", ztSpell=" + ztSpell +
        ", drugCode=" + drugCode +
        ", drugName=" + drugName +
        ", specs=" + specs +
        ", salePrice=" + salePrice +
        ", drugRate=" + drugRate +
        "}";
    }
}
