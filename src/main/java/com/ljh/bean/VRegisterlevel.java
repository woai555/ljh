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
public class VRegisterlevel implements Serializable {

    private static final long serialVersionUID=1L;

    private String reglevlCode;

    private String reglevlName;


    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getReglevlName() {
        return reglevlName;
    }

    public void setReglevlName(String reglevlName) {
        this.reglevlName = reglevlName;
    }

    @Override
    public String toString() {
        return "VRegisterlevel{" +
        "reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        "}";
    }
}
