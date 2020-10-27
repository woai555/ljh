package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 麻醉药品表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpAnaedrug implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "OPERATIONNO", type = IdType.AUTO)
    private String operationno;

    private BigDecimal recordno;

    private String drugCode;

    private String tradeName;

    private String specs;

    private BigDecimal drugPrice;

    private BigDecimal drugRate;

    private BigDecimal drugQty;

    private String drugUnit;

    private String ztCode;

    private String anaeUse;

    private String isBefore;

    private String chargeFlag;

    private String validFlag;

    private String operCode;

    private LocalDateTime operDate;


    public String getOperationno() {
        return operationno;
    }

    public void setOperationno(String operationno) {
        this.operationno = operationno;
    }

    public BigDecimal getRecordno() {
        return recordno;
    }

    public void setRecordno(BigDecimal recordno) {
        this.recordno = recordno;
    }

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

    public BigDecimal getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(BigDecimal drugPrice) {
        this.drugPrice = drugPrice;
    }

    public BigDecimal getDrugRate() {
        return drugRate;
    }

    public void setDrugRate(BigDecimal drugRate) {
        this.drugRate = drugRate;
    }

    public BigDecimal getDrugQty() {
        return drugQty;
    }

    public void setDrugQty(BigDecimal drugQty) {
        this.drugQty = drugQty;
    }

    public String getDrugUnit() {
        return drugUnit;
    }

    public void setDrugUnit(String drugUnit) {
        this.drugUnit = drugUnit;
    }

    public String getZtCode() {
        return ztCode;
    }

    public void setZtCode(String ztCode) {
        this.ztCode = ztCode;
    }

    public String getAnaeUse() {
        return anaeUse;
    }

    public void setAnaeUse(String anaeUse) {
        this.anaeUse = anaeUse;
    }

    public String getIsBefore() {
        return isBefore;
    }

    public void setIsBefore(String isBefore) {
        this.isBefore = isBefore;
    }

    public String getChargeFlag() {
        return chargeFlag;
    }

    public void setChargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag;
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag;
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
        return "OpAnaedrug{" +
        "operationno=" + operationno +
        ", recordno=" + recordno +
        ", drugCode=" + drugCode +
        ", tradeName=" + tradeName +
        ", specs=" + specs +
        ", drugPrice=" + drugPrice +
        ", drugRate=" + drugRate +
        ", drugQty=" + drugQty +
        ", drugUnit=" + drugUnit +
        ", ztCode=" + ztCode +
        ", anaeUse=" + anaeUse +
        ", isBefore=" + isBefore +
        ", chargeFlag=" + chargeFlag +
        ", validFlag=" + validFlag +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
