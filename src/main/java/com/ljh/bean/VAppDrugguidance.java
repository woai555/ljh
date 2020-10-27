package com.ljh.bean;

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
public class VAppDrugguidance implements Serializable {

    private static final long serialVersionUID=1L;

    private String sheetNo;

    private String drugCode;

    private String drugName;

    private String drugSpecifications;

    private String drugUsage;

    private String drugUseAttention;

    private String drugStopEffect;

    private String drugRemarks;

    private String drugExplain;


    public String getSheetNo() {
        return sheetNo;
    }

    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
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

    public String getDrugSpecifications() {
        return drugSpecifications;
    }

    public void setDrugSpecifications(String drugSpecifications) {
        this.drugSpecifications = drugSpecifications;
    }

    public String getDrugUsage() {
        return drugUsage;
    }

    public void setDrugUsage(String drugUsage) {
        this.drugUsage = drugUsage;
    }

    public String getDrugUseAttention() {
        return drugUseAttention;
    }

    public void setDrugUseAttention(String drugUseAttention) {
        this.drugUseAttention = drugUseAttention;
    }

    public String getDrugStopEffect() {
        return drugStopEffect;
    }

    public void setDrugStopEffect(String drugStopEffect) {
        this.drugStopEffect = drugStopEffect;
    }

    public String getDrugRemarks() {
        return drugRemarks;
    }

    public void setDrugRemarks(String drugRemarks) {
        this.drugRemarks = drugRemarks;
    }

    public String getDrugExplain() {
        return drugExplain;
    }

    public void setDrugExplain(String drugExplain) {
        this.drugExplain = drugExplain;
    }

    @Override
    public String toString() {
        return "VAppDrugguidance{" +
        "sheetNo=" + sheetNo +
        ", drugCode=" + drugCode +
        ", drugName=" + drugName +
        ", drugSpecifications=" + drugSpecifications +
        ", drugUsage=" + drugUsage +
        ", drugUseAttention=" + drugUseAttention +
        ", drugStopEffect=" + drugStopEffect +
        ", drugRemarks=" + drugRemarks +
        ", drugExplain=" + drugExplain +
        "}";
    }
}
