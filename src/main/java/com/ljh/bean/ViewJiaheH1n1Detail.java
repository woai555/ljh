package com.ljh.bean;

import java.math.BigDecimal;
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
public class ViewJiaheH1n1Detail implements Serializable {

    private static final long serialVersionUID=1L;

    private String p7501;

    private String p7502;

    private String p7506;

    private String p7500;

    private String p8016;

    private String p8017;

    private BigDecimal p8018;

    private BigDecimal p8019;

    private String p8020;

    private String p8021;

    private String p8022;

    private LocalDateTime seeDate;


    public String getP7501() {
        return p7501;
    }

    public void setP7501(String p7501) {
        this.p7501 = p7501;
    }

    public String getP7502() {
        return p7502;
    }

    public void setP7502(String p7502) {
        this.p7502 = p7502;
    }

    public String getP7506() {
        return p7506;
    }

    public void setP7506(String p7506) {
        this.p7506 = p7506;
    }

    public String getP7500() {
        return p7500;
    }

    public void setP7500(String p7500) {
        this.p7500 = p7500;
    }

    public String getP8016() {
        return p8016;
    }

    public void setP8016(String p8016) {
        this.p8016 = p8016;
    }

    public String getP8017() {
        return p8017;
    }

    public void setP8017(String p8017) {
        this.p8017 = p8017;
    }

    public BigDecimal getP8018() {
        return p8018;
    }

    public void setP8018(BigDecimal p8018) {
        this.p8018 = p8018;
    }

    public BigDecimal getP8019() {
        return p8019;
    }

    public void setP8019(BigDecimal p8019) {
        this.p8019 = p8019;
    }

    public String getP8020() {
        return p8020;
    }

    public void setP8020(String p8020) {
        this.p8020 = p8020;
    }

    public String getP8021() {
        return p8021;
    }

    public void setP8021(String p8021) {
        this.p8021 = p8021;
    }

    public String getP8022() {
        return p8022;
    }

    public void setP8022(String p8022) {
        this.p8022 = p8022;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    @Override
    public String toString() {
        return "ViewJiaheH1n1Detail{" +
        "p7501=" + p7501 +
        ", p7502=" + p7502 +
        ", p7506=" + p7506 +
        ", p7500=" + p7500 +
        ", p8016=" + p8016 +
        ", p8017=" + p8017 +
        ", p8018=" + p8018 +
        ", p8019=" + p8019 +
        ", p8020=" + p8020 +
        ", p8021=" + p8021 +
        ", p8022=" + p8022 +
        ", seeDate=" + seeDate +
        "}";
    }
}
