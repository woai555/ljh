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
public class ViewFeelistETest implements Serializable {

    private static final long serialVersionUID=1L;

    private String feeStatName;

    private String feeStatCate;

    private String feeName;

    private String feeStatCode;

    private String feeCode;

    private BigDecimal totCost;


    public String getFeeStatName() {
        return feeStatName;
    }

    public void setFeeStatName(String feeStatName) {
        this.feeStatName = feeStatName;
    }

    public String getFeeStatCate() {
        return feeStatCate;
    }

    public void setFeeStatCate(String feeStatCate) {
        this.feeStatCate = feeStatCate;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public String getFeeStatCode() {
        return feeStatCode;
    }

    public void setFeeStatCode(String feeStatCode) {
        this.feeStatCode = feeStatCode;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public BigDecimal getTotCost() {
        return totCost;
    }

    public void setTotCost(BigDecimal totCost) {
        this.totCost = totCost;
    }

    @Override
    public String toString() {
        return "ViewFeelistETest{" +
        "feeStatName=" + feeStatName +
        ", feeStatCate=" + feeStatCate +
        ", feeName=" + feeName +
        ", feeStatCode=" + feeStatCode +
        ", feeCode=" + feeCode +
        ", totCost=" + totCost +
        "}";
    }
}
