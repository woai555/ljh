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
public class ViewMdyPhysicianClass implements Serializable {

    private static final long serialVersionUID=1L;

    private String codeValue;

    private String codeDesc;


    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }

    @Override
    public String toString() {
        return "ViewMdyPhysicianClass{" +
        "codeValue=" + codeValue +
        ", codeDesc=" + codeDesc +
        "}";
    }
}
