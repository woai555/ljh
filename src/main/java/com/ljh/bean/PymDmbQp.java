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
public class PymDmbQp implements Serializable {

    private static final long serialVersionUID=1L;

    private String hz;

    private String py;

    private String wb;

    private String qw;


    public String getHz() {
        return hz;
    }

    public void setHz(String hz) {
        this.hz = hz;
    }

    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py;
    }

    public String getWb() {
        return wb;
    }

    public void setWb(String wb) {
        this.wb = wb;
    }

    public String getQw() {
        return qw;
    }

    public void setQw(String qw) {
        this.qw = qw;
    }

    @Override
    public String toString() {
        return "PymDmbQp{" +
        "hz=" + hz +
        ", py=" + py +
        ", wb=" + wb +
        ", qw=" + qw +
        "}";
    }
}
