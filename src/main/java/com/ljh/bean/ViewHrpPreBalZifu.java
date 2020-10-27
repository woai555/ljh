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
public class ViewHrpPreBalZifu implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal supplyCash;

    private BigDecimal supplyCheck;

    private BigDecimal supplyCard;

    private BigDecimal returnCash;

    private BigDecimal returnCheck;

    private BigDecimal returnCard;

    private BigDecimal prepaySupplyCash;

    private BigDecimal prepaySupplyCheck;

    private BigDecimal prepaySupplyCard;

    private BigDecimal prepayReturnCash;

    private BigDecimal prepayReturnCheck;

    private BigDecimal prepayReturnCard;

    private BigDecimal allOwncostCash;

    private BigDecimal allOwncostCheck;

    private BigDecimal allOwncostCard;

    private BigDecimal allOwncost;

    private BigDecimal allPubcost;

    private String operCode;

    private LocalDateTime operDate;


    public BigDecimal getSupplyCash() {
        return supplyCash;
    }

    public void setSupplyCash(BigDecimal supplyCash) {
        this.supplyCash = supplyCash;
    }

    public BigDecimal getSupplyCheck() {
        return supplyCheck;
    }

    public void setSupplyCheck(BigDecimal supplyCheck) {
        this.supplyCheck = supplyCheck;
    }

    public BigDecimal getSupplyCard() {
        return supplyCard;
    }

    public void setSupplyCard(BigDecimal supplyCard) {
        this.supplyCard = supplyCard;
    }

    public BigDecimal getReturnCash() {
        return returnCash;
    }

    public void setReturnCash(BigDecimal returnCash) {
        this.returnCash = returnCash;
    }

    public BigDecimal getReturnCheck() {
        return returnCheck;
    }

    public void setReturnCheck(BigDecimal returnCheck) {
        this.returnCheck = returnCheck;
    }

    public BigDecimal getReturnCard() {
        return returnCard;
    }

    public void setReturnCard(BigDecimal returnCard) {
        this.returnCard = returnCard;
    }

    public BigDecimal getPrepaySupplyCash() {
        return prepaySupplyCash;
    }

    public void setPrepaySupplyCash(BigDecimal prepaySupplyCash) {
        this.prepaySupplyCash = prepaySupplyCash;
    }

    public BigDecimal getPrepaySupplyCheck() {
        return prepaySupplyCheck;
    }

    public void setPrepaySupplyCheck(BigDecimal prepaySupplyCheck) {
        this.prepaySupplyCheck = prepaySupplyCheck;
    }

    public BigDecimal getPrepaySupplyCard() {
        return prepaySupplyCard;
    }

    public void setPrepaySupplyCard(BigDecimal prepaySupplyCard) {
        this.prepaySupplyCard = prepaySupplyCard;
    }

    public BigDecimal getPrepayReturnCash() {
        return prepayReturnCash;
    }

    public void setPrepayReturnCash(BigDecimal prepayReturnCash) {
        this.prepayReturnCash = prepayReturnCash;
    }

    public BigDecimal getPrepayReturnCheck() {
        return prepayReturnCheck;
    }

    public void setPrepayReturnCheck(BigDecimal prepayReturnCheck) {
        this.prepayReturnCheck = prepayReturnCheck;
    }

    public BigDecimal getPrepayReturnCard() {
        return prepayReturnCard;
    }

    public void setPrepayReturnCard(BigDecimal prepayReturnCard) {
        this.prepayReturnCard = prepayReturnCard;
    }

    public BigDecimal getAllOwncostCash() {
        return allOwncostCash;
    }

    public void setAllOwncostCash(BigDecimal allOwncostCash) {
        this.allOwncostCash = allOwncostCash;
    }

    public BigDecimal getAllOwncostCheck() {
        return allOwncostCheck;
    }

    public void setAllOwncostCheck(BigDecimal allOwncostCheck) {
        this.allOwncostCheck = allOwncostCheck;
    }

    public BigDecimal getAllOwncostCard() {
        return allOwncostCard;
    }

    public void setAllOwncostCard(BigDecimal allOwncostCard) {
        this.allOwncostCard = allOwncostCard;
    }

    public BigDecimal getAllOwncost() {
        return allOwncost;
    }

    public void setAllOwncost(BigDecimal allOwncost) {
        this.allOwncost = allOwncost;
    }

    public BigDecimal getAllPubcost() {
        return allPubcost;
    }

    public void setAllPubcost(BigDecimal allPubcost) {
        this.allPubcost = allPubcost;
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
        return "ViewHrpPreBalZifu{" +
        "supplyCash=" + supplyCash +
        ", supplyCheck=" + supplyCheck +
        ", supplyCard=" + supplyCard +
        ", returnCash=" + returnCash +
        ", returnCheck=" + returnCheck +
        ", returnCard=" + returnCard +
        ", prepaySupplyCash=" + prepaySupplyCash +
        ", prepaySupplyCheck=" + prepaySupplyCheck +
        ", prepaySupplyCard=" + prepaySupplyCard +
        ", prepayReturnCash=" + prepayReturnCash +
        ", prepayReturnCheck=" + prepayReturnCheck +
        ", prepayReturnCard=" + prepayReturnCard +
        ", allOwncostCash=" + allOwncostCash +
        ", allOwncostCheck=" + allOwncostCheck +
        ", allOwncostCard=" + allOwncostCard +
        ", allOwncost=" + allOwncost +
        ", allPubcost=" + allPubcost +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
