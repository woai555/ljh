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
public class VAppPscriptdetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String itemName;

    private String seeNo;

    private BigDecimal ownCost;

    private String feeStatName;


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public String getFeeStatName() {
        return feeStatName;
    }

    public void setFeeStatName(String feeStatName) {
        this.feeStatName = feeStatName;
    }

    @Override
    public String toString() {
        return "VAppPscriptdetail{" +
        "itemName=" + itemName +
        ", seeNo=" + seeNo +
        ", ownCost=" + ownCost +
        ", feeStatName=" + feeStatName +
        "}";
    }
}
