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
public class ViewInteractmedSeerecord implements Serializable {

    private static final long serialVersionUID=1L;

    private String treatmentNo;

    private String patientname;

    private String cardNo;

    private String sex;

    private String sexname;

    private Integer age;

    private String visitType;

    private String visitTypename;

    private String deptCode;

    private String deptName;

    private String doctorCode;

    private String doctorName;

    private String recipeType;

    private String seeDate;

    private String hostTell;

    private String currentIllness;

    private String seeNo;

    private String regid;

    private String anamnesis;

    private String diagTemp;

    private BigDecimal payable;

    private String unpayableReason;


    public String getTreatmentNo() {
        return treatmentNo;
    }

    public void setTreatmentNo(String treatmentNo) {
        this.treatmentNo = treatmentNo;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSexname() {
        return sexname;
    }

    public void setSexname(String sexname) {
        this.sexname = sexname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getVisitTypename() {
        return visitTypename;
    }

    public void setVisitTypename(String visitTypename) {
        this.visitTypename = visitTypename;
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

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }

    public String getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(String seeDate) {
        this.seeDate = seeDate;
    }

    public String getHostTell() {
        return hostTell;
    }

    public void setHostTell(String hostTell) {
        this.hostTell = hostTell;
    }

    public String getCurrentIllness() {
        return currentIllness;
    }

    public void setCurrentIllness(String currentIllness) {
        this.currentIllness = currentIllness;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getRegid() {
        return regid;
    }

    public void setRegid(String regid) {
        this.regid = regid;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getDiagTemp() {
        return diagTemp;
    }

    public void setDiagTemp(String diagTemp) {
        this.diagTemp = diagTemp;
    }

    public BigDecimal getPayable() {
        return payable;
    }

    public void setPayable(BigDecimal payable) {
        this.payable = payable;
    }

    public String getUnpayableReason() {
        return unpayableReason;
    }

    public void setUnpayableReason(String unpayableReason) {
        this.unpayableReason = unpayableReason;
    }

    @Override
    public String toString() {
        return "ViewInteractmedSeerecord{" +
        "treatmentNo=" + treatmentNo +
        ", patientname=" + patientname +
        ", cardNo=" + cardNo +
        ", sex=" + sex +
        ", sexname=" + sexname +
        ", age=" + age +
        ", visitType=" + visitType +
        ", visitTypename=" + visitTypename +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", doctorCode=" + doctorCode +
        ", doctorName=" + doctorName +
        ", recipeType=" + recipeType +
        ", seeDate=" + seeDate +
        ", hostTell=" + hostTell +
        ", currentIllness=" + currentIllness +
        ", seeNo=" + seeNo +
        ", regid=" + regid +
        ", anamnesis=" + anamnesis +
        ", diagTemp=" + diagTemp +
        ", payable=" + payable +
        ", unpayableReason=" + unpayableReason +
        "}";
    }
}
