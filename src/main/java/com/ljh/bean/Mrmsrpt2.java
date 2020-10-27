package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 社会及经济效益统计报表模版MRMSRPT2
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsrpt2 implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 大科代码
     */
    @TableId(value = "SDEPT_CODE", type = IdType.AUTO)
    private String sdeptCode;

    /**
     * 大科名称
     */
    private String sdeptName;

    /**
     * 子类代码
     */
    private String statKind;

    /**
     * 子类名称
     */
    private String statName;

    /**
     * 期内出院病人数
     */
    private Integer patientOut;

    /**
     * 出院病人占用总床日数
     */
    private Integer bedDaysop2;

    /**
     * 总费用
     */
    private BigDecimal costAll;

    /**
     * 住院费
     */
    private BigDecimal costBeds;

    /**
     * 药费
     */
    private BigDecimal costDrug;

    /**
     * 手术费
     */
    private BigDecimal costOper;

    /**
     * 检查治疗费
     */
    private BigDecimal costCure;

    private BigDecimal zg01CostAll;


    public String getSdeptCode() {
        return sdeptCode;
    }

    public void setSdeptCode(String sdeptCode) {
        this.sdeptCode = sdeptCode;
    }

    public String getSdeptName() {
        return sdeptName;
    }

    public void setSdeptName(String sdeptName) {
        this.sdeptName = sdeptName;
    }

    public String getStatKind() {
        return statKind;
    }

    public void setStatKind(String statKind) {
        this.statKind = statKind;
    }

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    public Integer getPatientOut() {
        return patientOut;
    }

    public void setPatientOut(Integer patientOut) {
        this.patientOut = patientOut;
    }

    public Integer getBedDaysop2() {
        return bedDaysop2;
    }

    public void setBedDaysop2(Integer bedDaysop2) {
        this.bedDaysop2 = bedDaysop2;
    }

    public BigDecimal getCostAll() {
        return costAll;
    }

    public void setCostAll(BigDecimal costAll) {
        this.costAll = costAll;
    }

    public BigDecimal getCostBeds() {
        return costBeds;
    }

    public void setCostBeds(BigDecimal costBeds) {
        this.costBeds = costBeds;
    }

    public BigDecimal getCostDrug() {
        return costDrug;
    }

    public void setCostDrug(BigDecimal costDrug) {
        this.costDrug = costDrug;
    }

    public BigDecimal getCostOper() {
        return costOper;
    }

    public void setCostOper(BigDecimal costOper) {
        this.costOper = costOper;
    }

    public BigDecimal getCostCure() {
        return costCure;
    }

    public void setCostCure(BigDecimal costCure) {
        this.costCure = costCure;
    }

    public BigDecimal getZg01CostAll() {
        return zg01CostAll;
    }

    public void setZg01CostAll(BigDecimal zg01CostAll) {
        this.zg01CostAll = zg01CostAll;
    }

    @Override
    public String toString() {
        return "Mrmsrpt2{" +
        "sdeptCode=" + sdeptCode +
        ", sdeptName=" + sdeptName +
        ", statKind=" + statKind +
        ", statName=" + statName +
        ", patientOut=" + patientOut +
        ", bedDaysop2=" + bedDaysop2 +
        ", costAll=" + costAll +
        ", costBeds=" + costBeds +
        ", costDrug=" + costDrug +
        ", costOper=" + costOper +
        ", costCure=" + costCure +
        ", zg01CostAll=" + zg01CostAll +
        "}";
    }
}
