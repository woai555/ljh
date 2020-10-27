package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 结算类别表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPaykind implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 结算类别号
     */
    @TableId(value = "PAYKIND_CODE", type = IdType.AUTO)
    private String paykindCode;

    /**
     * 结算类别名称
     */
    private String paykindName;

    /**
     * 药品加成比率
     */
    private BigDecimal mediRate;

    /**
     * 非药品加成比率
     */
    private BigDecimal othersRate;

    /**
     * 公费标记
     */
    private String ynpubfee;

    /**
     * 处方限额
     */
    private Integer prescriptLmt;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 1,可以,0,不可以
     */
    private String babyShare;

    /**
     * 备注
     */
    private String remark;

    /**
     * 标签
     */
    private String label;

    /**
     * 1停用
     */
    private String stopFlag;

    /**
     * 排序序号
     */
    private Integer sortid;


    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getPaykindName() {
        return paykindName;
    }

    public void setPaykindName(String paykindName) {
        this.paykindName = paykindName;
    }

    public BigDecimal getMediRate() {
        return mediRate;
    }

    public void setMediRate(BigDecimal mediRate) {
        this.mediRate = mediRate;
    }

    public BigDecimal getOthersRate() {
        return othersRate;
    }

    public void setOthersRate(BigDecimal othersRate) {
        this.othersRate = othersRate;
    }

    public String getYnpubfee() {
        return ynpubfee;
    }

    public void setYnpubfee(String ynpubfee) {
        this.ynpubfee = ynpubfee;
    }

    public Integer getPrescriptLmt() {
        return prescriptLmt;
    }

    public void setPrescriptLmt(Integer prescriptLmt) {
        this.prescriptLmt = prescriptLmt;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getBabyShare() {
        return babyShare;
    }

    public void setBabyShare(String babyShare) {
        this.babyShare = babyShare;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getStopFlag() {
        return stopFlag;
    }

    public void setStopFlag(String stopFlag) {
        this.stopFlag = stopFlag;
    }

    public Integer getSortid() {
        return sortid;
    }

    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }

    @Override
    public String toString() {
        return "RPaykind{" +
        "paykindCode=" + paykindCode +
        ", paykindName=" + paykindName +
        ", mediRate=" + mediRate +
        ", othersRate=" + othersRate +
        ", ynpubfee=" + ynpubfee +
        ", prescriptLmt=" + prescriptLmt +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", babyShare=" + babyShare +
        ", remark=" + remark +
        ", label=" + label +
        ", stopFlag=" + stopFlag +
        ", sortid=" + sortid +
        "}";
    }
}
