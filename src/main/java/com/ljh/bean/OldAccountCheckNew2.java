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
public class OldAccountCheckNew2 implements Serializable {

    private static final long serialVersionUID=1L;

    private String alipayno;

    private String refundno;

    private String orderType;

    private String cardNo;

    private String cardType;

    private String name;

    private String deptName;

    private String hisno;

    private LocalDateTime regDate;

    private String payWay;

    private BigDecimal totalJine;

    private LocalDateTime payTime;

    private BigDecimal sbcdJine;

    private BigDecimal zfJine;

    private String source;

    private String getregStatus;

    private String sbStatus;

    private String sbPihao;

    private String hisCardNo;


    public String getAlipayno() {
        return alipayno;
    }

    public void setAlipayno(String alipayno) {
        this.alipayno = alipayno;
    }

    public String getRefundno() {
        return refundno;
    }

    public void setRefundno(String refundno) {
        this.refundno = refundno;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHisno() {
        return hisno;
    }

    public void setHisno(String hisno) {
        this.hisno = hisno;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public BigDecimal getTotalJine() {
        return totalJine;
    }

    public void setTotalJine(BigDecimal totalJine) {
        this.totalJine = totalJine;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public BigDecimal getSbcdJine() {
        return sbcdJine;
    }

    public void setSbcdJine(BigDecimal sbcdJine) {
        this.sbcdJine = sbcdJine;
    }

    public BigDecimal getZfJine() {
        return zfJine;
    }

    public void setZfJine(BigDecimal zfJine) {
        this.zfJine = zfJine;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getGetregStatus() {
        return getregStatus;
    }

    public void setGetregStatus(String getregStatus) {
        this.getregStatus = getregStatus;
    }

    public String getSbStatus() {
        return sbStatus;
    }

    public void setSbStatus(String sbStatus) {
        this.sbStatus = sbStatus;
    }

    public String getSbPihao() {
        return sbPihao;
    }

    public void setSbPihao(String sbPihao) {
        this.sbPihao = sbPihao;
    }

    public String getHisCardNo() {
        return hisCardNo;
    }

    public void setHisCardNo(String hisCardNo) {
        this.hisCardNo = hisCardNo;
    }

    @Override
    public String toString() {
        return "OldAccountCheckNew2{" +
        "alipayno=" + alipayno +
        ", refundno=" + refundno +
        ", orderType=" + orderType +
        ", cardNo=" + cardNo +
        ", cardType=" + cardType +
        ", name=" + name +
        ", deptName=" + deptName +
        ", hisno=" + hisno +
        ", regDate=" + regDate +
        ", payWay=" + payWay +
        ", totalJine=" + totalJine +
        ", payTime=" + payTime +
        ", sbcdJine=" + sbcdJine +
        ", zfJine=" + zfJine +
        ", source=" + source +
        ", getregStatus=" + getregStatus +
        ", sbStatus=" + sbStatus +
        ", sbPihao=" + sbPihao +
        ", hisCardNo=" + hisCardNo +
        "}";
    }
}
