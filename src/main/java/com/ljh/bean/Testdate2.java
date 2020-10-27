package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class Testdate2 implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime c1;

    private LocalDateTime c2;


    public LocalDateTime getC1() {
        return c1;
    }

    public void setC1(LocalDateTime c1) {
        this.c1 = c1;
    }

    public LocalDateTime getC2() {
        return c2;
    }

    public void setC2(LocalDateTime c2) {
        this.c2 = c2;
    }

    @Override
    public String toString() {
        return "Testdate2{" +
        "c1=" + c1 +
        ", c2=" + c2 +
        "}";
    }
}
