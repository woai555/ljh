package com.ljh.bean;

import java.math.BigDecimal;
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
public class ViewHzyhCfmx2 implements Serializable {

    private static final long serialVersionUID=1L;

    private String orderId;

    private String rxCode;

    private String drugCode;

    private String drugName;

    private String drugSpec;

    private BigDecimal dosage;

    private String dosageUnit;

    private String frequency;

    private String route;

    private BigDecimal duration;

    private String groupId;

    private String sequence;

    private BigDecimal quantity;

    private String skinTestFlag;

    private String skinTestResult;

    private String fluidFlag;

    private String dispenserCode;

    private String dispenserName;

    private String status;

    private String remark;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRxCode() {
        return rxCode;
    }

    public void setRxCode(String rxCode) {
        this.rxCode = rxCode;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugSpec() {
        return drugSpec;
    }

    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec;
    }

    public BigDecimal getDosage() {
        return dosage;
    }

    public void setDosage(BigDecimal dosage) {
        this.dosage = dosage;
    }

    public String getDosageUnit() {
        return dosageUnit;
    }

    public void setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getSkinTestFlag() {
        return skinTestFlag;
    }

    public void setSkinTestFlag(String skinTestFlag) {
        this.skinTestFlag = skinTestFlag;
    }

    public String getSkinTestResult() {
        return skinTestResult;
    }

    public void setSkinTestResult(String skinTestResult) {
        this.skinTestResult = skinTestResult;
    }

    public String getFluidFlag() {
        return fluidFlag;
    }

    public void setFluidFlag(String fluidFlag) {
        this.fluidFlag = fluidFlag;
    }

    public String getDispenserCode() {
        return dispenserCode;
    }

    public void setDispenserCode(String dispenserCode) {
        this.dispenserCode = dispenserCode;
    }

    public String getDispenserName() {
        return dispenserName;
    }

    public void setDispenserName(String dispenserName) {
        this.dispenserName = dispenserName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ViewHzyhCfmx2{" +
        "orderId=" + orderId +
        ", rxCode=" + rxCode +
        ", drugCode=" + drugCode +
        ", drugName=" + drugName +
        ", drugSpec=" + drugSpec +
        ", dosage=" + dosage +
        ", dosageUnit=" + dosageUnit +
        ", frequency=" + frequency +
        ", route=" + route +
        ", duration=" + duration +
        ", groupId=" + groupId +
        ", sequence=" + sequence +
        ", quantity=" + quantity +
        ", skinTestFlag=" + skinTestFlag +
        ", skinTestResult=" + skinTestResult +
        ", fluidFlag=" + fluidFlag +
        ", dispenserCode=" + dispenserCode +
        ", dispenserName=" + dispenserName +
        ", status=" + status +
        ", remark=" + remark +
        "}";
    }
}
