package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 虹桥视图导入表-已报告项目
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class VListreport implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "NDATE", type = IdType.AUTO)
    private BigDecimal ndate;

    private BigDecimal specimenno;

    private String name;

    private String patindex;

    private String patname;

    private BigDecimal code;

    private String expr1;

    private BigDecimal sampledate;

    private BigDecimal sampletime;

    private BigDecimal specerindex;

    private String other;

    private String samplename;

    private BigDecimal receivedate;

    private BigDecimal receivetime;

    private BigDecimal receiverindex;

    private String receivername;

    private BigDecimal reviewdate;

    private BigDecimal reviewtime;

    private BigDecimal reviewerindex;

    private String reportname;

    private String his;

    private String flag;


    public BigDecimal getNdate() {
        return ndate;
    }

    public void setNdate(BigDecimal ndate) {
        this.ndate = ndate;
    }

    public BigDecimal getSpecimenno() {
        return specimenno;
    }

    public void setSpecimenno(BigDecimal specimenno) {
        this.specimenno = specimenno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatindex() {
        return patindex;
    }

    public void setPatindex(String patindex) {
        this.patindex = patindex;
    }

    public String getPatname() {
        return patname;
    }

    public void setPatname(String patname) {
        this.patname = patname;
    }

    public BigDecimal getCode() {
        return code;
    }

    public void setCode(BigDecimal code) {
        this.code = code;
    }

    public String getExpr1() {
        return expr1;
    }

    public void setExpr1(String expr1) {
        this.expr1 = expr1;
    }

    public BigDecimal getSampledate() {
        return sampledate;
    }

    public void setSampledate(BigDecimal sampledate) {
        this.sampledate = sampledate;
    }

    public BigDecimal getSampletime() {
        return sampletime;
    }

    public void setSampletime(BigDecimal sampletime) {
        this.sampletime = sampletime;
    }

    public BigDecimal getSpecerindex() {
        return specerindex;
    }

    public void setSpecerindex(BigDecimal specerindex) {
        this.specerindex = specerindex;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getSamplename() {
        return samplename;
    }

    public void setSamplename(String samplename) {
        this.samplename = samplename;
    }

    public BigDecimal getReceivedate() {
        return receivedate;
    }

    public void setReceivedate(BigDecimal receivedate) {
        this.receivedate = receivedate;
    }

    public BigDecimal getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(BigDecimal receivetime) {
        this.receivetime = receivetime;
    }

    public BigDecimal getReceiverindex() {
        return receiverindex;
    }

    public void setReceiverindex(BigDecimal receiverindex) {
        this.receiverindex = receiverindex;
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    public BigDecimal getReviewdate() {
        return reviewdate;
    }

    public void setReviewdate(BigDecimal reviewdate) {
        this.reviewdate = reviewdate;
    }

    public BigDecimal getReviewtime() {
        return reviewtime;
    }

    public void setReviewtime(BigDecimal reviewtime) {
        this.reviewtime = reviewtime;
    }

    public BigDecimal getReviewerindex() {
        return reviewerindex;
    }

    public void setReviewerindex(BigDecimal reviewerindex) {
        this.reviewerindex = reviewerindex;
    }

    public String getReportname() {
        return reportname;
    }

    public void setReportname(String reportname) {
        this.reportname = reportname;
    }

    public String getHis() {
        return his;
    }

    public void setHis(String his) {
        this.his = his;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "VListreport{" +
        "ndate=" + ndate +
        ", specimenno=" + specimenno +
        ", name=" + name +
        ", patindex=" + patindex +
        ", patname=" + patname +
        ", code=" + code +
        ", expr1=" + expr1 +
        ", sampledate=" + sampledate +
        ", sampletime=" + sampletime +
        ", specerindex=" + specerindex +
        ", other=" + other +
        ", samplename=" + samplename +
        ", receivedate=" + receivedate +
        ", receivetime=" + receivetime +
        ", receiverindex=" + receiverindex +
        ", receivername=" + receivername +
        ", reviewdate=" + reviewdate +
        ", reviewtime=" + reviewtime +
        ", reviewerindex=" + reviewerindex +
        ", reportname=" + reportname +
        ", his=" + his +
        ", flag=" + flag +
        "}";
    }
}
