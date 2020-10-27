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
public class PersonWorkMz implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 统计时间
     */
    @TableId(value = "OPER_DATE", type = IdType.AUTO)
    private LocalDateTime operDate;

    /**
     * 统计人
     */
    private String operCode;

    /**
     * 开始时间
     */
    private LocalDateTime fromDate;

    /**
     * 结束时间
     */
    private LocalDateTime toDate;

    /**
     * 统计大类
     */
    private String feeStatCate;

    /**
     * 统计大类名称
     */
    private String feeStatName;

    /**
     * 实付(现金、支票、信用卡等总和)
     */
    private BigDecimal realCost;

    /**
     * 合同单位公费金额
     */
    private BigDecimal pactPubCost;

    /**
     * 市医保帐户支付
     */
    private BigDecimal syPayCost;

    /**
     * 市医保统筹支付
     */
    private BigDecimal syPubCost;

    /**
     * 省医保帐户支付
     */
    private BigDecimal lnPayCost;

    /**
     * 省医保统筹支付
     */
    private BigDecimal lnPubCost;

    /**
     * 审核人
     */
    private String checkOperCode;

    /**
     * 审核时间
     */
    private LocalDateTime checkDate;

    /**
     * 统计编号
     */
    private Long statNum;


    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
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

    public Long getStatNum() {
        return statNum;
    }

    public void setStatNum(Long statNum) {
        this.statNum = statNum;
    }

    @Override
    public String toString() {
        return "PersonWorkMz{" +
        "operDate=" + operDate +
        ", operCode=" + operCode +
        ", fromDate=" + fromDate +
        ", toDate=" + toDate +
        ", feeStatCate=" + feeStatCate +
        ", feeStatName=" + feeStatName +
        ", realCost=" + realCost +
        ", pactPubCost=" + pactPubCost +
        ", syPayCost=" + syPayCost +
        ", syPubCost=" + syPubCost +
        ", lnPayCost=" + lnPayCost +
        ", lnPubCost=" + lnPubCost +
        ", checkOperCode=" + checkOperCode +
        ", checkDate=" + checkDate +
        ", statNum=" + statNum +
        "}";
    }
}
