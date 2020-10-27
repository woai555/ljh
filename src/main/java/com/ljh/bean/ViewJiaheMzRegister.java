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
public class ViewJiaheMzRegister implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime consultationSection;

    private String noonCode;

    private String outpId;

    private String personName;

    private String idNo;

    private String sexCode;

    private LocalDateTime dateOfBirth;

    private String paykindCode;

    private String paykindName;

    private String mcardNo;

    private String pactCode;

    private String pactName;

    private LocalDateTime registingTime;

    private String visitDept;

    private String visitDeptName;

    private Integer seeno;

    private String visitDoctor;

    private String visitDoctorName;

    private String ynregchrg;

    private String ynbook;

    private BigDecimal registrationFee;

    private BigDecimal chckFee;

    private BigDecimal diagFee;

    private BigDecimal othFee;

    private String firstVisitIndicator;

    private String yncancel;

    private BigDecimal ownRatio;

    private BigDecimal pubRatio;

    private BigDecimal payRatio;

    private String operCode;

    private String operName;

    private String ynsee;

    private String clinicCode;

    private BigDecimal discountRatio;

    private LocalDateTime cancelDate;

    private String cancelOpercode;

    private String chargeType;

    private String icdCode;

    private String endFlag;

    private String examCode;

    private LocalDateTime examDate;

    private String clinicNo;

    private String djbFlag;

    private String ynAdd;

    private BigDecimal bxFee;

    private String tradeno;

    private String realDoctid;

    private String realDoctname;

    private String icdName;

    private String ipaddress;

    private String macaddress;

    private String machinename;

    private String ylcardNo;

    private String noonTime;

    private String payWay;

    private String quitType;

    private String tradenoJyt;

    private String consultationCategory;

    private String consultationCategoryName;


    public LocalDateTime getConsultationSection() {
        return consultationSection;
    }

    public void setConsultationSection(LocalDateTime consultationSection) {
        this.consultationSection = consultationSection;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getOutpId() {
        return outpId;
    }

    public void setOutpId(String outpId) {
        this.outpId = outpId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getPaykindName() {
        return paykindName;
    }

    public void setPaykindName(String paykindName) {
        this.paykindName = paykindName;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public String getPactName() {
        return pactName;
    }

    public void setPactName(String pactName) {
        this.pactName = pactName;
    }

    public LocalDateTime getRegistingTime() {
        return registingTime;
    }

    public void setRegistingTime(LocalDateTime registingTime) {
        this.registingTime = registingTime;
    }

    public String getVisitDept() {
        return visitDept;
    }

    public void setVisitDept(String visitDept) {
        this.visitDept = visitDept;
    }

    public String getVisitDeptName() {
        return visitDeptName;
    }

    public void setVisitDeptName(String visitDeptName) {
        this.visitDeptName = visitDeptName;
    }

    public Integer getSeeno() {
        return seeno;
    }

    public void setSeeno(Integer seeno) {
        this.seeno = seeno;
    }

    public String getVisitDoctor() {
        return visitDoctor;
    }

    public void setVisitDoctor(String visitDoctor) {
        this.visitDoctor = visitDoctor;
    }

    public String getVisitDoctorName() {
        return visitDoctorName;
    }

    public void setVisitDoctorName(String visitDoctorName) {
        this.visitDoctorName = visitDoctorName;
    }

    public String getYnregchrg() {
        return ynregchrg;
    }

    public void setYnregchrg(String ynregchrg) {
        this.ynregchrg = ynregchrg;
    }

    public String getYnbook() {
        return ynbook;
    }

    public void setYnbook(String ynbook) {
        this.ynbook = ynbook;
    }

    public BigDecimal getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(BigDecimal registrationFee) {
        this.registrationFee = registrationFee;
    }

    public BigDecimal getChckFee() {
        return chckFee;
    }

    public void setChckFee(BigDecimal chckFee) {
        this.chckFee = chckFee;
    }

    public BigDecimal getDiagFee() {
        return diagFee;
    }

    public void setDiagFee(BigDecimal diagFee) {
        this.diagFee = diagFee;
    }

    public BigDecimal getOthFee() {
        return othFee;
    }

    public void setOthFee(BigDecimal othFee) {
        this.othFee = othFee;
    }

    public String getFirstVisitIndicator() {
        return firstVisitIndicator;
    }

    public void setFirstVisitIndicator(String firstVisitIndicator) {
        this.firstVisitIndicator = firstVisitIndicator;
    }

    public String getYncancel() {
        return yncancel;
    }

    public void setYncancel(String yncancel) {
        this.yncancel = yncancel;
    }

    public BigDecimal getOwnRatio() {
        return ownRatio;
    }

    public void setOwnRatio(BigDecimal ownRatio) {
        this.ownRatio = ownRatio;
    }

    public BigDecimal getPubRatio() {
        return pubRatio;
    }

    public void setPubRatio(BigDecimal pubRatio) {
        this.pubRatio = pubRatio;
    }

    public BigDecimal getPayRatio() {
        return payRatio;
    }

    public void setPayRatio(BigDecimal payRatio) {
        this.payRatio = payRatio;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public String getYnsee() {
        return ynsee;
    }

    public void setYnsee(String ynsee) {
        this.ynsee = ynsee;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
    }

    public BigDecimal getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(BigDecimal discountRatio) {
        this.discountRatio = discountRatio;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelOpercode() {
        return cancelOpercode;
    }

    public void setCancelOpercode(String cancelOpercode) {
        this.cancelOpercode = cancelOpercode;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getEndFlag() {
        return endFlag;
    }

    public void setEndFlag(String endFlag) {
        this.endFlag = endFlag;
    }

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public LocalDateTime getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDateTime examDate) {
        this.examDate = examDate;
    }

    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    public String getDjbFlag() {
        return djbFlag;
    }

    public void setDjbFlag(String djbFlag) {
        this.djbFlag = djbFlag;
    }

    public String getYnAdd() {
        return ynAdd;
    }

    public void setYnAdd(String ynAdd) {
        this.ynAdd = ynAdd;
    }

    public BigDecimal getBxFee() {
        return bxFee;
    }

    public void setBxFee(BigDecimal bxFee) {
        this.bxFee = bxFee;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public String getRealDoctid() {
        return realDoctid;
    }

    public void setRealDoctid(String realDoctid) {
        this.realDoctid = realDoctid;
    }

    public String getRealDoctname() {
        return realDoctname;
    }

    public void setRealDoctname(String realDoctname) {
        this.realDoctname = realDoctname;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    public String getMachinename() {
        return machinename;
    }

    public void setMachinename(String machinename) {
        this.machinename = machinename;
    }

    public String getYlcardNo() {
        return ylcardNo;
    }

    public void setYlcardNo(String ylcardNo) {
        this.ylcardNo = ylcardNo;
    }

    public String getNoonTime() {
        return noonTime;
    }

    public void setNoonTime(String noonTime) {
        this.noonTime = noonTime;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getQuitType() {
        return quitType;
    }

    public void setQuitType(String quitType) {
        this.quitType = quitType;
    }

    public String getTradenoJyt() {
        return tradenoJyt;
    }

    public void setTradenoJyt(String tradenoJyt) {
        this.tradenoJyt = tradenoJyt;
    }

    public String getConsultationCategory() {
        return consultationCategory;
    }

    public void setConsultationCategory(String consultationCategory) {
        this.consultationCategory = consultationCategory;
    }

    public String getConsultationCategoryName() {
        return consultationCategoryName;
    }

    public void setConsultationCategoryName(String consultationCategoryName) {
        this.consultationCategoryName = consultationCategoryName;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzRegister{" +
        "consultationSection=" + consultationSection +
        ", noonCode=" + noonCode +
        ", outpId=" + outpId +
        ", personName=" + personName +
        ", idNo=" + idNo +
        ", sexCode=" + sexCode +
        ", dateOfBirth=" + dateOfBirth +
        ", paykindCode=" + paykindCode +
        ", paykindName=" + paykindName +
        ", mcardNo=" + mcardNo +
        ", pactCode=" + pactCode +
        ", pactName=" + pactName +
        ", registingTime=" + registingTime +
        ", visitDept=" + visitDept +
        ", visitDeptName=" + visitDeptName +
        ", seeno=" + seeno +
        ", visitDoctor=" + visitDoctor +
        ", visitDoctorName=" + visitDoctorName +
        ", ynregchrg=" + ynregchrg +
        ", ynbook=" + ynbook +
        ", registrationFee=" + registrationFee +
        ", chckFee=" + chckFee +
        ", diagFee=" + diagFee +
        ", othFee=" + othFee +
        ", firstVisitIndicator=" + firstVisitIndicator +
        ", yncancel=" + yncancel +
        ", ownRatio=" + ownRatio +
        ", pubRatio=" + pubRatio +
        ", payRatio=" + payRatio +
        ", operCode=" + operCode +
        ", operName=" + operName +
        ", ynsee=" + ynsee +
        ", clinicCode=" + clinicCode +
        ", discountRatio=" + discountRatio +
        ", cancelDate=" + cancelDate +
        ", cancelOpercode=" + cancelOpercode +
        ", chargeType=" + chargeType +
        ", icdCode=" + icdCode +
        ", endFlag=" + endFlag +
        ", examCode=" + examCode +
        ", examDate=" + examDate +
        ", clinicNo=" + clinicNo +
        ", djbFlag=" + djbFlag +
        ", ynAdd=" + ynAdd +
        ", bxFee=" + bxFee +
        ", tradeno=" + tradeno +
        ", realDoctid=" + realDoctid +
        ", realDoctname=" + realDoctname +
        ", icdName=" + icdName +
        ", ipaddress=" + ipaddress +
        ", macaddress=" + macaddress +
        ", machinename=" + machinename +
        ", ylcardNo=" + ylcardNo +
        ", noonTime=" + noonTime +
        ", payWay=" + payWay +
        ", quitType=" + quitType +
        ", tradenoJyt=" + tradenoJyt +
        ", consultationCategory=" + consultationCategory +
        ", consultationCategoryName=" + consultationCategoryName +
        "}";
    }
}
