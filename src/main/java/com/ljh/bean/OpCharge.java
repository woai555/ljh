package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术患者批费表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpCharge implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "NOTE_NO", type = IdType.AUTO)
    private String noteNo;

    private String source;

    private String inpatientNo;

    private String cardNo;

    private String operationno;

    private LocalDateTime operationTime;

    private String tmplCode;

    private String deptCode;

    private String itemCode;

    private String itemName;

    private String itemProperty;

    private BigDecimal itemPrice;

    private Integer itemNum;

    private BigDecimal itemCost;

    private String ifConfirm;

    private String confirmer;

    private LocalDateTime confirmDate;

    private String operCode;

    private LocalDateTime operDate;


    public String getNoteNo() {
        return noteNo;
    }

    public void setNoteNo(String noteNo) {
        this.noteNo = noteNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getOperationno() {
        return operationno;
    }

    public void setOperationno(String operationno) {
        this.operationno = operationno;
    }

    public LocalDateTime getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(LocalDateTime operationTime) {
        this.operationTime = operationTime;
    }

    public String getTmplCode() {
        return tmplCode;
    }

    public void setTmplCode(String tmplCode) {
        this.tmplCode = tmplCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemProperty() {
        return itemProperty;
    }

    public void setItemProperty(String itemProperty) {
        this.itemProperty = itemProperty;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    public BigDecimal getItemCost() {
        return itemCost;
    }

    public void setItemCost(BigDecimal itemCost) {
        this.itemCost = itemCost;
    }

    public String getIfConfirm() {
        return ifConfirm;
    }

    public void setIfConfirm(String ifConfirm) {
        this.ifConfirm = ifConfirm;
    }

    public String getConfirmer() {
        return confirmer;
    }

    public void setConfirmer(String confirmer) {
        this.confirmer = confirmer;
    }

    public LocalDateTime getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(LocalDateTime confirmDate) {
        this.confirmDate = confirmDate;
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
        return "OpCharge{" +
        "noteNo=" + noteNo +
        ", source=" + source +
        ", inpatientNo=" + inpatientNo +
        ", cardNo=" + cardNo +
        ", operationno=" + operationno +
        ", operationTime=" + operationTime +
        ", tmplCode=" + tmplCode +
        ", deptCode=" + deptCode +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", itemProperty=" + itemProperty +
        ", itemPrice=" + itemPrice +
        ", itemNum=" + itemNum +
        ", itemCost=" + itemCost +
        ", ifConfirm=" + ifConfirm +
        ", confirmer=" + confirmer +
        ", confirmDate=" + confirmDate +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
