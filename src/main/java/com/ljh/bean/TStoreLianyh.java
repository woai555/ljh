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
public class TStoreLianyh implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugCode;

    private BigDecimal storeSum;


    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public BigDecimal getStoreSum() {
        return storeSum;
    }

    public void setStoreSum(BigDecimal storeSum) {
        this.storeSum = storeSum;
    }

    @Override
    public String toString() {
        return "TStoreLianyh{" +
        "drugCode=" + drugCode +
        ", storeSum=" + storeSum +
        "}";
    }
}
