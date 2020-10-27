package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术信息档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsopdt implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * INPATIENT_NO
     */
    @TableId(value = "INPATIENT_NO", type = IdType.AUTO)
    private String inpatientNo;

    /**
     * 住院病历号
     */
    private String patientNo;

    /**
     * 门诊病历号
     */
    private String cardNo;

    /**
     * 手术日期
     */
    private LocalDateTime dateOper;

    /**
     * 手术代码
     */
    private String operCode;

    /**
     * 手术名称
     */
    private String operCnname;

    /**
     * 手术总类
     */
    private String operKind;

    /**
     * 麻醉方式
     */
    private String narcKind;

    /**
     * 切口种类
     */
    private String nickKind;

    /**
     * 愈合种类
     */
    private String cicaKind;

    /**
     * 手术医师代码
     */
    private String docCode;

    /**
     * 手术医师名称
     */
    private String docName;

    /**
     * 统计标志
     */
    private String statFlag;

    /**
     * 入科日期
     */
    private LocalDateTime inDate;

    /**
     * 出院日期
     */
    private LocalDateTime outDate;

    /**
     * 死亡日期
     */
    private LocalDateTime deadDate;

    /**
     * 手术科室
     */
    private String operDept;

    /**
     * 出院病房
     */
    private String outDept;

    /**
     * 出院主诊断ICD
     */
    private String outIcd;

    /**
     * 是否合并症
     */
    private String syndFlag;

    /**
     * 是否V码患者
     */
    private String icdKind;

    /**
     * 手术申请单号
     */
    private String operNo;

    /**
     * I助
     */
    private String docI;

    /**
     * II助
     */
    private String docIi;

    /**
     * 麻醉医师
     */
    private String docNarc;

    /**
     * 三级护理天数
     */
    private BigDecimal thDays;

    private BigDecimal icuDays;

    private BigDecimal ccuDays;

    private BigDecimal h1Days;

    private BigDecimal h2Days;

    private BigDecimal h3Days;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getDateOper() {
        return dateOper;
    }

    public void setDateOper(LocalDateTime dateOper) {
        this.dateOper = dateOper;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperCnname() {
        return operCnname;
    }

    public void setOperCnname(String operCnname) {
        this.operCnname = operCnname;
    }

    public String getOperKind() {
        return operKind;
    }

    public void setOperKind(String operKind) {
        this.operKind = operKind;
    }

    public String getNarcKind() {
        return narcKind;
    }

    public void setNarcKind(String narcKind) {
        this.narcKind = narcKind;
    }

    public String getNickKind() {
        return nickKind;
    }

    public void setNickKind(String nickKind) {
        this.nickKind = nickKind;
    }

    public String getCicaKind() {
        return cicaKind;
    }

    public void setCicaKind(String cicaKind) {
        this.cicaKind = cicaKind;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getStatFlag() {
        return statFlag;
    }

    public void setStatFlag(String statFlag) {
        this.statFlag = statFlag;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    public LocalDateTime getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(LocalDateTime deadDate) {
        this.deadDate = deadDate;
    }

    public String getOperDept() {
        return operDept;
    }

    public void setOperDept(String operDept) {
        this.operDept = operDept;
    }

    public String getOutDept() {
        return outDept;
    }

    public void setOutDept(String outDept) {
        this.outDept = outDept;
    }

    public String getOutIcd() {
        return outIcd;
    }

    public void setOutIcd(String outIcd) {
        this.outIcd = outIcd;
    }

    public String getSyndFlag() {
        return syndFlag;
    }

    public void setSyndFlag(String syndFlag) {
        this.syndFlag = syndFlag;
    }

    public String getIcdKind() {
        return icdKind;
    }

    public void setIcdKind(String icdKind) {
        this.icdKind = icdKind;
    }

    public String getOperNo() {
        return operNo;
    }

    public void setOperNo(String operNo) {
        this.operNo = operNo;
    }

    public String getDocI() {
        return docI;
    }

    public void setDocI(String docI) {
        this.docI = docI;
    }

    public String getDocIi() {
        return docIi;
    }

    public void setDocIi(String docIi) {
        this.docIi = docIi;
    }

    public String getDocNarc() {
        return docNarc;
    }

    public void setDocNarc(String docNarc) {
        this.docNarc = docNarc;
    }

    public BigDecimal getThDays() {
        return thDays;
    }

    public void setThDays(BigDecimal thDays) {
        this.thDays = thDays;
    }

    public BigDecimal getIcuDays() {
        return icuDays;
    }

    public void setIcuDays(BigDecimal icuDays) {
        this.icuDays = icuDays;
    }

    public BigDecimal getCcuDays() {
        return ccuDays;
    }

    public void setCcuDays(BigDecimal ccuDays) {
        this.ccuDays = ccuDays;
    }

    public BigDecimal getH1Days() {
        return h1Days;
    }

    public void setH1Days(BigDecimal h1Days) {
        this.h1Days = h1Days;
    }

    public BigDecimal getH2Days() {
        return h2Days;
    }

    public void setH2Days(BigDecimal h2Days) {
        this.h2Days = h2Days;
    }

    public BigDecimal getH3Days() {
        return h3Days;
    }

    public void setH3Days(BigDecimal h3Days) {
        this.h3Days = h3Days;
    }

    @Override
    public String toString() {
        return "Mrmsopdt{" +
        "inpatientNo=" + inpatientNo +
        ", patientNo=" + patientNo +
        ", cardNo=" + cardNo +
        ", dateOper=" + dateOper +
        ", operCode=" + operCode +
        ", operCnname=" + operCnname +
        ", operKind=" + operKind +
        ", narcKind=" + narcKind +
        ", nickKind=" + nickKind +
        ", cicaKind=" + cicaKind +
        ", docCode=" + docCode +
        ", docName=" + docName +
        ", statFlag=" + statFlag +
        ", inDate=" + inDate +
        ", outDate=" + outDate +
        ", deadDate=" + deadDate +
        ", operDept=" + operDept +
        ", outDept=" + outDept +
        ", outIcd=" + outIcd +
        ", syndFlag=" + syndFlag +
        ", icdKind=" + icdKind +
        ", operNo=" + operNo +
        ", docI=" + docI +
        ", docIi=" + docIi +
        ", docNarc=" + docNarc +
        ", thDays=" + thDays +
        ", icuDays=" + icuDays +
        ", ccuDays=" + ccuDays +
        ", h1Days=" + h1Days +
        ", h2Days=" + h2Days +
        ", h3Days=" + h3Days +
        "}";
    }
}
