package com.ljh.bean;

import java.math.BigDecimal;
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
public class MrmsReportDict implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 报表编号
     */
    @TableId(value = "RPT_ID", type = IdType.AUTO)
    private String rptId;

    /**
     * 报表子项编号
     */
    private String rptSubid;

    /**
     * 子项编号序号
     */
    private BigDecimal rptSidnum;

    /**
     * 报表名称
     */
    private String rptName;

    /**
     * 报表子项名称
     */
    private String rptSubname;

    /**
     * ICD编码开始范围
     */
    private String icdBegin;

    /**
     * ICD编码结束范围
     */
    private String icdEnd;


    public String getRptId() {
        return rptId;
    }

    public void setRptId(String rptId) {
        this.rptId = rptId;
    }

    public String getRptSubid() {
        return rptSubid;
    }

    public void setRptSubid(String rptSubid) {
        this.rptSubid = rptSubid;
    }

    public BigDecimal getRptSidnum() {
        return rptSidnum;
    }

    public void setRptSidnum(BigDecimal rptSidnum) {
        this.rptSidnum = rptSidnum;
    }

    public String getRptName() {
        return rptName;
    }

    public void setRptName(String rptName) {
        this.rptName = rptName;
    }

    public String getRptSubname() {
        return rptSubname;
    }

    public void setRptSubname(String rptSubname) {
        this.rptSubname = rptSubname;
    }

    public String getIcdBegin() {
        return icdBegin;
    }

    public void setIcdBegin(String icdBegin) {
        this.icdBegin = icdBegin;
    }

    public String getIcdEnd() {
        return icdEnd;
    }

    public void setIcdEnd(String icdEnd) {
        this.icdEnd = icdEnd;
    }

    @Override
    public String toString() {
        return "MrmsReportDict{" +
        "rptId=" + rptId +
        ", rptSubid=" + rptSubid +
        ", rptSidnum=" + rptSidnum +
        ", rptName=" + rptName +
        ", rptSubname=" + rptSubname +
        ", icdBegin=" + icdBegin +
        ", icdEnd=" + icdEnd +
        "}";
    }
}
