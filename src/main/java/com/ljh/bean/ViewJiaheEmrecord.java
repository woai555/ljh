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
public class ViewJiaheEmrecord implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private LocalDateTime regDate;

    private String patientNo;

    private LocalDateTime minitime;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public LocalDateTime getMinitime() {
        return minitime;
    }

    public void setMinitime(LocalDateTime minitime) {
        this.minitime = minitime;
    }

    @Override
    public String toString() {
        return "ViewJiaheEmrecord{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", patientNo=" + patientNo +
        ", minitime=" + minitime +
        "}";
    }
}
