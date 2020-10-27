package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 特殊用药诊断
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SpecialMedicationDiagnosis implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * icd码
     */
    @TableId(value = "ICD_CODE", type = IdType.AUTO)
    private String icdCode;

    /**
     * 拼音码
     */
    private String spellCode;

    /**
     * icd疾病名称
     */
    private String icdName;

    /**
     * 最近一次操作时间
     */
    private LocalDateTime lastOperationTime;

    /**
     * 最近一次操作人员
     */
    private String lastOperator;


    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    public LocalDateTime getLastOperationTime() {
        return lastOperationTime;
    }

    public void setLastOperationTime(LocalDateTime lastOperationTime) {
        this.lastOperationTime = lastOperationTime;
    }

    public String getLastOperator() {
        return lastOperator;
    }

    public void setLastOperator(String lastOperator) {
        this.lastOperator = lastOperator;
    }

    @Override
    public String toString() {
        return "SpecialMedicationDiagnosis{" +
        "icdCode=" + icdCode +
        ", spellCode=" + spellCode +
        ", icdName=" + icdName +
        ", lastOperationTime=" + lastOperationTime +
        ", lastOperator=" + lastOperator +
        "}";
    }
}
