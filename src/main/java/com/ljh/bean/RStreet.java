package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 街道乡镇信息表（卫统五用）
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RStreet implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 编码
     */
    @TableId(value = "STREET_CODE", type = IdType.AUTO)
    private String streetCode;

    /**
     * 名称
     */
    private String streetName;

    /**
     * 拼音码
     */
    private String spellCode;


    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    @Override
    public String toString() {
        return "RStreet{" +
        "streetCode=" + streetCode +
        ", streetName=" + streetName +
        ", spellCode=" + spellCode +
        "}";
    }
}
