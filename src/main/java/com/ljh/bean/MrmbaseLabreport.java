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
public class MrmbaseLabreport implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 就诊卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 挂号时间
     */
    private LocalDateTime regDtime;

    /**
     * 序号
     */
    private BigDecimal xh;

    /**
     * 项目序号
     */
    private BigDecimal itemXh;

    /**
     * 项目代码
     */
    private String itemCode;

    /**
     * 项目名称
     */
    private String itemName;

    /**
     * 结果
     */
    private String value;

    /**
     * 参考值
     */
    private String refValue;

    /**
     * 单位
     */
    private String unit;

    /**
     * 项目英文名称
     */
    private String enname;

    /**
     * 采集标本日期
     */
    private LocalDateTime operDate;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDtime() {
        return regDtime;
    }

    public void setRegDtime(LocalDateTime regDtime) {
        this.regDtime = regDtime;
    }

    public BigDecimal getXh() {
        return xh;
    }

    public void setXh(BigDecimal xh) {
        this.xh = xh;
    }

    public BigDecimal getItemXh() {
        return itemXh;
    }

    public void setItemXh(BigDecimal itemXh) {
        this.itemXh = itemXh;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRefValue() {
        return refValue;
    }

    public void setRefValue(String refValue) {
        this.refValue = refValue;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "MrmbaseLabreport{" +
        "cardNo=" + cardNo +
        ", regDtime=" + regDtime +
        ", xh=" + xh +
        ", itemXh=" + itemXh +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", value=" + value +
        ", refValue=" + refValue +
        ", unit=" + unit +
        ", enname=" + enname +
        ", operDate=" + operDate +
        "}";
    }
}
