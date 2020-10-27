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
public class ViewHzyhFee implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String visitId;

    private String rxCode;

    private String rcptCode;

    private String feeCode;

    private String feeName;

    private String chargeCount;

    private LocalDateTime chargeTime;

    private BigDecimal money;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getRxCode() {
        return rxCode;
    }

    public void setRxCode(String rxCode) {
        this.rxCode = rxCode;
    }

    public String getRcptCode() {
        return rcptCode;
    }

    public void setRcptCode(String rcptCode) {
        this.rcptCode = rcptCode;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public String getChargeCount() {
        return chargeCount;
    }

    public void setChargeCount(String chargeCount) {
        this.chargeCount = chargeCount;
    }

    public LocalDateTime getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(LocalDateTime chargeTime) {
        this.chargeTime = chargeTime;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "ViewHzyhFee{" +
        "patientId=" + patientId +
        ", visitId=" + visitId +
        ", rxCode=" + rxCode +
        ", rcptCode=" + rcptCode +
        ", feeCode=" + feeCode +
        ", feeName=" + feeName +
        ", chargeCount=" + chargeCount +
        ", chargeTime=" + chargeTime +
        ", money=" + money +
        "}";
    }
}
