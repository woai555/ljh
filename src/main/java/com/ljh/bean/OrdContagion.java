package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊传染病明细表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdContagion implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 传染病大类编码
     */
    @TableId(value = "CONTAGION_CODE", type = IdType.AUTO)
    private BigDecimal contagionCode;

    /**
     * 传染病大类名称
     */
    private String contagionName;

    /**
     * 传染病明细编码  icd_code
     */
    private String contagiondetailCode;

    /**
     * 传染病明细名称  icd_name
     */
    private String contagiondetailName;

    /**
     * 操作员编码
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 拼音码
     */
    private String spellCode;

    /**
     * 顺序
     */
    private BigDecimal orderNo;


    public BigDecimal getContagionCode() {
        return contagionCode;
    }

    public void setContagionCode(BigDecimal contagionCode) {
        this.contagionCode = contagionCode;
    }

    public String getContagionName() {
        return contagionName;
    }

    public void setContagionName(String contagionName) {
        this.contagionName = contagionName;
    }

    public String getContagiondetailCode() {
        return contagiondetailCode;
    }

    public void setContagiondetailCode(String contagiondetailCode) {
        this.contagiondetailCode = contagiondetailCode;
    }

    public String getContagiondetailName() {
        return contagiondetailName;
    }

    public void setContagiondetailName(String contagiondetailName) {
        this.contagiondetailName = contagiondetailName;
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

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public BigDecimal getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(BigDecimal orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "OrdContagion{" +
        "contagionCode=" + contagionCode +
        ", contagionName=" + contagionName +
        ", contagiondetailCode=" + contagiondetailCode +
        ", contagiondetailName=" + contagiondetailName +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", spellCode=" + spellCode +
        ", orderNo=" + orderNo +
        "}";
    }
}
