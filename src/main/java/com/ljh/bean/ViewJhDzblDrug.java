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
public class ViewJhDzblDrug implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String hisVisitId;

    private String drugName;

    private String drugSpec;

    private BigDecimal drugQuantity;

    private String drugUnit;

    private String dosage;

    private String dosageUnit;

    private String frequence;

    private String usage;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getHisVisitId() {
        return hisVisitId;
    }

    public void setHisVisitId(String hisVisitId) {
        this.hisVisitId = hisVisitId;
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

    public BigDecimal getDrugQuantity() {
        return drugQuantity;
    }

    public void setDrugQuantity(BigDecimal drugQuantity) {
        this.drugQuantity = drugQuantity;
    }

    public String getDrugUnit() {
        return drugUnit;
    }

    public void setDrugUnit(String drugUnit) {
        this.drugUnit = drugUnit;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDosageUnit() {
        return dosageUnit;
    }

    public void setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "ViewJhDzblDrug{" +
        "patientId=" + patientId +
        ", hisVisitId=" + hisVisitId +
        ", drugName=" + drugName +
        ", drugSpec=" + drugSpec +
        ", drugQuantity=" + drugQuantity +
        ", drugUnit=" + drugUnit +
        ", dosage=" + dosage +
        ", dosageUnit=" + dosageUnit +
        ", frequence=" + frequence +
        ", usage=" + usage +
        "}";
    }
}
