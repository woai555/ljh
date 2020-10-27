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
public class VTsyby implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal biaoy;

    private BigDecimal ts;

    private BigDecimal tsybydf;

    private String tdmc;

    private LocalDateTime staticDate;


    public BigDecimal getBiaoy() {
        return biaoy;
    }

    public void setBiaoy(BigDecimal biaoy) {
        this.biaoy = biaoy;
    }

    public BigDecimal getTs() {
        return ts;
    }

    public void setTs(BigDecimal ts) {
        this.ts = ts;
    }

    public BigDecimal getTsybydf() {
        return tsybydf;
    }

    public void setTsybydf(BigDecimal tsybydf) {
        this.tsybydf = tsybydf;
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
        return "VTsyby{" +
        "biaoy=" + biaoy +
        ", ts=" + ts +
        ", tsybydf=" + tsybydf +
        ", tdmc=" + tdmc +
        ", staticDate=" + staticDate +
        "}";
    }
}
