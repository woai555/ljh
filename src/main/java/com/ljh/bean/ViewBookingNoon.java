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
public class ViewBookingNoon implements Serializable {

    private static final long serialVersionUID=1L;

    private String wbbm;

    private String wbmc;


    public String getWbbm() {
        return wbbm;
    }

    public void setWbbm(String wbbm) {
        this.wbbm = wbbm;
    }

    public String getWbmc() {
        return wbmc;
    }

    public void setWbmc(String wbmc) {
        this.wbmc = wbmc;
    }

    @Override
    public String toString() {
        return "ViewBookingNoon{" +
        "wbbm=" + wbbm +
        ", wbmc=" + wbmc +
        "}";
    }
}
