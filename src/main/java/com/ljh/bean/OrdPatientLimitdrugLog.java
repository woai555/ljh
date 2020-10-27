package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 限制药品信息设置修改记录
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdPatientLimitdrugLog implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 序号
     */
    @TableId(value = "SEQNO", type = IdType.AUTO)
    private BigDecimal seqno;

    /**
     * 患者身份证号
     */
    private String cardNo;

    /**
     * 操作类型
     */
    private String operKind;

    /**
     * 药品编码
     */
    private String drugCode;

    /**
     * 操作内容
     */
    private String operContent;

    /**
     * 操作人员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public BigDecimal getSeqno() {
        return seqno;
    }

    public void setSeqno(BigDecimal seqno) {
        this.seqno = seqno;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getOperKind() {
        return operKind;
    }

    public void setOperKind(String operKind) {
        this.operKind = operKind;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getOperContent() {
        return operContent;
    }

    public void setOperContent(String operContent) {
        this.operContent = operContent;
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

    @Override
    public String toString() {
        return "OrdPatientLimitdrugLog{" +
        "seqno=" + seqno +
        ", cardNo=" + cardNo +
        ", operKind=" + operKind +
        ", drugCode=" + drugCode +
        ", operContent=" + operContent +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
