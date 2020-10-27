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
public class VClinicPayDiaginfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String recipeno;

    private String recipedate;

    private String cardNo;

    private String seeNo;

    private String diagCode;

    private String diagName;

    private String medicalrecord;

    private String sectioncode;

    private String sectionname;

    private String hissectionname;

    private String drid;

    private String drname;

    private Integer recipetype;

    private String registertradeno;

    private String billstype;


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

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode;
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
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

    public Integer getRecipetype() {
        return recipetype;
    }

    public void setRecipetype(Integer recipetype) {
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

    @Override
    public String toString() {
        return "VClinicPayDiaginfo{" +
        "recipeno=" + recipeno +
        ", recipedate=" + recipedate +
        ", cardNo=" + cardNo +
        ", seeNo=" + seeNo +
        ", diagCode=" + diagCode +
        ", diagName=" + diagName +
        ", medicalrecord=" + medicalrecord +
        ", sectioncode=" + sectioncode +
        ", sectionname=" + sectionname +
        ", hissectionname=" + hissectionname +
        ", drid=" + drid +
        ", drname=" + drname +
        ", recipetype=" + recipetype +
        ", registertradeno=" + registertradeno +
        ", billstype=" + billstype +
        "}";
    }
}
