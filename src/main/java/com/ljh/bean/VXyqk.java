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
public class VXyqk implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal xqyy;

    private BigDecimal xqyydf;

    private String tdmc;

    private LocalDateTime staticDate;


    public BigDecimal getXqyy() {
        return xqyy;
    }

    public void setXqyy(BigDecimal xqyy) {
        this.xqyy = xqyy;
    }

    public BigDecimal getXqyydf() {
        return xqyydf;
    }

    public void setXqyydf(BigDecimal xqyydf) {
        this.xqyydf = xqyydf;
    }

    public String getTdmc() {
        return tdmc;
    }

    public void setTdmc(String tdmc) {
        this.tdmc = tdmc;
    }

    public LocalDateTime getStaticDate() {
        return staticDate;
    }

    public void setStaticDate(LocalDateTime staticDate) {
        this.staticDate = staticDate;
    }

    @Override
    public String toString() {
        return "VXyqk{" +
        "xqyy=" + xqyy +
        ", xqyydf=" + xqyydf +
        ", tdmc=" + tdmc +
        ", staticDate=" + staticDate +
        "}";
    }
}
