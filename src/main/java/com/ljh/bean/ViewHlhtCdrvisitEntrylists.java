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
public class ViewHlhtCdrvisitEntrylists implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String orderNo;

    private String visitNo;

    private String orderDate;

    private String orderedDatetime;

    private String cancelledDatetime;

    private String remark;

    private String roaCode;

    private String roaDesc;

    private String yinpianDecoctionDesc;

    private String oeOrderInfo;

    private String oeOrderRemarks;

    private String frequencyCode;

    private String frequencyDesc;

    private String durationQty;

    private String durationCode;

    private String durationDesc;

    private String packingnumber;

    private String herbalDosageNumber;

    private String execTime;

    private String prescriptionEffectiveDays;

    private String therapeuticPrincipleDesc;

    private String orderClass;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getVisitNo() {
        return visitNo;
    }

    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderedDatetime() {
        return orderedDatetime;
    }

    public void setOrderedDatetime(String orderedDatetime) {
        this.orderedDatetime = orderedDatetime;
    }

    public String getCancelledDatetime() {
        return cancelledDatetime;
    }

    public void setCancelledDatetime(String cancelledDatetime) {
        this.cancelledDatetime = cancelledDatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRoaCode() {
        return roaCode;
    }

    public void setRoaCode(String roaCode) {
        this.roaCode = roaCode;
    }

    public String getRoaDesc() {
        return roaDesc;
    }

    public void setRoaDesc(String roaDesc) {
        this.roaDesc = roaDesc;
    }

    public String getYinpianDecoctionDesc() {
        return yinpianDecoctionDesc;
    }

    public void setYinpianDecoctionDesc(String yinpianDecoctionDesc) {
        this.yinpianDecoctionDesc = yinpianDecoctionDesc;
    }

    public String getOeOrderInfo() {
        return oeOrderInfo;
    }

    public void setOeOrderInfo(String oeOrderInfo) {
        this.oeOrderInfo = oeOrderInfo;
    }

    public String getOeOrderRemarks() {
        return oeOrderRemarks;
    }

    public void setOeOrderRemarks(String oeOrderRemarks) {
        this.oeOrderRemarks = oeOrderRemarks;
    }

    public String getFrequencyCode() {
        return frequencyCode;
    }

    public void setFrequencyCode(String frequencyCode) {
        this.frequencyCode = frequencyCode;
    }

    public String getFrequencyDesc() {
        return frequencyDesc;
    }

    public void setFrequencyDesc(String frequencyDesc) {
        this.frequencyDesc = frequencyDesc;
    }

    public String getDurationQty() {
        return durationQty;
    }

    public void setDurationQty(String durationQty) {
        this.durationQty = durationQty;
    }

    public String getDurationCode() {
        return durationCode;
    }

    public void setDurationCode(String durationCode) {
        this.durationCode = durationCode;
    }

    public String getDurationDesc() {
        return durationDesc;
    }

    public void setDurationDesc(String durationDesc) {
        this.durationDesc = durationDesc;
    }

    public String getPackingnumber() {
        return packingnumber;
    }

    public void setPackingnumber(String packingnumber) {
        this.packingnumber = packingnumber;
    }

    public String getHerbalDosageNumber() {
        return herbalDosageNumber;
    }

    public void setHerbalDosageNumber(String herbalDosageNumber) {
        this.herbalDosageNumber = herbalDosageNumber;
    }

    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
    }

    public String getPrescriptionEffectiveDays() {
        return prescriptionEffectiveDays;
    }

    public void setPrescriptionEffectiveDays(String prescriptionEffectiveDays) {
        this.prescriptionEffectiveDays = prescriptionEffectiveDays;
    }

    public String getTherapeuticPrincipleDesc() {
        return therapeuticPrincipleDesc;
    }

    public void setTherapeuticPrincipleDesc(String therapeuticPrincipleDesc) {
        this.therapeuticPrincipleDesc = therapeuticPrincipleDesc;
    }

    public String getOrderClass() {
        return orderClass;
    }

    public void setOrderClass(String orderClass) {
        this.orderClass = orderClass;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdrvisitEntrylists{" +
        "cardNo=" + cardNo +
        ", orderNo=" + orderNo +
        ", visitNo=" + visitNo +
        ", orderDate=" + orderDate +
        ", orderedDatetime=" + orderedDatetime +
        ", cancelledDatetime=" + cancelledDatetime +
        ", remark=" + remark +
        ", roaCode=" + roaCode +
        ", roaDesc=" + roaDesc +
        ", yinpianDecoctionDesc=" + yinpianDecoctionDesc +
        ", oeOrderInfo=" + oeOrderInfo +
        ", oeOrderRemarks=" + oeOrderRemarks +
        ", frequencyCode=" + frequencyCode +
        ", frequencyDesc=" + frequencyDesc +
        ", durationQty=" + durationQty +
        ", durationCode=" + durationCode +
        ", durationDesc=" + durationDesc +
        ", packingnumber=" + packingnumber +
        ", herbalDosageNumber=" + herbalDosageNumber +
        ", execTime=" + execTime +
        ", prescriptionEffectiveDays=" + prescriptionEffectiveDays +
        ", therapeuticPrincipleDesc=" + therapeuticPrincipleDesc +
        ", orderClass=" + orderClass +
        "}";
    }
}
