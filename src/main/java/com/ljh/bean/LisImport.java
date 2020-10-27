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
public class LisImport implements Serializable {

    private static final long serialVersionUID=1L;

    private String shiguan;

    private String xm;

    private String shiguanmc;

    private String sxdd;

    private String qbgsj;

    private String nationalCode;

    private String itemCode;


    public String getShiguan() {
        return shiguan;
    }

    public void setShiguan(String shiguan) {
        this.shiguan = shiguan;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getShiguanmc() {
        return shiguanmc;
    }

    public void setShiguanmc(String shiguanmc) {
        this.shiguanmc = shiguanmc;
    }

    public String getSxdd() {
        return sxdd;
    }

    public void setSxdd(String sxdd) {
        this.sxdd = sxdd;
    }

    public String getQbgsj() {
        return qbgsj;
    }

    public void setQbgsj(String qbgsj) {
        this.qbgsj = qbgsj;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String toString() {
        return "LisImport{" +
        "shiguan=" + shiguan +
        ", xm=" + xm +
        ", shiguanmc=" + shiguanmc +
        ", sxdd=" + sxdd +
        ", qbgsj=" + qbgsj +
        ", nationalCode=" + nationalCode +
        ", itemCode=" + itemCode +
        "}";
    }
}
