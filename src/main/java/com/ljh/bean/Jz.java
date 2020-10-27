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
public class Jz implements Serializable {

    private static final long serialVersionUID=1L;

    private String dm;


    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    @Override
    public String toString() {
        return "Jz{" +
        "dm=" + dm +
        "}";
    }
}
