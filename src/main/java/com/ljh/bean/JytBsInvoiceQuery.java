package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class JytBsInvoiceQuery implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    @TableField("fserialNo")
    private String fserialNo;

    @TableField("fsecurityPayNo")
    private String fsecurityPayNo;

    @TableField("fsecurityNo")
    private String fsecurityNo;

    @TableField("fvisitNo")
    private String fvisitNo;

    @TableField("fbillType")
    private String fbillType;

    @TableField("fchargeType")
    private String fchargeType;

    private String fpayee;

    @TableField("fhisOrgType")
    private String fhisOrgType;

    @TableField("fuserName")
    private String fuserName;

    @TableField("fuserSex")
    private String fuserSex;

    @TableField("fsecurityType")
    private String fsecurityType;

    @TableField("fsecurityTypeName")
    private String fsecurityTypeName;

    @TableField("fdateTime")
    private LocalDateTime fdateTime;

    @TableField("fcountMoney")
    private BigDecimal fcountMoney;

    @TableField("fbillNo")
    private String fbillNo;

    private String ynprint;

    @TableField("faccountPay")
    private BigDecimal faccountPay;

    @TableField("fownPayMoney")
    private BigDecimal fownPayMoney;

    @TableField("ffundPay")
    private BigDecimal ffundPay;

    @TableField("fcaseNo")
    private String fcaseNo;

    @TableField("fhospitalNo")
    private String fhospitalNo;

    @TableField("fhospitalTime")
    private String fhospitalTime;

    @TableField("fhospitalDay")
    private String fhospitalDay;

    @TableField("fpreMoney")
    private String fpreMoney;

    @TableField("fsuppleMoney")
    private String fsuppleMoney;

    @TableField("fbackMoney")
    private String fbackMoney;

    private String ftype;

    private String payWay;

    private String aliorderid;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getFserialNo() {
        return fserialNo;
    }

    public void setFserialNo(String fserialNo) {
        this.fserialNo = fserialNo;
    }

    public String getFsecurityPayNo() {
        return fsecurityPayNo;
    }

    public void setFsecurityPayNo(String fsecurityPayNo) {
        this.fsecurityPayNo = fsecurityPayNo;
    }

    public String getFsecurityNo() {
        return fsecurityNo;
    }

    public void setFsecurityNo(String fsecurityNo) {
        this.fsecurityNo = fsecurityNo;
    }

    public String getFvisitNo() {
        return fvisitNo;
    }

    public void setFvisitNo(String fvisitNo) {
        this.fvisitNo = fvisitNo;
    }

    public String getFbillType() {
        return fbillType;
    }

    public void setFbillType(String fbillType) {
        this.fbillType = fbillType;
    }

    public String getFchargeType() {
        return fchargeType;
    }

    public void setFchargeType(String fchargeType) {
        this.fchargeType = fchargeType;
    }

    public String getFpayee() {
        return fpayee;
    }

    public void setFpayee(String fpayee) {
        this.fpayee = fpayee;
    }

    public String getFhisOrgType() {
        return fhisOrgType;
    }

    public void setFhisOrgType(String fhisOrgType) {
        this.fhisOrgType = fhisOrgType;
    }

    public String getFuserName() {
        return fuserName;
    }

    public void setFuserName(String fuserName) {
        this.fuserName = fuserName;
    }

    public String getFuserSex() {
        return fuserSex;
    }

    public void setFuserSex(String fuserSex) {
        this.fuserSex = fuserSex;
    }

    public String getFsecurityType() {
        return fsecurityType;
    }

    public void setFsecurityType(String fsecurityType) {
        this.fsecurityType = fsecurityType;
    }

    public String getFsecurityTypeName() {
        return fsecurityTypeName;
    }

    public void setFsecurityTypeName(String fsecurityTypeName) {
        this.fsecurityTypeName = fsecurityTypeName;
    }

    public LocalDateTime getFdateTime() {
        return fdateTime;
    }

    public void setFdateTime(LocalDateTime fdateTime) {
        this.fdateTime = fdateTime;
    }

    public BigDecimal getFcountMoney() {
        return fcountMoney;
    }

    public void setFcountMoney(BigDecimal fcountMoney) {
        this.fcountMoney = fcountMoney;
    }

    public String getFbillNo() {
        return fbillNo;
    }

    public void setFbillNo(String fbillNo) {
        this.fbillNo = fbillNo;
    }

    public String getYnprint() {
        return ynprint;
    }

    public void setYnprint(String ynprint) {
        this.ynprint = ynprint;
    }

    public BigDecimal getFaccountPay() {
        return faccountPay;
    }

    public void setFaccountPay(BigDecimal faccountPay) {
        this.faccountPay = faccountPay;
    }

    public BigDecimal getFownPayMoney() {
        return fownPayMoney;
    }

    public void setFownPayMoney(BigDecimal fownPayMoney) {
        this.fownPayMoney = fownPayMoney;
    }

    public BigDecimal getFfundPay() {
        return ffundPay;
    }

    public void setFfundPay(BigDecimal ffundPay) {
        this.ffundPay = ffundPay;
    }

    public String getFcaseNo() {
        return fcaseNo;
    }

    public void setFcaseNo(String fcaseNo) {
        this.fcaseNo = fcaseNo;
    }

    public String getFhospitalNo() {
        return fhospitalNo;
    }

    public void setFhospitalNo(String fhospitalNo) {
        this.fhospitalNo = fhospitalNo;
    }

    public String getFhospitalTime() {
        return fhospitalTime;
    }

    public void setFhospitalTime(String fhospitalTime) {
        this.fhospitalTime = fhospitalTime;
    }

    public String getFhospitalDay() {
        return fhospitalDay;
    }

    public void setFhospitalDay(String fhospitalDay) {
        this.fhospitalDay = fhospitalDay;
    }

    public String getFpreMoney() {
        return fpreMoney;
    }

    public void setFpreMoney(String fpreMoney) {
        this.fpreMoney = fpreMoney;
    }

    public String getFsuppleMoney() {
        return fsuppleMoney;
    }

    public void setFsuppleMoney(String fsuppleMoney) {
        this.fsuppleMoney = fsuppleMoney;
    }

    public String getFbackMoney() {
        return fbackMoney;
    }

    public void setFbackMoney(String fbackMoney) {
        this.fbackMoney = fbackMoney;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getAliorderid() {
        return aliorderid;
    }

    public void setAliorderid(String aliorderid) {
        this.aliorderid = aliorderid;
    }

    @Override
    public String toString() {
        return "JytBsInvoiceQuery{" +
        "cardNo=" + cardNo +
        ", fserialNo=" + fserialNo +
        ", fsecurityPayNo=" + fsecurityPayNo +
        ", fsecurityNo=" + fsecurityNo +
        ", fvisitNo=" + fvisitNo +
        ", fbillType=" + fbillType +
        ", fchargeType=" + fchargeType +
        ", fpayee=" + fpayee +
        ", fhisOrgType=" + fhisOrgType +
        ", fuserName=" + fuserName +
        ", fuserSex=" + fuserSex +
        ", fsecurityType=" + fsecurityType +
        ", fsecurityTypeName=" + fsecurityTypeName +
        ", fdateTime=" + fdateTime +
        ", fcountMoney=" + fcountMoney +
        ", fbillNo=" + fbillNo +
        ", ynprint=" + ynprint +
        ", faccountPay=" + faccountPay +
        ", fownPayMoney=" + fownPayMoney +
        ", ffundPay=" + ffundPay +
        ", fcaseNo=" + fcaseNo +
        ", fhospitalNo=" + fhospitalNo +
        ", fhospitalTime=" + fhospitalTime +
        ", fhospitalDay=" + fhospitalDay +
        ", fpreMoney=" + fpreMoney +
        ", fsuppleMoney=" + fsuppleMoney +
        ", fbackMoney=" + fbackMoney +
        ", ftype=" + ftype +
        ", payWay=" + payWay +
        ", aliorderid=" + aliorderid +
        "}";
    }
}
