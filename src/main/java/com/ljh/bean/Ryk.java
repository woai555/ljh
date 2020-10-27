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
public class Ryk implements Serializable {

    private static final long serialVersionUID=1L;

    private Long bh;

    private String xm;

    private String lkh;

    private Long cardNo;

    private String name;

    private String clinicNo;

    private String cardno;


    public Long getBh() {
        return bh;
    }

    public void setBh(Long bh) {
        this.bh = bh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getLkh() {
        return lkh;
    }

    public void setLkh(String lkh) {
        this.lkh = lkh;
    }

    public Long getCardNo() {
        return cardNo;
    }

    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    @Override
    public String toString() {
        return "Ryk{" +
        "bh=" + bh +
        ", xm=" + xm +
        ", lkh=" + lkh +
        ", cardNo=" + cardNo +
        ", name=" + name +
        ", clinicNo=" + clinicNo +
        ", cardno=" + cardno +
        "}";
    }
}
