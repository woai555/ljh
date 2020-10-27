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
public class JytClinicPayDiaginfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String hisregno;

    private String recipeno;

    private String recipedate;

    private String cardNo;

    private LocalDateTime regDate;

    private String seeNo;

    private String diagnosecode;

    private String diagnosename;

    private String medicalrecord;

    private String sectioncode;

    private String sectionname;

    private String hissectionname;

    private String drid;

    private String drname;

    private String recipetype;

    private String registertradeno;

    private String billstype;

    private String deptCode;

    private String doctCode;

    private String paykindCode;


    public String getHisregno() {
        return hisregno;
    }

    public void setHisregno(String hisregno) {
        this.hisregno = hisregno;
    }

    public String getRecipeno() {
        return recipeno;
    }

    public void setRecipeno(String recipeno) {
        this.recipeno = recipeno;
    }

    public String getRecipedate() {
        return recipedate;
    }

    public void setRecipedate(String recipedate) {
        this.recipedate = recipedate;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getDiagnosecode() {
        return diagnosecode;
    }

    public void setDiagnosecode(String diagnosecode) {
        this.diagnosecode = diagnosecode;
    }

    public String getDiagnosename() {
        return diagnosename;
    }

    public void setDiagnosename(String diagnosename) {
        this.diagnosename = diagnosename;
    }

    public String getMedicalrecord() {
        return medicalrecord;
    }

    public void setMedicalrecord(String medicalrecord) {
        this.medicalrecord = medicalrecord;
    }

    public String getSectioncode() {
        return sectioncode;
    }

    public void setSectioncode(String sectioncode) {
        this.sectioncode = sectioncode;
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname;
    }

    public String getHissectionname() {
        return hissectionname;
    }

    public void setHissectionname(String hissectionname) {
        this.hissectionname = hissectionname;
    }

    public String getDrid() {
        return drid;
    }

    public void setDrid(String drid) {
        this.drid = drid;
    }

    public String getDrname() {
        return drname;
    }

    public void setDrname(String drname) {
        this.drname = drname;
    }

    public String getRecipetype() {
        return recipetype;
    }

    public void setRecipetype(String recipetype) {
        this.recipetype = recipetype;
    }

    public String getRegistertradeno() {
        return registertradeno;
    }

    public void setRegistertradeno(String registertradeno) {
        this.registertradeno = registertradeno;
    }

    public String getBillstype() {
        return billstype;
    }

    public void setBillstype(String billstype) {
        this.billstype = billstype;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    @Override
    public String toString() {
        return "JytClinicPayDiaginfo{" +
        "hisregno=" + hisregno +
        ", recipeno=" + recipeno +
        ", recipedate=" + recipedate +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", seeNo=" + seeNo +
        ", diagnosecode=" + diagnosecode +
        ", diagnosename=" + diagnosename +
        ", medicalrecord=" + medicalrecord +
        ", sectioncode=" + sectioncode +
        ", sectionname=" + sectionname +
        ", hissectionname=" + hissectionname +
        ", drid=" + drid +
        ", drname=" + drname +
        ", recipetype=" + recipetype +
        ", registertradeno=" + registertradeno +
        ", billstype=" + billstype +
        ", deptCode=" + deptCode +
        ", doctCode=" + doctCode +
        ", paykindCode=" + paykindCode +
        "}";
    }
}
