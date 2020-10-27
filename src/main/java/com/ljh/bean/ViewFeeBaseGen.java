package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_FEE_BASE_GEN
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewFeeBaseGen implements Serializable {

    private static final long serialVersionUID=1L;

    private String feeCode;

    private String feeName;

    private LocalDateTime feeDate;

    private BigDecimal num;

    private BigDecimal cost;


    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public LocalDateTime getFeeDate() {
        return feeDate;
    }

    public void setFeeDate(LocalDateTime feeDate) {
        this.feeDate = feeDate;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ViewFeeBaseGen{" +
        "feeCode=" + feeCode +
        ", feeName=" + feeName +
        ", feeDate=" + feeDate +
        ", num=" + num +
        ", cost=" + cost +
        "}";
    }
}
