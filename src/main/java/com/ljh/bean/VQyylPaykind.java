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
public class VQyylPaykind implements Serializable {

    private static final long serialVersionUID=1L;

    private String paykindCode;

    private String paykindName;


    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getPaykindName() {
        return paykindName;
    }

    public void setPaykindName(String paykindName) {
        this.paykindName = paykindName;
    }

    @Override
    public String toString() {
        return "VQyylPaykind{" +
        "paykindCode=" + paykindCode +
        ", paykindName=" + paykindName +
        "}";
    }
}
