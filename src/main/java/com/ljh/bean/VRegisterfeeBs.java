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
public class VRegisterfeeBs implements Serializable {

    private static final long serialVersionUID=1L;

    private String invoName;

    private String itemGrade;

    private BigDecimal ownCost;

    private String reglevlCode;

    private String fenlei;

    private String deptCode;


    public String getInvoName() {
        return invoName;
    }

    public void setInvoName(String invoName) {
        this.invoName = invoName;
    }

    public String getItemGrade() {
        return itemGrade;
    }

    public void setItemGrade(String itemGrade) {
        this.itemGrade = itemGrade;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getFenlei() {
        return fenlei;
    }

    public void setFenlei(String fenlei) {
        this.fenlei = fenlei;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Override
    public String toString() {
        return "VRegisterfeeBs{" +
        "invoName=" + invoName +
        ", itemGrade=" + itemGrade +
        ", ownCost=" + ownCost +
        ", reglevlCode=" + reglevlCode +
        ", fenlei=" + fenlei +
        ", deptCode=" + deptCode +
        "}";
    }
}
