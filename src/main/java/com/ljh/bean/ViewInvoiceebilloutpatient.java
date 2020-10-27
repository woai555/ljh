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
public class ViewInvoiceebilloutpatient implements Serializable {

    private static final long serialVersionUID=1L;

    private String busno;

    private String transType;

    private String bustype;

    private String payer;

    private String busdatetime;

    private String placecode;

    private String payee;

    private String author;

    private BigDecimal totalamt;

    private String remark;

    private String alipaycode;

    private String wechatorderno;

    private String openid;

    private String tel;

    private String email;

    private String idcardno;

    private String cardtype;

    private String cardno;

    private String medicalinstitution;

    private String medicalcaretype;

    private String medcaretypecode;

    private String medcareinstitution;

    private String medicalinsuranceid;

    private String consultationdate;

    private String category;

    private String patientcategorycode;

    private String patientno;

    private String patientid;

    private String sex;

    private BigDecimal age;

    private String casenumber;

    private String specialdiseasesname;

    private String paymentvoucher;

    private BigDecimal accountpay;

    private BigDecimal fundpay;

    private BigDecimal otherfundpay;

    private BigDecimal ownpay;

    private BigDecimal selfconceitedamt;

    private BigDecimal selfpayamt;

    private BigDecimal selfcashpay;

    private BigDecimal cashpay;

    private BigDecimal chequepay;

    private BigDecimal transferaccountpay;

    private BigDecimal cashrecharge;

    private BigDecimal chequerecharge;

    private BigDecimal transferrecharge;

    private BigDecimal cashrefund;

    private BigDecimal chequerefund;

    private BigDecimal transferrefund;

    private BigDecimal ownacbalance;

    private BigDecimal reimbursementamt;

    private String balancednumber;

    private String otherinfo;

    private String othermedicallist;

    private String paychannelcode;

    private BigDecimal paychannelvalue;

    private String ebillrelateno;

    private String pbillcode;

    private String pbillbatchcode;

    private LocalDateTime fundtime;

    private String invoiceKind;

    private String jkrlx;

    private String jkdwbm;


    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getBustype() {
        return bustype;
    }

