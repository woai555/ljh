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
public class PmiMerge implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 病人ID被合并的
     */
    @TableId(value = "PATIENT_ID_MERGED", type = IdType.AUTO)
    private String patientIdMerged;

    /**
     * 病人ID保留的
     */
    private String patientIdReserved;

    /**
     * 操作日期
     */
    private LocalDateTime operateDate;

    /**
     * 操作员
     */
    private String operatorCode;


    public String getPatientIdMerged() {
        return patientIdMerged;
    }

    public void setPatientIdMerged(String patientIdMerged) {
        this.patientIdMerged = patientIdMerged;
    }

    public String getPatientIdReserved() {
        return patientIdReserved;
    }

    public void setPatientIdReserved(String patientIdReserved) {
        this.patientIdReserved = patientIdReserved;
    }

    public LocalDateTime getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(LocalDateTime operateDate) {
        this.operateDate = operateDate;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    @Override
    public String toString() {
        return "PmiMerge{" +
        "patientIdMerged=" + patientIdMerged +
        ", patientIdReserved=" + patientIdReserved +
        ", operateDate=" + operateDate +
        ", operatorCode=" + operatorCode +
        "}";
    }
}
