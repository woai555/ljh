package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 修改患者结算类别记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class PaykindModifyRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 发生序号
     */
    @TableId(value = "HAPPEN_NO", type = IdType.AUTO)
    private BigDecimal happenNo;

    /**
     * 患者卡号
     */
    private String cardNo;

    /**
     * 原结算类别
     */
    private String oldPaykind;

    /**
     * 现结算类别
     */
    private String newPaykind;

    /**
     * 操作人员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public BigDecimal getHappenNo() {
        return happenNo;
    }

    public void setHappenNo(BigDecimal happenNo) {
        this.happenNo = happenNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getOldPaykind() {
        return oldPaykind;
    }

    public void setOldPaykind(String oldPaykind) {
        this.oldPaykind = oldPaykind;
    }

    public String getNewPaykind() {
        return newPaykind;
    }

    public void setNewPaykind(String newPaykind) {
        this.newPaykind = newPaykind;
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
        return "PaykindModifyRecord{" +
        "happenNo=" + happenNo +
        ", cardNo=" + cardNo +
        ", oldPaykind=" + oldPaykind +
        ", newPaykind=" + newPaykind +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
