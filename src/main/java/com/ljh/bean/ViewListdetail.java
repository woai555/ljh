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
public class ViewListdetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String invoiceNo;

    private String transType;

    private String listdetailno;

    private String chargecode;

    private String chargename;

    private String prescribecode;

    private String listtypecode;

    private String listtypename;

    private String code1;

    private String name1;

    private String form;

    private String specification1;

    private String unit;

    private BigDecimal std;

    private BigDecimal number1;

    private BigDecimal amt;

    private BigDecimal selfamt;

    private BigDecimal receivableamt;

    private String medicalcaretype;

    private String medcareitemtype;

    private String medreimburserate;

    private String remark;

    private String sortno;

    private String chrgtype;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getListdetailno() {
        return listdetailno;
    }

    public void setListdetailno(String listdetailno) {
        this.listdetailno = listdetailno;
    }

    public String getChargecode() {
        return chargecode;
    }

    public void setChargecode(String chargecode) {
        this.chargecode = chargecode;
    }

    public String getChargename() {
        return chargename;
    }

    public void setChargename(String chargename) {
        this.chargename = chargename;
    }

    public String getPrescribecode() {
        return prescribecode;
    }

    public void setPrescribecode(String prescribecode) {
        this.prescribecode = prescribecode;
    }

    public String getListtypecode() {
        return listtypecode;
    }

    public void setListtypecode(String listtypecode) {
        this.listtypecode = listtypecode;
    }

    public String getListtypename() {
        return listtypename;
    }

    public void setListtypename(String listtypename) {
        this.listtypename = listtypename;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getSpecification1() {
        return specification1;
    }

    public void setSpecification1(String specification1) {
        this.specification1 = specification1;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getStd() {
        return std;
    }

    public void setStd(BigDecimal std) {
        this.std = std;
    }

    public BigDecimal getNumber1() {
        return number1;
    }

    public void setNumber1(BigDecimal number1) {
        this.number1 = number1;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getSelfamt() {
        return selfamt;
    }

    public void setSelfamt(BigDecimal selfamt) {
        this.selfamt = selfamt;
    }

    public BigDecimal getReceivableamt() {
        return receivableamt;
    }

    public void setReceivableamt(BigDecimal receivableamt) {
        this.receivableamt = receivableamt;
    }

    public String getMedicalcaretype() {
        return medicalcaretype;
    }

    public void setMedicalcaretype(String medicalcaretype) {
        this.medicalcaretype = medicalcaretype;
    }

    public String getMedcareitemtype() {
        return medcareitemtype;
    }

    public void setMedcareitemtype(String medcareitemtype) {
        this.medcareitemtype = medcareitemtype;
    }

    public String getMedreimburserate() {
        return medreimburserate;
    }

    public void setMedreimburserate(String medreimburserate) {
        this.medreimburserate = medreimburserate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSortno() {
        return sortno;
    }

    public void setSortno(String sortno) {
        this.sortno = sortno;
    }

    public String getChrgtype() {
        return chrgtype;
    }

    public void setChrgtype(String chrgtype) {
        this.chrgtype = chrgtype;
    }

    @Override
    public String toString() {
        return "ViewListdetail{" +
        "cardNo=" + cardNo +
        ", invoiceNo=" + invoiceNo +
        ", transType=" + transType +
        ", listdetailno=" + listdetailno +
        ", chargecode=" + chargecode +
        ", chargename=" + chargename +
        ", prescribecode=" + prescribecode +
        ", listtypecode=" + listtypecode +
        ", listtypename=" + listtypename +
        ", code1=" + code1 +
        ", name1=" + name1 +
        ", form=" + form +
        ", specification1=" + specification1 +
        ", unit=" + unit +
        ", std=" + std +
        ", number1=" + number1 +
        ", amt=" + amt +
        ", selfamt=" + selfamt +
        ", receivableamt=" + receivableamt +
        ", medicalcaretype=" + medicalcaretype +
        ", medcareitemtype=" + medcareitemtype +
        ", medreimburserate=" + medreimburserate +
        ", remark=" + remark +
        ", sortno=" + sortno +
        ", chrgtype=" + chrgtype +
        "}";
    }
}
