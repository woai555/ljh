package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_MRMS_FROMWHERE
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewMrmsFromwhere implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptName;

    private String deptCode;

    private BigDecimal sBq;

    private BigDecimal sBshi;

    private BigDecimal sBsheng;

    private BigDecimal sWs;

    private BigDecimal sGw;

    private BigDecimal sGat;


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getsBq() {
        return sBq;
    }

    public void setsBq(BigDecimal sBq) {
        this.sBq = sBq;
    }

    public BigDecimal getsBshi() {
        return sBshi;
    }

    public void setsBshi(BigDecimal sBshi) {
        this.sBshi = sBshi;
    }

    public BigDecimal getsBsheng() {
        return sBsheng;
    }

    public void setsBsheng(BigDecimal sBsheng) {
        this.sBsheng = sBsheng;
    }

    public BigDecimal getsWs() {
        return sWs;
    }

    public void setsWs(BigDecimal sWs) {
        this.sWs = sWs;
    }

    public BigDecimal getsGw() {
        return sGw;
    }

    public void setsGw(BigDecimal sGw) {
        this.sGw = sGw;
    }

    public BigDecimal getsGat() {
        return sGat;
    }

    public void setsGat(BigDecimal sGat) {
        this.sGat = sGat;
    }

    @Override
    public String toString() {
        return "ViewMrmsFromwhere{" +
        "deptName=" + deptName +
        ", deptCode=" + deptCode +
        ", sBq=" + sBq +
        ", sBshi=" + sBshi +
        ", sBsheng=" + sBsheng +
        ", sWs=" + sWs +
        ", sGw=" + sGw +
        ", sGat=" + sGat +
        "}";
    }
}
