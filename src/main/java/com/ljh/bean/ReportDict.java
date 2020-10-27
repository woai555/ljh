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
public class ReportDict implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 隶属中心
     */
    private String sszx;

    /**
     * 机构名称
     */
    private String jgmc;

    /**
     * 团队名称
     */
    private String tdmc;

    /**
     * 0不参与考核，1隶属卫生站管理2隶属中心管理
     */
    private String flag;

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
     *  签约时间
     */
    private LocalDateTime qysj;


    public String getSszx() {
        return sszx;
    }

    public void setSszx(String sszx) {
        this.sszx = sszx;
    }

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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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
        return "ReportDict{" +
        "sszx=" + sszx +
        ", jgmc=" + jgmc +
        ", tdmc=" + tdmc +
        ", flag=" + flag +
        ", staticDate=" + staticDate +
        ", uploadDate=" + uploadDate +
        ", qysj=" + qysj +
        "}";
    }
}
