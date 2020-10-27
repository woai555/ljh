package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_IF_INPREPAY_NOCANCEL
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewIfInprepayNocancel implements Serializable {

    private static final long serialVersionUID=1L;

    private String inpatientNo;

    private Integer happenNo;

    private BigDecimal prepayCost;

    private String deliverMode;

    private String sdeptCode;

    private String deptCode;

    private String receiptNo;

    private String checkFlag;

    private String chargeUnitCode;

    private LocalDateTime statDate;

    private LocalDateTime balanceStatDate;

    private String balanceState;

    private Integer balanceNo;

    private String returnFlag;

    private String operCode;

    private LocalDateTime operDtime;

    private String openBank;

    private String openAccounts;

    private String invoice;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public Integer getHappenNo() {
        return happenNo;
    }

    public void setHappenNo(Integer happenNo) {
        this.happenNo = happenNo;
    }

    public BigDecimal getPrepayCost() {
        return prepayCost;
    }

    public void setPrepayCost(BigDecimal prepayCost) {
        this.prepayCost = prepayCost;
    }

    public String getDeliverMode() {
        return deliverMode;
    }

    public void setDeliverMode(String deliverMode) {
        this.deliverMode = deliverMode;
    }

    public String getSdeptCode() {
        return sdeptCode;
    }

    public void setSdeptCode(String sdeptCode) {
        this.sdeptCode = sdeptCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag;
    }

    public String getChargeUnitCode() {
        return chargeUnitCode;
    }

    public void setChargeUnitCode(String chargeUnitCode) {
        this.chargeUnitCode = chargeUnitCode;
    }

    public LocalDateTime getStatDate() {
        return statDate;
    }

    public void setStatDate(LocalDateTime statDate) {
        this.statDate = statDate;
    }

    public LocalDateTime getBalanceStatDate() {
        return balanceStatDate;
    }

    public void setBalanceStatDate(LocalDateTime balanceStatDate) {
        this.balanceStatDate = balanceStatDate;
    }

    public String getBalanceState() {
        return balanceState;
    }

    public void setBalanceState(String balanceState) {
        this.balanceState = balanceState;
    }

    public Integer getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(Integer balanceNo) {
        this.balanceNo = balanceNo;
    }

    public String getReturnFlag() {
        return returnFlag;
    }

    public void setReturnFlag(String returnFlag) {
        this.returnFlag = returnFlag;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDtime() {
        return operDtime;
    }

    public void setOperDtime(LocalDateTime operDtime) {
        this.operDtime = operDtime;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public String getOpenAccounts() {
        return openAccounts;
    }

    public void setOpenAccounts(String openAccounts) {
        this.openAccounts = openAccounts;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "ViewIfInprepayNocancel{" +
        "inpatientNo=" + inpatientNo +
        ", happenNo=" + happenNo +
        ", prepayCost=" + prepayCost +
        ", deliverMode=" + deliverMode +
        ", sdeptCode=" + sdeptCode +
        ", deptCode=" + deptCode +
        ", receiptNo=" + receiptNo +
        ", checkFlag=" + checkFlag +
        ", chargeUnitCode=" + chargeUnitCode +
        ", statDate=" + statDate +
        ", balanceStatDate=" + balanceStatDate +
        ", balanceState=" + balanceState +
        ", balanceNo=" + balanceNo +
        ", returnFlag=" + returnFlag +
        ", operCode=" + operCode +
        ", operDtime=" + operDtime +
        ", openBank=" + openBank +
        ", openAccounts=" + openAccounts +
        ", invoice=" + invoice +
        "}";
    }
}
