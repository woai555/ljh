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
public class ViewHrpRegister implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String name;

    private String deptCode;

    private String deptName;

    private String emplCode;

    private String doctName;

    private LocalDateTime seeDate;

    private String noon;

    private String reglevlCode;

    private String reglevlName;

    private String itemid;

    private BigDecimal fee;

    private BigDecimal bxFee;

    private String payWay;

    private LocalDateTime feeDate;

    private String operCode;

    private String yncancel;

    private LocalDateTime cancelDate;

    private String cancelOpercode;

    private BigDecimal backFee;

    private BigDecimal backBxFee;

    private String payWayQuit;


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

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getReglevlName() {
        return reglevlName;
    }

    public void setReglevlName(String reglevlName) {
        this.reglevlName = reglevlName;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getBxFee() {
        return bxFee;
    }

    public void setBxFee(BigDecimal bxFee) {
        this.bxFee = bxFee;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public LocalDateTime getFeeDate() {
        return feeDate;
    }

    public void setFeeDate(LocalDateTime feeDate) {
        this.feeDate = feeDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getYncancel() {
        return yncancel;
    }

    public void setYncancel(String yncancel) {
        this.yncancel = yncancel;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelOpercode() {
        return cancelOpercode;
    }

    public void setCancelOpercode(String cancelOpercode) {
        this.cancelOpercode = cancelOpercode;
    }

    public BigDecimal getBackFee() {
        return backFee;
    }

    public void setBackFee(BigDecimal backFee) {
        this.backFee = backFee;
    }

    public BigDecimal getBackBxFee() {
        return backBxFee;
    }

    public void setBackBxFee(BigDecimal backBxFee) {
        this.backBxFee = backBxFee;
    }

    public String getPayWayQuit() {
        return payWayQuit;
    }

    public void setPayWayQuit(String payWayQuit) {
        this.payWayQuit = payWayQuit;
    }

    @Override
    public String toString() {
        return "ViewHrpRegister{" +
        "cardNo=" + cardNo +
        ", name=" + name +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", emplCode=" + emplCode +
        ", doctName=" + doctName +
        ", seeDate=" + seeDate +
        ", noon=" + noon +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", itemid=" + itemid +
        ", fee=" + fee +
        ", bxFee=" + bxFee +
        ", payWay=" + payWay +
        ", feeDate=" + feeDate +
        ", operCode=" + operCode +
        ", yncancel=" + yncancel +
        ", cancelDate=" + cancelDate +
        ", cancelOpercode=" + cancelOpercode +
        ", backFee=" + backFee +
        ", backBxFee=" + backBxFee +
        ", payWayQuit=" + payWayQuit +
        "}";
    }
}
