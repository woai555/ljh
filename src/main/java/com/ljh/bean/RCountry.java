package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 国籍编码表R_COUNTRY
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RCountry implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 代号
     */
    @TableId(value = "COUN_CODE", type = IdType.AUTO)
    private String counCode;

    /**
     * 国家
     */
    private String coun;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 国家标志
     */
    private String counFl;

    /**
     * 顺序号
     */
    private Integer orderId;

    /**
     * 拼音码
     */
    private String spellCode;

    /**
     * 医价平台代号
     */
    private String counCodeYj;

    /**
     * 医价平台国家
     */
    private String counYj;


    public String getCounCode() {
        return counCode;
    }

    public void setCounCode(String counCode) {
        this.counCode = counCode;
    }

    public String getCoun() {
        return coun;
    }

    public void setCoun(String coun) {
        this.coun = coun;
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

    public String getCounFl() {
        return counFl;
    }

    public void setCounFl(String counFl) {
        this.counFl = counFl;
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

    public String getCounCodeYj() {
        return counCodeYj;
    }

    public void setCounCodeYj(String counCodeYj) {
        this.counCodeYj = counCodeYj;
    }

    public String getCounYj() {
        return counYj;
    }

    public void setCounYj(String counYj) {
        this.counYj = counYj;
    }

    @Override
    public String toString() {
        return "RCountry{" +
        "counCode=" + counCode +
        ", coun=" + coun +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", counFl=" + counFl +
        ", orderId=" + orderId +
        ", spellCode=" + spellCode +
        ", counCodeYj=" + counCodeYj +
        ", counYj=" + counYj +
        "}";
    }
}
