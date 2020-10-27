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
public class ViewMzStaticBalance implements Serializable {

    private static final long serialVersionUID=1L;

    private String feeStatCate;

    private String feeStatName;

    private String sRealCost;

    private String sHPubCost;

    private String sSyPayCost;

    private String sSyPubCost;

    private String sSyDebzCost;

    private String sLnPayCost;

    private String sLnPubCost;

    private String sLnDebzCost;

    private String sLnGwyCost;


    public String getFeeStatCate() {
        return feeStatCate;
    }

    public void setFeeStatCate(String feeStatCate) {
        this.feeStatCate = feeStatCate;
    }

    public String getFeeStatName() {
        return feeStatName;
    }

    public void setFeeStatName(String feeStatName) {
        this.feeStatName = feeStatName;
    }

    public String getsRealCost() {
        return sRealCost;
    }

    public void setsRealCost(String sRealCost) {
        this.sRealCost = sRealCost;
    }

    public String getsHPubCost() {
        return sHPubCost;
    }

    public void setsHPubCost(String sHPubCost) {
        this.sHPubCost = sHPubCost;
    }

    public String getsSyPayCost() {
        return sSyPayCost;
    }

    public void setsSyPayCost(String sSyPayCost) {
        this.sSyPayCost = sSyPayCost;
    }

    public String getsSyPubCost() {
        return sSyPubCost;
    }

    public void setsSyPubCost(String sSyPubCost) {
        this.sSyPubCost = sSyPubCost;
    }

    public String getsSyDebzCost() {
        return sSyDebzCost;
    }

    public void setsSyDebzCost(String sSyDebzCost) {
        this.sSyDebzCost = sSyDebzCost;
    }

    public String getsLnPayCost() {
        return sLnPayCost;
    }

    public void setsLnPayCost(String sLnPayCost) {
        this.sLnPayCost = sLnPayCost;
    }

    public String getsLnPubCost() {
        return sLnPubCost;
    }

    public void setsLnPubCost(String sLnPubCost) {
        this.sLnPubCost = sLnPubCost;
    }

    public String getsLnDebzCost() {
        return sLnDebzCost;
    }

    public void setsLnDebzCost(String sLnDebzCost) {
        this.sLnDebzCost = sLnDebzCost;
    }

    public String getsLnGwyCost() {
        return sLnGwyCost;
    }

    public void setsLnGwyCost(String sLnGwyCost) {
        this.sLnGwyCost = sLnGwyCost;
    }

    @Override
    public String toString() {
        return "ViewMzStaticBalance{" +
        "feeStatCate=" + feeStatCate +
        ", feeStatName=" + feeStatName +
        ", sRealCost=" + sRealCost +
        ", sHPubCost=" + sHPubCost +
        ", sSyPayCost=" + sSyPayCost +
        ", sSyPubCost=" + sSyPubCost +
        ", sSyDebzCost=" + sSyDebzCost +
        ", sLnPayCost=" + sLnPayCost +
        ", sLnPubCost=" + sLnPubCost +
        ", sLnDebzCost=" + sLnDebzCost +
        ", sLnGwyCost=" + sLnGwyCost +
        "}";
    }
}
