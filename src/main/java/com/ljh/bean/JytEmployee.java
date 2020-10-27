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
public class JytEmployee implements Serializable {

    private static final long serialVersionUID=1L;

    private String emplCode;

    private String emplName;

    private String emplEname;

    private String sexCode;

    private Integer age;

    private String posiCode;

    private String levlCode;

    private String idenno;

    private String deptCode;

    private String nurseCellCode;

    private String ynexpert;

    private String emplType;

    private String ynlistdrug;

    private LocalDateTime operDate;

    private String operCode;

    private String zhiwu;

    private String operGrade;

    private String ynkss;

    private String ynzfy;

    private String nbyy;

    private String profGroup;

    private String pCardno;

    private String doctCardid;

    private String printPermit;

    private String codeGz;

    private String deptGz;

    private String gchannelPower;

    private String ifgroup;

    private String caid;

    private String speciality;


    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getEmplEname() {
        return emplEname;
    }

    public void setEmplEname(String emplEname) {
        this.emplEname = emplEname;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosiCode() {
        return posiCode;
    }

    public void setPosiCode(String posiCode) {
        this.posiCode = posiCode;
    }

    public String getLevlCode() {
        return levlCode;
    }

    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getNurseCellCode() {
        return nurseCellCode;
    }

    public void setNurseCellCode(String nurseCellCode) {
        this.nurseCellCode = nurseCellCode;
    }

    public String getYnexpert() {
        return ynexpert;
    }

    public void setYnexpert(String ynexpert) {
        this.ynexpert = ynexpert;
    }

    public String getEmplType() {
        return emplType;
    }

    public void setEmplType(String emplType) {
        this.emplType = emplType;
    }

    public String getYnlistdrug() {
        return ynlistdrug;
    }

    public void setYnlistdrug(String ynlistdrug) {
        this.ynlistdrug = ynlistdrug;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu;
    }

    public String getOperGrade() {
        return operGrade;
    }

    public void setOperGrade(String operGrade) {
        this.operGrade = operGrade;
    }

    public String getYnkss() {
        return ynkss;
    }

    public void setYnkss(String ynkss) {
        this.ynkss = ynkss;
    }

    public String getYnzfy() {
        return ynzfy;
    }

    public void setYnzfy(String ynzfy) {
        this.ynzfy = ynzfy;
    }

    public String getNbyy() {
        return nbyy;
    }

    public void setNbyy(String nbyy) {
        this.nbyy = nbyy;
    }

    public String getProfGroup() {
        return profGroup;
    }

    public void setProfGroup(String profGroup) {
        this.profGroup = profGroup;
    }

    public String getpCardno() {
        return pCardno;
    }

    public void setpCardno(String pCardno) {
        this.pCardno = pCardno;
    }

    public String getDoctCardid() {
        return doctCardid;
    }

    public void setDoctCardid(String doctCardid) {
        this.doctCardid = doctCardid;
    }

    public String getPrintPermit() {
        return printPermit;
    }

    public void setPrintPermit(String printPermit) {
        this.printPermit = printPermit;
    }

    public String getCodeGz() {
        return codeGz;
    }

    public void setCodeGz(String codeGz) {
        this.codeGz = codeGz;
    }

    public String getDeptGz() {
        return deptGz;
    }

    public void setDeptGz(String deptGz) {
        this.deptGz = deptGz;
    }

    public String getGchannelPower() {
        return gchannelPower;
    }

    public void setGchannelPower(String gchannelPower) {
        this.gchannelPower = gchannelPower;
    }

    public String getIfgroup() {
        return ifgroup;
    }

    public void setIfgroup(String ifgroup) {
        this.ifgroup = ifgroup;
    }

    public String getCaid() {
        return caid;
    }

    public void setCaid(String caid) {
        this.caid = caid;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "JytEmployee{" +
        "emplCode=" + emplCode +
        ", emplName=" + emplName +
        ", emplEname=" + emplEname +
        ", sexCode=" + sexCode +
        ", age=" + age +
        ", posiCode=" + posiCode +
        ", levlCode=" + levlCode +
        ", idenno=" + idenno +
        ", deptCode=" + deptCode +
        ", nurseCellCode=" + nurseCellCode +
        ", ynexpert=" + ynexpert +
        ", emplType=" + emplType +
        ", ynlistdrug=" + ynlistdrug +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", zhiwu=" + zhiwu +
        ", operGrade=" + operGrade +
        ", ynkss=" + ynkss +
        ", ynzfy=" + ynzfy +
        ", nbyy=" + nbyy +
        ", profGroup=" + profGroup +
        ", pCardno=" + pCardno +
        ", doctCardid=" + doctCardid +
        ", printPermit=" + printPermit +
        ", codeGz=" + codeGz +
        ", deptGz=" + deptGz +
        ", gchannelPower=" + gchannelPower +
        ", ifgroup=" + ifgroup +
        ", caid=" + caid +
        ", speciality=" + speciality +
        "}";
    }
}
