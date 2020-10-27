package com.ljh.bean;

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
public class ViewJiaheIcdCode implements Serializable {

    private static final long serialVersionUID=1L;

    private String icdCode;

    private String spellCode;

    private String icdName;

    private String icdName1;

    private String icdName2;

    private String dieReason;

    private String diseaseCode;

    private Integer standardDate;

    private String inpGrade;

    private String operCode;

    private LocalDateTime operDate;

    private String wbCode;

    private String sicd10;

    private String yncontagion;

    private String stopFlag;

    private String icdAlias;

    private String icdAliasSpell;


    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    public String getIcdName1() {
        return icdName1;
    }

    public void setIcdName1(String icdName1) {
        this.icdName1 = icdName1;
    }

    public String getIcdName2() {
        return icdName2;
    }

    public void setIcdName2(String icdName2) {
        this.icdName2 = icdName2;
    }

    public String getDieReason() {
        return dieReason;
    }

    public void setDieReason(String dieReason) {
        this.dieReason = dieReason;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    public Integer getStandardDate() {
        return standardDate;
    }

    public void setStandardDate(Integer standardDate) {
        this.standardDate = standardDate;
    }

    public String getInpGrade() {
        return inpGrade;
    }

    public void setInpGrade(String inpGrade) {
        this.inpGrade = inpGrade;
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

    public String getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode = wbCode;
    }

    public String getSicd10() {
        return sicd10;
    }

    public void setSicd10(String sicd10) {
        this.sicd10 = sicd10;
    }

    public String getYncontagion() {
        return yncontagion;
    }

    public void setYncontagion(String yncontagion) {
        this.yncontagion = yncontagion;
    }

    public String getStopFlag() {
        return stopFlag;
    }

    public void setStopFlag(String stopFlag) {
        this.stopFlag = stopFlag;
    }

    public String getIcdAlias() {
        return icdAlias;
    }

    public void setIcdAlias(String icdAlias) {
        this.icdAlias = icdAlias;
    }

    public String getIcdAliasSpell() {
        return icdAliasSpell;
    }

    public void setIcdAliasSpell(String icdAliasSpell) {
        this.icdAliasSpell = icdAliasSpell;
    }

    @Override
    public String toString() {
        return "ViewJiaheIcdCode{" +
        "icdCode=" + icdCode +
        ", spellCode=" + spellCode +
        ", icdName=" + icdName +
        ", icdName1=" + icdName1 +
        ", icdName2=" + icdName2 +
        ", dieReason=" + dieReason +
        ", diseaseCode=" + diseaseCode +
        ", standardDate=" + standardDate +
        ", inpGrade=" + inpGrade +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", wbCode=" + wbCode +
        ", sicd10=" + sicd10 +
        ", yncontagion=" + yncontagion +
        ", stopFlag=" + stopFlag +
        ", icdAlias=" + icdAlias +
        ", icdAliasSpell=" + icdAliasSpell +
        "}";
    }
}
