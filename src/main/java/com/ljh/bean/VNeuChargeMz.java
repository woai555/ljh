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
public class VNeuChargeMz implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String recipeNo;

    private Integer sequenceNo;

    private String itemname;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    @Override
    public String toString() {
        return "VNeuChargeMz{" +
        "cardNo=" + cardNo +
        ", recipeNo=" + recipeNo +
        ", sequenceNo=" + sequenceNo +
        ", itemname=" + itemname +
        "}";
    }
}
