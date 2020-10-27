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
public class LTest implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer a;

    private Integer b;

    private Integer d;


    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "LTest{" +
        "a=" + a +
        ", b=" + b +
        ", d=" + d +
        "}";
    }
}
