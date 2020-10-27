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
public class ViewHlhtCdrvisitItemlists implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String seeNo;

    private String visitNo;

    private String orderNo;

    private String formNo;

    private String presStatus;

    private BigDecimal duration;

    private BigDecimal herbDosageQty;

    private String prescriptionTypeCode;

    private String prescriptionTypeDesc;

    private String zyypcf;

    private String chineseMedicineCode;

    private String chineseMedicineDesc;

    private String itemTypeCode;

    private String itemTypeDesc;

    private String execSubspecialtyCode;

    private String execSubspecialtyDesc;

    private String orderitemCode;

    private String orderitemDesc;

    private String chargeitemCode;

    private String drugitemCode;

    private String totalCost;

    private String drugitemDesc;

    private String dosageFormCode;

    private String dosageFormDesc;

    private String packageNo;

    private String specification;

    private String drugSpec;

    private String dosageQty;

    private String dosageUnitCode;

    private String dosageUnitDesc;

    private String totalDosageQty;

    private String orderedQty;

    private String orderedQtyUomCode;

    private String orderedQtyUomDes;

    private String actualUnitPrice;

    private String orderId;

    private String orderDate;

    private String remark;

    private String roaCode;

    private String roaDesc;

    private String oeOrderInfo;

    private String oeOrderRemarks;

    private String frequencyCode;

    private String frequencyDesc;

    private BigDecimal durationQty;

    private String durationCode;

    private String durationDesc;

    private BigDecimal packingnumber;

    private BigDecimal herbalDosageNumber;

    private String yinpianDecoctionDesc;

    private String execTime;

    private String therapeuticPrincipleDesc;

    private String orderClass;

    private String chargeStatus;

    private String costType;

    private String drugAllergy;

    private String doctorTypeCode;

    private String doctorTypeDesc;

    private String examineDate;

    private String implementDoctor;

    private String implementDoctorCode;

    private String examineDoctorCode;

    private String examineDoctor;

    private String standardCode;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getVisitNo() {
        return visitNo;
    }

    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getFormNo() {
        return formNo;
    }

    public void setFormNo(String formNo) {
        this.formNo = formNo;
    }

    public String getPresStatus() {
        return presStatus;
    }

    public void setPresStatus(String presStatus) {
        this.presStatus = presStatus;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public BigDecimal getHerbDosageQty() {
        return herbDosageQty;
    }

    public void setHerbDosageQty(BigDecimal herbDosageQty) {
        this.herbDosageQty = herbDosageQty;
    }

    public String getPrescriptionTypeCode() {
        return prescriptionTypeCode;
    }

    public void setPrescriptionTypeCode(String prescriptionTypeCode) {
        this.prescriptionTypeCode = prescriptionTypeCode;
    }

    public String getPrescriptionTypeDesc() {
        return prescriptionTypeDesc;
    }

    public void setPrescriptionTypeDesc(String prescriptionTypeDesc) {
        this.prescriptionTypeDesc = prescriptionTypeDesc;
    }

    public String getZyypcf() {
        return zyypcf;
    }

    public void setZyypcf(String zyypcf) {
        this.zyypcf = zyypcf;
    }

    public String getChineseMedicineCode() {
        return chineseMedicineCode;
    }

    public void setChineseMedicineCode(String chineseMedicineCode) {
        this.chineseMedicineCode = chineseMedicineCode;
    }

    public String getChineseMedicineDesc() {
        return chineseMedicineDesc;
    }

    public void setChineseMedicineDesc(String chineseMedicineDesc) {
        this.chineseMedicineDesc = chineseMedicineDesc;
    }

    public String getItemTypeCode() {
        return itemTypeCode;
    }

    public void setItemTypeCode(String itemTypeCode) {
        this.itemTypeCode = itemTypeCode;
    }

    public String getItemTypeDesc() {
        return itemTypeDesc;
    }

    public void setItemTypeDesc(String itemTypeDesc) {
        this.itemTypeDesc = itemTypeDesc;
    }

    public String getExecSubspecialtyCode() {
        return execSubspecialtyCode;
    }

    public void setExecSubspecialtyCode(String execSubspecialtyCode) {
        this.execSubspecialtyCode = execSubspecialtyCode;
    }

    public String getExecSubspecialtyDesc() {
        return execSubspecialtyDesc;
    }

    public void setExecSubspecialtyDesc(String execSubspecialtyDesc) {
        this.execSubspecialtyDesc = execSubspecialtyDesc;
    }

    public String getOrderitemCode() {
        return orderitemCode;
    }

    public void setOrderitemCode(String orderitemCode) {
        this.orderitemCode = orderitemCode;
    }

    public String getOrderitemDesc() {
        return orderitemDesc;
    }

    public void setOrderitemDesc(String orderitemDesc) {
        this.orderitemDesc = orderitemDesc;
    }

    public String getChargeitemCode() {
        return chargeitemCode;
    }

    public void setChargeitemCode(String chargeitemCode) {
        this.chargeitemCode = chargeitemCode;
    }

    public String getDrugitemCode() {
        return drugitemCode;
    }

    public void setDrugitemCode(String drugitemCode) {
        this.drugitemCode = drugitemCode;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public String getDrugitemDesc() {
        return drugitemDesc;
    }

    public void setDrugitemDesc(String drugitemDesc) {
        this.drugitemDesc = drugitemDesc;
    }

    public String getDosageFormCode() {
        return dosageFormCode;
    }

    public void setDosageFormCode(String dosageFormCode) {
        this.dosageFormCode = dosageFormCode;
    }

    public String getDosageFormDesc() {
        return dosageFormDesc;
    }

    public void setDosageFormDesc(String dosageFormDesc) {
        this.dosageFormDesc = dosageFormDesc;
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

    public String getDrugSpec() {
        return drugSpec;
    }

    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec;
    }

    public String getDosageQty() {
        return dosageQty;
    }

    public void setDosageQty(String dosageQty) {
        this.dosageQty = dosageQty;
    }

    public String getDosageUnitCode() {
        return dosageUnitCode;
    }

    public void setDosageUnitCode(String dosageUnitCode) {
        this.dosageUnitCode = dosageUnitCode;
    }

    public String getDosageUnitDesc() {
        return dosageUnitDesc;
    }

    public void setDosageUnitDesc(String dosageUnitDesc) {
        this.dosageUnitDesc = dosageUnitDesc;
    }

    public String getTotalDosageQty() {
        return totalDosageQty;
    }

    public void setTotalDosageQty(String totalDosageQty) {
        this.totalDosageQty = totalDosageQty;
    }

    public String getOrderedQty() {
        return orderedQty;
    }

    public void setOrderedQty(String orderedQty) {
        this.orderedQty = orderedQty;
    }

    public String getOrderedQtyUomCode() {
        return orderedQtyUomCode;
    }

    public void setOrderedQtyUomCode(String orderedQtyUomCode) {
        this.orderedQtyUomCode = orderedQtyUomCode;
    }

    public String getOrderedQtyUomDes() {
        return orderedQtyUomDes;
    }

    public void setOrderedQtyUomDes(String orderedQtyUomDes) {
        this.orderedQtyUomDes = orderedQtyUomDes;
    }

    public String getActualUnitPrice() {
        return actualUnitPrice;
    }

    public void setActualUnitPrice(String actualUnitPrice) {
        this.actualUnitPrice = actualUnitPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
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

    public BigDecimal getDurationQty() {
        return durationQty;
    }

    public void setDurationQty(BigDecimal durationQty) {
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

    public BigDecimal getPackingnumber() {
        return packingnumber;
    }

    public void setPackingnumber(BigDecimal packingnumber) {
        this.packingnumber = packingnumber;
    }

    public BigDecimal getHerbalDosageNumber() {
        return herbalDosageNumber;
    }

    public void setHerbalDosageNumber(BigDecimal herbalDosageNumber) {
        this.herbalDosageNumber = herbalDosageNumber;
    }

    public String getYinpianDecoctionDesc() {
        return yinpianDecoctionDesc;
    }

    public void setYinpianDecoctionDesc(String yinpianDecoctionDesc) {
        this.yinpianDecoctionDesc = yinpianDecoctionDesc;
    }

    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
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

    public String getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(String chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getDrugAllergy() {
        return drugAllergy;
    }

    public void setDrugAllergy(String drugAllergy) {
        this.drugAllergy = drugAllergy;
    }

    public String getDoctorTypeCode() {
        return doctorTypeCode;
    }

    public void setDoctorTypeCode(String doctorTypeCode) {
        this.doctorTypeCode = doctorTypeCode;
    }

    public String getDoctorTypeDesc() {
        return doctorTypeDesc;
    }

    public void setDoctorTypeDesc(String doctorTypeDesc) {
        this.doctorTypeDesc = doctorTypeDesc;
    }

    public String getExamineDate() {
        return examineDate;
    }

    public void setExamineDate(String examineDate) {
        this.examineDate = examineDate;
    }

    public String getImplementDoctor() {
        return implementDoctor;
    }

    public void setImplementDoctor(String implementDoctor) {
        this.implementDoctor = implementDoctor;
    }

    public String getImplementDoctorCode() {
        return implementDoctorCode;
    }

    public void setImplementDoctorCode(String implementDoctorCode) {
        this.implementDoctorCode = implementDoctorCode;
    }

    public String getExamineDoctorCode() {
        return examineDoctorCode;
    }

    public void setExamineDoctorCode(String examineDoctorCode) {
        this.examineDoctorCode = examineDoctorCode;
    }

    public String getExamineDoctor() {
        return examineDoctor;
    }

    public void setExamineDoctor(String examineDoctor) {
        this.examineDoctor = examineDoctor;
    }

    public String getStandardCode() {
        return standardCode;
    }

    public void setStandardCode(String standardCode) {
        this.standardCode = standardCode;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdrvisitItemlists{" +
        "cardNo=" + cardNo +
        ", seeNo=" + seeNo +
        ", visitNo=" + visitNo +
        ", orderNo=" + orderNo +
        ", formNo=" + formNo +
        ", presStatus=" + presStatus +
        ", duration=" + duration +
        ", herbDosageQty=" + herbDosageQty +
        ", prescriptionTypeCode=" + prescriptionTypeCode +
        ", prescriptionTypeDesc=" + prescriptionTypeDesc +
        ", zyypcf=" + zyypcf +
        ", chineseMedicineCode=" + chineseMedicineCode +
        ", chineseMedicineDesc=" + chineseMedicineDesc +
        ", itemTypeCode=" + itemTypeCode +
        ", itemTypeDesc=" + itemTypeDesc +
        ", execSubspecialtyCode=" + execSubspecialtyCode +
        ", execSubspecialtyDesc=" + execSubspecialtyDesc +
        ", orderitemCode=" + orderitemCode +
        ", orderitemDesc=" + orderitemDesc +
        ", chargeitemCode=" + chargeitemCode +
        ", drugitemCode=" + drugitemCode +
        ", totalCost=" + totalCost +
        ", drugitemDesc=" + drugitemDesc +
        ", dosageFormCode=" + dosageFormCode +
        ", dosageFormDesc=" + dosageFormDesc +
        ", packageNo=" + packageNo +
        ", specification=" + specification +
        ", drugSpec=" + drugSpec +
        ", dosageQty=" + dosageQty +
        ", dosageUnitCode=" + dosageUnitCode +
        ", dosageUnitDesc=" + dosageUnitDesc +
        ", totalDosageQty=" + totalDosageQty +
        ", orderedQty=" + orderedQty +
        ", orderedQtyUomCode=" + orderedQtyUomCode +
        ", orderedQtyUomDes=" + orderedQtyUomDes +
        ", actualUnitPrice=" + actualUnitPrice +
        ", orderId=" + orderId +
        ", orderDate=" + orderDate +
        ", remark=" + remark +
        ", roaCode=" + roaCode +
        ", roaDesc=" + roaDesc +
        ", oeOrderInfo=" + oeOrderInfo +
        ", oeOrderRemarks=" + oeOrderRemarks +
        ", frequencyCode=" + frequencyCode +
        ", frequencyDesc=" + frequencyDesc +
        ", durationQty=" + durationQty +
        ", durationCode=" + durationCode +
        ", durationDesc=" + durationDesc +
        ", packingnumber=" + packingnumber +
        ", herbalDosageNumber=" + herbalDosageNumber +
        ", yinpianDecoctionDesc=" + yinpianDecoctionDesc +
        ", execTime=" + execTime +
        ", therapeuticPrincipleDesc=" + therapeuticPrincipleDesc +
        ", orderClass=" + orderClass +
        ", chargeStatus=" + chargeStatus +
        ", costType=" + costType +
        ", drugAllergy=" + drugAllergy +
        ", doctorTypeCode=" + doctorTypeCode +
        ", doctorTypeDesc=" + doctorTypeDesc +
        ", examineDate=" + examineDate +
        ", implementDoctor=" + implementDoctor +
        ", implementDoctorCode=" + implementDoctorCode +
        ", examineDoctorCode=" + examineDoctorCode +
        ", examineDoctor=" + examineDoctor +
        ", standardCode=" + standardCode +
        "}";
    }
}
