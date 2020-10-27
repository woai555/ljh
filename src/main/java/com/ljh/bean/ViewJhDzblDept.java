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
public class ViewJhDzblDept implements Serializable {

    private static final long serialVersionUID=1L;

    private String serialNo;

    private String deptCode;

    private String deptName;

    private String deptAlias;

    private BigDecimal outpOrInp;

    private String internalOrSergery;

    private String inputCode;

    private String typeCode;

    private String location;

    private BigDecimal synchroFlag;

    private BigDecimal deptEmr;

    private String deptEmrDateTime;

    private BigDecimal deptType;

    private BigDecimal hospitalNo;

    private String pym;

    private BigDecimal wbm;


    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
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

    public String getDeptAlias() {
        return deptAlias;
    }

    public void setDeptAlias(String deptAlias) {
        this.deptAlias = deptAlias;
    }

    public BigDecimal getOutpOrInp() {
        return outpOrInp;
    }

    public void setOutpOrInp(BigDecimal outpOrInp) {
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

    public BigDecimal getSynchroFlag() {
        return synchroFlag;
    }

    public void setSynchroFlag(BigDecimal synchroFlag) {
        this.synchroFlag = synchroFlag;
    }

    public BigDecimal getDeptEmr() {
        return deptEmr;
    }

    public void setDeptEmr(BigDecimal deptEmr) {
        this.deptEmr = deptEmr;
    }

    public String getDeptEmrDateTime() {
        return deptEmrDateTime;
    }

    public void setDeptEmrDateTime(String deptEmrDateTime) {
        this.deptEmrDateTime = deptEmrDateTime;
    }

    public BigDecimal getDeptType() {
        return deptType;
    }

    public void setDeptType(BigDecimal deptType) {
        this.deptType = deptType;
    }

    public BigDecimal getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(BigDecimal hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    public String getPym() {
        return pym;
    }

    public void setPym(String pym) {
        this.pym = pym;
    }

    public BigDecimal getWbm() {
        return wbm;
    }

    public void setWbm(BigDecimal wbm) {
        this.wbm = wbm;
    }

    @Override
    public String toString() {
        return "ViewJhDzblDept{" +
        "serialNo=" + serialNo +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", deptAlias=" + deptAlias +
        ", outpOrInp=" + outpOrInp +
        ", internalOrSergery=" + internalOrSergery +
        ", inputCode=" + inputCode +
        ", typeCode=" + typeCode +
        ", location=" + location +
        ", synchroFlag=" + synchroFlag +
        ", deptEmr=" + deptEmr +
        ", deptEmrDateTime=" + deptEmrDateTime +
        ", deptType=" + deptType +
        ", hospitalNo=" + hospitalNo +
        ", pym=" + pym +
        ", wbm=" + wbm +
        "}";
    }
}
