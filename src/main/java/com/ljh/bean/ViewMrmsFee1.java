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
public class ViewMrmsFee1 implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private BigDecimal inFee;

    private BigDecimal zyFee;

    private BigDecimal xyFee;

    private BigDecimal zlFee;

    private BigDecimal ssFee;

    private BigDecimal jcFee;

    private BigDecimal jyFee;

    private BigDecimal fsflFee;

    private BigDecimal sxsyFee;

    private BigDecimal qtFee;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getInFee() {
        return inFee;
    }

    public void setInFee(BigDecimal inFee) {
        this.inFee = inFee;
    }

    public BigDecimal getZyFee() {
        return zyFee;
    }

    public void setZyFee(BigDecimal zyFee) {
        this.zyFee = zyFee;
    }

    public BigDecimal getXyFee() {
        return xyFee;
    }

    public void setXyFee(BigDecimal xyFee) {
        this.xyFee = xyFee;
    }

    public BigDecimal getZlFee() {
        return zlFee;
    }

    public void setZlFee(BigDecimal zlFee) {
        this.zlFee = zlFee;
    }

    public BigDecimal getSsFee() {
        return ssFee;
    }

    public void setSsFee(BigDecimal ssFee) {
        this.ssFee = ssFee;
    }

    public BigDecimal getJcFee() {
        return jcFee;
    }

    public void setJcFee(BigDecimal jcFee) {
        this.jcFee = jcFee;
    }

    public BigDecimal getJyFee() {
        return jyFee;
    }

    public void setJyFee(BigDecimal jyFee) {
        this.jyFee = jyFee;
    }

    public BigDecimal getFsflFee() {
        return fsflFee;
    }

    public void setFsflFee(BigDecimal fsflFee) {
        this.fsflFee = fsflFee;
    }

    public BigDecimal getSxsyFee() {
        return sxsyFee;
    }

    public void setSxsyFee(BigDecimal sxsyFee) {
        this.sxsyFee = sxsyFee;
    }

    public BigDecimal getQtFee() {
        return qtFee;
    }

    public void setQtFee(BigDecimal qtFee) {
        this.qtFee = qtFee;
    }

    @Override
    public String toString() {
        return "ViewMrmsFee1{" +
        "deptCode=" + deptCode +
        ", inFee=" + inFee +
        ", zyFee=" + zyFee +
        ", xyFee=" + xyFee +
        ", zlFee=" + zlFee +
        ", ssFee=" + ssFee +
        ", jcFee=" + jcFee +
        ", jyFee=" + jyFee +
        ", fsflFee=" + fsflFee +
        ", sxsyFee=" + sxsyFee +
        ", qtFee=" + qtFee +
        "}";
    }
}
