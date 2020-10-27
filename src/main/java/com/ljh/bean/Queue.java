package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 队列表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Queue implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 序号
     */
    @TableId(value = "QUEUE_ID", type = IdType.AUTO)
    private BigDecimal queueId;

    /**
     * 患者卡号
     */
    private String cardNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 挂号时间
     */
    private LocalDateTime regDate;

    /**
     * his序号
     */
    private BigDecimal seeNo;

    /**
     * 挂号科室编码
     */
    private String deptCode;

    /**
     * 挂号科室名称
     */
    private String deptName;

    /**
     * 挂号医生编码
     */
    private String doctCode;

    /**
     * 挂号医生名称
     */
    private String doctName;

    /**
     * 操作地点编码
     */
    private BigDecimal locationSet;

    /**
     * 号别编码
     */
    private String reglevlCode;

    /**
     * 号别名称
     */
    private String reglevlName;

    /**
     * 医生是否呼叫1是0否
     */
    private BigDecimal yndoctcall;

    /**
     * 护士是否呼叫1是0否
     */
    private BigDecimal ynnursecall;

    /**
     * 呼叫位置
     */
    private BigDecimal locationId;

    /**
     * 呼叫时间
     */
    private LocalDateTime callDate;

    /**
     * 午别：1-上午3-下午4-夜班5-早班
     */
    private String noonCode;

    /**
     * 备注
     */
    private String remarks;

    private String realDoctname;


    public BigDecimal getQueueId() {
        return queueId;
    }

    public void setQueueId(BigDecimal queueId) {
        this.queueId = queueId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public BigDecimal getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(BigDecimal seeNo) {
        this.seeNo = seeNo;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public BigDecimal getLocationSet() {
        return locationSet;
    }

    public void setLocationSet(BigDecimal locationSet) {
        this.locationSet = locationSet;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getReglevlName() {
        return reglevlName;
    }

    public void setReglevlName(String reglevlName) {
        this.reglevlName = reglevlName;
    }

    public BigDecimal getYndoctcall() {
        return yndoctcall;
    }

    public void setYndoctcall(BigDecimal yndoctcall) {
        this.yndoctcall = yndoctcall;
    }

    public BigDecimal getYnnursecall() {
        return ynnursecall;
    }

    public void setYnnursecall(BigDecimal ynnursecall) {
        this.ynnursecall = ynnursecall;
    }

    public BigDecimal getLocationId() {
        return locationId;
    }

    public void setLocationId(BigDecimal locationId) {
        this.locationId = locationId;
    }

    public LocalDateTime getCallDate() {
        return callDate;
    }

    public void setCallDate(LocalDateTime callDate) {
        this.callDate = callDate;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRealDoctname() {
        return realDoctname;
    }

    public void setRealDoctname(String realDoctname) {
        this.realDoctname = realDoctname;
    }

    @Override
    public String toString() {
        return "Queue{" +
        "queueId=" + queueId +
        ", cardNo=" + cardNo +
        ", name=" + name +
        ", regDate=" + regDate +
        ", seeNo=" + seeNo +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", doctCode=" + doctCode +
        ", doctName=" + doctName +
        ", locationSet=" + locationSet +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", yndoctcall=" + yndoctcall +
        ", ynnursecall=" + ynnursecall +
        ", locationId=" + locationId +
        ", callDate=" + callDate +
        ", noonCode=" + noonCode +
        ", remarks=" + remarks +
        ", realDoctname=" + realDoctname +
        "}";
    }
}
