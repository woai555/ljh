package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 禁忌明细表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdTaboodetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 禁忌代码
     */
    @TableId(value = "TABOO_NO", type = IdType.AUTO)
    private String tabooNo;

    /**
     * 项目代码
     */
    private String itemCode;

    /**
     * 项目名称
     */
    private String itemName;

    /**
     * 主药标志
     */
    private String mainDrug;

    /**
     * 最大剂量
     */
    private BigDecimal maxDose;

    /**
     * 药品性质，1普药
     */
    private String drugQuality;

    /**
     * 剂型
     */
    private String doseModel;

    /**
     * 药品类别
     */
    private String drugType;

    /**
     * 限制频次
     */
    private Integer maxFreq;

    /**
     * 备注
     */
    private String remark;


    public String getTabooNo() {
        return tabooNo;
    }

    public void setTabooNo(String tabooNo) {
        this.tabooNo = tabooNo;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getMainDrug() {
        return mainDrug;
    }

    public void setMainDrug(String mainDrug) {
        this.mainDrug = mainDrug;
    }

    public BigDecimal getMaxDose() {
        return maxDose;
    }

    public void setMaxDose(BigDecimal maxDose) {
        this.maxDose = maxDose;
    }

    public String getDrugQuality() {
        return drugQuality;
    }

    public void setDrugQuality(String drugQuality) {
        this.drugQuality = drugQuality;
    }

    public String getDoseModel() {
        return doseModel;
    }

    public void setDoseModel(String doseModel) {
        this.doseModel = doseModel;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public Integer getMaxFreq() {
        return maxFreq;
    }

    public void setMaxFreq(Integer maxFreq) {
        this.maxFreq = maxFreq;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "OrdTaboodetail{" +
        "tabooNo=" + tabooNo +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", mainDrug=" + mainDrug +
        ", maxDose=" + maxDose +
        ", drugQuality=" + drugQuality +
        ", doseModel=" + doseModel +
        ", drugType=" + drugType +
        ", maxFreq=" + maxFreq +
        ", remark=" + remark +
        "}";
    }
}
