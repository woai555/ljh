package com.ljh.bean;

import java.math.BigDecimal;
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
public class ViewBookingRegfee implements Serializable {

    private static final long serialVersionUID=1L;

    private String ksbm;

    private String ghdj;

    private BigDecimal ghfy;


    public String getKsbm() {
        return ksbm;
    }

    public void setKsbm(String ksbm) {
        this.ksbm = ksbm;
    }

    public String getGhdj() {
        return ghdj;
    }

    public void setGhdj(String ghdj) {
        this.ghdj = ghdj;
    }

    public BigDecimal getGhfy() {
        return ghfy;
    }

    public void setGhfy(BigDecimal ghfy) {
        this.ghfy = ghfy;
    }

    @Override
    public String toString() {
        return "ViewBookingRegfee{" +
        "ksbm=" + ksbm +
        ", ghdj=" + ghdj +
        ", ghfy=" + ghfy +
        "}";
    }
}
