package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 操作员收费明细结算单
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class PersonWorkBalance implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    @TableId(value = "OPER_CODE", type = IdType.AUTO)
    private String operCode;

    /**
     * 起始时间
     */
    private LocalDateTime fromDate;

    /**
     * 截止时间
     */
    private LocalDateTime toDate;

    /**
     * 统计大类
     */
    private String feeStatCate;

    /**
     * 统计名称
     */
    private String feeStatName;

    /**
     * 金额
     */
    private BigDecimal totCost;

    /**
     * 退费金额
     */
    private BigDecimal returnCost;

    /**
     * 打印顺序
     */
    private Integer printOrder;

    /**
     * 退费类型 ：1 退费  2 重打
     */
    private String quitType;

    /**
     * 审核标志 1 审核 0 未审核
     */
    private String checkFlag;

    /**
     * 取消标志 1 取消 0 未取消
     */
    private String cancelFlag;

    /**
     * 审核人
     */
    private String checkOperCode;

    /**
     * 审核时间
     */
    private LocalDateTime checkDate;


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

    public BigDecimal getTotCost() {
        return totCost;
    }

    public void setTotCost(BigDecimal totCost) {
        this.totCost = totCost;
    }

    public BigDecimal getReturnCost() {
        return returnCost;
    }

    public void setReturnCost(BigDecimal returnCost) {
        this.returnCost = returnCost;
    }

    public Integer getPrintOrder() {
        return printOrder;
    }

    public void setPrintOrder(Integer printOrder) {
        this.printOrder = printOrder;
    }

    public String getQuitType() {
        return quitType;
    }

    public void setQuitType(String quitType) {
        this.quitType = quitType;
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
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

    @Override
    public String toString() {
        return "PersonWorkBalance{" +
        "operDate=" + operDate +
        ", operCode=" + operCode +
        ", fromDate=" + fromDate +
        ", toDate=" + toDate +
        ", feeStatCate=" + feeStatCate +
        ", feeStatName=" + feeStatName +
        ", totCost=" + totCost +
        ", returnCost=" + returnCost +
        ", printOrder=" + printOrder +
        ", quitType=" + quitType +
        ", checkFlag=" + checkFlag +
        ", cancelFlag=" + cancelFlag +
        ", checkOperCode=" + checkOperCode +
        ", checkDate=" + checkDate +
        "}";
    }
}
