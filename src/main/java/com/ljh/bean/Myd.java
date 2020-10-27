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
public class Myd implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 团队名称
     */
    private String tdmc;

    /**
     * 2019年考核指标  ：服务获得感
     */
    private BigDecimal fwhdg;

    /**
     * 家庭医生尽职尽责（履约满意度）
     */
    private BigDecimal lymyd;

    /**
     * 续签意愿
     */
    private BigDecimal xqyy;

    /**
     *  2019年考核指标 ：签约居民满意度
     */
    private BigDecimal qyjmmyd;

    /**
     * 对预约就诊的时间满意
     */
    private BigDecimal yyjzmyd;

    private BigDecimal fwhdgdf;

    /**
     * 2019年考核指标 ：服务获得感得分
     */
    private BigDecimal lymyddf;

    /**
     * 2019年考核指标 ：签约居民满意度得分
     */
    private BigDecimal qyjmmyddf;

    private BigDecimal yyjzmyddf;

    /**
     * 满意度总分
     */
    private BigDecimal mydzf;

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
     * 机构名称
     */
    private String jgmc;

    /**
     * 居民对家庭医生签约服务认知度
     */
    private BigDecimal qyfwrzd;

    /**
     * 居民对家庭医生签约服务认知度得分
     */
    private BigDecimal qyfwrzddf;

    /**
     * 家庭医生团队满意度
     */
    private BigDecimal jtystdmyd;

    /**
     * 家庭医生团队满意度得分
     */
    private BigDecimal jtystdmyddf;


    public String getTdmc() {
        return tdmc;
    }

    public void setTdmc(String tdmc) {
        this.tdmc = tdmc;
    }

    public BigDecimal getFwhdg() {
        return fwhdg;
    }

    public void setFwhdg(BigDecimal fwhdg) {
        this.fwhdg = fwhdg;
    }

    public BigDecimal getLymyd() {
        return lymyd;
    }

    public void setLymyd(BigDecimal lymyd) {
        this.lymyd = lymyd;
    }

    public BigDecimal getXqyy() {
        return xqyy;
    }

    public void setXqyy(BigDecimal xqyy) {
        this.xqyy = xqyy;
    }

    public BigDecimal getQyjmmyd() {
        return qyjmmyd;
    }

    public void setQyjmmyd(BigDecimal qyjmmyd) {
        this.qyjmmyd = qyjmmyd;
    }

    public BigDecimal getYyjzmyd() {
        return yyjzmyd;
    }

    public void setYyjzmyd(BigDecimal yyjzmyd) {
        this.yyjzmyd = yyjzmyd;
    }

    public BigDecimal getFwhdgdf() {
        return fwhdgdf;
    }

    public void setFwhdgdf(BigDecimal fwhdgdf) {
        this.fwhdgdf = fwhdgdf;
    }

    public BigDecimal getLymyddf() {
        return lymyddf;
    }

    public void setLymyddf(BigDecimal lymyddf) {
        this.lymyddf = lymyddf;
    }

    public BigDecimal getQyjmmyddf() {
        return qyjmmyddf;
    }

    public void setQyjmmyddf(BigDecimal qyjmmyddf) {
        this.qyjmmyddf = qyjmmyddf;
    }

    public BigDecimal getYyjzmyddf() {
        return yyjzmyddf;
    }

    public void setYyjzmyddf(BigDecimal yyjzmyddf) {
        this.yyjzmyddf = yyjzmyddf;
    }

    public BigDecimal getMydzf() {
        return mydzf;
    }

    public void setMydzf(BigDecimal mydzf) {
        this.mydzf = mydzf;
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

    public String getJgmc() {
        return jgmc;
    }

    public void setJgmc(String jgmc) {
        this.jgmc = jgmc;
    }

    public BigDecimal getQyfwrzd() {
        return qyfwrzd;
    }

    public void setQyfwrzd(BigDecimal qyfwrzd) {
        this.qyfwrzd = qyfwrzd;
    }

    public BigDecimal getQyfwrzddf() {
        return qyfwrzddf;
    }

    public void setQyfwrzddf(BigDecimal qyfwrzddf) {
        this.qyfwrzddf = qyfwrzddf;
    }

    public BigDecimal getJtystdmyd() {
        return jtystdmyd;
    }

    public void setJtystdmyd(BigDecimal jtystdmyd) {
        this.jtystdmyd = jtystdmyd;
    }

    public BigDecimal getJtystdmyddf() {
        return jtystdmyddf;
    }

    public void setJtystdmyddf(BigDecimal jtystdmyddf) {
        this.jtystdmyddf = jtystdmyddf;
    }

    @Override
    public String toString() {
        return "Myd{" +
        "tdmc=" + tdmc +
        ", fwhdg=" + fwhdg +
        ", lymyd=" + lymyd +
        ", xqyy=" + xqyy +
        ", qyjmmyd=" + qyjmmyd +
        ", yyjzmyd=" + yyjzmyd +
        ", fwhdgdf=" + fwhdgdf +
        ", lymyddf=" + lymyddf +
        ", qyjmmyddf=" + qyjmmyddf +
        ", yyjzmyddf=" + yyjzmyddf +
        ", mydzf=" + mydzf +
        ", staticDate=" + staticDate +
        ", uploadDate=" + uploadDate +
        ", qysj=" + qysj +
        ", jgmc=" + jgmc +
        ", qyfwrzd=" + qyfwrzd +
        ", qyfwrzddf=" + qyfwrzddf +
        ", jtystdmyd=" + jtystdmyd +
        ", jtystdmyddf=" + jtystdmyddf +
        "}";
    }
}
