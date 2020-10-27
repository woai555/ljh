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
public class Pbcatfmt implements Serializable {

    private static final long serialVersionUID=1L;

    private String pbfName;

    private String pbfFrmt;

    private BigDecimal pbfType;

    private BigDecimal pbfCntr;


    public String getPbfName() {
        return pbfName;
    }

    public void setPbfName(String pbfName) {
        this.pbfName = pbfName;
    }

    public String getPbfFrmt() {
        return pbfFrmt;
    }

    public void setPbfFrmt(String pbfFrmt) {
        this.pbfFrmt = pbfFrmt;
    }

    public BigDecimal getPbfType() {
        return pbfType;
    }

    public void setPbfType(BigDecimal pbfType) {
        this.pbfType = pbfType;
    }

    public BigDecimal getPbfCntr() {
        return pbfCntr;
    }

    public void setPbfCntr(BigDecimal pbfCntr) {
        this.pbfCntr = pbfCntr;
    }

    @Override
    public String toString() {
        return "Pbcatfmt{" +
        "pbfName=" + pbfName +
        ", pbfFrmt=" + pbfFrmt +
        ", pbfType=" + pbfType +
        ", pbfCntr=" + pbfCntr +
        "}";
    }
}
