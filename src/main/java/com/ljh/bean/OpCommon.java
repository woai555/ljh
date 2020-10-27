package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 1手术规模、2麻醉方式、3人员角色、4手术分类、5切口类型 6手术资料
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpCommon implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "TABLENO", type = IdType.AUTO)
    private String tableno;

    private String itemno;

    private String itemname;

    private String spell;


    public String getTableno() {
        return tableno;
    }

    public void setTableno(String tableno) {
        this.tableno = tableno;
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno;
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
        return "OpCommon{" +
        "tableno=" + tableno +
        ", itemno=" + itemno +
        ", itemname=" + itemname +
        ", spell=" + spell +
        "}";
    }
}
