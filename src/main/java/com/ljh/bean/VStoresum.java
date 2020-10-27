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
public class VStoresum implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugDeptCode;

    private String drugCode;

    private BigDecimal startnum;


    public String getDrugDeptCode() {
        return drugDeptCode;
    }

    public void setDrugDeptCode(String drugDeptCode) {
        this.drugDeptCode = drugDeptCode;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public BigDecimal getStartnum() {
        return startnum;
    }

    public void setStartnum(BigDecimal startnum) {
        this.startnum = startnum;
    }

    @Override
    public String toString() {
        return "VStoresum{" +
        "drugDeptCode=" + drugDeptCode +
        ", drugCode=" + drugCode +
        ", startnum=" + startnum +
        "}";
    }
}
