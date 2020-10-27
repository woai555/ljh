package com.ljh.bean;

import java.math.BigDecimal;
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
public class VClinicDiaginfoAutoJh implements Serializable {

    private static final long serialVersionUID=1L;

    private String seeNo;

    private String cardNo;

    private LocalDateTime regDate;

    private String isMain;

    private BigDecimal diagnosisSubNo;

    private String diagCode;

    private String diagName;


    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

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

    public String getIsMain() {
        return isMain;
    }

    public void setIsMain(String isMain) {
        this.isMain = isMain;
    }

    public BigDecimal getDiagnosisSubNo() {
        return diagnosisSubNo;
    }

    public void setDiagnosisSubNo(BigDecimal diagnosisSubNo) {
        this.diagnosisSubNo = diagnosisSubNo;
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode;
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    @Override
    public String toString() {
        return "VClinicDiaginfoAutoJh{" +
        "seeNo=" + seeNo +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", isMain=" + isMain +
        ", diagnosisSubNo=" + diagnosisSubNo +
        ", diagCode=" + diagCode +
        ", diagName=" + diagName +
        "}";
    }
}
