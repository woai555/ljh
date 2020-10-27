package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 特殊病患者删除信息表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPatientinfoTbdelete implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 卡号
     */
    private String cardNo;

    /**
     * 病种
     */
    private String diseaseCategory;

    /**
     * 删除日期
     */
    private LocalDateTime operDate;

    /**
     * 删除操作员
     */
    private String operCode;

    /**
     * 有效期截止日期
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
        return "RPatientinfoTbdelete{" +
        "cardNo=" + cardNo +
        ", diseaseCategory=" + diseaseCategory +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", validDate=" + validDate +
        "}";
    }
}
