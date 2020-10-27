package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class VRegPatient implements Serializable {

    private static final long serialVersionUID=1L;

    private String orderId;

    private String cardNo;

    private String name;

    private String reglevlCode;

    private String reglevlName;

    private String doctCode;

    private String deptCode;

    private String deptName;

    private String cardType;

    private String cardnoJyt;

    private String aliorderid;

    private String payWay;

    private String jytChannel;

    private String regNo;

    private String yuntaiPayNo;

    private String noonCode;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

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

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
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

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getAliorderid() {
        return aliorderid;
    }

    public void setAliorderid(String aliorderid) {
        this.aliorderid = aliorderid;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getJytChannel() {
        return jytChannel;
    }

    public void setJytChannel(String jytChannel) {
        this.jytChannel = jytChannel;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getYuntaiPayNo() {
        return yuntaiPayNo;
    }

    public void setYuntaiPayNo(String yuntaiPayNo) {
        this.yuntaiPayNo = yuntaiPayNo;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    @Override
    public String toString() {
        return "VRegPatient{" +
        "orderId=" + orderId +
        ", cardNo=" + cardNo +
        ", name=" + name +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", doctCode=" + doctCode +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", cardType=" + cardType +
        ", cardnoJyt=" + cardnoJyt +
        ", aliorderid=" + aliorderid +
        ", payWay=" + payWay +
        ", jytChannel=" + jytChannel +
        ", regNo=" + regNo +
        ", yuntaiPayNo=" + yuntaiPayNo +
        ", noonCode=" + noonCode +
        "}";
    }
}
