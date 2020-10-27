package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 救治记录-呼吸机子表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Prbreath implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 编码
     */
    @TableId(value = "PR_CODE", type = IdType.AUTO)
    private BigDecimal prCode;

    /**
     * 救治编码
     */
    private String treatmentCode;

    /**
     * 处理序号
     */
    private BigDecimal dealNumber;

    /**
     * 呼吸机型号
     */
    private String breathingMachine;

    /**
     * 是否有创 有创/无创
     */
    private String ynWound;

    /**
     * 模式
     */
    private String model;

    /**
     * 潮气量
     */
    private String tidalVolume;

    /**
     * 通气频率
     */
    private String breathingFrequency;

    /**
     * 通气时间比率
     */
    private String breathingRate;

    /**
     * 氧浓度
     */
    private String oxygenConcentration;

    /**
     * 吸气时间
     */
    private String breatheInTime;

    /**
     * PEEP
     */
    private String peep;

    /**
     * IPAP
     */
    private String ipap;

    /**
     * EPAP
     */
    private String epap;

    /**
     * 其它
     */
    private String other;

    /**
     * 备注
     */
    private String remark;

    /**
     * 最后更新时间
     */
    private LocalDateTime lastupdatetime;


    public BigDecimal getPrCode() {
        return prCode;
    }

    public void setPrCode(BigDecimal prCode) {
        this.prCode = prCode;
    }

    public String getTreatmentCode() {
        return treatmentCode;
    }

    public void setTreatmentCode(String treatmentCode) {
        this.treatmentCode = treatmentCode;
    }

    public BigDecimal getDealNumber() {
        return dealNumber;
    }

    public void setDealNumber(BigDecimal dealNumber) {
        this.dealNumber = dealNumber;
    }

    public String getBreathingMachine() {
        return breathingMachine;
    }

    public void setBreathingMachine(String breathingMachine) {
        this.breathingMachine = breathingMachine;
    }

    public String getYnWound() {
        return ynWound;
    }

    public void setYnWound(String ynWound) {
        this.ynWound = ynWound;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTidalVolume() {
        return tidalVolume;
    }

    public void setTidalVolume(String tidalVolume) {
        this.tidalVolume = tidalVolume;
    }

    public String getBreathingFrequency() {
        return breathingFrequency;
    }

    public void setBreathingFrequency(String breathingFrequency) {
        this.breathingFrequency = breathingFrequency;
    }

    public String getBreathingRate() {
        return breathingRate;
    }

    public void setBreathingRate(String breathingRate) {
        this.breathingRate = breathingRate;
    }

    public String getOxygenConcentration() {
        return oxygenConcentration;
    }

    public void setOxygenConcentration(String oxygenConcentration) {
        this.oxygenConcentration = oxygenConcentration;
    }

    public String getBreatheInTime() {
        return breatheInTime;
    }

    public void setBreatheInTime(String breatheInTime) {
        this.breatheInTime = breatheInTime;
    }

    public String getPeep() {
        return peep;
    }

    public void setPeep(String peep) {
        this.peep = peep;
    }

    public String getIpap() {
        return ipap;
    }

    public void setIpap(String ipap) {
        this.ipap = ipap;
    }

    public String getEpap() {
        return epap;
    }

    public void setEpap(String epap) {
        this.epap = epap;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(LocalDateTime lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    @Override
    public String toString() {
        return "Prbreath{" +
        "prCode=" + prCode +
        ", treatmentCode=" + treatmentCode +
        ", dealNumber=" + dealNumber +
        ", breathingMachine=" + breathingMachine +
        ", ynWound=" + ynWound +
        ", model=" + model +
        ", tidalVolume=" + tidalVolume +
        ", breathingFrequency=" + breathingFrequency +
        ", breathingRate=" + breathingRate +
        ", oxygenConcentration=" + oxygenConcentration +
        ", breatheInTime=" + breatheInTime +
        ", peep=" + peep +
        ", ipap=" + ipap +
        ", epap=" + epap +
        ", other=" + other +
        ", remark=" + remark +
        ", lastupdatetime=" + lastupdatetime +
        "}";
    }
}
