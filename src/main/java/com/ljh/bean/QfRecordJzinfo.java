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
public class QfRecordJzinfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 患者卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 挂号科室
     */
    private String deptCode;

    /**
     * 欠费原因
     */
    private String qfReason;

    /**
     * 欠费金额
     */
    private BigDecimal qfCost;

    /**
     * 主要病情介绍
     */
    private String diagnose;

    /**
     * 登记医生
     */
    private String operDoctcode;

    /**
     * 登记时间
     */
    private LocalDateTime operDate;

    /**
     * 医师是否完成登记
     */
    private String ynRegbydoct;

    /**
     * 是否忽略
     */
    private String ynIngnore;

    /**
     * 是否补缴完全
     */
    private String ynCharge;

    /**
     * 是否绿色通道患者
     */
    private String ynChanel;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getQfReason() {
        return qfReason;
    }

    public void setQfReason(String qfReason) {
        this.qfReason = qfReason;
    }

    public BigDecimal getQfCost() {
        return qfCost;
    }

    public void setQfCost(BigDecimal qfCost) {
        this.qfCost = qfCost;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getOperDoctcode() {
        return operDoctcode;
    }

    public void setOperDoctcode(String operDoctcode) {
        this.operDoctcode = operDoctcode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getYnRegbydoct() {
        return ynRegbydoct;
    }

    public void setYnRegbydoct(String ynRegbydoct) {
        this.ynRegbydoct = ynRegbydoct;
    }

    public String getYnIngnore() {
        return ynIngnore;
    }

    public void setYnIngnore(String ynIngnore) {
        this.ynIngnore = ynIngnore;
    }

    public String getYnCharge() {
        return ynCharge;
    }

    public void setYnCharge(String ynCharge) {
        this.ynCharge = ynCharge;
    }

    public String getYnChanel() {
        return ynChanel;
    }

    public void setYnChanel(String ynChanel) {
        this.ynChanel = ynChanel;
    }

    @Override
    public String toString() {
        return "QfRecordJzinfo{" +
        "cardNo=" + cardNo +
        ", name=" + name +
        ", deptCode=" + deptCode +
        ", qfReason=" + qfReason +
        ", qfCost=" + qfCost +
        ", diagnose=" + diagnose +
        ", operDoctcode=" + operDoctcode +
        ", operDate=" + operDate +
        ", ynRegbydoct=" + ynRegbydoct +
        ", ynIngnore=" + ynIngnore +
        ", ynCharge=" + ynCharge +
        ", ynChanel=" + ynChanel +
        "}";
    }
}
