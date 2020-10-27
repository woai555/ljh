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
public class ViewHlhtCdroutchg implements Serializable {

    private static final long serialVersionUID=1L;

    private String outPatientId;

    private String healthCardNo;

    private String outpNo;

    private String visitId;

    private String visitType;

    private String chargeNo;

    private String transactionType;

    private String invalidReceiptSn;

    private String orderGroupNo;

    private String orderNo;

    private String parentOrderNo;

    private String orderClass;

    private String orderItem;

    private String orderDeptCode;

    private String orderDeptName;

    private String orderDoctor;

    private String orderTime;

    private String orderText;

    private String orderNote;

    private String cancelDoctor;

    private String cancelTime;

    private String cancelReason;

    private String presStatus;

    private String frequency;

    private String frequencyDesc;

    private String duration;

    private String drugId;

    private String packageNo;

    private String specification;

    private BigDecimal drugAmount;

    private BigDecimal herbAmount;

    private BigDecimal dosage;

    private BigDecimal totalDosage;

    private String dosageUnit;

    private String pharmacyWay;

    private String prescTime;

    private String prescDeptCode;

    private String prescDeptName;

    private String ledgerSn;

    private String chargeCode;

    private String chargeName;

    private String chargeClassCode;

    private String chargeClassName;

    private String billItemCode;

    private String billItemName;

    private String chargeStatusCode;

    private String chargeStatusName;

    private BigDecimal chargeItemPrice;

    private BigDecimal chargeAmount;

    private BigDecimal chargeFee;

    private String chargeTime;

    private String rescueChargeInd;

    private String operChargeInd;

    private String priceOperator;

    private String priceTime;

    private String chargeWindow;

    private String chargeOper;

    private String chargeConfirmer;

    private String chargeConfirmTime;

    private String operateType;

    private LocalDateTime operatortime;


    public String getOutPatientId() {
        return outPatientId;
    }

    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public String getOutpNo() {
        return outpNo;
    }

