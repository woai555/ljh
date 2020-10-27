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
public class ViewYtappBilllist implements Serializable {

    private static final long serialVersionUID=1L;

    private String hosCode;

    private String channelType;

    private String tradeType;

    private String payType;

    private BigDecimal tradeFee;

    private String outTradeNo;

    private String inTradeNo;

    private String tradeTime;

    private String tradeNo;

    private String bizType;

    private String districtId;

    private String sourceType;

    private String statType;

    private String deviceNo;

    private String empNo;

    private LocalDateTime startDate;

    private LocalDateTime endDate;


    public String getHosCode() {
        return hosCode;
    }

    public void setHosCode(String hosCode) {
        this.hosCode = hosCode;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public BigDecimal getTradeFee() {
        return tradeFee;
    }

    public void setTradeFee(BigDecimal tradeFee) {
        this.tradeFee = tradeFee;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getInTradeNo() {
        return inTradeNo;
    }

    public void setInTradeNo(String inTradeNo) {
        this.inTradeNo = inTradeNo;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "ViewYtappBilllist{" +
        "hosCode=" + hosCode +
        ", channelType=" + channelType +
        ", tradeType=" + tradeType +
        ", payType=" + payType +
        ", tradeFee=" + tradeFee +
        ", outTradeNo=" + outTradeNo +
        ", inTradeNo=" + inTradeNo +
        ", tradeTime=" + tradeTime +
        ", tradeNo=" + tradeNo +
        ", bizType=" + bizType +
        ", districtId=" + districtId +
        ", sourceType=" + sourceType +
        ", statType=" + statType +
        ", deviceNo=" + deviceNo +
        ", empNo=" + empNo +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        "}";
    }
}
