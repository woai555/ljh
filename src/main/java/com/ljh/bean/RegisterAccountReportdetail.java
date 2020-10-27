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
public class RegisterAccountReportdetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 操作日期
     */
    @TableId(value = "REPORTDATE", type = IdType.AUTO)
    private LocalDateTime reportdate;

    /**
     * 票据类型
     */
    private String fbilltype;

    /**
     * 收费项目名称
     */
    private String fitemname;

    /**
     * 余额
     */
    private BigDecimal fpaymoney;

    private String opercode;

    private LocalDateTime operdate;

    private String jytChannel;

    /**
     * 预交金额
     */
    private BigDecimal yjjfee;

    /**
     * 前一日预交金余额
     */
    private BigDecimal registerfee;

    /**
     * 当日收预交金
     */
    private BigDecimal yjjGain;

    /**
     * 当日返还预交金
     */
    private BigDecimal yjjBack;

    /**
     * 当日应收自负
     */
    private BigDecimal ownCost;

    /**
     * 当日返还医保
     */
    private BigDecimal backyb;

    /**
     * 当日医院应收
     */
    private BigDecimal supply;

    /**
     * 当日医院实收
     */
    private BigDecimal supplyReal;

    /**
     * 差异说明
     */
    private String remark;


    public LocalDateTime getReportdate() {
        return reportdate;
    }

    public void setReportdate(LocalDateTime reportdate) {
        this.reportdate = reportdate;
    }

    public String getFbilltype() {
        return fbilltype;
    }

    public void setFbilltype(String fbilltype) {
        this.fbilltype = fbilltype;
    }

    public String getFitemname() {
        return fitemname;
    }

    public void setFitemname(String fitemname) {
        this.fitemname = fitemname;
    }

    public BigDecimal getFpaymoney() {
        return fpaymoney;
    }

    public void setFpaymoney(BigDecimal fpaymoney) {
        this.fpaymoney = fpaymoney;
    }

    public String getOpercode() {
        return opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    public String getJytChannel() {
        return jytChannel;
    }

    public void setJytChannel(String jytChannel) {
        this.jytChannel = jytChannel;
    }

    public BigDecimal getYjjfee() {
        return yjjfee;
    }

    public void setYjjfee(BigDecimal yjjfee) {
        this.yjjfee = yjjfee;
    }

    public BigDecimal getRegisterfee() {
        return registerfee;
    }

    public void setRegisterfee(BigDecimal registerfee) {
        this.registerfee = registerfee;
    }

    public BigDecimal getYjjGain() {
        return yjjGain;
    }

    public void setYjjGain(BigDecimal yjjGain) {
        this.yjjGain = yjjGain;
    }

    public BigDecimal getYjjBack() {
        return yjjBack;
    }

    public void setYjjBack(BigDecimal yjjBack) {
        this.yjjBack = yjjBack;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public BigDecimal getBackyb() {
        return backyb;
    }

    public void setBackyb(BigDecimal backyb) {
        this.backyb = backyb;
    }

    public BigDecimal getSupply() {
        return supply;
    }

    public void setSupply(BigDecimal supply) {
        this.supply = supply;
    }

    public BigDecimal getSupplyReal() {
        return supplyReal;
    }

    public void setSupplyReal(BigDecimal supplyReal) {
        this.supplyReal = supplyReal;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "RegisterAccountReportdetail{" +
        "reportdate=" + reportdate +
        ", fbilltype=" + fbilltype +
        ", fitemname=" + fitemname +
        ", fpaymoney=" + fpaymoney +
        ", opercode=" + opercode +
        ", operdate=" + operdate +
        ", jytChannel=" + jytChannel +
        ", yjjfee=" + yjjfee +
        ", registerfee=" + registerfee +
        ", yjjGain=" + yjjGain +
        ", yjjBack=" + yjjBack +
        ", ownCost=" + ownCost +
        ", backyb=" + backyb +
        ", supply=" + supply +
        ", supplyReal=" + supplyReal +
        ", remark=" + remark +
        "}";
    }
}
