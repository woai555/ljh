package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门急诊病历首页字典
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MrmbaseMzDict implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类别
     */
    @TableId(value = "CATEGORY", type = IdType.AUTO)
    private String category;

    /**
     * 代码
     */
    private String itemId;

    /**
     * 名称
     */
    private String itemName;

    /**
     * 名称拼音
     */
    private String spell;

    /**
     * 备注1
     */
    private String bz1;

    /**
     * 备注2
     */
    private String bz2;

    /**
     * his系统代码
     */
    private String hisId;

    /**
     * 电子病历共享工程编码
     */
    private String mrCode;


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

    public String getHisId() {
        return hisId;
    }

    public void setHisId(String hisId) {
        this.hisId = hisId;
    }

    public String getMrCode() {
        return mrCode;
    }

    public void setMrCode(String mrCode) {
        this.mrCode = mrCode;
    }

    @Override
    public String toString() {
        return "MrmbaseMzDict{" +
        "category=" + category +
        ", itemId=" + itemId +
        ", itemName=" + itemName +
        ", spell=" + spell +
        ", bz1=" + bz1 +
        ", bz2=" + bz2 +
        ", hisId=" + hisId +
        ", mrCode=" + mrCode +
        "}";
    }
}
