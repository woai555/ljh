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
public class Swz2 implements Serializable {

    private static final long serialVersionUID=1L;

    private String regno;


    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    @Override
    public String toString() {
        return "Swz2{" +
        "regno=" + regno +
        "}";
    }
}
