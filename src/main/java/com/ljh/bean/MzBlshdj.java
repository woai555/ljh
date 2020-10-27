package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病历审核登记
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MzBlshdj implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 复印病历登记流水号
     */
    @TableId(value = "BINGLI_NO", type = IdType.AUTO)
    private BigDecimal bingliNo;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 患者证件号码
     */
    private String patientIden;

    /**
     * 代办人姓名
     */
    private String replaceName;

    /**
     * 代办人证件号码
     */
    private String replaceIden;

    /**
     * 审核登记日期
     */
    private LocalDateTime operDate;

    /**
     * 操作人
     */
    private String operName;


    public BigDecimal getBingliNo() {
        return bingliNo;
    }

    public void setBingliNo(BigDecimal bingliNo) {
        this.bingliNo = bingliNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientIden() {
        return patientIden;
    }

    public void setPatientIden(String patientIden) {
        this.patientIden = patientIden;
    }

    public String getReplaceName() {
        return replaceName;
    }

    public void setReplaceName(String replaceName) {
        this.replaceName = replaceName;
    }

    public String getReplaceIden() {
        return replaceIden;
    }

    public void setReplaceIden(String replaceIden) {
        this.replaceIden = replaceIden;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    @Override
    public String toString() {
        return "MzBlshdj{" +
        "bingliNo=" + bingliNo +
        ", patientName=" + patientName +
        ", patientIden=" + patientIden +
        ", replaceName=" + replaceName +
        ", replaceIden=" + replaceIden +
        ", operDate=" + operDate +
        ", operName=" + operName +
        "}";
    }
}
