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
public class RFactHiscon implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类别
     */
    private String pCode;

    /**
     * 代码
     */
    private String code;

    /**
     * 名称
     */
    private String name;


    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RFactHiscon{" +
        "pCode=" + pCode +
        ", code=" + code +
        ", name=" + name +
        "}";
    }
}
