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
public class ViewHzyhPatientinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String brid;

    private String brxm;

    private String sfzh;

    private String brxb;

    private LocalDateTime csrq;

    private String lxdh;

    private String jtzz;

    private String lxfs;

    private String brlx;


    public String getBrid() {
        return brid;
    }

    public void setBrid(String brid) {
        this.brid = brid;
    }

    public String getBrxm() {
        return brxm;
    }

    public void setBrxm(String brxm) {
        this.brxm = brxm;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getBrxb() {
        return brxb;
    }

    public void setBrxb(String brxb) {
        this.brxb = brxb;
    }

    public LocalDateTime getCsrq() {
        return csrq;
    }

    public void setCsrq(LocalDateTime csrq) {
        this.csrq = csrq;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getJtzz() {
        return jtzz;
    }

    public void setJtzz(String jtzz) {
        this.jtzz = jtzz;
    }

    public String getLxfs() {
        return lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs;
    }

    public String getBrlx() {
        return brlx;
    }

    public void setBrlx(String brlx) {
        this.brlx = brlx;
    }

    @Override
    public String toString() {
        return "ViewHzyhPatientinfo{" +
        "brid=" + brid +
        ", brxm=" + brxm +
        ", sfzh=" + sfzh +
        ", brxb=" + brxb +
        ", csrq=" + csrq +
        ", lxdh=" + lxdh +
        ", jtzz=" + jtzz +
        ", lxfs=" + lxfs +
        ", brlx=" + brlx +
        "}";
    }
}
