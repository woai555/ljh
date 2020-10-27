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
public class ViewBookingDocsch implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime rq;

    private String xq;

    private String wubie;

    private String ysbm;

    private String ksbm;

    private String hb;

    private Integer yyxe;

    private Integer yyyg;


    public LocalDateTime getRq() {
        return rq;
    }

    public void setRq(LocalDateTime rq) {
        this.rq = rq;
    }

    public String getXq() {
        return xq;
    }

    public void setXq(String xq) {
        this.xq = xq;
    }

    public String getWubie() {
        return wubie;
    }

    public void setWubie(String wubie) {
        this.wubie = wubie;
    }

    public String getYsbm() {
        return ysbm;
    }

    public void setYsbm(String ysbm) {
        this.ysbm = ysbm;
    }

    public String getKsbm() {
        return ksbm;
    }

    public void setKsbm(String ksbm) {
        this.ksbm = ksbm;
    }

    public String getHb() {
        return hb;
    }

    public void setHb(String hb) {
        this.hb = hb;
    }

    public Integer getYyxe() {
        return yyxe;
    }

    public void setYyxe(Integer yyxe) {
        this.yyxe = yyxe;
    }

    public Integer getYyyg() {
        return yyyg;
    }

    public void setYyyg(Integer yyyg) {
        this.yyyg = yyyg;
    }

    @Override
    public String toString() {
        return "ViewBookingDocsch{" +
        "rq=" + rq +
        ", xq=" + xq +
        ", wubie=" + wubie +
        ", ysbm=" + ysbm +
        ", ksbm=" + ksbm +
        ", hb=" + hb +
        ", yyxe=" + yyxe +
        ", yyyg=" + yyyg +
        "}";
    }
}
