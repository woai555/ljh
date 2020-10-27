package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊患者诊断记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class TriDiagnose implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 患者就诊卡号
     */
    private String cardNo;

    /**
     * 患者挂号时间
     */
    @TableId(value = "REG_DATE", type = IdType.AUTO)
    private LocalDateTime regDate;

    /**
     * 看诊流水号
     */
    private BigDecimal seeSequence;

    /**
     * 看诊流水号
     */
    private BigDecimal diagSequence;

    /**
     * 诊断编码
     */
    private String diagnoseNo;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 诊断名称
     */
    private String diagnoseName;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public BigDecimal getSeeSequence() {
        return seeSequence;
    }

    public void setSeeSequence(BigDecimal seeSequence) {
        this.seeSequence = seeSequence;
    }

    public BigDecimal getDiagSequence() {
        return diagSequence;
    }

    public void setDiagSequence(BigDecimal diagSequence) {
        this.diagSequence = diagSequence;
    }

    public String getDiagnoseNo() {
        return diagnoseNo;
    }

    public void setDiagnoseNo(String diagnoseNo) {
        this.diagnoseNo = diagnoseNo;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getDiagnoseName() {
        return diagnoseName;
    }

    public void setDiagnoseName(String diagnoseName) {
        this.diagnoseName = diagnoseName;
    }

    @Override
    public String toString() {
        return "TriDiagnose{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", seeSequence=" + seeSequence +
        ", diagSequence=" + diagSequence +
        ", diagnoseNo=" + diagnoseNo +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", diagnoseName=" + diagnoseName +
        "}";
    }
}
