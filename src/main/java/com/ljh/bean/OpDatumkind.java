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
public class OpDatumkind implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 1 诊断  2 手术项目  3 手术器材  4 用药   5手术分类 6 注意事项
     */
    @TableId(value = "KINDCODE", type = IdType.AUTO)
    private String kindcode;

    /**
     * 类型名称
     */
    private String kindname;

    /**
     * 拼音编码
     */
    private String spell;


    public String getKindcode() {
        return kindcode;
    }

    public void setKindcode(String kindcode) {
        this.kindcode = kindcode;
    }

    public String getKindname() {
        return kindname;
    }

    public void setKindname(String kindname) {
        this.kindname = kindname;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    @Override
    public String toString() {
        return "OpDatumkind{" +
        "kindcode=" + kindcode +
        ", kindname=" + kindname +
        ", spell=" + spell +
        "}";
    }
}
