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
public class MrmbaseMzDictnew implements Serializable {

    private static final long serialVersionUID=1L;

    private String category;

    private String itemId;

    private String itemName;

    private String spell;

    private String bz1;

    private String bz2;


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getBz1() {
        return bz1;
    }

    public void setBz1(String bz1) {
        this.bz1 = bz1;
    }

    public String getBz2() {
        return bz2;
    }

    public void setBz2(String bz2) {
        this.bz2 = bz2;
    }

    @Override
    public String toString() {
        return "MrmbaseMzDictnew{" +
        "category=" + category +
        ", itemId=" + itemId +
        ", itemName=" + itemName +
        ", spell=" + spell +
        ", bz1=" + bz1 +
        ", bz2=" + bz2 +
        "}";
    }
}
