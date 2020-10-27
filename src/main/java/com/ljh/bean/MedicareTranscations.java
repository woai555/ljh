package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医保交易
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MedicareTranscations implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 交易流水号
     */
    @TableId(value = "TRANSACTION_SERIAL_NUMBER", type = IdType.AUTO)
    private String transactionSerialNumber;

    /**
     * 交易日期
     */
    private LocalDateTime transactionDate;

    /**
     * 险种类别
     */
    private String insuranceType;

    /**
     * 医疗类别
     */
    private String medicalType;

    /**
     * 医保号
     */
    private String medicareNumber;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 发票号
     */
    private String invoiceNumber;

    /**
     * 总金额
     */
    private BigDecimal sumPayments;

    /**
     * 基金支付金额
     */
    private BigDecimal fundPayments;

    /**
     * 个人支付金额
     */
    private BigDecimal individualPayments;

    /**
     * 明细错误
     */
    private String detailError;

    /**
     * 西药费用
     */
    private BigDecimal westernMedicineCosts;

    /**
     * 中成药费用
     */
    private BigDecimal chnPatentMedCosts;

    /**
     * 中草药费用
     */
    private BigDecimal chnTraditonalDrugCosts;

    /**
     * 常规检查费用
     */
    private BigDecimal routineExamCosts;

    /**
     * CT费用
     */
    private BigDecimal ctCosts;

    /**
     * 核磁费用
     */
    private BigDecimal nmrCosts;

    /**
     * B超费
     */
    private BigDecimal bUltrasoundCosts;

    /**
     * 输氧费
     */
    private BigDecimal oxygenCosts;

    /**
     * 手术费
     */
    private BigDecimal surgeryCosts;

    /**
     * 治疗费
     */
    private BigDecimal treatmentCosts;

    /**
     * 放射费
     */
    private BigDecimal radiotherapyCosts;

    /**
     * 化验费
     */
    private BigDecimal assayCosts;

    /**
     * 正畸费
     */
    private BigDecimal orthodonticsCosts;

    /**
     * 镶牙费
     */
    private BigDecimal denturistsCosts;

    /**
     * 心理测试费
     */
    private BigDecimal pshchoTestCosts;

    /**
     * 司法鉴定费
     */
    private BigDecimal judicialAppraisalCosts;

    /**
     * 材料费
     */
    private BigDecimal materialCosts;

    /**
     * 单位支付金额
     */
    private BigDecimal unitPayments;

    /**
     * 其他项目费用
     */
    private BigDecimal otherCosts;

    /**
     * 上传批号
     */
    private String uploadNumber;

    /**
     * 上传时间
     */
    private LocalDateTime uploadTime;

    /**
     * 上传标志
     */
    private String uploadStatus;

    /**
     * 入库标志
     */
    private String storageStatus;

    /**
     * 审核标志
     */
    private String auditStatus;

    /**
     * 退费标识
     */
    private String refundMark;

    /**
     * 原交易流水号
     */
    private String preTranSerialNumber;

    /**
     * 申报批号
     */
    private String reportNumber;

    /**
     * 交易状态
     */
    private String transcationStatus;

    /**
     * HIS认证版本号
     */
    private String hisVersionNumber;

    /**
     * 输血费
     */
    private BigDecimal bloodTransfusionCosts;

    /**
     * 序号
     */
    private String rowNumber;


    public String getTransactionSerialNumber() {
        return transactionSerialNumber;
    }

    public void setTransactionSerialNumber(String transactionSerialNumber) {
        this.transactionSerialNumber = transactionSerialNumber;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getMedicalType() {
        return medicalType;
    }

    public void setMedicalType(String medicalType) {
        this.medicalType = medicalType;
    }

    public String getMedicareNumber() {
        return medicareNumber;
    }

    public void setMedicareNumber(String medicareNumber) {
        this.medicareNumber = medicareNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public BigDecimal getSumPayments() {
        return sumPayments;
    }

    public void setSumPayments(BigDecimal sumPayments) {
        this.sumPayments = sumPayments;
    }

    public BigDecimal getFundPayments() {
        return fundPayments;
    }

    public void setFundPayments(BigDecimal fundPayments) {
        this.fundPayments = fundPayments;
    }

    public BigDecimal getIndividualPayments() {
        return individualPayments;
    }

    public void setIndividualPayments(BigDecimal individualPayments) {
        this.individualPayments = individualPayments;
    }

    public String getDetailError() {
        return detailError;
    }

    public void setDetailError(String detailError) {
        this.detailError = detailError;
    }

    public BigDecimal getWesternMedicineCosts() {
        return westernMedicineCosts;
    }

    public void setWesternMedicineCosts(BigDecimal westernMedicineCosts) {
        this.westernMedicineCosts = westernMedicineCosts;
    }

    public BigDecimal getChnPatentMedCosts() {
        return chnPatentMedCosts;
    }

    public void setChnPatentMedCosts(BigDecimal chnPatentMedCosts) {
        this.chnPatentMedCosts = chnPatentMedCosts;
    }

    public BigDecimal getChnTraditonalDrugCosts() {
        return chnTraditonalDrugCosts;
    }

    public void setChnTraditonalDrugCosts(BigDecimal chnTraditonalDrugCosts) {
        this.chnTraditonalDrugCosts = chnTraditonalDrugCosts;
    }

    public BigDecimal getRoutineExamCosts() {
        return routineExamCosts;
    }

    public void setRoutineExamCosts(BigDecimal routineExamCosts) {
        this.routineExamCosts = routineExamCosts;
    }

    public BigDecimal getCtCosts() {
        return ctCosts;
    }

    public void setCtCosts(BigDecimal ctCosts) {
        this.ctCosts = ctCosts;
    }

    public BigDecimal getNmrCosts() {
        return nmrCosts;
    }

    public void setNmrCosts(BigDecimal nmrCosts) {
        this.nmrCosts = nmrCosts;
    }

    public BigDecimal getbUltrasoundCosts() {
        return bUltrasoundCosts;
    }

    public void setbUltrasoundCosts(BigDecimal bUltrasoundCosts) {
        this.bUltrasoundCosts = bUltrasoundCosts;
    }

    public BigDecimal getOxygenCosts() {
        return oxygenCosts;
    }

    public void setOxygenCosts(BigDecimal oxygenCosts) {
        this.oxygenCosts = oxygenCosts;
    }

    public BigDecimal getSurgeryCosts() {
        return surgeryCosts;
    }

    public void setSurgeryCosts(BigDecimal surgeryCosts) {
        this.surgeryCosts = surgeryCosts;
    }

    public BigDecimal getTreatmentCosts() {
        return treatmentCosts;
    }

    public void setTreatmentCosts(BigDecimal treatmentCosts) {
        this.treatmentCosts = treatmentCosts;
    }

    public BigDecimal getRadiotherapyCosts() {
        return radiotherapyCosts;
    }

    public void setRadiotherapyCosts(BigDecimal radiotherapyCosts) {
        this.radiotherapyCosts = radiotherapyCosts;
    }

    public BigDecimal getAssayCosts() {
        return assayCosts;
    }

    public void setAssayCosts(BigDecimal assayCosts) {
        this.assayCosts = assayCosts;
    }

    public BigDecimal getOrthodonticsCosts() {
        return orthodonticsCosts;
    }

    public void setOrthodonticsCosts(BigDecimal orthodonticsCosts) {
        this.orthodonticsCosts = orthodonticsCosts;
    }

    public BigDecimal getDenturistsCosts() {
        return denturistsCosts;
    }

    public void setDenturistsCosts(BigDecimal denturistsCosts) {
        this.denturistsCosts = denturistsCosts;
    }

    public BigDecimal getPshchoTestCosts() {
        return pshchoTestCosts;
    }

    public void setPshchoTestCosts(BigDecimal pshchoTestCosts) {
        this.pshchoTestCosts = pshchoTestCosts;
    }

    public BigDecimal getJudicialAppraisalCosts() {
        return judicialAppraisalCosts;
    }

    public void setJudicialAppraisalCosts(BigDecimal judicialAppraisalCosts) {
        this.judicialAppraisalCosts = judicialAppraisalCosts;
    }

    public BigDecimal getMaterialCosts() {
        return materialCosts;
    }

    public void setMaterialCosts(BigDecimal materialCosts) {
        this.materialCosts = materialCosts;
    }

    public BigDecimal getUnitPayments() {
        return unitPayments;
    }

    public void setUnitPayments(BigDecimal unitPayments) {
        this.unitPayments = unitPayments;
    }

    public BigDecimal getOtherCosts() {
        return otherCosts;
    }

    public void setOtherCosts(BigDecimal otherCosts) {
        this.otherCosts = otherCosts;
    }

    public String getUploadNumber() {
        return uploadNumber;
    }

    public void setUploadNumber(String uploadNumber) {
        this.uploadNumber = uploadNumber;
    }

    public LocalDateTime getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(LocalDateTime uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadStatus() {
        return uploadStatus;
    }

    public void setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    public String getStorageStatus() {
        return storageStatus;
    }

    public void setStorageStatus(String storageStatus) {
        this.storageStatus = storageStatus;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getRefundMark() {
        return refundMark;
    }

    public void setRefundMark(String refundMark) {
        this.refundMark = refundMark;
    }

    public String getPreTranSerialNumber() {
        return preTranSerialNumber;
    }

    public void setPreTranSerialNumber(String preTranSerialNumber) {
        this.preTranSerialNumber = preTranSerialNumber;
    }

    public String getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getTranscationStatus() {
        return transcationStatus;
    }

    public void setTranscationStatus(String transcationStatus) {
        this.transcationStatus = transcationStatus;
    }

    public String getHisVersionNumber() {
        return hisVersionNumber;
    }

    public void setHisVersionNumber(String hisVersionNumber) {
        this.hisVersionNumber = hisVersionNumber;
    }

    public BigDecimal getBloodTransfusionCosts() {
        return bloodTransfusionCosts;
    }

    public void setBloodTransfusionCosts(BigDecimal bloodTransfusionCosts) {
        this.bloodTransfusionCosts = bloodTransfusionCosts;
    }

    public String getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(String rowNumber) {
        this.rowNumber = rowNumber;
    }

    @Override
    public String toString() {
        return "MedicareTranscations{" +
        "transactionSerialNumber=" + transactionSerialNumber +
        ", transactionDate=" + transactionDate +
        ", insuranceType=" + insuranceType +
        ", medicalType=" + medicalType +
        ", medicareNumber=" + medicareNumber +
        ", idNumber=" + idNumber +
        ", patientName=" + patientName +
        ", sex=" + sex +
        ", invoiceNumber=" + invoiceNumber +
        ", sumPayments=" + sumPayments +
        ", fundPayments=" + fundPayments +
        ", individualPayments=" + individualPayments +
        ", detailError=" + detailError +
        ", westernMedicineCosts=" + westernMedicineCosts +
        ", chnPatentMedCosts=" + chnPatentMedCosts +
        ", chnTraditonalDrugCosts=" + chnTraditonalDrugCosts +
        ", routineExamCosts=" + routineExamCosts +
        ", ctCosts=" + ctCosts +
        ", nmrCosts=" + nmrCosts +
        ", bUltrasoundCosts=" + bUltrasoundCosts +
        ", oxygenCosts=" + oxygenCosts +
        ", surgeryCosts=" + surgeryCosts +
        ", treatmentCosts=" + treatmentCosts +
        ", radiotherapyCosts=" + radiotherapyCosts +
        ", assayCosts=" + assayCosts +
        ", orthodonticsCosts=" + orthodonticsCosts +
        ", denturistsCosts=" + denturistsCosts +
        ", pshchoTestCosts=" + pshchoTestCosts +
        ", judicialAppraisalCosts=" + judicialAppraisalCosts +
        ", materialCosts=" + materialCosts +
        ", unitPayments=" + unitPayments +
        ", otherCosts=" + otherCosts +
        ", uploadNumber=" + uploadNumber +
        ", uploadTime=" + uploadTime +
        ", uploadStatus=" + uploadStatus +
        ", storageStatus=" + storageStatus +
        ", auditStatus=" + auditStatus +
        ", refundMark=" + refundMark +
        ", preTranSerialNumber=" + preTranSerialNumber +
        ", reportNumber=" + reportNumber +
        ", transcationStatus=" + transcationStatus +
        ", hisVersionNumber=" + hisVersionNumber +
        ", bloodTransfusionCosts=" + bloodTransfusionCosts +
        ", rowNumber=" + rowNumber +
        "}";
    }
}
