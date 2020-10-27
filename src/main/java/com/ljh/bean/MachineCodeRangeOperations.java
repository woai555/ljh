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
public class MachineCodeRangeOperations implements Serializable {

    private static final long serialVersionUID=1L;

    private Long serialNumber;

    private String yearcode;

    private String machineCode;

    private String operationType;

    private LocalDateTime operationTime;

    private String operatorId;


    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getYearcode() {
        return yearcode;
    }

    public void setYearcode(String yearcode) {
        this.yearcode = yearcode;
    }

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
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
        return "MachineCodeRangeOperations{" +
        "serialNumber=" + serialNumber +
        ", yearcode=" + yearcode +
        ", machineCode=" + machineCode +
        ", operationType=" + operationType +
        ", operationTime=" + operationTime +
        ", operatorId=" + operatorId +
        "}";
    }
}
