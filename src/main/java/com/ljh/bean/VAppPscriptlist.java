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
public class VAppPscriptlist implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime createTime;

    private String cardNo;

    private LocalDateTime startDate;

    private String visitId;

    private LocalDateTime endDate;

    private LocalDateTime operDate;

    private String hisPscriptNo;

    private String docName;

    private String deptName;

    private String pscriptType;

    private String auditDocName;

    private String confirmDocName;

    private String dispenseDocName;

    private String feeType;

    private String payStatus;

    private String idCard;

    private String idCardType;

    private String mcardNo;

    private String cardnoJyt;

    private String diagName;

    private BigDecimal ownCost;


    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getHisPscriptNo() {
        return hisPscriptNo;
    }

    public void setHisPscriptNo(String hisPscriptNo) {
        this.hisPscriptNo = hisPscriptNo;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPscriptType() {
        return pscriptType;
    }

    public void setPscriptType(String pscriptType) {
        this.pscriptType = pscriptType;
    }

    public String getAuditDocName() {
        return auditDocName;
    }

    public void setAuditDocName(String auditDocName) {
        this.auditDocName = auditDocName;
    }

    public String getConfirmDocName() {
        return confirmDocName;
    }

    public void setConfirmDocName(String confirmDocName) {
        this.confirmDocName = confirmDocName;
    }

    public String getDispenseDocName() {
        return dispenseDocName;
    }

    public void setDispenseDocName(String dispenseDocName) {
        this.dispenseDocName = dispenseDocName;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
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

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    @Override
    public String toString() {
        return "VAppPscriptlist{" +
        "createTime=" + createTime +
        ", cardNo=" + cardNo +
        ", startDate=" + startDate +
        ", visitId=" + visitId +
        ", endDate=" + endDate +
        ", operDate=" + operDate +
        ", hisPscriptNo=" + hisPscriptNo +
        ", docName=" + docName +
        ", deptName=" + deptName +
        ", pscriptType=" + pscriptType +
        ", auditDocName=" + auditDocName +
        ", confirmDocName=" + confirmDocName +
        ", dispenseDocName=" + dispenseDocName +
        ", feeType=" + feeType +
        ", payStatus=" + payStatus +
        ", idCard=" + idCard +
        ", idCardType=" + idCardType +
        ", mcardNo=" + mcardNo +
        ", cardnoJyt=" + cardnoJyt +
        ", diagName=" + diagName +
        ", ownCost=" + ownCost +
        "}";
    }
}
