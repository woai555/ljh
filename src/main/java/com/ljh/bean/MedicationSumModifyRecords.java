package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医保用药金额限额维护记录
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MedicationSumModifyRecords implements Serializable {

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
     * 当前限额
     */
    private BigDecimal currentSum;

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

    public BigDecimal getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(BigDecimal currentSum) {
        this.currentSum = currentSum;
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
        return "MedicationSumModifyRecords{" +
        "serialNumber=" + serialNumber +
        ", deptCode=" + deptCode +
        ", currentSum=" + currentSum +
        ", operationTime=" + operationTime +
        ", operatorId=" + operatorId +
        "}";
    }
}
