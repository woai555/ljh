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
public class ViewHlhtCdrvisitEntrydiag implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String visitNo;

    private String diagnosisCode;

    private String diagnosisDesc;

    private String cdiagnosisCode;

    private String cdiagnosisDesc;

    private String tcmdiagnosisCode;

    private String tcmdiagnosisDesc;

    private String seeNo;

    private String seeTime;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getVisitNo() {
        return visitNo;
    }

    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo;
    }

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public String getDiagnosisDesc() {
        return diagnosisDesc;
    }

    public void setDiagnosisDesc(String diagnosisDesc) {
        this.diagnosisDesc = diagnosisDesc;
    }

    public String getCdiagnosisCode() {
        return cdiagnosisCode;
    }

    public void setCdiagnosisCode(String cdiagnosisCode) {
        this.cdiagnosisCode = cdiagnosisCode;
    }

    public String getCdiagnosisDesc() {
        return cdiagnosisDesc;
    }

    public void setCdiagnosisDesc(String cdiagnosisDesc) {
        this.cdiagnosisDesc = cdiagnosisDesc;
    }

    public String getTcmdiagnosisCode() {
        return tcmdiagnosisCode;
    }

    public void setTcmdiagnosisCode(String tcmdiagnosisCode) {
        this.tcmdiagnosisCode = tcmdiagnosisCode;
    }

    public String getTcmdiagnosisDesc() {
        return tcmdiagnosisDesc;
    }

    public void setTcmdiagnosisDesc(String tcmdiagnosisDesc) {
        this.tcmdiagnosisDesc = tcmdiagnosisDesc;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getSeeTime() {
        return seeTime;
    }

    public void setSeeTime(String seeTime) {
        this.seeTime = seeTime;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdrvisitEntrydiag{" +
        "cardNo=" + cardNo +
        ", visitNo=" + visitNo +
        ", diagnosisCode=" + diagnosisCode +
        ", diagnosisDesc=" + diagnosisDesc +
        ", cdiagnosisCode=" + cdiagnosisCode +
        ", cdiagnosisDesc=" + cdiagnosisDesc +
        ", tcmdiagnosisCode=" + tcmdiagnosisCode +
        ", tcmdiagnosisDesc=" + tcmdiagnosisDesc +
        ", seeNo=" + seeNo +
        ", seeTime=" + seeTime +
        "}";
    }
}
