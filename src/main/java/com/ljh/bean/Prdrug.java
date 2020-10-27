package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 救治记录-用药子表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Prdrug implements Serializable {

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
     * 给药方式
     */
    private String deliveryWay;

    /**
     * 药品名称
     */
    private String medicineName;

    /**
     * 规格
     */
    private String spec;

    /**
     * 用量
     */
    private String qty;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否外带药 是/否
     */
    private String ynOut;

    /**
     * 用药剂量
     */
    private String dose;

    /**
     * 是否拆分
     */
    private String ynBreakUp;

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

    public String getDeliveryWay() {
        return deliveryWay;
    }

    public void setDeliveryWay(String deliveryWay) {
        this.deliveryWay = deliveryWay;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getYnOut() {
        return ynOut;
    }

    public void setYnOut(String ynOut) {
        this.ynOut = ynOut;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getYnBreakUp() {
        return ynBreakUp;
    }

    public void setYnBreakUp(String ynBreakUp) {
        this.ynBreakUp = ynBreakUp;
    }

    public LocalDateTime getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(LocalDateTime lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    @Override
    public String toString() {
        return "Prdrug{" +
        "prCode=" + prCode +
        ", treatmentCode=" + treatmentCode +
        ", dealNumber=" + dealNumber +
        ", deliveryWay=" + deliveryWay +
        ", medicineName=" + medicineName +
        ", spec=" + spec +
        ", qty=" + qty +
        ", remark=" + remark +
        ", ynOut=" + ynOut +
        ", dose=" + dose +
        ", ynBreakUp=" + ynBreakUp +
        ", lastupdatetime=" + lastupdatetime +
        "}";
    }
}
