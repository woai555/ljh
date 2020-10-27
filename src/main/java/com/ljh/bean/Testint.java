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
public class Testint implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal c1;


    public BigDecimal getC1() {
        return c1;
    }

    public void setC1(BigDecimal c1) {
        this.c1 = c1;
    }

    @Override
    public String toString() {
        return "Testint{" +
        "c1=" + c1 +
        "}";
    }
}
