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
public class Tsyby implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 机构名称
     */
    private String jgmc;

    /**
     * 团队名称
     */
    private String tdmc;

    /**
     * 团队长姓名
     */
    private String tdzxm;

    /**
     * 医生
     */
    private String yisheng;

    /**
     * 药剂师
     */
    private String yaojishi;

    /**
     * 护士
     */
    private String hushi;

    /**
     * 防保人员
     */
    private String fangbao;

    /**
     * 表扬
     */
    private BigDecimal biaoy;

    /**
     * 投诉
     */
    private BigDecimal ts;

    private BigDecimal tsyby;

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


    public String getJgmc() {
        return jgmc;
    }

    public void setJgmc(String jgmc) {
        this.jgmc = jgmc;
    }

    public String getTdmc() {
        return tdmc;
    }

    public void setTdmc(String tdmc) {
        this.tdmc = tdmc;
    }

    public String getTdzxm() {
        return tdzxm;
    }

    public void setTdzxm(String tdzxm) {
        this.tdzxm = tdzxm;
    }

    public String getYisheng() {
        return yisheng;
    }

    public void setYisheng(String yisheng) {
        this.yisheng = yisheng;
    }

    public String getYaojishi() {
        return yaojishi;
    }

    public void setYaojishi(String yaojishi) {
        this.yaojishi = yaojishi;
    }

    public String getHushi() {
        return hushi;
    }

    public void setHushi(String hushi) {
        this.hushi = hushi;
    }

    public String getFangbao() {
        return fangbao;
    }

    public void setFangbao(String fangbao) {
        this.fangbao = fangbao;
    }

    public BigDecimal getBiaoy() {
        return biaoy;
    }

    public void setBiaoy(BigDecimal biaoy) {
        this.biaoy = biaoy;
    }

    public BigDecimal getTs() {
        return ts;
    }

    public void setTs(BigDecimal ts) {
        this.ts = ts;
    }

    public BigDecimal getTsyby() {
        return tsyby;
    }

    public void setTsyby(BigDecimal tsyby) {
        this.tsyby = tsyby;
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

    @Override
    public String toString() {
        return "Tsyby{" +
        "jgmc=" + jgmc +
        ", tdmc=" + tdmc +
        ", tdzxm=" + tdzxm +
        ", yisheng=" + yisheng +
        ", yaojishi=" + yaojishi +
        ", hushi=" + hushi +
        ", fangbao=" + fangbao +
        ", biaoy=" + biaoy +
        ", ts=" + ts +
        ", tsyby=" + tsyby +
        ", staticDate=" + staticDate +
        ", uploadDate=" + uploadDate +
        ", qysj=" + qysj +
        "}";
    }
}
