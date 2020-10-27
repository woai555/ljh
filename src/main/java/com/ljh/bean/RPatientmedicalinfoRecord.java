package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病人病历流转记录表(R_PatientMedicalInfo_record)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPatientmedicalinfoRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 序号
     */
    @TableId(value = "SERIALNO", type = IdType.AUTO)
    private BigDecimal serialno;

    /**
     * 病历号
     */
    private String clinicNo;

    /**
     * 类别
     */
    private String subject;

    /**
     * 去向科室代码
     */
    private String expDeptCode;

    /**
     * 去向科室名称
     */
    private String expDeptName;

    /**
     * 借阅人ID
     */
    private String lendingPersonalId;

    /**
     * 借阅人名称
     */
    private String lendingPersonalName;

    /**
     * 出库时间
     */
    private LocalDateTime expDate;

    /**
     * 出库经办人
     */
    private String expOper;

    /**
     * 返还状态
     */
    private String returnStatus;

    /**
     * 返还时间
     */
    private LocalDateTime returnDate;

    /**
     * 归还经办人
     */
    private String returnOper;


    public BigDecimal getSerialno() {
        return serialno;
    }

    public void setSerialno(BigDecimal serialno) {
        this.serialno = serialno;
    }

    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExpDeptCode() {
        return expDeptCode;
    }

    public void setExpDeptCode(String expDeptCode) {
        this.expDeptCode = expDeptCode;
    }

    public String getExpDeptName() {
        return expDeptName;
    }

    public void setExpDeptName(String expDeptName) {
        this.expDeptName = expDeptName;
    }

    public String getLendingPersonalId() {
        return lendingPersonalId;
    }

    public void setLendingPersonalId(String lendingPersonalId) {
        this.lendingPersonalId = lendingPersonalId;
    }

    public String getLendingPersonalName() {
        return lendingPersonalName;
    }

    public void setLendingPersonalName(String lendingPersonalName) {
        this.lendingPersonalName = lendingPersonalName;
    }

    public LocalDateTime getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDateTime expDate) {
        this.expDate = expDate;
    }

    public String getExpOper() {
        return expOper;
    }

    public void setExpOper(String expOper) {
        this.expOper = expOper;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnOper() {
        return returnOper;
    }

    public void setReturnOper(String returnOper) {
        this.returnOper = returnOper;
    }

    @Override
    public String toString() {
        return "RPatientmedicalinfoRecord{" +
        "serialno=" + serialno +
        ", clinicNo=" + clinicNo +
        ", subject=" + subject +
        ", expDeptCode=" + expDeptCode +
        ", expDeptName=" + expDeptName +
        ", lendingPersonalId=" + lendingPersonalId +
        ", lendingPersonalName=" + lendingPersonalName +
        ", expDate=" + expDate +
        ", expOper=" + expOper +
        ", return=" + returnStatus +
        ", returnDate=" + returnDate +
        ", returnOper=" + returnOper +
        "}";
    }
}
