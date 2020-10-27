package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class VRegPatientBd implements Serializable {

    private static final long serialVersionUID=1L;

    private String parHisRegNo;

    private String ksmc;

    private String cardType;

    private String cardNo;

    private String parRegNo;


    public String getParHisRegNo() {
        return parHisRegNo;
    }

    public void setParHisRegNo(String parHisRegNo) {
        this.parHisRegNo = parHisRegNo;
    }

    public String getKsmc() {
        return ksmc;
    }

    public void setKsmc(String ksmc) {
        this.ksmc = ksmc;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getParRegNo() {
        return parRegNo;
    }

    public void setParRegNo(String parRegNo) {
        this.parRegNo = parRegNo;
    }

    @Override
    public String toString() {
        return "VRegPatientBd{" +
        "parHisRegNo=" + parHisRegNo +
        ", ksmc=" + ksmc +
        ", cardType=" + cardType +
        ", cardNo=" + cardNo +
        ", parRegNo=" + parRegNo +
        "}";
    }
}
