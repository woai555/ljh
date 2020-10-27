package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 特殊用药诊断删除记录
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SpecialDiagnosisRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * icd码
     */
    private String icdCode;

    /**
     * icd疾病名称
     */
    private String icdName;

    /**
     * 删除操作时间
     */
    private LocalDateTime deleteTime;

    /**
     * 删除操作人员
     */
    private String deleteOperator;

    /**
     * 流水号，主键
     */
    @TableId(value = "SERIAL_NUMBER", type = IdType.AUTO)
    private Integer serialNumber;


    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    public LocalDateTime getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getDeleteOperator() {
        return deleteOperator;
    }

    public void setDeleteOperator(String deleteOperator) {
        this.deleteOperator = deleteOperator;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "SpecialDiagnosisRecord{" +
        "icdCode=" + icdCode +
        ", icdName=" + icdName +
        ", deleteTime=" + deleteTime +
        ", deleteOperator=" + deleteOperator +
        ", serialNumber=" + serialNumber +
        "}";
    }
}
