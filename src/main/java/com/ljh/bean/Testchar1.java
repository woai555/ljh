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
public class Testchar1 implements Serializable {

    private static final long serialVersionUID=1L;

    private String c1;


    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    @Override
    public String toString() {
        return "Testchar1{" +
        "c1=" + c1 +
        "}";
    }
}
