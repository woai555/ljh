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
public class VRwzbFeedetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String streamNo;

    private String tradeNo;

    private BigDecimal charge;

    private String patientId;

    private LocalDateTime transDate;

    private String hisNo;

    private String transType;

    private String payWayJyt;


    public String getStreamNo() {
        return streamNo;
    }

    public void setStreamNo(String streamNo) {
        this.streamNo = streamNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public BigDecimal getCharge() {
        return charge;
    }

    public void setCharge(BigDecimal charge) {
        this.charge = charge;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public LocalDateTime getTransDate() {
        return transDate;
    }

    public void setTransDate(LocalDateTime transDate) {
        this.transDate = transDate;
    }

    public String getHisNo() {
        return hisNo;
    }

    public void setHisNo(String hisNo) {
        this.hisNo = hisNo;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getPayWayJyt() {
        return payWayJyt;
    }

    public void setPayWayJyt(String payWayJyt) {
        this.payWayJyt = payWayJyt;
    }

    @Override
    public String toString() {
        return "VRwzbFeedetail{" +
        "streamNo=" + streamNo +
        ", tradeNo=" + tradeNo +
        ", charge=" + charge +
        ", patientId=" + patientId +
        ", transDate=" + transDate +
        ", hisNo=" + hisNo +
        ", transType=" + transType +
        ", payWayJyt=" + payWayJyt +
        "}";
    }
}
