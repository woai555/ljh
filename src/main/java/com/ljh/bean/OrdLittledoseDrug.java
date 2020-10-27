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
public class OrdLittledoseDrug implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 药品编码
     */
    @TableId(value = "DRUG_CODE", type = IdType.AUTO)
    private String drugCode;

    /**
     * 药品名称
     */
    private String tradeName;

    /**
     * 规格
     */
    private String specs;

    /**
     * 零售价
     */
    private BigDecimal salePrice;

    /**
     * 包装单位
     */
    private String packUnit;

    /**
     * 维护人
     */
    private String operCode;

    /**
     * 维护时间
     */
    private LocalDateTime operDate;


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

    public String getPackUnit() {
        return packUnit;
    }

    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "OrdLittledoseDrug{" +
        "drugCode=" + drugCode +
        ", tradeName=" + tradeName +
        ", specs=" + specs +
        ", salePrice=" + salePrice +
        ", packUnit=" + packUnit +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
