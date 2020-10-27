package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医生修改主诉诊断日志表，记录为修改前数据tri_seedoct_modifylist
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdSeedoctModifylist implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ORD_SEQ", type = IdType.AUTO)
    private BigDecimal ordSeq;

    private String seeNo;

    private LocalDateTime regDate;

    private String cardNo;

    private String seeDoctid;

    private LocalDateTime operDate;

    private String hostTell;

    private String currentIllness;

    private String anamnesis;

    private String diagCode1;

    private String diagCode2;

    private String diagCode3;

    private String diagCode4;

    private String diagCode5;

    private String diagTemp;

    private String diagName1;

    private String diagName2;

    private String diagName3;

    private String diagName4;

    private String diagName5;

    /**
     * 0未收费其它已收费
     */
    private Integer status;


    public BigDecimal getOrdSeq() {
        return ordSeq;
    }

    public void setOrdSeq(BigDecimal ordSeq) {
        this.ordSeq = ordSeq;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getSeeDoctid() {
        return seeDoctid;
    }

    public void setSeeDoctid(String seeDoctid) {
        this.seeDoctid = seeDoctid;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getHostTell() {
        return hostTell;
    }

    public void setHostTell(String hostTell) {
        this.hostTell = hostTell;
    }

    public String getCurrentIllness() {
        return currentIllness;
    }

    public void setCurrentIllness(String currentIllness) {
        this.currentIllness = currentIllness;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getDiagCode1() {
        return diagCode1;
    }

    public void setDiagCode1(String diagCode1) {
        this.diagCode1 = diagCode1;
    }

    public String getDiagCode2() {
        return diagCode2;
    }

    public void setDiagCode2(String diagCode2) {
        this.diagCode2 = diagCode2;
    }

    public String getDiagCode3() {
        return diagCode3;
    }

    public void setDiagCode3(String diagCode3) {
        this.diagCode3 = diagCode3;
    }

    public String getDiagCode4() {
        return diagCode4;
    }

    public void setDiagCode4(String diagCode4) {
        this.diagCode4 = diagCode4;
    }

    public String getDiagCode5() {
        return diagCode5;
    }

    public void setDiagCode5(String diagCode5) {
        this.diagCode5 = diagCode5;
    }

    public String getDiagTemp() {
        return diagTemp;
    }

    public void setDiagTemp(String diagTemp) {
        this.diagTemp = diagTemp;
    }

    public String getDiagName1() {
        return diagName1;
    }

    public void setDiagName1(String diagName1) {
        this.diagName1 = diagName1;
    }

    public String getDiagName2() {
        return diagName2;
    }

    public void setDiagName2(String diagName2) {
        this.diagName2 = diagName2;
    }

    public String getDiagName3() {
        return diagName3;
    }

    public void setDiagName3(String diagName3) {
        this.diagName3 = diagName3;
    }

    public String getDiagName4() {
        return diagName4;
    }

    public void setDiagName4(String diagName4) {
        this.diagName4 = diagName4;
    }

    public String getDiagName5() {
        return diagName5;
    }

    public void setDiagName5(String diagName5) {
        this.diagName5 = diagName5;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrdSeedoctModifylist{" +
        "ordSeq=" + ordSeq +
        ", seeNo=" + seeNo +
        ", regDate=" + regDate +
        ", cardNo=" + cardNo +
        ", seeDoctid=" + seeDoctid +
        ", operDate=" + operDate +
        ", hostTell=" + hostTell +
        ", currentIllness=" + currentIllness +
        ", anamnesis=" + anamnesis +
        ", diagCode1=" + diagCode1 +
        ", diagCode2=" + diagCode2 +
        ", diagCode3=" + diagCode3 +
        ", diagCode4=" + diagCode4 +
        ", diagCode5=" + diagCode5 +
        ", diagTemp=" + diagTemp +
        ", diagName1=" + diagName1 +
        ", diagName2=" + diagName2 +
        ", diagName3=" + diagName3 +
        ", diagName4=" + diagName4 +
        ", diagName5=" + diagName5 +
        ", status=" + status +
        "}";
    }
}
