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
public class Pbcatedt implements Serializable {

    private static final long serialVersionUID=1L;

    private String pbeName;

    private String pbeEdit;

    private BigDecimal pbeType;

    private BigDecimal pbeCntr;

    private BigDecimal pbeSeqn;

    private BigDecimal pbeFlag;

    private String pbeWork;


    public String getPbeName() {
        return pbeName;
    }

    public void setPbeName(String pbeName) {
        this.pbeName = pbeName;
    }

    public String getPbeEdit() {
        return pbeEdit;
    }

    public void setPbeEdit(String pbeEdit) {
        this.pbeEdit = pbeEdit;
    }

    public BigDecimal getPbeType() {
        return pbeType;
    }

    public void setPbeType(BigDecimal pbeType) {
        this.pbeType = pbeType;
    }

    public BigDecimal getPbeCntr() {
        return pbeCntr;
    }

    public void setPbeCntr(BigDecimal pbeCntr) {
        this.pbeCntr = pbeCntr;
    }

    public BigDecimal getPbeSeqn() {
        return pbeSeqn;
    }

    public void setPbeSeqn(BigDecimal pbeSeqn) {
        this.pbeSeqn = pbeSeqn;
    }

    public BigDecimal getPbeFlag() {
        return pbeFlag;
    }

    public void setPbeFlag(BigDecimal pbeFlag) {
        this.pbeFlag = pbeFlag;
    }

    public String getPbeWork() {
        return pbeWork;
    }

    public void setPbeWork(String pbeWork) {
        this.pbeWork = pbeWork;
    }

    @Override
    public String toString() {
        return "Pbcatedt{" +
        "pbeName=" + pbeName +
        ", pbeEdit=" + pbeEdit +
        ", pbeType=" + pbeType +
        ", pbeCntr=" + pbeCntr +
        ", pbeSeqn=" + pbeSeqn +
        ", pbeFlag=" + pbeFlag +
        ", pbeWork=" + pbeWork +
        "}";
    }
}
