package com.ljh.bean;

import java.math.BigDecimal;
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
public class MrmbaseDiag implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 就诊卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 挂号时间
     */
    private LocalDateTime regDtime;

    /**
     * 就诊序号
     */
    private BigDecimal xh;

    /**
     * 就诊原因（类型）
     */
    private String regReason;

    /**
     * 诊断类别
     */
    private String diagType;

    /**
     * 主要就诊原因（诊断）代码
     */
    private String diagCode;

    /**
     * 主要就诊原因（诊断）名称
     */
    private String diagName;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDtime() {
        return regDtime;
    }

    public void setRegDtime(LocalDateTime regDtime) {
        this.regDtime = regDtime;
    }

    public BigDecimal getXh() {
        return xh;
    }

    public void setXh(BigDecimal xh) {
        this.xh = xh;
    }

    public String getRegReason() {
        return regReason;
    }

    public void setRegReason(String regReason) {
        this.regReason = regReason;
    }

    public String getDiagType() {
        return diagType;
    }

    public void setDiagType(String diagType) {
        this.diagType = diagType;
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode;
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    @Override
    public String toString() {
        return "MrmbaseDiag{" +
        "cardNo=" + cardNo +
        ", regDtime=" + regDtime +
        ", xh=" + xh +
        ", regReason=" + regReason +
        ", diagType=" + diagType +
        ", diagCode=" + diagCode +
        ", diagName=" + diagName +
        "}";
    }
}
