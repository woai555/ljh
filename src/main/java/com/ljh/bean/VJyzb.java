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
public class VJyzb implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal jycgjeb;

    private BigDecimal jycgjebdf;

    private String tdmc;

    private LocalDateTime staticDate;


    public BigDecimal getJycgjeb() {
        return jycgjeb;
    }

    public void setJycgjeb(BigDecimal jycgjeb) {
        this.jycgjeb = jycgjeb;
    }

    public BigDecimal getJycgjebdf() {
        return jycgjebdf;
    }

    public void setJycgjebdf(BigDecimal jycgjebdf) {
        this.jycgjebdf = jycgjebdf;
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
        return "VJyzb{" +
        "jycgjeb=" + jycgjeb +
        ", jycgjebdf=" + jycgjebdf +
        ", tdmc=" + tdmc +
        ", staticDate=" + staticDate +
        "}";
    }
}
