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
public class OpStaOpeitem implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    private String year;

    private String month;

    private BigDecimal totQty;

    private BigDecimal type1Qty;

    private BigDecimal type2Qty;

    private BigDecimal type3Qty;

    private BigDecimal type4Qty;

    private BigDecimal urgentQty;

    private BigDecimal dangerQty;

    private BigDecimal iQty;

    private BigDecimal iiQty;

    private BigDecimal iiiQty;

    private BigDecimal dieQty;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getTotQty() {
        return totQty;
    }

    public void setTotQty(BigDecimal totQty) {
        this.totQty = totQty;
    }

    public BigDecimal getType1Qty() {
        return type1Qty;
    }

    public void setType1Qty(BigDecimal type1Qty) {
        this.type1Qty = type1Qty;
    }

    public BigDecimal getType2Qty() {
        return type2Qty;
    }

    public void setType2Qty(BigDecimal type2Qty) {
        this.type2Qty = type2Qty;
    }

    public BigDecimal getType3Qty() {
        return type3Qty;
    }

    public void setType3Qty(BigDecimal type3Qty) {
        this.type3Qty = type3Qty;
    }

    public BigDecimal getType4Qty() {
        return type4Qty;
    }

    public void setType4Qty(BigDecimal type4Qty) {
        this.type4Qty = type4Qty;
    }

    public BigDecimal getUrgentQty() {
        return urgentQty;
    }

    public void setUrgentQty(BigDecimal urgentQty) {
        this.urgentQty = urgentQty;
    }

    public BigDecimal getDangerQty() {
        return dangerQty;
    }

    public void setDangerQty(BigDecimal dangerQty) {
        this.dangerQty = dangerQty;
    }

    public BigDecimal getiQty() {
        return iQty;
    }

    public void setiQty(BigDecimal iQty) {
        this.iQty = iQty;
    }

    public BigDecimal getIiQty() {
        return iiQty;
    }

    public void setIiQty(BigDecimal iiQty) {
        this.iiQty = iiQty;
    }

    public BigDecimal getIiiQty() {
        return iiiQty;
    }

    public void setIiiQty(BigDecimal iiiQty) {
        this.iiiQty = iiiQty;
    }

    public BigDecimal getDieQty() {
        return dieQty;
    }

    public void setDieQty(BigDecimal dieQty) {
        this.dieQty = dieQty;
    }

    @Override
    public String toString() {
        return "OpStaOpeitem{" +
        "deptCode=" + deptCode +
        ", year=" + year +
        ", month=" + month +
        ", totQty=" + totQty +
        ", type1Qty=" + type1Qty +
        ", type2Qty=" + type2Qty +
        ", type3Qty=" + type3Qty +
        ", type4Qty=" + type4Qty +
        ", urgentQty=" + urgentQty +
        ", dangerQty=" + dangerQty +
        ", iQty=" + iQty +
        ", iiQty=" + iiQty +
        ", iiiQty=" + iiiQty +
        ", dieQty=" + dieQty +
        "}";
    }
}
