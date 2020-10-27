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
public class RStaticDayreport implements Serializable {

    private static final long serialVersionUID=1L;

    private Long statNum;

    @TableId(value = "CHECK_OPER_CODE", type = IdType.AUTO)
    private String checkOperCode;

    private LocalDateTime checkDate;

    private String feeStatCate;

    private String feeStatName;

    private BigDecimal realCost;

    private BigDecimal pactPubCost;

    private BigDecimal syOwnCost;

    private BigDecimal syPayCost;

    private BigDecimal syPubCost;

    private BigDecimal syDebzCost;

    private BigDecimal lnOwnCost;

    private BigDecimal lnPayCost;

    private BigDecimal lnPubCost;

    private BigDecimal lnDebzCost;

    private BigDecimal lnGwyCost;


    public Long getStatNum() {
        return statNum;
    }

    public void setStatNum(Long statNum) {
        this.statNum = statNum;
    }

    public String getCheckOperCode() {
        return checkOperCode;
    }

    public void setCheckOperCode(String checkOperCode) {
        this.checkOperCode = checkOperCode;
    }

    public LocalDateTime getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(LocalDateTime checkDate) {
        this.checkDate = checkDate;
    }

    public String getFeeStatCate() {
        return feeStatCate;
    }

    public void setFeeStatCate(String feeStatCate) {
        this.feeStatCate = feeStatCate;
    }

    public String getFeeStatName() {
        return feeStatName;
    }

    public void setFeeStatName(String feeStatName) {
        this.feeStatName = feeStatName;
    }

    public BigDecimal getRealCost() {
        return realCost;
    }

    public void setRealCost(BigDecimal realCost) {
        this.realCost = realCost;
    }

    public BigDecimal getPactPubCost() {
        return pactPubCost;
    }

    public void setPactPubCost(BigDecimal pactPubCost) {
        this.pactPubCost = pactPubCost;
    }

    public BigDecimal getSyOwnCost() {
        return syOwnCost;
    }

    public void setSyOwnCost(BigDecimal syOwnCost) {
        this.syOwnCost = syOwnCost;
    }

    public BigDecimal getSyPayCost() {
        return syPayCost;
    }

    public void setSyPayCost(BigDecimal syPayCost) {
        this.syPayCost = syPayCost;
    }

    public BigDecimal getSyPubCost() {
        return syPubCost;
    }

    public void setSyPubCost(BigDecimal syPubCost) {
        this.syPubCost = syPubCost;
    }

    public BigDecimal getSyDebzCost() {
        return syDebzCost;
    }

    public void setSyDebzCost(BigDecimal syDebzCost) {
        this.syDebzCost = syDebzCost;
    }

    public BigDecimal getLnOwnCost() {
        return lnOwnCost;
    }

    public void setLnOwnCost(BigDecimal lnOwnCost) {
        this.lnOwnCost = lnOwnCost;
    }

    public BigDecimal getLnPayCost() {
        return lnPayCost;
    }

    public void setLnPayCost(BigDecimal lnPayCost) {
        this.lnPayCost = lnPayCost;
    }

    public BigDecimal getLnPubCost() {
        return lnPubCost;
    }

    public void setLnPubCost(BigDecimal lnPubCost) {
        this.lnPubCost = lnPubCost;
    }

    public BigDecimal getLnDebzCost() {
        return lnDebzCost;
    }

    public void setLnDebzCost(BigDecimal lnDebzCost) {
        this.lnDebzCost = lnDebzCost;
    }

    public BigDecimal getLnGwyCost() {
        return lnGwyCost;
    }

    public void setLnGwyCost(BigDecimal lnGwyCost) {
        this.lnGwyCost = lnGwyCost;
    }

    @Override
    public String toString() {
        return "RStaticDayreport{" +
        "statNum=" + statNum +
        ", checkOperCode=" + checkOperCode +
        ", checkDate=" + checkDate +
        ", feeStatCate=" + feeStatCate +
        ", feeStatName=" + feeStatName +
        ", realCost=" + realCost +
        ", pactPubCost=" + pactPubCost +
        ", syOwnCost=" + syOwnCost +
        ", syPayCost=" + syPayCost +
        ", syPubCost=" + syPubCost +
        ", syDebzCost=" + syDebzCost +
        ", lnOwnCost=" + lnOwnCost +
        ", lnPayCost=" + lnPayCost +
        ", lnPubCost=" + lnPubCost +
        ", lnDebzCost=" + lnDebzCost +
        ", lnGwyCost=" + lnGwyCost +
        "}";
    }
}
