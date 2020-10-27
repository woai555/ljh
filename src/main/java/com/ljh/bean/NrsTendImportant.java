package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 重病护理记录
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NrsTendImportant implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院号
     */
    @TableId(value = "INPATIENT_NO", type = IdType.AUTO)
    private String inpatientNo;

    /**
     * 护理时间

     */
    private LocalDateTime tendTime;

    /**
     * 体温
     */
    private BigDecimal temprature;

    /**
     * 脉搏
     */
    private Integer pulse;

    /**
     * 呼吸
     */
    private String breath;

    /**
     * 血压
     */
    private String blood;

    /**
     * 排出量名称
     */
    private String outName;

    /**
     * 排出量含水量
     */
    private Integer outWater;

    /**
     * 输入量饮食
     */
    private Integer inFood;

    /**
     * 输入量含水量
     */
    private Integer inWater;

    /**
     * 输入量药物
     */
    private Integer inMedicine;

    /**
     * 输入量剂量
     */
    private Integer inCount;

    /**
     * 病情护理及要点
     */
    private String tendImpor;

    private String operCode;

    /**
     * 签名
     */
    private String operName;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public LocalDateTime getTendTime() {
        return tendTime;
    }

    public void setTendTime(LocalDateTime tendTime) {
        this.tendTime = tendTime;
    }

    public BigDecimal getTemprature() {
        return temprature;
    }

    public void setTemprature(BigDecimal temprature) {
        this.temprature = temprature;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public String getBreath() {
        return breath;
    }

    public void setBreath(String breath) {
        this.breath = breath;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getOutName() {
        return outName;
    }

    public void setOutName(String outName) {
        this.outName = outName;
    }

    public Integer getOutWater() {
        return outWater;
    }

    public void setOutWater(Integer outWater) {
        this.outWater = outWater;
    }

    public Integer getInFood() {
        return inFood;
    }

    public void setInFood(Integer inFood) {
        this.inFood = inFood;
    }

    public Integer getInWater() {
        return inWater;
    }

    public void setInWater(Integer inWater) {
        this.inWater = inWater;
    }

    public Integer getInMedicine() {
        return inMedicine;
    }

    public void setInMedicine(Integer inMedicine) {
        this.inMedicine = inMedicine;
    }

    public Integer getInCount() {
        return inCount;
    }

    public void setInCount(Integer inCount) {
        this.inCount = inCount;
    }

    public String getTendImpor() {
        return tendImpor;
    }

    public void setTendImpor(String tendImpor) {
        this.tendImpor = tendImpor;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    @Override
    public String toString() {
        return "NrsTendImportant{" +
        "inpatientNo=" + inpatientNo +
        ", tendTime=" + tendTime +
        ", temprature=" + temprature +
        ", pulse=" + pulse +
        ", breath=" + breath +
        ", blood=" + blood +
        ", outName=" + outName +
        ", outWater=" + outWater +
        ", inFood=" + inFood +
        ", inWater=" + inWater +
        ", inMedicine=" + inMedicine +
        ", inCount=" + inCount +
        ", tendImpor=" + tendImpor +
        ", operCode=" + operCode +
        ", operName=" + operName +
        "}";
    }
}
