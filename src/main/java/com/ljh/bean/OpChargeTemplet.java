package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术批费模板
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpChargeTemplet implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    private String templetCode;

    private String templetName;

    private String templetType;

    private String itemCode;

    private String itemSpell;

    private String itemName;

    private BigDecimal itemPrice;

    private String itemUnit;

    private Integer itemPos;

    private String itemProperty;

    private String itemInput;

    private String operCode;

    private LocalDateTime operDate;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getTempletCode() {
        return templetCode;
    }

    public void setTempletCode(String templetCode) {
        this.templetCode = templetCode;
    }

    public String getTempletName() {
        return templetName;
    }

    public void setTempletName(String templetName) {
        this.templetName = templetName;
    }

    public String getTempletType() {
        return templetType;
    }

    public void setTempletType(String templetType) {
        this.templetType = templetType;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemSpell() {
        return itemSpell;
    }

    public void setItemSpell(String itemSpell) {
        this.itemSpell = itemSpell;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public Integer getItemPos() {
        return itemPos;
    }

    public void setItemPos(Integer itemPos) {
        this.itemPos = itemPos;
    }

    public String getItemProperty() {
        return itemProperty;
    }

    public void setItemProperty(String itemProperty) {
        this.itemProperty = itemProperty;
    }

    public String getItemInput() {
        return itemInput;
    }

    public void setItemInput(String itemInput) {
        this.itemInput = itemInput;
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
        return "OpChargeTemplet{" +
        "deptCode=" + deptCode +
        ", templetCode=" + templetCode +
        ", templetName=" + templetName +
        ", templetType=" + templetType +
        ", itemCode=" + itemCode +
        ", itemSpell=" + itemSpell +
        ", itemName=" + itemName +
        ", itemPrice=" + itemPrice +
        ", itemUnit=" + itemUnit +
        ", itemPos=" + itemPos +
        ", itemProperty=" + itemProperty +
        ", itemInput=" + itemInput +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
