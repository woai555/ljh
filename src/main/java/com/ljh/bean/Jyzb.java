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
public class Jyzb implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 机构名称
     */
    private String jgmc;

    /**
     * 基药品种数
     */
    private BigDecimal jypzs;

    /**
     * 总品种数
     */
    private BigDecimal pzs;

    /**
     * 基药订购金额
     */
    private BigDecimal jydgje;

    /**
     * 订购金额
     */
    private BigDecimal dgje;

    /**
     * 基药订购占比
     */
    private BigDecimal jycgjeb;

    /**
     * 评分
     */
    private BigDecimal jycgjebdf;

    /**
     * 申请统计绩效时间
     */
    @TableId(value = "STATIC_DATE", type = IdType.AUTO)
    private LocalDateTime staticDate;

    /**
     * 上传时间
     */
    private LocalDateTime uploadDate;

    /**
     * 签约时间
     */
    private LocalDateTime qysj;

    /**
     * 团队名称
     */
    private String tdmc;


    public String getJgmc() {
        return jgmc;
    }

    public void setJgmc(String jgmc) {
        this.jgmc = jgmc;
    }

    public BigDecimal getJypzs() {
        return jypzs;
    }

    public void setJypzs(BigDecimal jypzs) {
        this.jypzs = jypzs;
    }

    public BigDecimal getPzs() {
        return pzs;
    }

    public void setPzs(BigDecimal pzs) {
        this.pzs = pzs;
    }

    public BigDecimal getJydgje() {
        return jydgje;
    }

    public void setJydgje(BigDecimal jydgje) {
        this.jydgje = jydgje;
    }

    public BigDecimal getDgje() {
        return dgje;
    }

    public void setDgje(BigDecimal dgje) {
        this.dgje = dgje;
    }

    public BigDecimal getJycgjeb() {
        return jycgjeb;
    }

    public void setJycgjeb(BigDecimal jycgjeb) {
        this.jycgjeb = jycgjeb;
    }

    public BigDecimal getJycgjebdf() {
        return jycgjebdf;
    }

    public void setJycgjebdf(BigDecimal jycgjebdf) {
        this.jycgjebdf = jycgjebdf;
    }

    public LocalDateTime getStaticDate() {
        return staticDate;
    }

    public void setStaticDate(LocalDateTime staticDate) {
        this.staticDate = staticDate;
    }

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }

    public LocalDateTime getQysj() {
        return qysj;
    }

    public void setQysj(LocalDateTime qysj) {
        this.qysj = qysj;
    }

    public String getTdmc() {
        return tdmc;
    }

    public void setTdmc(String tdmc) {
        this.tdmc = tdmc;
    }

    @Override
    public String toString() {
        return "Jyzb{" +
        "jgmc=" + jgmc +
        ", jypzs=" + jypzs +
        ", pzs=" + pzs +
        ", jydgje=" + jydgje +
        ", dgje=" + dgje +
        ", jycgjeb=" + jycgjeb +
        ", jycgjebdf=" + jycgjebdf +
        ", staticDate=" + staticDate +
        ", uploadDate=" + uploadDate +
        ", qysj=" + qysj +
        ", tdmc=" + tdmc +
        "}";
    }
}
