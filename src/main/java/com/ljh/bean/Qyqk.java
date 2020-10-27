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
public class Qyqk implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 机构名称
     */
    private String jgmc;

    /**
     * 总人数
     */
    private BigDecimal zrs;

    /**
     * 重点人群数
     */
    private BigDecimal zdrq;

    /**
     * 全人群签约数
     */
    private BigDecimal zrsqy;

    /**
     * 重点人群签约数
     */
    private BigDecimal zdrqqy;

    /**
     * 高血压签约
     */
    private BigDecimal gxyqy;

    /**
     * 糖尿病签约
     */
    private BigDecimal tnbqy;

    /**
     * 老年人签约
     */
    private BigDecimal lnrqy;

    /**
     * 重性精神病签约
     */
    private BigDecimal jszaqy;

    private BigDecimal cjrqyl;

    private BigDecimal etqyl;

    private BigDecimal ycfqyl;

    private BigDecimal jsjtqyl;

    private BigDecimal fjhqyl;

    private BigDecimal pkrkqyl;

    private BigDecimal ljrqqyl;

    private BigDecimal qyldf;

    private BigDecimal ljzdrqqyl;

    private BigDecimal zdrqqyldf;

    private BigDecimal gxyhzqyl;

    private BigDecimal gxyhzqydf;

    private BigDecimal tnbhzqyl;

    private BigDecimal tnbhzqydf;

    private BigDecimal lnrqyl;

    private BigDecimal lnrqyldf;

    private BigDecimal jszaqyl;

    private BigDecimal jszaqyldf;

    private BigDecimal cjrqyldf;

    private BigDecimal etqyldf;

    private BigDecimal ycfqyldf;

    private BigDecimal jsjtqyldf;

    private BigDecimal fjhqyldf;

    private BigDecimal pkrkqyldf;

    private BigDecimal zf;

    private BigDecimal lnrds;

    private BigDecimal jszads;

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

    public BigDecimal getZrs() {
        return zrs;
    }

    public void setZrs(BigDecimal zrs) {
        this.zrs = zrs;
    }

    public BigDecimal getZdrq() {
        return zdrq;
    }

    public void setZdrq(BigDecimal zdrq) {
        this.zdrq = zdrq;
    }

    public BigDecimal getZrsqy() {
        return zrsqy;
    }

    public void setZrsqy(BigDecimal zrsqy) {
        this.zrsqy = zrsqy;
    }

    public BigDecimal getZdrqqy() {
        return zdrqqy;
    }

    public void setZdrqqy(BigDecimal zdrqqy) {
        this.zdrqqy = zdrqqy;
    }

    public BigDecimal getGxyqy() {
        return gxyqy;
    }

    public void setGxyqy(BigDecimal gxyqy) {
        this.gxyqy = gxyqy;
    }

    public BigDecimal getTnbqy() {
        return tnbqy;
    }

    public void setTnbqy(BigDecimal tnbqy) {
        this.tnbqy = tnbqy;
    }

    public BigDecimal getLnrqy() {
        return lnrqy;
    }

    public void setLnrqy(BigDecimal lnrqy) {
        this.lnrqy = lnrqy;
    }

    public BigDecimal getJszaqy() {
        return jszaqy;
    }

    public void setJszaqy(BigDecimal jszaqy) {
        this.jszaqy = jszaqy;
    }

    public BigDecimal getCjrqyl() {
        return cjrqyl;
    }

    public void setCjrqyl(BigDecimal cjrqyl) {
        this.cjrqyl = cjrqyl;
    }

    public BigDecimal getEtqyl() {
        return etqyl;
    }

    public void setEtqyl(BigDecimal etqyl) {
        this.etqyl = etqyl;
    }

    public BigDecimal getYcfqyl() {
        return ycfqyl;
    }

    public void setYcfqyl(BigDecimal ycfqyl) {
        this.ycfqyl = ycfqyl;
    }

    public BigDecimal getJsjtqyl() {
        return jsjtqyl;
    }

    public void setJsjtqyl(BigDecimal jsjtqyl) {
        this.jsjtqyl = jsjtqyl;
    }

    public BigDecimal getFjhqyl() {
        return fjhqyl;
    }

    public void setFjhqyl(BigDecimal fjhqyl) {
        this.fjhqyl = fjhqyl;
    }

    public BigDecimal getPkrkqyl() {
        return pkrkqyl;
    }

    public void setPkrkqyl(BigDecimal pkrkqyl) {
        this.pkrkqyl = pkrkqyl;
    }

    public BigDecimal getLjrqqyl() {
        return ljrqqyl;
    }

    public void setLjrqqyl(BigDecimal ljrqqyl) {
        this.ljrqqyl = ljrqqyl;
    }

    public BigDecimal getQyldf() {
        return qyldf;
    }

    public void setQyldf(BigDecimal qyldf) {
        this.qyldf = qyldf;
    }

    public BigDecimal getLjzdrqqyl() {
        return ljzdrqqyl;
    }

    public void setLjzdrqqyl(BigDecimal ljzdrqqyl) {
        this.ljzdrqqyl = ljzdrqqyl;
    }

    public BigDecimal getZdrqqyldf() {
        return zdrqqyldf;
    }

    public void setZdrqqyldf(BigDecimal zdrqqyldf) {
        this.zdrqqyldf = zdrqqyldf;
    }

    public BigDecimal getGxyhzqyl() {
        return gxyhzqyl;
    }

    public void setGxyhzqyl(BigDecimal gxyhzqyl) {
        this.gxyhzqyl = gxyhzqyl;
    }

    public BigDecimal getGxyhzqydf() {
        return gxyhzqydf;
    }

    public void setGxyhzqydf(BigDecimal gxyhzqydf) {
        this.gxyhzqydf = gxyhzqydf;
    }

    public BigDecimal getTnbhzqyl() {
        return tnbhzqyl;
    }

    public void setTnbhzqyl(BigDecimal tnbhzqyl) {
        this.tnbhzqyl = tnbhzqyl;
    }

    public BigDecimal getTnbhzqydf() {
        return tnbhzqydf;
    }

    public void setTnbhzqydf(BigDecimal tnbhzqydf) {
        this.tnbhzqydf = tnbhzqydf;
    }

    public BigDecimal getLnrqyl() {
        return lnrqyl;
    }

    public void setLnrqyl(BigDecimal lnrqyl) {
        this.lnrqyl = lnrqyl;
    }

    public BigDecimal getLnrqyldf() {
        return lnrqyldf;
    }

    public void setLnrqyldf(BigDecimal lnrqyldf) {
        this.lnrqyldf = lnrqyldf;
    }

    public BigDecimal getJszaqyl() {
        return jszaqyl;
    }

    public void setJszaqyl(BigDecimal jszaqyl) {
        this.jszaqyl = jszaqyl;
    }

    public BigDecimal getJszaqyldf() {
        return jszaqyldf;
    }

    public void setJszaqyldf(BigDecimal jszaqyldf) {
        this.jszaqyldf = jszaqyldf;
    }

    public BigDecimal getCjrqyldf() {
        return cjrqyldf;
    }

    public void setCjrqyldf(BigDecimal cjrqyldf) {
        this.cjrqyldf = cjrqyldf;
    }

    public BigDecimal getEtqyldf() {
        return etqyldf;
    }

    public void setEtqyldf(BigDecimal etqyldf) {
        this.etqyldf = etqyldf;
    }

    public BigDecimal getYcfqyldf() {
        return ycfqyldf;
    }

    public void setYcfqyldf(BigDecimal ycfqyldf) {
        this.ycfqyldf = ycfqyldf;
    }

    public BigDecimal getJsjtqyldf() {
        return jsjtqyldf;
    }

    public void setJsjtqyldf(BigDecimal jsjtqyldf) {
        this.jsjtqyldf = jsjtqyldf;
    }

    public BigDecimal getFjhqyldf() {
        return fjhqyldf;
    }

    public void setFjhqyldf(BigDecimal fjhqyldf) {
        this.fjhqyldf = fjhqyldf;
    }

    public BigDecimal getPkrkqyldf() {
        return pkrkqyldf;
    }

    public void setPkrkqyldf(BigDecimal pkrkqyldf) {
        this.pkrkqyldf = pkrkqyldf;
    }

    public BigDecimal getZf() {
        return zf;
    }

    public void setZf(BigDecimal zf) {
        this.zf = zf;
    }

    public BigDecimal getLnrds() {
        return lnrds;
    }

    public void setLnrds(BigDecimal lnrds) {
        this.lnrds = lnrds;
    }

    public BigDecimal getJszads() {
        return jszads;
    }

    public void setJszads(BigDecimal jszads) {
        this.jszads = jszads;
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
        return "Qyqk{" +
        "jgmc=" + jgmc +
        ", zrs=" + zrs +
        ", zdrq=" + zdrq +
        ", zrsqy=" + zrsqy +
        ", zdrqqy=" + zdrqqy +
        ", gxyqy=" + gxyqy +
        ", tnbqy=" + tnbqy +
        ", lnrqy=" + lnrqy +
        ", jszaqy=" + jszaqy +
        ", cjrqyl=" + cjrqyl +
        ", etqyl=" + etqyl +
        ", ycfqyl=" + ycfqyl +
        ", jsjtqyl=" + jsjtqyl +
        ", fjhqyl=" + fjhqyl +
        ", pkrkqyl=" + pkrkqyl +
        ", ljrqqyl=" + ljrqqyl +
        ", qyldf=" + qyldf +
        ", ljzdrqqyl=" + ljzdrqqyl +
        ", zdrqqyldf=" + zdrqqyldf +
        ", gxyhzqyl=" + gxyhzqyl +
        ", gxyhzqydf=" + gxyhzqydf +
        ", tnbhzqyl=" + tnbhzqyl +
        ", tnbhzqydf=" + tnbhzqydf +
        ", lnrqyl=" + lnrqyl +
        ", lnrqyldf=" + lnrqyldf +
        ", jszaqyl=" + jszaqyl +
        ", jszaqyldf=" + jszaqyldf +
        ", cjrqyldf=" + cjrqyldf +
        ", etqyldf=" + etqyldf +
        ", ycfqyldf=" + ycfqyldf +
        ", jsjtqyldf=" + jsjtqyldf +
        ", fjhqyldf=" + fjhqyldf +
        ", pkrkqyldf=" + pkrkqyldf +
        ", zf=" + zf +
        ", lnrds=" + lnrds +
        ", jszads=" + jszads +
        ", staticDate=" + staticDate +
        ", uploadDate=" + uploadDate +
        ", qysj=" + qysj +
        ", tdmc=" + tdmc +
        "}";
    }
}
