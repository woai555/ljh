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
public class ViewYtappRegistatus implements Serializable {

    private static final long serialVersionUID=1L;

    private String accessPatId;

    private LocalDateTime operdate;

    private String regId;

    private String yuntaiPayNo;

    private String orderstatus;

    private String visitFlag;

    private String medicalFlag;

    private BigDecimal medicalAmount;


    public String getAccessPatId() {
        return accessPatId;
    }

    public void setAccessPatId(String accessPatId) {
        this.accessPatId = accessPatId;
    }

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getYuntaiPayNo() {
        return yuntaiPayNo;
    }

    public void setYuntaiPayNo(String yuntaiPayNo) {
        this.yuntaiPayNo = yuntaiPayNo;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getVisitFlag() {
        return visitFlag;
    }

    public void setVisitFlag(String visitFlag) {
        this.visitFlag = visitFlag;
    }

    public String getMedicalFlag() {
        return medicalFlag;
    }

    public void setMedicalFlag(String medicalFlag) {
        this.medicalFlag = medicalFlag;
    }

    public BigDecimal getMedicalAmount() {
        return medicalAmount;
    }

    public void setMedicalAmount(BigDecimal medicalAmount) {
        this.medicalAmount = medicalAmount;
    }

    @Override
    public String toString() {
        return "ViewYtappRegistatus{" +
        "accessPatId=" + accessPatId +
        ", operdate=" + operdate +
        ", regId=" + regId +
        ", yuntaiPayNo=" + yuntaiPayNo +
        ", orderstatus=" + orderstatus +
        ", visitFlag=" + visitFlag +
        ", medicalFlag=" + medicalFlag +
        ", medicalAmount=" + medicalAmount +
        "}";
    }
}
