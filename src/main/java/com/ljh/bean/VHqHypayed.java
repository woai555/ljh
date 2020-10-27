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
public class VHqHypayed implements Serializable {

    private static final long serialVersionUID=1L;

    private String kdys;

    private String kdks;

    private String sfrq;

    private String sfsj;

    private String itemcode;

    private String zyh;

    private String cardno;

    private String recipe;


    public String getKdys() {
        return kdys;
    }

    public void setKdys(String kdys) {
        this.kdys = kdys;
    }

    public String getKdks() {
        return kdks;
    }

    public void setKdks(String kdks) {
        this.kdks = kdks;
    }

    public String getSfrq() {
        return sfrq;
    }

    public void setSfrq(String sfrq) {
        this.sfrq = sfrq;
    }

    public String getSfsj() {
        return sfsj;
    }

    public void setSfsj(String sfsj) {
        this.sfsj = sfsj;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getZyh() {
        return zyh;
    }

    public void setZyh(String zyh) {
        this.zyh = zyh;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "VHqHypayed{" +
        "kdys=" + kdys +
        ", kdks=" + kdks +
        ", sfrq=" + sfrq +
        ", sfsj=" + sfsj +
        ", itemcode=" + itemcode +
        ", zyh=" + zyh +
        ", cardno=" + cardno +
        ", recipe=" + recipe +
        "}";
    }
}
