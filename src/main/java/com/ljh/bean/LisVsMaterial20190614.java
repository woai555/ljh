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
public class LisVsMaterial20190614 implements Serializable {

    private static final long serialVersionUID=1L;

    private String undrugCode;

    private String undrugName;

    private String itemCode;

    private String itemName;

    private Integer qty;

    private String lisName;

    private String lisEname;

    private String nationalCode;

    private String tubeCode;

    private String tubeName;


    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getUndrugName() {
        return undrugName;
    }

    public void setUndrugName(String undrugName) {
        this.undrugName = undrugName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getLisName() {
        return lisName;
    }

    public void setLisName(String lisName) {
        this.lisName = lisName;
    }

    public String getLisEname() {
        return lisEname;
    }

    public void setLisEname(String lisEname) {
        this.lisEname = lisEname;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getTubeCode() {
        return tubeCode;
    }

    public void setTubeCode(String tubeCode) {
        this.tubeCode = tubeCode;
    }

    public String getTubeName() {
        return tubeName;
    }

    public void setTubeName(String tubeName) {
        this.tubeName = tubeName;
    }

    @Override
    public String toString() {
        return "LisVsMaterial20190614{" +
        "undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", qty=" + qty +
        ", lisName=" + lisName +
        ", lisEname=" + lisEname +
        ", nationalCode=" + nationalCode +
        ", tubeCode=" + tubeCode +
        ", tubeName=" + tubeName +
        "}";
    }
}
