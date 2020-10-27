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
public class UndrugXgbdjcItem implements Serializable {

    private static final long serialVersionUID=1L;

    private String undrugCode;

    private String undrugName;


    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getUndrugName() {
        return undrugName;
    }

    public void setUndrugName(String undrugName) {
        this.undrugName = undrugName;
    }

    @Override
    public String toString() {
        return "UndrugXgbdjcItem{" +
        "undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        "}";
    }
}
