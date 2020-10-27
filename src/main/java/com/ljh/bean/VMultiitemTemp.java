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
public class VMultiitemTemp implements Serializable {

    private static final long serialVersionUID=1L;

    private String nationCode;

    private String undrugCode;


    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    @Override
    public String toString() {
        return "VMultiitemTemp{" +
        "nationCode=" + nationCode +
        ", undrugCode=" + undrugCode +
        "}";
    }
}
