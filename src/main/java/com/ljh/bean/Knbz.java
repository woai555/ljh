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
public class Knbz implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String name;

    private String mcardno;

    private Integer ordFlag;

    private String patientNo;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMcardno() {
        return mcardno;
    }

    public void setMcardno(String mcardno) {
        this.mcardno = mcardno;
    }

    public Integer getOrdFlag() {
        return ordFlag;
    }

    public void setOrdFlag(Integer ordFlag) {
        this.ordFlag = ordFlag;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    @Override
    public String toString() {
        return "Knbz{" +
        "cardNo=" + cardNo +
        ", name=" + name +
        ", mcardno=" + mcardno +
        ", ordFlag=" + ordFlag +
        ", patientNo=" + patientNo +
        "}";
    }
}
