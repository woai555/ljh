package com.ljh.bean;

import java.math.BigDecimal;
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
public class OrdByd implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal code1;

    private String code2;

    private String code3;


    public BigDecimal getCode1() {
        return code1;
    }

    public void setCode1(BigDecimal code1) {
        this.code1 = code1;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getCode3() {
        return code3;
    }

    public void setCode3(String code3) {
        this.code3 = code3;
    }

    @Override
    public String toString() {
        return "OrdByd{" +
        "code1=" + code1 +
        ", code2=" + code2 +
        ", code3=" + code3 +
        "}";
    }
}
