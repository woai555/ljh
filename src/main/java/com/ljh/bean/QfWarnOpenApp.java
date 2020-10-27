package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 欠费解封申请表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class QfWarnOpenApp implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 患者姓名
     */
    private String name;

    /**
     * 住院号码
     */
    private String patientid;

    /**
     * 住院流水
     */
    @TableId(value = "INPATIENTNO", type = IdType.AUTO)
    private String inpatientno;

    /**
     * 科室名称
     */
    private String roomname;

    /**
     * 欠费金额
     */
    private BigDecimal oughtaccount;

    /**
     * 住院押金
     */
    private BigDecimal prepaycost;

    /**
     * 诊断名称
     */
    private String zhenduan;

    /**
     * 欠费类别
     */
    private String qfType;

    /**
     * 欠费原因
     */
    private String qfReason;

    /**
     * 主管医师
     */
    private String operator;

    /**
     * 申请医师
     */
    private String appDoct;

    /**
     * 复核医师
     */
    private String checkDoct;

    /**
     * 值班意见
     */
    private String views;

    /**
     * 备注
     */
    private String remark;

    /**
     * 申请日期
     */
    private LocalDateTime ldDate;

    /**
     * 复核日期
     */
    private LocalDateTime ldDateCheck;

    /**
     * 行号
     */
    private BigDecimal rowNum;

    /**
     * 标志  0-申请 1-审批
     */
    private String appBz;

    /**
     * 解封标志  1-解封  2-取消
     */
    private String appJf;

    /**
     * 主任是否同意 0-不同意 1-同意
     */
    private String masterApp;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getInpatientno() {
        return inpatientno;
    }

    public void setInpatientno(String inpatientno) {
        this.inpatientno = inpatientno;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public BigDecimal getOughtaccount() {
        return oughtaccount;
    }

    public void setOughtaccount(BigDecimal oughtaccount) {
        this.oughtaccount = oughtaccount;
    }

    public BigDecimal getPrepaycost() {
        return prepaycost;
    }

    public void setPrepaycost(BigDecimal prepaycost) {
        this.prepaycost = prepaycost;
    }

    public String getZhenduan() {
        return zhenduan;
    }

    public void setZhenduan(String zhenduan) {
        this.zhenduan = zhenduan;
    }

    public String getQfType() {
        return qfType;
    }

    public void setQfType(String qfType) {
        this.qfType = qfType;
    }

    public String getQfReason() {
        return qfReason;
    }

    public void setQfReason(String qfReason) {
        this.qfReason = qfReason;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getAppDoct() {
        return appDoct;
    }

    public void setAppDoct(String appDoct) {
        this.appDoct = appDoct;
    }

    public String getCheckDoct() {
        return checkDoct;
    }

    public void setCheckDoct(String checkDoct) {
        this.checkDoct = checkDoct;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getLdDate() {
        return ldDate;
    }

    public void setLdDate(LocalDateTime ldDate) {
        this.ldDate = ldDate;
    }

    public LocalDateTime getLdDateCheck() {
        return ldDateCheck;
    }

    public void setLdDateCheck(LocalDateTime ldDateCheck) {
        this.ldDateCheck = ldDateCheck;
    }

    public BigDecimal getRowNum() {
        return rowNum;
    }

    public void setRowNum(BigDecimal rowNum) {
        this.rowNum = rowNum;
    }

    public String getAppBz() {
        return appBz;
    }

    public void setAppBz(String appBz) {
        this.appBz = appBz;
    }

    public String getAppJf() {
        return appJf;
    }

    public void setAppJf(String appJf) {
        this.appJf = appJf;
    }

    public String getMasterApp() {
        return masterApp;
    }

    public void setMasterApp(String masterApp) {
        this.masterApp = masterApp;
    }

    @Override
    public String toString() {
        return "QfWarnOpenApp{" +
        "name=" + name +
        ", patientid=" + patientid +
        ", inpatientno=" + inpatientno +
        ", roomname=" + roomname +
        ", oughtaccount=" + oughtaccount +
        ", prepaycost=" + prepaycost +
        ", zhenduan=" + zhenduan +
        ", qfType=" + qfType +
        ", qfReason=" + qfReason +
        ", operator=" + operator +
        ", appDoct=" + appDoct +
        ", checkDoct=" + checkDoct +
        ", views=" + views +
        ", remark=" + remark +
        ", ldDate=" + ldDate +
        ", ldDateCheck=" + ldDateCheck +
        ", rowNum=" + rowNum +
        ", appBz=" + appBz +
        ", appJf=" + appJf +
        ", masterApp=" + masterApp +
        "}";
    }
}
