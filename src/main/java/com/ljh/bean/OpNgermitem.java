package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 无菌检查项目
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpNgermitem implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ITEMCODE", type = IdType.AUTO)
    private String itemcode;

    private String itemname;

    private String spell;


    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    @Override
    public String toString() {
        return "OpNgermitem{" +
        "itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", spell=" + spell +
        "}";
    }
}
