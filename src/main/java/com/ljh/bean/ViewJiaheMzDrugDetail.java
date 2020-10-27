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
public class ViewJiaheMzDrugDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String prescNo;

    private Integer sequenceNo;

    private String transType;

    private String outpId;

    private LocalDateTime regDtime;

    private String pharmaceuticalCode;

    private String pharmaceuticalName;

    private String spec;

    private String recipeFlag;

    private String selfMade;

    private BigDecimal price;

    private BigDecimal qty;

    private Integer days;

    private String freqCode;

    private String freqName;

    private String useWayCode;

    private String usageCode;

    private String usageName;

    private BigDecimal dosage;

    private String doseUnit;

    private BigDecimal amount;

    private String amountUnit;

    private Integer packQty;

    private String packUnit;

    private String minUnit;

    private String centerCode;

    private BigDecimal pubCost;

    private BigDecimal payCost;

    private BigDecimal ownCost;

    private String payFlag;

    private String cancelFlag;

    private String drugQuality;

    private String dataFrom;

    private String feeCode;

    private String stockCode;

    private String minusStockFlag;

    private String getDrugFlag;

    private String recorder;

    private LocalDateTime recordDate;

    private String operCode;

    private LocalDateTime operDtime;

    private String apprNo;

    private String invoiceNo;

    private String itemGrade;

    private String pharmacyDoctor;

    private String pharmacyDoctorname;

    private Long updateSequenceno;

    private String ifFru;

    private String pharmacyDept;

    private String pharmacyDeptname;

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

    private String refeeFlag;

    private String kss;

    private String zsj;


    public String getPrescNo() {
        return prescNo;
    }

    public void setPrescNo(String prescNo) {
        this.prescNo = prescNo;
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

    public String getOutpId() {
        return outpId;
    }

    public void setOutpId(String outpId) {
        this.outpId = outpId;
    }

    public LocalDateTime getRegDtime() {
        return regDtime;
    }

    public void setRegDtime(LocalDateTime regDtime) {
        this.regDtime = regDtime;
    }

    public String getPharmaceuticalCode() {
        return pharmaceuticalCode;
    }

    public void setPharmaceuticalCode(String pharmaceuticalCode) {
        this.pharmaceuticalCode = pharmaceuticalCode;
    }

    public String getPharmaceuticalName() {
        return pharmaceuticalName;
    }

    public void setPharmaceuticalName(String pharmaceuticalName) {
        this.pharmaceuticalName = pharmaceuticalName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getRecipeFlag() {
        return recipeFlag;
    }

    public void setRecipeFlag(String recipeFlag) {
        this.recipeFlag = recipeFlag;
    }

    public String getSelfMade() {
        return selfMade;
    }

    public void setSelfMade(String selfMade) {
        this.selfMade = selfMade;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getFreqCode() {
        return freqCode;
    }

    public void setFreqCode(String freqCode) {
        this.freqCode = freqCode;
    }

    public String getFreqName() {
        return freqName;
    }

    public void setFreqName(String freqName) {
        this.freqName = freqName;
    }

    public String getUseWayCode() {
        return useWayCode;
    }

    public void setUseWayCode(String useWayCode) {
        this.useWayCode = useWayCode;
    }

    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode;
    }

    public String getUsageName() {
        return usageName;
    }

    public void setUsageName(String usageName) {
        this.usageName = usageName;
    }

    public BigDecimal getDosage() {
        return dosage;
    }

    public void setDosage(BigDecimal dosage) {
        this.dosage = dosage;
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(String amountUnit) {
        this.amountUnit = amountUnit;
    }

    public Integer getPackQty() {
        return packQty;
    }

    public void setPackQty(Integer packQty) {
        this.packQty = packQty;
    }

    public String getPackUnit() {
        return packUnit;
    }

    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit;
    }

    public String getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(String minUnit) {
        this.minUnit = minUnit;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
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

    public String getDrugQuality() {
        return drugQuality;
    }

    public void setDrugQuality(String drugQuality) {
        this.drugQuality = drugQuality;
    }

    public String getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
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

    public String getGetDrugFlag() {
        return getDrugFlag;
    }

    public void setGetDrugFlag(String getDrugFlag) {
        this.getDrugFlag = getDrugFlag;
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

    public LocalDateTime getOperDtime() {
        return operDtime;
    }

    public void setOperDtime(LocalDateTime operDtime) {
        this.operDtime = operDtime;
    }

    public String getApprNo() {
        return apprNo;
    }

    public void setApprNo(String apprNo) {
        this.apprNo = apprNo;
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

    public String getPharmacyDoctor() {
        return pharmacyDoctor;
    }

    public void setPharmacyDoctor(String pharmacyDoctor) {
        this.pharmacyDoctor = pharmacyDoctor;
    }

    public String getPharmacyDoctorname() {
        return pharmacyDoctorname;
    }

    public void setPharmacyDoctorname(String pharmacyDoctorname) {
        this.pharmacyDoctorname = pharmacyDoctorname;
    }

    public Long getUpdateSequenceno() {
        return updateSequenceno;
    }

    public void setUpdateSequenceno(Long updateSequenceno) {
        this.updateSequenceno = updateSequenceno;
    }

    public String getIfFru() {
        return ifFru;
    }

    public void setIfFru(String ifFru) {
        this.ifFru = ifFru;
    }

    public String getPharmacyDept() {
        return pharmacyDept;
    }

    public void setPharmacyDept(String pharmacyDept) {
        this.pharmacyDept = pharmacyDept;
    }

    public String getPharmacyDeptname() {
        return pharmacyDeptname;
    }

    public void setPharmacyDeptname(String pharmacyDeptname) {
        this.pharmacyDeptname = pharmacyDeptname;
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

    public String getRefeeFlag() {
        return refeeFlag;
    }

    public void setRefeeFlag(String refeeFlag) {
        this.refeeFlag = refeeFlag;
    }

    public String getKss() {
        return kss;
    }

    public void setKss(String kss) {
        this.kss = kss;
    }

    public String getZsj() {
        return zsj;
    }

    public void setZsj(String zsj) {
        this.zsj = zsj;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzDrugDetail{" +
        "prescNo=" + prescNo +
        ", sequenceNo=" + sequenceNo +
        ", transType=" + transType +
        ", outpId=" + outpId +
        ", regDtime=" + regDtime +
        ", pharmaceuticalCode=" + pharmaceuticalCode +
        ", pharmaceuticalName=" + pharmaceuticalName +
        ", spec=" + spec +
        ", recipeFlag=" + recipeFlag +
        ", selfMade=" + selfMade +
        ", price=" + price +
        ", qty=" + qty +
        ", days=" + days +
        ", freqCode=" + freqCode +
        ", freqName=" + freqName +
        ", useWayCode=" + useWayCode +
        ", usageCode=" + usageCode +
        ", usageName=" + usageName +
        ", dosage=" + dosage +
        ", doseUnit=" + doseUnit +
        ", amount=" + amount +
        ", amountUnit=" + amountUnit +
        ", packQty=" + packQty +
        ", packUnit=" + packUnit +
        ", minUnit=" + minUnit +
        ", centerCode=" + centerCode +
        ", pubCost=" + pubCost +
        ", payCost=" + payCost +
        ", ownCost=" + ownCost +
        ", payFlag=" + payFlag +
        ", cancelFlag=" + cancelFlag +
        ", drugQuality=" + drugQuality +
        ", dataFrom=" + dataFrom +
        ", feeCode=" + feeCode +
        ", stockCode=" + stockCode +
        ", minusStockFlag=" + minusStockFlag +
        ", getDrugFlag=" + getDrugFlag +
        ", recorder=" + recorder +
        ", recordDate=" + recordDate +
        ", operCode=" + operCode +
        ", operDtime=" + operDtime +
        ", apprNo=" + apprNo +
        ", invoiceNo=" + invoiceNo +
        ", itemGrade=" + itemGrade +
        ", pharmacyDoctor=" + pharmacyDoctor +
        ", pharmacyDoctorname=" + pharmacyDoctorname +
        ", updateSequenceno=" + updateSequenceno +
        ", ifFru=" + ifFru +
        ", pharmacyDept=" + pharmacyDept +
        ", pharmacyDeptname=" + pharmacyDeptname +
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
        ", refeeFlag=" + refeeFlag +
        ", kss=" + kss +
        ", zsj=" + zsj +
        "}";
    }
}
