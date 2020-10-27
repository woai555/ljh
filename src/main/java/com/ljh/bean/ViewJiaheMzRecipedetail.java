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
public class ViewJiaheMzRecipedetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String seeNo;

    private Integer sequenceNo;

    private String outpId;

    private LocalDateTime regDate;

    private String presClassCode;

    private String presClassName;

    private String spec;

    private String drugFlag;

    private String classCode;

    private String feeCode;

    private BigDecimal unitPrice;

    private BigDecimal qty;

    private Integer days;

    private Integer packQty;

    private String itemUnit;

    private BigDecimal ownCost;

    private BigDecimal payCost;

    private BigDecimal pubCost;

    private BigDecimal onceDose;

    private String onceUnit;

    private String freqCode;

    private String usageCode;

    private String usageName;

    private String deptCode;

    private String deptName;

    private String mainDrug;

    private String combNo;

    private String selfMade;

    private String drugQuanlity;

    private String presDoctor;

    private String presDoctorName;

    private String presDept;

    private LocalDateTime presTime;

    private String cancelUserid;

    private LocalDateTime cancelDate;

    private String remark;

    private String status;

    private String checkBody;

    private String applyNo;

    private String needConfirm;

    private String confirmCode;

    private String confirmDept;

    private LocalDateTime confirmDate;

    private BigDecimal baseDose;

    private String presNo;

    private String labType;

    private String checkBodyCode;

    private String itemGrade;

    private String combid;

    private BigDecimal useDays;

    private String ztCode;

    private String ztName;

    private String invoiceNo;

    private String invoiceOperid;

    private String feeStatName;

    private LocalDateTime seeDate;

    private LocalDateTime lastDate;


    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getOutpId() {
        return outpId;
    }

    public void setOutpId(String outpId) {
        this.outpId = outpId;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getPresClassCode() {
        return presClassCode;
    }

    public void setPresClassCode(String presClassCode) {
        this.presClassCode = presClassCode;
    }

    public String getPresClassName() {
        return presClassName;
    }

    public void setPresClassName(String presClassName) {
        this.presClassName = presClassName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getDrugFlag() {
        return drugFlag;
    }

    public void setDrugFlag(String drugFlag) {
        this.drugFlag = drugFlag;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
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

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getPackQty() {
        return packQty;
    }

    public void setPackQty(Integer packQty) {
        this.packQty = packQty;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public BigDecimal getPayCost() {
        return payCost;
    }

    public void setPayCost(BigDecimal payCost) {
        this.payCost = payCost;
    }

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public BigDecimal getOnceDose() {
        return onceDose;
    }

    public void setOnceDose(BigDecimal onceDose) {
        this.onceDose = onceDose;
    }

    public String getOnceUnit() {
        return onceUnit;
    }

    public void setOnceUnit(String onceUnit) {
        this.onceUnit = onceUnit;
    }

    public String getFreqCode() {
        return freqCode;
    }

    public void setFreqCode(String freqCode) {
        this.freqCode = freqCode;
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

    public String getMainDrug() {
        return mainDrug;
    }

    public void setMainDrug(String mainDrug) {
        this.mainDrug = mainDrug;
    }

    public String getCombNo() {
        return combNo;
    }

    public void setCombNo(String combNo) {
        this.combNo = combNo;
    }

    public String getSelfMade() {
        return selfMade;
    }

    public void setSelfMade(String selfMade) {
        this.selfMade = selfMade;
    }

    public String getDrugQuanlity() {
        return drugQuanlity;
    }

    public void setDrugQuanlity(String drugQuanlity) {
        this.drugQuanlity = drugQuanlity;
    }

    public String getPresDoctor() {
        return presDoctor;
    }

    public void setPresDoctor(String presDoctor) {
        this.presDoctor = presDoctor;
    }

    public String getPresDoctorName() {
        return presDoctorName;
    }

    public void setPresDoctorName(String presDoctorName) {
        this.presDoctorName = presDoctorName;
    }

    public String getPresDept() {
        return presDept;
    }

    public void setPresDept(String presDept) {
        this.presDept = presDept;
    }

    public LocalDateTime getPresTime() {
        return presTime;
    }

    public void setPresTime(LocalDateTime presTime) {
        this.presTime = presTime;
    }

    public String getCancelUserid() {
        return cancelUserid;
    }

    public void setCancelUserid(String cancelUserid) {
        this.cancelUserid = cancelUserid;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheckBody() {
        return checkBody;
    }

    public void setCheckBody(String checkBody) {
        this.checkBody = checkBody;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getNeedConfirm() {
        return needConfirm;
    }

    public void setNeedConfirm(String needConfirm) {
        this.needConfirm = needConfirm;
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }

    public String getConfirmDept() {
        return confirmDept;
    }

    public void setConfirmDept(String confirmDept) {
        this.confirmDept = confirmDept;
    }

    public LocalDateTime getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(LocalDateTime confirmDate) {
        this.confirmDate = confirmDate;
    }

    public BigDecimal getBaseDose() {
        return baseDose;
    }

    public void setBaseDose(BigDecimal baseDose) {
        this.baseDose = baseDose;
    }

    public String getPresNo() {
        return presNo;
    }

    public void setPresNo(String presNo) {
        this.presNo = presNo;
    }

    public String getLabType() {
        return labType;
    }

    public void setLabType(String labType) {
        this.labType = labType;
    }

    public String getCheckBodyCode() {
        return checkBodyCode;
    }

    public void setCheckBodyCode(String checkBodyCode) {
        this.checkBodyCode = checkBodyCode;
    }

    public String getItemGrade() {
        return itemGrade;
    }

    public void setItemGrade(String itemGrade) {
        this.itemGrade = itemGrade;
    }

    public String getCombid() {
        return combid;
    }

    public void setCombid(String combid) {
        this.combid = combid;
    }

    public BigDecimal getUseDays() {
        return useDays;
    }

    public void setUseDays(BigDecimal useDays) {
        this.useDays = useDays;
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

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceOperid() {
        return invoiceOperid;
    }

    public void setInvoiceOperid(String invoiceOperid) {
        this.invoiceOperid = invoiceOperid;
    }

    public String getFeeStatName() {
        return feeStatName;
    }

    public void setFeeStatName(String feeStatName) {
        this.feeStatName = feeStatName;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public LocalDateTime getLastDate() {
        return lastDate;
    }

    public void setLastDate(LocalDateTime lastDate) {
        this.lastDate = lastDate;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzRecipedetail{" +
        "seeNo=" + seeNo +
        ", sequenceNo=" + sequenceNo +
        ", outpId=" + outpId +
        ", regDate=" + regDate +
        ", presClassCode=" + presClassCode +
        ", presClassName=" + presClassName +
        ", spec=" + spec +
        ", drugFlag=" + drugFlag +
        ", classCode=" + classCode +
        ", feeCode=" + feeCode +
        ", unitPrice=" + unitPrice +
        ", qty=" + qty +
        ", days=" + days +
        ", packQty=" + packQty +
        ", itemUnit=" + itemUnit +
        ", ownCost=" + ownCost +
        ", payCost=" + payCost +
        ", pubCost=" + pubCost +
        ", onceDose=" + onceDose +
        ", onceUnit=" + onceUnit +
        ", freqCode=" + freqCode +
        ", usageCode=" + usageCode +
        ", usageName=" + usageName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", mainDrug=" + mainDrug +
        ", combNo=" + combNo +
        ", selfMade=" + selfMade +
        ", drugQuanlity=" + drugQuanlity +
        ", presDoctor=" + presDoctor +
        ", presDoctorName=" + presDoctorName +
        ", presDept=" + presDept +
        ", presTime=" + presTime +
        ", cancelUserid=" + cancelUserid +
        ", cancelDate=" + cancelDate +
        ", remark=" + remark +
        ", status=" + status +
        ", checkBody=" + checkBody +
        ", applyNo=" + applyNo +
        ", needConfirm=" + needConfirm +
        ", confirmCode=" + confirmCode +
        ", confirmDept=" + confirmDept +
        ", confirmDate=" + confirmDate +
        ", baseDose=" + baseDose +
        ", presNo=" + presNo +
        ", labType=" + labType +
        ", checkBodyCode=" + checkBodyCode +
        ", itemGrade=" + itemGrade +
        ", combid=" + combid +
        ", useDays=" + useDays +
        ", ztCode=" + ztCode +
        ", ztName=" + ztName +
        ", invoiceNo=" + invoiceNo +
        ", invoiceOperid=" + invoiceOperid +
        ", feeStatName=" + feeStatName +
        ", seeDate=" + seeDate +
        ", lastDate=" + lastDate +
        "}";
    }
}
