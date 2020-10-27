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
public class ViewHzyhCfxx implements Serializable {

    private static final long serialVersionUID=1L;

    private String cfhm;

    private String brid;

    private String kfysxm;

    private String kfksdm;

    private String kfksmc;

    private LocalDateTime kfsj;

    private String zdmc;


    public String getCfhm() {
        return cfhm;
    }

    public void setCfhm(String cfhm) {
        this.cfhm = cfhm;
    }

    public String getBrid() {
        return brid;
    }

    public void setBrid(String brid) {
        this.brid = brid;
    }

    public String getKfysxm() {
        return kfysxm;
    }

    public void setKfysxm(String kfysxm) {
        this.kfysxm = kfysxm;
    }

    public String getKfksdm() {
        return kfksdm;
    }

    public void setKfksdm(String kfksdm) {
        this.kfksdm = kfksdm;
    }

    public String getKfksmc() {
        return kfksmc;
    }

    public void setKfksmc(String kfksmc) {
        this.kfksmc = kfksmc;
    }

    public LocalDateTime getKfsj() {
        return kfsj;
    }

    public void setKfsj(LocalDateTime kfsj) {
        this.kfsj = kfsj;
    }

    public String getZdmc() {
        return zdmc;
    }

    public void setZdmc(String zdmc) {
        this.zdmc = zdmc;
    }

    @Override
    public String toString() {
        return "ViewHzyhCfxx{" +
        "cfhm=" + cfhm +
        ", brid=" + brid +
        ", kfysxm=" + kfysxm +
        ", kfksdm=" + kfksdm +
        ", kfksmc=" + kfksmc +
        ", kfsj=" + kfsj +
        ", zdmc=" + zdmc +
        "}";
    }
}
