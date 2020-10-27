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
public class WfComname implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ITEMNO", type = IdType.AUTO)
    private Integer itemno;

    private Integer tableno;

    private String itemname;

    private String spellcode;


    public Integer getItemno() {
        return itemno;
    }

    public void setItemno(Integer itemno) {
        this.itemno = itemno;
    }

    public Integer getTableno() {
        return tableno;
    }

    public void setTableno(Integer tableno) {
        this.tableno = tableno;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getSpellcode() {
        return spellcode;
    }

    public void setSpellcode(String spellcode) {
        this.spellcode = spellcode;
    }

    @Override
    public String toString() {
        return "WfComname{" +
        "itemno=" + itemno +
        ", tableno=" + tableno +
        ", itemname=" + itemname +
        ", spellcode=" + spellcode +
        "}";
    }
}
