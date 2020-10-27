package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 职业代码表R_PROFESSION
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RProfession implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 职业代码
     */
    @TableId(value = "PROF_CODE", type = IdType.AUTO)
    private String profCode;

    /**
     * 职业名称
     */
    private String prof;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 顺序号
     */
    private Integer orderId;

    /**
     * 拼音码
     */
    private String spellCode;

    /**
     * 集成平台编号
     */
    private String jcptcode;


    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getJcptcode() {
        return jcptcode;
    }

    public void setJcptcode(String jcptcode) {
        this.jcptcode = jcptcode;
    }

    @Override
    public String toString() {
        return "RProfession{" +
        "profCode=" + profCode +
        ", prof=" + prof +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", orderId=" + orderId +
        ", spellCode=" + spellCode +
        ", jcptcode=" + jcptcode +
        "}";
    }
}
