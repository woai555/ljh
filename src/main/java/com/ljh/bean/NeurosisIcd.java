package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 精神疾病诊断列表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NeurosisIcd implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ICD_CODE", type = IdType.AUTO)
    private String icdCode;

    private String spellCode;

    private String icdName;

    /**
     * 疾病类别(第1类、第2类)
     */
    private String icdType;

    /**
     * 疾病编号(1类1-15、2类1-24)
     */
    private String icdNum;


    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    public String getIcdType() {
        return icdType;
    }

    public void setIcdType(String icdType) {
        this.icdType = icdType;
    }

    public String getIcdNum() {
        return icdNum;
    }

    public void setIcdNum(String icdNum) {
        this.icdNum = icdNum;
    }

    @Override
    public String toString() {
        return "NeurosisIcd{" +
        "icdCode=" + icdCode +
        ", spellCode=" + spellCode +
        ", icdName=" + icdName +
        ", icdType=" + icdType +
        ", icdNum=" + icdNum +
        "}";
    }
}