    public void setBustype(String bustype) {
        this.bustype = bustype;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getBusdatetime() {
        return busdatetime;
    }

    public void setBusdatetime(String busdatetime) {
        this.busdatetime = busdatetime;
    }

    public String getPlacecode() {
        return placecode;
    }

    public void setPlacecode(String placecode) {
        this.placecode = placecode;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getTotalamt() {
        return totalamt;
    }

    public void setTotalamt(BigDecimal totalamt) {
        this.totalamt = totalamt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAlipaycode() {
        return alipaycode;
    }

    public void setAlipaycode(String alipaycode) {
        this.alipaycode = alipaycode;
    }

    public String getWechatorderno() {
        return wechatorderno;
    }

    public void setWechatorderno(String wechatorderno) {
        this.wechatorderno = wechatorderno;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getMedicalinstitution() {
        return medicalinstitution;
    }

    public void setMedicalinstitution(String medicalinstitution) {
        this.medicalinstitution = medicalinstitution;
    }

    public String getMedicalcaretype() {
        return medicalcaretype;
    }

    public void setMedicalcaretype(String medicalcaretype) {
        this.medicalcaretype = medicalcaretype;
    }

    public String getMedcaretypecode() {
        return medcaretypecode;
    }

    public void setMedcaretypecode(String medcaretypecode) {
        this.medcaretypecode = medcaretypecode;
    }

    public String getMedcareinstitution() {
        return medcareinstitution;
    }

    public void setMedcareinstitution(String medcareinstitution) {
        this.medcareinstitution = medcareinstitution;
    }

    public String getMedicalinsuranceid() {
        return medicalinsuranceid;
    }

    public void setMedicalinsuranceid(String medicalinsuranceid) {
        this.medicalinsuranceid = medicalinsuranceid;
    }

    public String getConsultationdate() {
        return consultationdate;
    }

    public void setConsultationdate(String consultationdate) {
        this.consultationdate = consultationdate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPatientcategorycode() {
        return patientcategorycode;
    }

    public void setPatientcategorycode(String patientcategorycode) {
        this.patientcategorycode = patientcategorycode;
    }

    public String getPatientno() {
        return patientno;
    }

    public void setPatientno(String patientno) {
        this.patientno = patientno;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getCasenumber() {
        return casenumber;
    }

    public void setCasenumber(String casenumber) {
        this.casenumber = casenumber;
    }

    public String getSpecialdiseasesname() {
        return specialdiseasesname;
    }

    public void setSpecialdiseasesname(String specialdiseasesname) {
        this.specialdiseasesname = specialdiseasesname;
    }

    public String getPaymentvoucher() {
        return paymentvoucher;
    }

    public void setPaymentvoucher(String paymentvoucher) {
        this.paymentvoucher = paymentvoucher;
    }

    public BigDecimal getAccountpay() {
        return accountpay;
    }

    public void setAccountpay(BigDecimal accountpay) {
        this.accountpay = accountpay;
    }

    public BigDecimal getFundpay() {
        return fundpay;
    }

    public void setFundpay(BigDecimal fundpay) {
        this.fundpay = fundpay;
    }

    public BigDecimal getOtherfundpay() {
        return otherfundpay;
    }

    public void setOtherfundpay(BigDecimal otherfundpay) {
        this.otherfundpay = otherfundpay;
    }

    public BigDecimal getOwnpay() {
        return ownpay;
    }

    public void setOwnpay(BigDecimal ownpay) {
        this.ownpay = ownpay;
    }

    public BigDecimal getSelfconceitedamt() {
        return selfconceitedamt;
    }

    public void setSelfconceitedamt(BigDecimal selfconceitedamt) {
        this.selfconceitedamt = selfconceitedamt;
    }

    public BigDecimal getSelfpayamt() {
        return selfpayamt;
    }

    public void setSelfpayamt(BigDecimal selfpayamt) {
        this.selfpayamt = selfpayamt;
    }

    public BigDecimal getSelfcashpay() {
        return selfcashpay;
    }

    public void setSelfcashpay(BigDecimal selfcashpay) {
        this.selfcashpay = selfcashpay;
    }

    public BigDecimal getCashpay() {
        return cashpay;
    }

    public void setCashpay(BigDecimal cashpay) {
        this.cashpay = cashpay;
    }

    public BigDecimal getChequepay() {
        return chequepay;
    }

    public void setChequepay(BigDecimal chequepay) {
        this.chequepay = chequepay;
    }

    public BigDecimal getTransferaccountpay() {
        return transferaccountpay;
    }

    public void setTransferaccountpay(BigDecimal transferaccountpay) {
        this.transferaccountpay = transferaccountpay;
    }

    public BigDecimal getCashrecharge() {
        return cashrecharge;
    }

    public void setCashrecharge(BigDecimal cashrecharge) {
        this.cashrecharge = cashrecharge;
    }

    public BigDecimal getChequerecharge() {
        return chequerecharge;
    }

    public void setChequerecharge(BigDecimal chequerecharge) {
        this.chequerecharge = chequerecharge;
    }

    public BigDecimal getTransferrecharge() {
        return transferrecharge;
    }

    public void setTransferrecharge(BigDecimal transferrecharge) {
        this.transferrecharge = transferrecharge;
    }

    public BigDecimal getCashrefund() {
        return cashrefund;
    }

    public void setCashrefund(BigDecimal cashrefund) {
        this.cashrefund = cashrefund;
    }

    public BigDecimal getChequerefund() {
        return chequerefund;
    }

    public void setChequerefund(BigDecimal chequerefund) {
        this.chequerefund = chequerefund;
    }

    public BigDecimal getTransferrefund() {
        return transferrefund;
    }

    public void setTransferrefund(BigDecimal transferrefund) {
        this.transferrefund = transferrefund;
    }

    public BigDecimal getOwnacbalance() {
        return ownacbalance;
    }

    public void setOwnacbalance(BigDecimal ownacbalance) {
        this.ownacbalance = ownacbalance;
    }

    public BigDecimal getReimbursementamt() {
        return reimbursementamt;
    }

    public void setReimbursementamt(BigDecimal reimbursementamt) {
        this.reimbursementamt = reimbursementamt;
    }

    public String getBalancednumber() {
        return balancednumber;
    }

    public void setBalancednumber(String balancednumber) {
        this.balancednumber = balancednumber;
    }

    public String getOtherinfo() {
        return otherinfo;
    }

    public void setOtherinfo(String otherinfo) {
        this.otherinfo = otherinfo;
    }

    public String getOthermedicallist() {
        return othermedicallist;
    }

    public void setOthermedicallist(String othermedicallist) {
        this.othermedicallist = othermedicallist;
    }

    public String getPaychannelcode() {
        return paychannelcode;
    }

    public void setPaychannelcode(String paychannelcode) {
        this.paychannelcode = paychannelcode;
    }

    public BigDecimal getPaychannelvalue() {
        return paychannelvalue;
    }

    public void setPaychannelvalue(BigDecimal paychannelvalue) {
        this.paychannelvalue = paychannelvalue;
    }

    public String getEbillrelateno() {
        return ebillrelateno;
    }

    public void setEbillrelateno(String ebillrelateno) {
        this.ebillrelateno = ebillrelateno;
    }

    public String getPbillcode() {
        return pbillcode;
    }

    public void setPbillcode(String pbillcode) {
        this.pbillcode = pbillcode;
    }

    public String getPbillbatchcode() {
        return pbillbatchcode;
    }

    public void setPbillbatchcode(String pbillbatchcode) {
        this.pbillbatchcode = pbillbatchcode;
    }

    public LocalDateTime getFundtime() {
        return fundtime;
    }

    public void setFundtime(LocalDateTime fundtime) {
        this.fundtime = fundtime;
    }

    public String getInvoiceKind() {
        return invoiceKind;
    }

    public void setInvoiceKind(String invoiceKind) {
        this.invoiceKind = invoiceKind;
    }

    public String getJkrlx() {
        return jkrlx;
    }

    public void setJkrlx(String jkrlx) {
        this.jkrlx = jkrlx;
    }

    public String getJkdwbm() {
        return jkdwbm;
    }

    public void setJkdwbm(String jkdwbm) {
        this.jkdwbm = jkdwbm;
    }

    @Override
    public String toString() {
        return "ViewInvoiceebilloutpatient{" +
        "busno=" + busno +
        ", transType=" + transType +
        ", bustype=" + bustype +
        ", payer=" + payer +
        ", busdatetime=" + busdatetime +
        ", placecode=" + placecode +
        ", payee=" + payee +
        ", author=" + author +
        ", totalamt=" + totalamt +
        ", remark=" + remark +
        ", alipaycode=" + alipaycode +
        ", wechatorderno=" + wechatorderno +
        ", openid=" + openid +
        ", tel=" + tel +
        ", email=" + email +
        ", idcardno=" + idcardno +
        ", cardtype=" + cardtype +
        ", cardno=" + cardno +
        ", medicalinstitution=" + medicalinstitution +
        ", medicalcaretype=" + medicalcaretype +
        ", medcaretypecode=" + medcaretypecode +
        ", medcareinstitution=" + medcareinstitution +
        ", medicalinsuranceid=" + medicalinsuranceid +
        ", consultationdate=" + consultationdate +
        ", category=" + category +
        ", patientcategorycode=" + patientcategorycode +
        ", patientno=" + patientno +
        ", patientid=" + patientid +
        ", sex=" + sex +
        ", age=" + age +
        ", casenumber=" + casenumber +
        ", specialdiseasesname=" + specialdiseasesname +
        ", paymentvoucher=" + paymentvoucher +
        ", accountpay=" + accountpay +
        ", fundpay=" + fundpay +
        ", otherfundpay=" + otherfundpay +
        ", ownpay=" + ownpay +
        ", selfconceitedamt=" + selfconceitedamt +
        ", selfpayamt=" + selfpayamt +
        ", selfcashpay=" + selfcashpay +
        ", cashpay=" + cashpay +
        ", chequepay=" + chequepay +
        ", transferaccountpay=" + transferaccountpay +
        ", cashrecharge=" + cashrecharge +
        ", chequerecharge=" + chequerecharge +
        ", transferrecharge=" + transferrecharge +
        ", cashrefund=" + cashrefund +
        ", chequerefund=" + chequerefund +
        ", transferrefund=" + transferrefund +
        ", ownacbalance=" + ownacbalance +
        ", reimbursementamt=" + reimbursementamt +
        ", balancednumber=" + balancednumber +
        ", otherinfo=" + otherinfo +
        ", othermedicallist=" + othermedicallist +
        ", paychannelcode=" + paychannelcode +
        ", paychannelvalue=" + paychannelvalue +
        ", ebillrelateno=" + ebillrelateno +
        ", pbillcode=" + pbillcode +
        ", pbillbatchcode=" + pbillbatchcode +
        ", fundtime=" + fundtime +
        ", invoiceKind=" + invoiceKind +
        ", jkrlx=" + jkrlx +
        ", jkdwbm=" + jkdwbm +
        "}";
    }
}
