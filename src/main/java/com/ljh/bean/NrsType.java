package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 护理类别档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NrsType implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 护理类别:1相关因素2目标3措施
     */
    @TableId(value = "NRS_TYPE", type = IdType.AUTO)
    private String nrsType;

    /**
     * 类别代码
     */
    private String nrsCode;

    /**
     * 类别名称
     */
    private String nrsName;

    /**
     * 类别输入码
     */
    private String nrsCode2;


    public String getNrsType() {
        return nrsType;
    }

    public void setNrsType(String nrsType) {
        this.nrsType = nrsType;
    }

    public String getNrsCode() {
        return nrsCode;
    }

    public void setNrsCode(String nrsCode) {
        this.nrsCode = nrsCode;
    }

    public String getNrsName() {
        return nrsName;
    }

    public void setNrsName(String nrsName) {
        this.nrsName = nrsName;
    }

    public String getNrsCode2() {
        return nrsCode2;
    }

    public void setNrsCode2(String nrsCode2) {
        this.nrsCode2 = nrsCode2;
    }

    @Override
    public String toString() {
        return "NrsType{" +
        "nrsType=" + nrsType +
        ", nrsCode=" + nrsCode +
        ", nrsName=" + nrsName +
        ", nrsCode2=" + nrsCode2 +
        "}";
    }
}
