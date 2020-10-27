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
public class UndrugDetailTemp implements Serializable {

    private static final long serialVersionUID=1L;

    private String recipeNo;

    private Integer sequenceNo;

    private String transType;

    private String cardNo;

    private LocalDateTime regDtime;

    private String undrugCode;

    private String undrugName;

    private String feeCode;

    private String sysClass;

    private BigDecimal unitPrice;

    private BigDecimal qty;

    private BigDecimal pubCost;

    private BigDecimal payCost;

    private BigDecimal ownCost;

    private String deptCode;

    private String deptName;

    private String sdeptCode;

    private String payFlag;

    private String cancelFlag;

    private BigDecimal derateCost;

    private String emergFlag;

    private String centerCode;

    private String dataFrom;

    private String stockCode;

    private String minusStockFlag;

    private String stockUnit;

    private String apprNo;

    private String recorder;

    private LocalDateTime recordDate;

    private String operCode;

    private LocalDateTime operDate;

    private String invoiceNo;

    private String itemGrade;

    private String doctCode;

    private String doctDept;

    private String ifFru;

    private String ztCode;

    private String ztName;

    private String lisFlag;

    private String checkOperCode;

    private LocalDateTime checkDate;

    private String confirmFlag;

    private String confirmOperCode;

    private LocalDateTime confirmDate;

    private String cancelOperCode;

    private LocalDateTime cancelDate;

    private String machineCode;

    private String execOperCode;

    private String djbFlag;

    private String clinicCode;

    private String moOrder;

    private String invaliddateOperCode;

    private LocalDateTime invaliddateDate;


    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDtime() {
        return regDtime;
    }

    public void setRegDtime(LocalDateTime regDtime) {
        this.regDtime = regDtime;
    }

    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getUndrugName() {
        return undrugName;
    }

