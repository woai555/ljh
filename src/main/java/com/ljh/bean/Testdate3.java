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
public class Testdate3 implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime c1;


    public LocalDateTime getC1() {
        return c1;
    }

    public void setC1(LocalDateTime c1) {
        this.c1 = c1;
    }

    @Override
    public String toString() {
        return "Testdate3{" +
        "c1=" + c1 +
        "}";
    }
}
