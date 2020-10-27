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
public class VCjfy implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal cjfy;

    private String tdmc;

    private LocalDateTime staticDate;


    public BigDecimal getCjfy() {
        return cjfy;
    }

    public void setCjfy(BigDecimal cjfy) {
        this.cjfy = cjfy;
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
        return "VCjfy{" +
        "cjfy=" + cjfy +
        ", tdmc=" + tdmc +
        ", staticDate=" + staticDate +
        "}";
    }
}
