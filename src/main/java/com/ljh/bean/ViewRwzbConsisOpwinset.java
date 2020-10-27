package com.ljh.bean;

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
public class ViewRwzbConsisOpwinset implements Serializable {

    private static final long serialVersionUID=1L;

    private String stockCode;

    private String drugDeptCode;

    private String drugDeptName;


    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getDrugDeptCode() {
        return drugDeptCode;
    }

    public void setDrugDeptCode(String drugDeptCode) {
        this.drugDeptCode = drugDeptCode;
    }

    public String getDrugDeptName() {
        return drugDeptName;
    }

    public void setDrugDeptName(String drugDeptName) {
        this.drugDeptName = drugDeptName;
    }

    @Override
    public String toString() {
        return "ViewRwzbConsisOpwinset{" +
        "stockCode=" + stockCode +
        ", drugDeptCode=" + drugDeptCode +
        ", drugDeptName=" + drugDeptName +
        "}";
    }
}
