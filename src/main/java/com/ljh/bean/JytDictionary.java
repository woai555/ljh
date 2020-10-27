package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 京医通常数表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class JytDictionary implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 常数类型
     */
    @TableId(value = "TYPE", type = IdType.AUTO)
    private String type;

    /**
     * 京医通常数代码
     */
    private String jytCode;

    /**
     * HIS中的常数代码
     */
    private String hisCode;

    /**
     * 常数名称
     */
    private String name;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getJytCode() {
        return jytCode;
    }

    public void setJytCode(String jytCode) {
        this.jytCode = jytCode;
    }

    public String getHisCode() {
        return hisCode;
    }

    public void setHisCode(String hisCode) {
        this.hisCode = hisCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JytDictionary{" +
        "type=" + type +
        ", jytCode=" + jytCode +
        ", hisCode=" + hisCode +
        ", name=" + name +
        "}";
    }
}
