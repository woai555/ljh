package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 保险公司（会诊用基础数据）
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdMeetingInsurance implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 代码
     */
    @TableId(value = "INS_CODE", type = IdType.AUTO)
    private String insCode;

    /**
     * 名称
     */
    private String insName;

    /**
     * 拼音码
     */
    private String spellCode;

    /**
     * 顺序号
     */
    private BigDecimal orderId;


    public String getInsCode() {
        return insCode;
    }

    public void setInsCode(String insCode) {
        this.insCode = insCode;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public BigDecimal getOrderId() {
        return orderId;
    }

    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrdMeetingInsurance{" +
        "insCode=" + insCode +
        ", insName=" + insName +
        ", spellCode=" + spellCode +
        ", orderId=" + orderId +
        "}";
    }
}
