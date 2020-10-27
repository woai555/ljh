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
public class VAppRegister implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String cardType;

    private String patName;

    private String idCardNo;

    private String deptName;

    private String docName;

    private BigDecimal dateType;

    private String startTime;

    private String endTime;

    private String exceptDate;

    private String accessPatId;

    private String accessRegId;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public BigDecimal getDateType() {
        return dateType;
    }

    public void setDateType(BigDecimal dateType) {
        this.dateType = dateType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getExceptDate() {
        return exceptDate;
    }

    public void setExceptDate(String exceptDate) {
        this.exceptDate = exceptDate;
    }

    public String getAccessPatId() {
        return accessPatId;
    }

    public void setAccessPatId(String accessPatId) {
        this.accessPatId = accessPatId;
    }

    public String getAccessRegId() {
        return accessRegId;
    }

    public void setAccessRegId(String accessRegId) {
        this.accessRegId = accessRegId;
    }

    @Override
    public String toString() {
        return "VAppRegister{" +
        "cardNo=" + cardNo +
        ", cardType=" + cardType +
        ", patName=" + patName +
        ", idCardNo=" + idCardNo +
        ", deptName=" + deptName +
        ", docName=" + docName +
        ", dateType=" + dateType +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", exceptDate=" + exceptDate +
        ", accessPatId=" + accessPatId +
        ", accessRegId=" + accessRegId +
        "}";
    }
}
