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
public class RStreetold implements Serializable {

    private static final long serialVersionUID=1L;

    private String streetCode;

    private String streetName;

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
        return "RStreetold{" +
        "streetCode=" + streetCode +
        ", streetName=" + streetName +
        ", spellCode=" + spellCode +
        "}";
    }
}
