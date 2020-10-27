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
public class ViewInteractmedOutdg implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String seeNo;

    private String seeDoctnm;

    private String diagnosisNum;

    private String icdCode;

    private String icdName;

    private LocalDateTime diagnosisTime;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getSeeDoctnm() {
        return seeDoctnm;
    }

    public void setSeeDoctnm(String seeDoctnm) {
        this.seeDoctnm = seeDoctnm;
    }

    public String getDiagnosisNum() {
        return diagnosisNum;
    }

    public void setDiagnosisNum(String diagnosisNum) {
        this.diagnosisNum = diagnosisNum;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    public LocalDateTime getDiagnosisTime() {
        return diagnosisTime;
    }

    public void setDiagnosisTime(LocalDateTime diagnosisTime) {
        this.diagnosisTime = diagnosisTime;
    }

    @Override
    public String toString() {
        return "ViewInteractmedOutdg{" +
        "cardNo=" + cardNo +
        ", seeNo=" + seeNo +
        ", seeDoctnm=" + seeDoctnm +
        ", diagnosisNum=" + diagnosisNum +
        ", icdCode=" + icdCode +
        ", icdName=" + icdName +
        ", diagnosisTime=" + diagnosisTime +
        "}";
    }
}
