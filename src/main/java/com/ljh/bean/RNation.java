package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 民族代码表R_NATION
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RNation implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 民族代码
     */
    @TableId(value = "NATION_CODE", type = IdType.AUTO)
    private String nationCode;

    /**
     * 民族名称
     */
    private String nation;

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
     * jcpt字典码
     */
    private String jcptcode;


    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
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
        return "RNation{" +
        "nationCode=" + nationCode +
        ", nation=" + nation +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", orderId=" + orderId +
        ", spellCode=" + spellCode +
        ", jcptcode=" + jcptcode +
        "}";
    }
}
