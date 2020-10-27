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
public class ViewBookingDocinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String ysbm;

    private String ysxm;

    private String pym;

    private String ysxb;


    public String getYsbm() {
        return ysbm;
    }

    public void setYsbm(String ysbm) {
        this.ysbm = ysbm;
    }

    public String getYsxm() {
        return ysxm;
    }

    public void setYsxm(String ysxm) {
        this.ysxm = ysxm;
    }

    public String getPym() {
        return pym;
    }

    public void setPym(String pym) {
        this.pym = pym;
    }

    public String getYsxb() {
        return ysxb;
    }

    public void setYsxb(String ysxb) {
        this.ysxb = ysxb;
    }

    @Override
    public String toString() {
        return "ViewBookingDocinfo{" +
        "ysbm=" + ysbm +
        ", ysxm=" + ysxm +
        ", pym=" + pym +
        ", ysxb=" + ysxb +
        "}";
    }
}
