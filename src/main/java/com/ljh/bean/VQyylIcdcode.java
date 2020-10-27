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
public class VQyylIcdcode implements Serializable {

    private static final long serialVersionUID=1L;

    private String icdCode;

    private String icdName;

    private String spellCode;


    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    @Override
    public String toString() {
        return "VQyylIcdcode{" +
        "icdCode=" + icdCode +
        ", icdName=" + icdName +
        ", spellCode=" + spellCode +
        "}";
    }
}
