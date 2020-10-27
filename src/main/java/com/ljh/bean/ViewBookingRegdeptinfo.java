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
public class ViewBookingRegdeptinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String ksbm;

    private String kemc;

    private String kspym;


    public String getKsbm() {
        return ksbm;
    }

    public void setKsbm(String ksbm) {
        this.ksbm = ksbm;
    }

    public String getKemc() {
        return kemc;
    }

    public void setKemc(String kemc) {
        this.kemc = kemc;
    }

    public String getKspym() {
        return kspym;
    }

    public void setKspym(String kspym) {
        this.kspym = kspym;
    }

    @Override
    public String toString() {
        return "ViewBookingRegdeptinfo{" +
        "ksbm=" + ksbm +
        ", kemc=" + kemc +
        ", kspym=" + kspym +
        "}";
    }
}
