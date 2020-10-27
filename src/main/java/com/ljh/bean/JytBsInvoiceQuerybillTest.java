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
public class JytBsInvoiceQuerybillTest implements Serializable {

    private static final long serialVersionUID=1L;

    private String transtype;

    @TableField("fisSync")
    private String fisSync;

    @TableField("fisPrint")
    private String fisPrint;

    @TableField("fserialNo")
    private String fserialNo;

    @TableField("fsecurityPayNo")
    private String fsecurityPayNo;

    @TableField("fsecurityNo")
    private String fsecurityNo;

    @TableField("fpayeeCode")
    private String fpayeeCode;

    @TableField("fpayeeName")
    private String fpayeeName;

    @TableField("fdrawerCode")
    private String fdrawerCode;

    @TableField("fdrawerName")
    private String fdrawerName;

    @TableField("fbillType")
    private String fbillType;

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

    @TableField("fbillNo")
    private String fbillNo;

    @TableField("fprintTime")
    private LocalDateTime fprintTime;

    @TableField("fdateTime")
    private LocalDateTime fdateTime;

    @TableField("fcountMoney")
    private BigDecimal fcountMoney;

    @TableField("foldSerialNo")
    private String foldSerialNo;

    @TableField("foldBillNo")
    private String foldBillNo;

    private String cancelflag;

    @TableField("fbusinessType")
    private String fbusinessType;

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


    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getFisSync() {
        return fisSync;
    }

    public void setFisSync(String fisSync) {
        this.fisSync = fisSync;
    }

    public String getFisPrint() {
        return fisPrint;
    }

    public void setFisPrint(String fisPrint) {
        this.fisPrint = fisPrint;
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

    public String getFpayeeCode() {
        return fpayeeCode;
    }

    public void setFpayeeCode(String fpayeeCode) {
        this.fpayeeCode = fpayeeCode;
    }

    public String getFpayeeName() {
        return fpayeeName;
    }

    public void setFpayeeName(String fpayeeName) {
        this.fpayeeName = fpayeeName;
    }

    public String getFdrawerCode() {
        return fdrawerCode;
    }

    public void setFdrawerCode(String fdrawerCode) {
        this.fdrawerCode = fdrawerCode;
    }

    public String getFdrawerName() {
        return fdrawerName;
    }

    public void setFdrawerName(String fdrawerName) {
        this.fdrawerName = fdrawerName;
    }

    public String getFbillType() {
        return fbillType;
    }

    public void setFbillType(String fbillType) {
        this.fbillType = fbillType;
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

    public String getFbillNo() {
        return fbillNo;
    }

    public void setFbillNo(String fbillNo) {
        this.fbillNo = fbillNo;
    }

    public LocalDateTime getFprintTime() {
        return fprintTime;
    }

    public void setFprintTime(LocalDateTime fprintTime) {
        this.fprintTime = fprintTime;
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

    public String getFoldSerialNo() {
        return foldSerialNo;
    }

    public void setFoldSerialNo(String foldSerialNo) {
        this.foldSerialNo = foldSerialNo;
    }

    public String getFoldBillNo() {
        return foldBillNo;
    }

    public void setFoldBillNo(String foldBillNo) {
        this.foldBillNo = foldBillNo;
    }

    public String getCancelflag() {
        return cancelflag;
    }

    public void setCancelflag(String cancelflag) {
        this.cancelflag = cancelflag;
    }

    public String getFbusinessType() {
        return fbusinessType;
    }

    public void setFbusinessType(String fbusinessType) {
        this.fbusinessType = fbusinessType;
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

    @Override
    public String toString() {
        return "JytBsInvoiceQuerybillTest{" +
        "transtype=" + transtype +
        ", fisSync=" + fisSync +
        ", fisPrint=" + fisPrint +
        ", fserialNo=" + fserialNo +
        ", fsecurityPayNo=" + fsecurityPayNo +
        ", fsecurityNo=" + fsecurityNo +
        ", fpayeeCode=" + fpayeeCode +
        ", fpayeeName=" + fpayeeName +
        ", fdrawerCode=" + fdrawerCode +
        ", fdrawerName=" + fdrawerName +
        ", fbillType=" + fbillType +
        ", fhisOrgType=" + fhisOrgType +
        ", fuserName=" + fuserName +
        ", fuserSex=" + fuserSex +
        ", fsecurityType=" + fsecurityType +
        ", fsecurityTypeName=" + fsecurityTypeName +
        ", fbillNo=" + fbillNo +
        ", fprintTime=" + fprintTime +
        ", fdateTime=" + fdateTime +
        ", fcountMoney=" + fcountMoney +
        ", foldSerialNo=" + foldSerialNo +
        ", foldBillNo=" + foldBillNo +
        ", cancelflag=" + cancelflag +
        ", fbusinessType=" + fbusinessType +
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
        "}";
    }
}
