package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 欠费患者解封表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class QfWarnOpen implements Serializable {

    private static final long serialVersionUID=1L;

    private String inpatientno;

    /**
     * 0作废 1有效
     */
    private Integer validFlag;

    /**
     * 1是1万一下；‘2’是2万以下；‘3是’3万以下；‘4’是3万以上
     */
    private String qfLimit;

    private Integer operatorid;

    private LocalDateTime operatortime;

    @TableId(value = "SEQ_NO", type = IdType.AUTO)
    private BigDecimal seqNo;

    /**
     * 修改人
     */
    private Integer modifyOperid;

    /**
     * 修改日期
     */
    private LocalDateTime modifyDate;

    private Integer roomid;

    private Integer branchid;

    private String patientid;

    private String name;


    public String getInpatientno() {
        return inpatientno;
    }

    public void setInpatientno(String inpatientno) {
        this.inpatientno = inpatientno;
    }

    public Integer getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(Integer validFlag) {
        this.validFlag = validFlag;
    }

    public String getQfLimit() {
        return qfLimit;
    }

    public void setQfLimit(String qfLimit) {
        this.qfLimit = qfLimit;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    public BigDecimal getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(BigDecimal seqNo) {
        this.seqNo = seqNo;
    }

    public Integer getModifyOperid() {
        return modifyOperid;
    }

    public void setModifyOperid(Integer modifyOperid) {
        this.modifyOperid = modifyOperid;
    }

    public LocalDateTime getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(LocalDateTime modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getBranchid() {
        return branchid;
    }

    public void setBranchid(Integer branchid) {
        this.branchid = branchid;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "QfWarnOpen{" +
        "inpatientno=" + inpatientno +
        ", validFlag=" + validFlag +
        ", qfLimit=" + qfLimit +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        ", seqNo=" + seqNo +
        ", modifyOperid=" + modifyOperid +
        ", modifyDate=" + modifyDate +
        ", roomid=" + roomid +
        ", branchid=" + branchid +
        ", patientid=" + patientid +
        ", name=" + name +
        "}";
    }
}
