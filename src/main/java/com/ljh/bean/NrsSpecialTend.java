package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 特别护理记录单
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NrsSpecialTend implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院号
     */
    @TableId(value = "INPATIENT_NO", type = IdType.AUTO)
    private String inpatientNo;

    /**
     * 时间
     */
    private LocalDateTime tendTime;

    /**
     * 神志
     */
    private String senses;

    /**
     * 瞳孔
     */
    private String pupil;

    /**
     * 体温
     */
    private BigDecimal temperature;

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
     * 项目
     */
    private String item;

    /**
     * 实入量
     */
    private Integer factIn;

    /**
     * 输液量
     */
    private Integer transfusion;

    /**
     * 小便量及比重
     */
    private Integer piss;

    /**
     * 大便量
     */
    private Integer stool;

    /**
     * 呕吐或引流量
     */
    private Integer spew;

    /**
     * 管道名称
     */
    private String name;

    /**
     * 情况
     */
    private String station;

    /**
     * 皮肤
     */
    private String skin;

    /**
     * 病情及护理措施实施情况
     */
    private String action;

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

    public String getSenses() {
        return senses;
    }

    public void setSenses(String senses) {
        this.senses = senses;
    }

    public String getPupil() {
        return pupil;
    }

    public void setPupil(String pupil) {
        this.pupil = pupil;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
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

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getFactIn() {
        return factIn;
    }

    public void setFactIn(Integer factIn) {
        this.factIn = factIn;
    }

    public Integer getTransfusion() {
        return transfusion;
    }

    public void setTransfusion(Integer transfusion) {
        this.transfusion = transfusion;
    }

    public Integer getPiss() {
        return piss;
    }

    public void setPiss(Integer piss) {
        this.piss = piss;
    }

    public Integer getStool() {
        return stool;
    }

    public void setStool(Integer stool) {
        this.stool = stool;
    }

    public Integer getSpew() {
        return spew;
    }

    public void setSpew(Integer spew) {
        this.spew = spew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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
        return "NrsSpecialTend{" +
        "inpatientNo=" + inpatientNo +
        ", tendTime=" + tendTime +
        ", senses=" + senses +
        ", pupil=" + pupil +
        ", temperature=" + temperature +
        ", pulse=" + pulse +
        ", breath=" + breath +
        ", blood=" + blood +
        ", item=" + item +
        ", factIn=" + factIn +
        ", transfusion=" + transfusion +
        ", piss=" + piss +
        ", stool=" + stool +
        ", spew=" + spew +
        ", name=" + name +
        ", station=" + station +
        ", skin=" + skin +
        ", action=" + action +
        ", operCode=" + operCode +
        ", operName=" + operName +
        "}";
    }
}
