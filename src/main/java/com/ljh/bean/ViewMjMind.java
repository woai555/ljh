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
public class ViewMjMind implements Serializable {

    private static final long serialVersionUID=1L;

    private String mindCode;

    private String mindName;


    public String getMindCode() {
        return mindCode;
    }

    public void setMindCode(String mindCode) {
        this.mindCode = mindCode;
    }

    public String getMindName() {
        return mindName;
    }

    public void setMindName(String mindName) {
        this.mindName = mindName;
    }

    @Override
    public String toString() {
        return "ViewMjMind{" +
        "mindCode=" + mindCode +
        ", mindName=" + mindName +
        "}";
    }
}
