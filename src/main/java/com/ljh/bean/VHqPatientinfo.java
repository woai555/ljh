package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class VHqPatientinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String xm;

    private String xb;

    private LocalDateTime sr;

    private String cardno;

    private String clinicNo;


    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public LocalDateTime getSr() {
        return sr;
    }

    public void setSr(LocalDateTime sr) {
        this.sr = sr;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    @Override
    public String toString() {
        return "VHqPatientinfo{" +
        "xm=" + xm +
        ", xb=" + xb +
        ", sr=" + sr +
        ", cardno=" + cardno +
        ", clinicNo=" + clinicNo +
        "}";
    }
}
