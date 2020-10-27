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
public class Med4and7 implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugDeptCode;

    private String drugCode;

    private String placecode;


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

    public String getPlacecode() {
        return placecode;
    }

    public void setPlacecode(String placecode) {
        this.placecode = placecode;
    }

    @Override
    public String toString() {
        return "Med4and7{" +
        "drugDeptCode=" + drugDeptCode +
        ", drugCode=" + drugCode +
        ", placecode=" + placecode +
        "}";
    }
}
