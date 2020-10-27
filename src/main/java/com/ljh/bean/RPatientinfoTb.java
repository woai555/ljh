package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 特殊病患者信息表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPatientinfoTb implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 病种
     */
    private String diseaseCategory;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;

    /**
     * 操作人
     */
    private String operCode;

    /**
     * 有效期截止时间
     */
    private LocalDateTime validDate;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getDiseaseCategory() {
        return diseaseCategory;
    }

    public void setDiseaseCategory(String diseaseCategory) {
        this.diseaseCategory = diseaseCategory;
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

    public LocalDateTime getValidDate() {
        return validDate;
    }

    public void setValidDate(LocalDateTime validDate) {
        this.validDate = validDate;
    }

    @Override
    public String toString() {
        return "RPatientinfoTb{" +
        "cardNo=" + cardNo +
        ", diseaseCategory=" + diseaseCategory +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", validDate=" + validDate +
        "}";
    }
}
