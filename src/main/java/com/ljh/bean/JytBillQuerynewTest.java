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
public class JytBillQuerynewTest implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime regDtime;

    private String recipeNo;

    private String hisRegNo;

    private String treatmentNo;

    private String groupId;

    private BigDecimal payable;

    private String unpayableReason;

    private String deptCode1;

    private String deptName1;

    private String deptCode2;

    private String deptName2;

    private String doctorCode;

    private BigDecimal recipeType;

    private String recipeDate;

    private String hosCode;

    private String cardNo;

    private BigDecimal payStatus;

    private BigDecimal totalCost;

    private String mcardNo;

    private String cardnoJyt;

    private BigDecimal rtSettlement;


    public LocalDateTime getRegDtime() {
        return regDtime;
    }

    public void setRegDtime(LocalDateTime regDtime) {
        this.regDtime = regDtime;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public String getHisRegNo() {
        return hisRegNo;
    }

    public void setHisRegNo(String hisRegNo) {
        this.hisRegNo = hisRegNo;
    }

    public String getTreatmentNo() {
        return treatmentNo;
    }

    public void setTreatmentNo(String treatmentNo) {
        this.treatmentNo = treatmentNo;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public BigDecimal getPayable() {
        return payable;
    }

    public void setPayable(BigDecimal payable) {
        this.payable = payable;
    }

    public String getUnpayableReason() {
        return unpayableReason;
    }

    public void setUnpayableReason(String unpayableReason) {
        this.unpayableReason = unpayableReason;
    }

    public String getDeptCode1() {
        return deptCode1;
    }

    public void setDeptCode1(String deptCode1) {
        this.deptCode1 = deptCode1;
    }

    public String getDeptName1() {
        return deptName1;
    }

    public void setDeptName1(String deptName1) {
        this.deptName1 = deptName1;
    }

    public String getDeptCode2() {
        return deptCode2;
    }

    public void setDeptCode2(String deptCode2) {
        this.deptCode2 = deptCode2;
    }

    public String getDeptName2() {
        return deptName2;
    }

    public void setDeptName2(String deptName2) {
        this.deptName2 = deptName2;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public BigDecimal getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(BigDecimal recipeType) {
        this.recipeType = recipeType;
    }

    public String getRecipeDate() {
        return recipeDate;
    }

    public void setRecipeDate(String recipeDate) {
        this.recipeDate = recipeDate;
    }

    public String getHosCode() {
        return hosCode;
    }

    public void setHosCode(String hosCode) {
        this.hosCode = hosCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public BigDecimal getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(BigDecimal payStatus) {
        this.payStatus = payStatus;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
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

    public BigDecimal getRtSettlement() {
        return rtSettlement;
    }

    public void setRtSettlement(BigDecimal rtSettlement) {
        this.rtSettlement = rtSettlement;
    }

    @Override
    public String toString() {
        return "JytBillQuerynewTest{" +
        "regDtime=" + regDtime +
        ", recipeNo=" + recipeNo +
        ", hisRegNo=" + hisRegNo +
        ", treatmentNo=" + treatmentNo +
        ", groupId=" + groupId +
        ", payable=" + payable +
        ", unpayableReason=" + unpayableReason +
        ", deptCode1=" + deptCode1 +
        ", deptName1=" + deptName1 +
        ", deptCode2=" + deptCode2 +
        ", deptName2=" + deptName2 +
        ", doctorCode=" + doctorCode +
        ", recipeType=" + recipeType +
        ", recipeDate=" + recipeDate +
        ", hosCode=" + hosCode +
        ", cardNo=" + cardNo +
        ", payStatus=" + payStatus +
        ", totalCost=" + totalCost +
        ", mcardNo=" + mcardNo +
        ", cardnoJyt=" + cardnoJyt +
        ", rtSettlement=" + rtSettlement +
        "}";
    }
}