    public void setOutpNo(String outpNo) {
        this.outpNo = outpNo;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getChargeNo() {
        return chargeNo;
    }

    public void setChargeNo(String chargeNo) {
        this.chargeNo = chargeNo;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getInvalidReceiptSn() {
        return invalidReceiptSn;
    }

    public void setInvalidReceiptSn(String invalidReceiptSn) {
        this.invalidReceiptSn = invalidReceiptSn;
    }

    public String getOrderGroupNo() {
        return orderGroupNo;
    }

    public void setOrderGroupNo(String orderGroupNo) {
        this.orderGroupNo = orderGroupNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getParentOrderNo() {
        return parentOrderNo;
    }

    public void setParentOrderNo(String parentOrderNo) {
        this.parentOrderNo = parentOrderNo;
    }

    public String getOrderClass() {
        return orderClass;
    }

    public void setOrderClass(String orderClass) {
        this.orderClass = orderClass;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    public String getOrderDeptCode() {
        return orderDeptCode;
    }

    public void setOrderDeptCode(String orderDeptCode) {
        this.orderDeptCode = orderDeptCode;
    }

    public String getOrderDeptName() {
        return orderDeptName;
    }

    public void setOrderDeptName(String orderDeptName) {
        this.orderDeptName = orderDeptName;
    }

    public String getOrderDoctor() {
        return orderDoctor;
    }

    public void setOrderDoctor(String orderDoctor) {
        this.orderDoctor = orderDoctor;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderText() {
        return orderText;
    }

    public void setOrderText(String orderText) {
        this.orderText = orderText;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    public String getCancelDoctor() {
        return cancelDoctor;
    }

    public void setCancelDoctor(String cancelDoctor) {
        this.cancelDoctor = cancelDoctor;
    }

    public String getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getPresStatus() {
        return presStatus;
    }

    public void setPresStatus(String presStatus) {
        this.presStatus = presStatus;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getFrequencyDesc() {
        return frequencyDesc;
    }

    public void setFrequencyDesc(String frequencyDesc) {
        this.frequencyDesc = frequencyDesc;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public BigDecimal getDrugAmount() {
        return drugAmount;
    }

    public void setDrugAmount(BigDecimal drugAmount) {
        this.drugAmount = drugAmount;
    }

    public BigDecimal getHerbAmount() {
        return herbAmount;
    }

    public void setHerbAmount(BigDecimal herbAmount) {
        this.herbAmount = herbAmount;
    }

    public BigDecimal getDosage() {
        return dosage;
    }

    public void setDosage(BigDecimal dosage) {
        this.dosage = dosage;
    }

    public BigDecimal getTotalDosage() {
        return totalDosage;
    }

    public void setTotalDosage(BigDecimal totalDosage) {
        this.totalDosage = totalDosage;
    }

    public String getDosageUnit() {
        return dosageUnit;
    }

    public void setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit;
    }

    public String getPharmacyWay() {
        return pharmacyWay;
    }

    public void setPharmacyWay(String pharmacyWay) {
        this.pharmacyWay = pharmacyWay;
    }

    public String getPrescTime() {
        return prescTime;
    }

    public void setPrescTime(String prescTime) {
        this.prescTime = prescTime;
    }

    public String getPrescDeptCode() {
        return prescDeptCode;
    }

    public void setPrescDeptCode(String prescDeptCode) {
        this.prescDeptCode = prescDeptCode;
    }

    public String getPrescDeptName() {
        return prescDeptName;
    }

    public void setPrescDeptName(String prescDeptName) {
        this.prescDeptName = prescDeptName;
    }

    public String getLedgerSn() {
        return ledgerSn;
    }

    public void setLedgerSn(String ledgerSn) {
        this.ledgerSn = ledgerSn;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    public String getChargeClassCode() {
        return chargeClassCode;
    }

    public void setChargeClassCode(String chargeClassCode) {
        this.chargeClassCode = chargeClassCode;
    }

    public String getChargeClassName() {
        return chargeClassName;
    }

    public void setChargeClassName(String chargeClassName) {
        this.chargeClassName = chargeClassName;
    }

    public String getBillItemCode() {
        return billItemCode;
    }

    public void setBillItemCode(String billItemCode) {
        this.billItemCode = billItemCode;
    }

    public String getBillItemName() {
        return billItemName;
    }

    public void setBillItemName(String billItemName) {
        this.billItemName = billItemName;
    }

    public String getChargeStatusCode() {
        return chargeStatusCode;
    }

    public void setChargeStatusCode(String chargeStatusCode) {
        this.chargeStatusCode = chargeStatusCode;
    }

    public String getChargeStatusName() {
        return chargeStatusName;
    }

    public void setChargeStatusName(String chargeStatusName) {
        this.chargeStatusName = chargeStatusName;
    }

    public BigDecimal getChargeItemPrice() {
        return chargeItemPrice;
    }

    public void setChargeItemPrice(BigDecimal chargeItemPrice) {
        this.chargeItemPrice = chargeItemPrice;
    }

    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(BigDecimal chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public BigDecimal getChargeFee() {
        return chargeFee;
    }

    public void setChargeFee(BigDecimal chargeFee) {
        this.chargeFee = chargeFee;
    }

    public String getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
    }

    public String getRescueChargeInd() {
        return rescueChargeInd;
    }

    public void setRescueChargeInd(String rescueChargeInd) {
        this.rescueChargeInd = rescueChargeInd;
    }

    public String getOperChargeInd() {
        return operChargeInd;
    }

    public void setOperChargeInd(String operChargeInd) {
        this.operChargeInd = operChargeInd;
    }

    public String getPriceOperator() {
        return priceOperator;
    }

    public void setPriceOperator(String priceOperator) {
        this.priceOperator = priceOperator;
    }

    public String getPriceTime() {
        return priceTime;
    }

    public void setPriceTime(String priceTime) {
        this.priceTime = priceTime;
    }

    public String getChargeWindow() {
        return chargeWindow;
    }

    public void setChargeWindow(String chargeWindow) {
        this.chargeWindow = chargeWindow;
    }

    public String getChargeOper() {
        return chargeOper;
    }

    public void setChargeOper(String chargeOper) {
        this.chargeOper = chargeOper;
    }

    public String getChargeConfirmer() {
        return chargeConfirmer;
    }

    public void setChargeConfirmer(String chargeConfirmer) {
        this.chargeConfirmer = chargeConfirmer;
    }

    public String getChargeConfirmTime() {
        return chargeConfirmTime;
    }

    public void setChargeConfirmTime(String chargeConfirmTime) {
        this.chargeConfirmTime = chargeConfirmTime;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdroutchg{" +
        "outPatientId=" + outPatientId +
        ", healthCardNo=" + healthCardNo +
        ", outpNo=" + outpNo +
        ", visitId=" + visitId +
        ", visitType=" + visitType +
        ", chargeNo=" + chargeNo +
        ", transactionType=" + transactionType +
        ", invalidReceiptSn=" + invalidReceiptSn +
        ", orderGroupNo=" + orderGroupNo +
        ", orderNo=" + orderNo +
        ", parentOrderNo=" + parentOrderNo +
        ", orderClass=" + orderClass +
        ", orderItem=" + orderItem +
        ", orderDeptCode=" + orderDeptCode +
        ", orderDeptName=" + orderDeptName +
        ", orderDoctor=" + orderDoctor +
        ", orderTime=" + orderTime +
        ", orderText=" + orderText +
        ", orderNote=" + orderNote +
        ", cancelDoctor=" + cancelDoctor +
        ", cancelTime=" + cancelTime +
        ", cancelReason=" + cancelReason +
        ", presStatus=" + presStatus +
        ", frequency=" + frequency +
        ", frequencyDesc=" + frequencyDesc +
        ", duration=" + duration +
        ", drugId=" + drugId +
        ", packageNo=" + packageNo +
        ", specification=" + specification +
        ", drugAmount=" + drugAmount +
        ", herbAmount=" + herbAmount +
        ", dosage=" + dosage +
        ", totalDosage=" + totalDosage +
        ", dosageUnit=" + dosageUnit +
        ", pharmacyWay=" + pharmacyWay +
        ", prescTime=" + prescTime +
        ", prescDeptCode=" + prescDeptCode +
        ", prescDeptName=" + prescDeptName +
        ", ledgerSn=" + ledgerSn +
        ", chargeCode=" + chargeCode +
        ", chargeName=" + chargeName +
        ", chargeClassCode=" + chargeClassCode +
        ", chargeClassName=" + chargeClassName +
        ", billItemCode=" + billItemCode +
        ", billItemName=" + billItemName +
        ", chargeStatusCode=" + chargeStatusCode +
        ", chargeStatusName=" + chargeStatusName +
        ", chargeItemPrice=" + chargeItemPrice +
        ", chargeAmount=" + chargeAmount +
        ", chargeFee=" + chargeFee +
        ", chargeTime=" + chargeTime +
        ", rescueChargeInd=" + rescueChargeInd +
        ", operChargeInd=" + operChargeInd +
        ", priceOperator=" + priceOperator +
        ", priceTime=" + priceTime +
        ", chargeWindow=" + chargeWindow +
        ", chargeOper=" + chargeOper +
        ", chargeConfirmer=" + chargeConfirmer +
        ", chargeConfirmTime=" + chargeConfirmTime +
        ", operateType=" + operateType +
        ", operatortime=" + operatortime +
        "}";
    }
}
