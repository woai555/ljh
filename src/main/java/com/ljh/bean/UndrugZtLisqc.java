package com.ljh.bean;

import java.math.BigDecimal;
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
public class UndrugZtLisqc implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 组套编码
     */
    private String ztCode;

    /**
     * 组套名称
     */
    private String ztName;

    /**
     * 父级编码
     */
    private String parentCode;

    /**
     * 是否父级标志
     */
    private String parentFlag;

    /**
     * 非药品编码
     */
    private String undrugCode;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 系统类别
     */
    private String sysClass;

    /**
     * 组套内子序号
     */
    @TableId(value = "ZT_ORDER", type = IdType.AUTO)
    private BigDecimal ztOrder;

    private String spellCode;


    public String getZtCode() {
        return ztCode;
    }

    public void setZtCode(String ztCode) {
        this.ztCode = ztCode;
    }

    public String getZtName() {
        return ztName;
    }

    public void setZtName(String ztName) {
        this.ztName = ztName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentFlag() {
        return parentFlag;
    }

    public void setParentFlag(String parentFlag) {
        this.parentFlag = parentFlag;
    }

    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getSysClass() {
        return sysClass;
    }

    public void setSysClass(String sysClass) {
        this.sysClass = sysClass;
    }

    public BigDecimal getZtOrder() {
        return ztOrder;
    }

    public void setZtOrder(BigDecimal ztOrder) {
        this.ztOrder = ztOrder;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    @Override
    public String toString() {
        return "UndrugZtLisqc{" +
        "ztCode=" + ztCode +
        ", ztName=" + ztName +
        ", parentCode=" + parentCode +
        ", parentFlag=" + parentFlag +
        ", undrugCode=" + undrugCode +
        ", unitPrice=" + unitPrice +
        ", sysClass=" + sysClass +
        ", ztOrder=" + ztOrder +
        ", spellCode=" + spellCode +
        "}";
    }
}
