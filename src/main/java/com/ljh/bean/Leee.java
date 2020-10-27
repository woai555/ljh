package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 测试表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Leee implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * leee的主键
     */
    @TableId(value = "AA", type = IdType.AUTO)
    private BigDecimal aa;

    private String bb;

    private String cc;

    private String dd;

    private BigDecimal ee;


    public BigDecimal getAa() {
        return aa;
    }

    public void setAa(BigDecimal aa) {
        this.aa = aa;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public BigDecimal getEe() {
        return ee;
    }

    public void setEe(BigDecimal ee) {
        this.ee = ee;
    }

    @Override
    public String toString() {
        return "Leee{" +
        "aa=" + aa +
        ", bb=" + bb +
        ", cc=" + cc +
        ", dd=" + dd +
        ", ee=" + ee +
        "}";
    }
}
