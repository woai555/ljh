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
public class VAppRecipe implements Serializable {

    private static final long serialVersionUID=1L;

    private String accessPatId;

    private String mcardNo;

    private String cardnoJyt;

    private String patName;

    private String accPresId;

    private String prescriptionType;

    private String prescriptionNo;

    private LocalDateTime prescriptionDate;

    private String prescriptionName;


    public String getAccessPatId() {
        return accessPatId;
    }

    public void setAccessPatId(String accessPatId) {
        this.accessPatId = accessPatId;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getAccPresId() {
        return accPresId;
    }

    public void setAccPresId(String accPresId) {
        this.accPresId = accPresId;
    }

    public String getPrescriptionType() {
        return prescriptionType;
    }

    public void setPrescriptionType(String prescriptionType) {
        this.prescriptionType = prescriptionType;
    }

    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    public LocalDateTime getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(LocalDateTime prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName;
    }

    @Override
    public String toString() {
        return "VAppRecipe{" +
        "accessPatId=" + accessPatId +
        ", mcardNo=" + mcardNo +
        ", cardnoJyt=" + cardnoJyt +
        ", patName=" + patName +
        ", accPresId=" + accPresId +
        ", prescriptionType=" + prescriptionType +
        ", prescriptionNo=" + prescriptionNo +
        ", prescriptionDate=" + prescriptionDate +
        ", prescriptionName=" + prescriptionName +
        "}";
    }
}
