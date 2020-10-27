package com.ljh.bean;

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
public class ViewJiaheDeptDict implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private String deptName;

    private String deptAlias;

    private String clinicAttr;

    private String outpOrInp;

    private String internalOrSergery;

    private String inputCode;

    private String typeCode;

    private String location;

    private String displayOrder;

    private String totalBedNum;

    private String totalBedNumOld;

    private String synchroFlag;

    private String deptEmr;

    private String deptEmrDateTime;

    private String deptConsult;

    private String deptType;

    private String errorStyle;

    private String viewSequence;

    private String hospitalNo;

    private String pym;

    private String wbm;

    private String isGraveDept;


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

    public String getDeptAlias() {
        return deptAlias;
    }

    public void setDeptAlias(String deptAlias) {
        this.deptAlias = deptAlias;
    }

    public String getClinicAttr() {
        return clinicAttr;
    }

    public void setClinicAttr(String clinicAttr) {
        this.clinicAttr = clinicAttr;
    }

    public String getOutpOrInp() {
        return outpOrInp;
    }

    public void setOutpOrInp(String outpOrInp) {
        this.outpOrInp = outpOrInp;
    }

    public String getInternalOrSergery() {
        return internalOrSergery;
    }

    public void setInternalOrSergery(String internalOrSergery) {
        this.internalOrSergery = internalOrSergery;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(String displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getTotalBedNum() {
        return totalBedNum;
    }

    public void setTotalBedNum(String totalBedNum) {
        this.totalBedNum = totalBedNum;
    }

    public String getTotalBedNumOld() {
        return totalBedNumOld;
    }

    public void setTotalBedNumOld(String totalBedNumOld) {
        this.totalBedNumOld = totalBedNumOld;
    }

    public String getSynchroFlag() {
        return synchroFlag;
    }

    public void setSynchroFlag(String synchroFlag) {
        this.synchroFlag = synchroFlag;
    }

    public String getDeptEmr() {
        return deptEmr;
    }

    public void setDeptEmr(String deptEmr) {
        this.deptEmr = deptEmr;
    }

    public String getDeptEmrDateTime() {
        return deptEmrDateTime;
    }

    public void setDeptEmrDateTime(String deptEmrDateTime) {
        this.deptEmrDateTime = deptEmrDateTime;
    }

    public String getDeptConsult() {
        return deptConsult;
    }

    public void setDeptConsult(String deptConsult) {
        this.deptConsult = deptConsult;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public String getErrorStyle() {
        return errorStyle;
    }

    public void setErrorStyle(String errorStyle) {
        this.errorStyle = errorStyle;
    }

    public String getViewSequence() {
        return viewSequence;
    }

    public void setViewSequence(String viewSequence) {
        this.viewSequence = viewSequence;
    }

    public String getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    public String getPym() {
        return pym;
    }

    public void setPym(String pym) {
        this.pym = pym;
    }

    public String getWbm() {
        return wbm;
    }

    public void setWbm(String wbm) {
        this.wbm = wbm;
    }

    public String getIsGraveDept() {
        return isGraveDept;
    }

    public void setIsGraveDept(String isGraveDept) {
        this.isGraveDept = isGraveDept;
    }

    @Override
    public String toString() {
        return "ViewJiaheDeptDict{" +
        "deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", deptAlias=" + deptAlias +
        ", clinicAttr=" + clinicAttr +
        ", outpOrInp=" + outpOrInp +
        ", internalOrSergery=" + internalOrSergery +
        ", inputCode=" + inputCode +
        ", typeCode=" + typeCode +
        ", location=" + location +
        ", displayOrder=" + displayOrder +
        ", totalBedNum=" + totalBedNum +
        ", totalBedNumOld=" + totalBedNumOld +
        ", synchroFlag=" + synchroFlag +
        ", deptEmr=" + deptEmr +
        ", deptEmrDateTime=" + deptEmrDateTime +
        ", deptConsult=" + deptConsult +
        ", deptType=" + deptType +
        ", errorStyle=" + errorStyle +
        ", viewSequence=" + viewSequence +
        ", hospitalNo=" + hospitalNo +
        ", pym=" + pym +
        ", wbm=" + wbm +
        ", isGraveDept=" + isGraveDept +
        "}";
    }
}
