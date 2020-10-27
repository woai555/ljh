package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * r_汉字拼音对照表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RSpellCompare implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * ID号
     */
    @TableId(value = "SPL_ID", type = IdType.AUTO)
    private String splId;

    /**
     * 名称
     */
    private String splCode;

    /**
     * 拼音(全拼)
     */
    private String splSpell;


    public String getSplId() {
        return splId;
    }

    public void setSplId(String splId) {
        this.splId = splId;
    }

    public String getSplCode() {
        return splCode;
    }

    public void setSplCode(String splCode) {
        this.splCode = splCode;
    }

    public String getSplSpell() {
        return splSpell;
    }

    public void setSplSpell(String splSpell) {
        this.splSpell = splSpell;
    }

    @Override
    public String toString() {
        return "RSpellCompare{" +
        "splId=" + splId +
        ", splCode=" + splCode +
        ", splSpell=" + splSpell +
        "}";
    }
}
