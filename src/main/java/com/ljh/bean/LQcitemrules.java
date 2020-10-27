package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 质控项目规则表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LQcitemrules implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 质控项目ID
     */
    @TableId(value = "ITEMID", type = IdType.AUTO)
    private Integer itemid;

    /**
     * 质控规则ID
     */
    private Integer ruleid;

    /**
     * 是否默认，1是，2否
     */
    private String isdefault;


    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getRuleid() {
        return ruleid;
    }

    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
    }

    @Override
    public String toString() {
        return "LQcitemrules{" +
        "itemid=" + itemid +
        ", ruleid=" + ruleid +
        ", isdefault=" + isdefault +
        "}";
    }
}
