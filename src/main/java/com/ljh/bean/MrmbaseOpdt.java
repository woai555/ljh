package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊病案手术信息档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MrmbaseOpdt implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 就诊卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 挂号时间
     */
    private LocalDateTime regDtime;

    /**
     * 序号
     */
    private BigDecimal xh;

    /**
     * 手术序号
     */
    private BigDecimal operXh;

    /**
     * 手术日期时间（开始）
     */
    private LocalDateTime operBgnDatetime;

    /**
     * 手术日期时间（开始）
     */
    private LocalDateTime operEndDatetime;

    /**
     * 手术及操作医师（术者医师执业证书编码）
     */
    private String doctCode;

    /**
     * 手术及操作医师姓名
     */
    private String doctName;

    /**
     * 麻醉方式
     */
    private String narcKind;

    /**
     * 麻醉医师（医师执业证书编码）
     */
    private String doctNarcCode;

    /**
     * 麻醉医师姓名
     */
    private String doctNarcName;

    /**
     * 手术及操作编码(ICD-9-CM3)
     */
    private String operCode;

    /**
     * 手术及操作名称
     */
    private String operCnname;

    /**
     * 是否主要手术或操作
     */
    private String majorFlag;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDtime() {
        return regDtime;
    }

    public void setRegDtime(LocalDateTime regDtime) {
        this.regDtime = regDtime;
    }

    public BigDecimal getXh() {
        return xh;
    }

    public void setXh(BigDecimal xh) {
        this.xh = xh;
    }

    public BigDecimal getOperXh() {
        return operXh;
    }

    public void setOperXh(BigDecimal operXh) {
        this.operXh = operXh;
    }

    public LocalDateTime getOperBgnDatetime() {
        return operBgnDatetime;
    }

    public void setOperBgnDatetime(LocalDateTime operBgnDatetime) {
        this.operBgnDatetime = operBgnDatetime;
    }

    public LocalDateTime getOperEndDatetime() {
        return operEndDatetime;
    }

    public void setOperEndDatetime(LocalDateTime operEndDatetime) {
        this.operEndDatetime = operEndDatetime;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public String getNarcKind() {
        return narcKind;
    }

    public void setNarcKind(String narcKind) {
        this.narcKind = narcKind;
    }

    public String getDoctNarcCode() {
        return doctNarcCode;
    }

    public void setDoctNarcCode(String doctNarcCode) {
        this.doctNarcCode = doctNarcCode;
    }

    public String getDoctNarcName() {
        return doctNarcName;
    }

    public void setDoctNarcName(String doctNarcName) {
        this.doctNarcName = doctNarcName;
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

    public String getMajorFlag() {
        return majorFlag;
    }

    public void setMajorFlag(String majorFlag) {
        this.majorFlag = majorFlag;
    }

    @Override
    public String toString() {
        return "MrmbaseOpdt{" +
        "cardNo=" + cardNo +
        ", regDtime=" + regDtime +
        ", xh=" + xh +
        ", operXh=" + operXh +
        ", operBgnDatetime=" + operBgnDatetime +
        ", operEndDatetime=" + operEndDatetime +
        ", doctCode=" + doctCode +
        ", doctName=" + doctName +
        ", narcKind=" + narcKind +
        ", doctNarcCode=" + doctNarcCode +
        ", doctNarcName=" + doctNarcName +
        ", operCode=" + operCode +
        ", operCnname=" + operCnname +
        ", majorFlag=" + majorFlag +
        "}";
    }
}
