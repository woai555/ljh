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
public class MedicationRangeOperations implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 流水号
     */
    @TableId(value = "SERIAL_NUMBER", type = IdType.AUTO)
    private Long serialNumber;

    /**
     * 科室代码
     */
    private String deptCode;

    /**
     * 药品代码
     */
    private String drugCode;

    /**
     * 操作类型（添加或者删除）
     */
    private String operationType;

    /**
     * 操作时间
     */
    private LocalDateTime operationTime;

    /**
     * 操作人员ID
     */
    private String operatorId;


    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public LocalDateTime getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(LocalDateTime operationTime) {
        this.operationTime = operationTime;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    @Override
    public String toString() {
        return "MedicationRangeOperations{" +
        "serialNumber=" + serialNumber +
        ", deptCode=" + deptCode +
        ", drugCode=" + drugCode +
        ", operationType=" + operationType +
        ", operationTime=" + operationTime +
        ", operatorId=" + operatorId +
        "}";
    }
}
