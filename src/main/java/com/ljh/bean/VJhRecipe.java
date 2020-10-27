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
public class VJhRecipe implements Serializable {

    private static final long serialVersionUID=1L;

    private String seeNo;

    private Integer sequenceNo;

    private String cardNo;

    private LocalDateTime regDate;

    private String itemName;

    private BigDecimal onceDose;

    private String onceUnit;

    private String freqCode;

    private String usagename;

    private LocalDateTime operDate;

    private String ordertype;

    private String orderGroup;


    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getOnceDose() {
        return onceDose;
    }

    public void setOnceDose(BigDecimal onceDose) {
        this.onceDose = onceDose;
    }

    public String getOnceUnit() {
        return onceUnit;
    }

    public void setOnceUnit(String onceUnit) {
        this.onceUnit = onceUnit;
    }

    public String getFreqCode() {
        return freqCode;
    }

    public void setFreqCode(String freqCode) {
        this.freqCode = freqCode;
    }

    public String getUsagename() {
        return usagename;
    }

    public void setUsagename(String usagename) {
        this.usagename = usagename;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public String getOrderGroup() {
        return orderGroup;
    }

    public void setOrderGroup(String orderGroup) {
        this.orderGroup = orderGroup;
    }

    @Override
    public String toString() {
        return "VJhRecipe{" +
        "seeNo=" + seeNo +
        ", sequenceNo=" + sequenceNo +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", itemName=" + itemName +
        ", onceDose=" + onceDose +
        ", onceUnit=" + onceUnit +
        ", freqCode=" + freqCode +
        ", usagename=" + usagename +
        ", operDate=" + operDate +
        ", ordertype=" + ordertype +
        ", orderGroup=" + orderGroup +
        "}";
    }
}