    public void setUndrugName(String undrugName) {
        this.undrugName = undrugName;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getSysClass() {
        return sysClass;
    }

    public void setSysClass(String sysClass) {
        this.sysClass = sysClass;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public BigDecimal getPayCost() {
        return payCost;
    }

    public void setPayCost(BigDecimal payCost) {
        this.payCost = payCost;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getSdeptCode() {
        return sdeptCode;
    }

    public void setSdeptCode(String sdeptCode) {
        this.sdeptCode = sdeptCode;
    }

    public String getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public BigDecimal getDerateCost() {
        return derateCost;
    }

    public void setDerateCost(BigDecimal derateCost) {
        this.derateCost = derateCost;
    }

    public String getEmergFlag() {
        return emergFlag;
    }

    public void setEmergFlag(String emergFlag) {
        this.emergFlag = emergFlag;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public String getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getMinusStockFlag() {
        return minusStockFlag;
    }

    public void setMinusStockFlag(String minusStockFlag) {
        this.minusStockFlag = minusStockFlag;
    }

    public String getStockUnit() {
        return stockUnit;
    }

    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit;
    }

    public String getApprNo() {
        return apprNo;
    }

    public void setApprNo(String apprNo) {
        this.apprNo = apprNo;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    public LocalDateTime getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDateTime recordDate) {
        this.recordDate = recordDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getItemGrade() {
        return itemGrade;
    }

    public void setItemGrade(String itemGrade) {
        this.itemGrade = itemGrade;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getDoctDept() {
        return doctDept;
    }

    public void setDoctDept(String doctDept) {
        this.doctDept = doctDept;
    }

    public String getIfFru() {
        return ifFru;
    }

    public void setIfFru(String ifFru) {
        this.ifFru = ifFru;
    }

    public String getZtCode() {
        return ztCode;
    }

    public void setZtCode(String ztCode) {
        this.ztCode = ztCode;
    }

    public String getZtName() {
        return ztName;
    }

    public void setZtName(String ztName) {
        this.ztName = ztName;
    }

    public String getLisFlag() {
        return lisFlag;
    }

    public void setLisFlag(String lisFlag) {
        this.lisFlag = lisFlag;
    }

    public String getCheckOperCode() {
        return checkOperCode;
    }

    public void setCheckOperCode(String checkOperCode) {
        this.checkOperCode = checkOperCode;
    }

    public LocalDateTime getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(LocalDateTime checkDate) {
        this.checkDate = checkDate;
    }

    public String getConfirmFlag() {
        return confirmFlag;
    }

    public void setConfirmFlag(String confirmFlag) {
        this.confirmFlag = confirmFlag;
    }

    public String getConfirmOperCode() {
        return confirmOperCode;
    }

    public void setConfirmOperCode(String confirmOperCode) {
        this.confirmOperCode = confirmOperCode;
    }

    public LocalDateTime getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(LocalDateTime confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getCancelOperCode() {
        return cancelOperCode;
    }

    public void setCancelOperCode(String cancelOperCode) {
        this.cancelOperCode = cancelOperCode;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    public String getExecOperCode() {
        return execOperCode;
    }

    public void setExecOperCode(String execOperCode) {
        this.execOperCode = execOperCode;
    }

    public String getDjbFlag() {
        return djbFlag;
    }

    public void setDjbFlag(String djbFlag) {
        this.djbFlag = djbFlag;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
    }

    public String getMoOrder() {
        return moOrder;
    }

    public void setMoOrder(String moOrder) {
        this.moOrder = moOrder;
    }

    public String getInvaliddateOperCode() {
        return invaliddateOperCode;
    }

    public void setInvaliddateOperCode(String invaliddateOperCode) {
        this.invaliddateOperCode = invaliddateOperCode;
    }

    public LocalDateTime getInvaliddateDate() {
        return invaliddateDate;
    }

    public void setInvaliddateDate(LocalDateTime invaliddateDate) {
        this.invaliddateDate = invaliddateDate;
    }

    @Override
    public String toString() {
        return "UndrugDetailTemp{" +
        "recipeNo=" + recipeNo +
        ", sequenceNo=" + sequenceNo +
        ", transType=" + transType +
        ", cardNo=" + cardNo +
        ", regDtime=" + regDtime +
        ", undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        ", feeCode=" + feeCode +
        ", sysClass=" + sysClass +
        ", unitPrice=" + unitPrice +
        ", qty=" + qty +
        ", pubCost=" + pubCost +
        ", payCost=" + payCost +
        ", ownCost=" + ownCost +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", sdeptCode=" + sdeptCode +
        ", payFlag=" + payFlag +
        ", cancelFlag=" + cancelFlag +
        ", derateCost=" + derateCost +
        ", emergFlag=" + emergFlag +
        ", centerCode=" + centerCode +
        ", dataFrom=" + dataFrom +
        ", stockCode=" + stockCode +
        ", minusStockFlag=" + minusStockFlag +
        ", stockUnit=" + stockUnit +
        ", apprNo=" + apprNo +
        ", recorder=" + recorder +
        ", recordDate=" + recordDate +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", invoiceNo=" + invoiceNo +
        ", itemGrade=" + itemGrade +
        ", doctCode=" + doctCode +
        ", doctDept=" + doctDept +
        ", ifFru=" + ifFru +
        ", ztCode=" + ztCode +
        ", ztName=" + ztName +
        ", lisFlag=" + lisFlag +
        ", checkOperCode=" + checkOperCode +
        ", checkDate=" + checkDate +
        ", confirmFlag=" + confirmFlag +
        ", confirmOperCode=" + confirmOperCode +
        ", confirmDate=" + confirmDate +
        ", cancelOperCode=" + cancelOperCode +
        ", cancelDate=" + cancelDate +
        ", machineCode=" + machineCode +
        ", execOperCode=" + execOperCode +
        ", djbFlag=" + djbFlag +
        ", clinicCode=" + clinicCode +
        ", moOrder=" + moOrder +
        ", invaliddateOperCode=" + invaliddateOperCode +
        ", invaliddateDate=" + invaliddateDate +
        "}";
    }
}
