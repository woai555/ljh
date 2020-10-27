package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 麻醉记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpAnaerecord implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "OPERATIONNO", type = IdType.AUTO)
    private String operationno;

    private BigDecimal recordno;

    private String operationItem;

    private LocalDateTime operationDate;

    private String inpatientNo;

    private String cardNo;

    private LocalDateTime regDate;

    private String source;

    private String name;

    private String sex;

    private String anaeType;

    private LocalDateTime anaeDate;

    private String anaeDoc;

    private String anaeHelper;

    private String anaeResult;

    private String mark;

    private String beforeClinic;

    private String isBefore;

    private String chargeFlag;

    private String easePain;

    private String validFlag;

    private String operCode;

    private LocalDateTime operDate;


    public String getOperationno() {
        return operationno;
    }

    public void setOperationno(String operationno) {
        this.operationno = operationno;
    }

    public BigDecimal getRecordno() {
        return recordno;
    }

    public void setRecordno(BigDecimal recordno) {
        this.recordno = recordno;
    }

    public String getOperationItem() {
        return operationItem;
    }

    public void setOperationItem(String operationItem) {
        this.operationItem = operationItem;
    }

    public LocalDateTime getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDateTime operationDate) {
        this.operationDate = operationDate;
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAnaeType() {
        return anaeType;
    }

    public void setAnaeType(String anaeType) {
        this.anaeType = anaeType;
    }

    public LocalDateTime getAnaeDate() {
        return anaeDate;
    }

    public void setAnaeDate(LocalDateTime anaeDate) {
        this.anaeDate = anaeDate;
    }

    public String getAnaeDoc() {
        return anaeDoc;
    }

    public void setAnaeDoc(String anaeDoc) {
        this.anaeDoc = anaeDoc;
    }

    public String getAnaeHelper() {
        return anaeHelper;
    }

    public void setAnaeHelper(String anaeHelper) {
        this.anaeHelper = anaeHelper;
    }

    public String getAnaeResult() {
        return anaeResult;
    }

    public void setAnaeResult(String anaeResult) {
        this.anaeResult = anaeResult;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getBeforeClinic() {
        return beforeClinic;
    }

    public void setBeforeClinic(String beforeClinic) {
        this.beforeClinic = beforeClinic;
    }

    public String getIsBefore() {
        return isBefore;
    }

    public void setIsBefore(String isBefore) {
        this.isBefore = isBefore;
    }

    public String getChargeFlag() {
        return chargeFlag;
    }

    public void setChargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag;
    }

    public String getEasePain() {
        return easePain;
    }

    public void setEasePain(String easePain) {
        this.easePain = easePain;
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag;
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

    @Override
    public String toString() {
        return "OpAnaerecord{" +
        "operationno=" + operationno +
        ", recordno=" + recordno +
        ", operationItem=" + operationItem +
        ", operationDate=" + operationDate +
        ", inpatientNo=" + inpatientNo +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", source=" + source +
        ", name=" + name +
        ", sex=" + sex +
        ", anaeType=" + anaeType +
        ", anaeDate=" + anaeDate +
        ", anaeDoc=" + anaeDoc +
        ", anaeHelper=" + anaeHelper +
        ", anaeResult=" + anaeResult +
        ", mark=" + mark +
        ", beforeClinic=" + beforeClinic +
        ", isBefore=" + isBefore +
        ", chargeFlag=" + chargeFlag +
        ", easePain=" + easePain +
        ", validFlag=" + validFlag +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
