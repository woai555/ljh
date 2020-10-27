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
public class PymDmb implements Serializable {

    private static final long serialVersionUID=1L;

    private String mc;

    private String dm;


    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    @Override
    public String toString() {
        return "PymDmb{" +
        "mc=" + mc +
        ", dm=" + dm +
        "}";
    }
}
