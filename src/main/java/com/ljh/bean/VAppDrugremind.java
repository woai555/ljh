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
public class VAppDrugremind implements Serializable {

    private static final long serialVersionUID=1L;

    private String hisPscriptNo;

    private LocalDateTime createTime;

    private String tcmRpUsage;

    private String tcmRpAmount;

    private String drugCode;

    private String drugName;

    private String drugSpec;

    private String drugAmount;

    private String usage;

    private String dosage;

    private BigDecimal drugPrice;

    private BigDecimal useDays;

    private String freqCode;

    private String doNumber;


    public String getHisPscriptNo() {
        return hisPscriptNo;
    }

    public void setHisPscriptNo(String hisPscriptNo) {
        this.hisPscriptNo = hisPscriptNo;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getTcmRpUsage() {
        return tcmRpUsage;
    }

    public void setTcmRpUsage(String tcmRpUsage) {
        this.tcmRpUsage = tcmRpUsage;
    }

    public String getTcmRpAmount() {
        return tcmRpAmount;
    }

    public void setTcmRpAmount(String tcmRpAmount) {
        this.tcmRpAmount = tcmRpAmount;
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

    public String getDrugSpec() {
        return drugSpec;
    }

    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec;
    }

    public String getDrugAmount() {
        return drugAmount;
    }

    public void setDrugAmount(String drugAmount) {
        this.drugAmount = drugAmount;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public BigDecimal getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(BigDecimal drugPrice) {
        this.drugPrice = drugPrice;
    }

    public BigDecimal getUseDays() {
        return useDays;
    }

    public void setUseDays(BigDecimal useDays) {
        this.useDays = useDays;
    }

    public String getFreqCode() {
        return freqCode;
    }

    public void setFreqCode(String freqCode) {
        this.freqCode = freqCode;
    }

    public String getDoNumber() {
        return doNumber;
    }

    public void setDoNumber(String doNumber) {
        this.doNumber = doNumber;
    }

    @Override
    public String toString() {
        return "VAppDrugremind{" +
        "hisPscriptNo=" + hisPscriptNo +
        ", createTime=" + createTime +
        ", tcmRpUsage=" + tcmRpUsage +
        ", tcmRpAmount=" + tcmRpAmount +
        ", drugCode=" + drugCode +
        ", drugName=" + drugName +
        ", drugSpec=" + drugSpec +
        ", drugAmount=" + drugAmount +
        ", usage=" + usage +
        ", dosage=" + dosage +
        ", drugPrice=" + drugPrice +
        ", useDays=" + useDays +
        ", freqCode=" + freqCode +
        ", doNumber=" + doNumber +
        "}";
    }
}
