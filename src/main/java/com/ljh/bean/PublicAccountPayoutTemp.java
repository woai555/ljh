package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 公费帐户支出明细费用计算
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class PublicAccountPayoutTemp implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 日期
     */
    private LocalDateTime accDtime;

    /**
     * 病历号
     */
    private String cardNo;

    /**
     * 病人姓名
     */
    private String patientName;

    /**
     * 结算类别码
     */
    private String paykindCode;

    /**
     * 结算类别名称
     */
    private String paykindName;

    /**
     * 医疗证号
     */
    private String mcardNo;

    /**
     * 合同单位编号
     */
    private String pactCode;

    /**
     * 地区
     */
    private String area;

    /**
     * 金额
     */
    private BigDecimal cost;

    /**
     * 支出标志
     */
    private String payoutFlag;

    /**
     * 上报标志
     */
    private String reportFlag;

    /**
     * 拨款标志
     */
    private String loadFlag;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 挂号级别
     */
    private String regLevel;

    /**
     * 发票费用代码
     */
    private String feeCode;

    /**
     * 处方单号
     */
    private String recipeNo;

    /**
     * 发票号
     */
    private String invoiceNo;


    public LocalDateTime getAccDtime() {
        return accDtime;
    }

    public void setAccDtime(LocalDateTime accDtime) {
        this.accDtime = accDtime;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getPaykindName() {
        return paykindName;
    }

    public void setPaykindName(String paykindName) {
        this.paykindName = paykindName;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getPayoutFlag() {
        return payoutFlag;
    }

    public void setPayoutFlag(String payoutFlag) {
        this.payoutFlag = payoutFlag;
    }

    public String getReportFlag() {
        return reportFlag;
    }

    public void setReportFlag(String reportFlag) {
        this.reportFlag = reportFlag;
    }

    public String getLoadFlag() {
        return loadFlag;
    }

    public void setLoadFlag(String loadFlag) {
        this.loadFlag = loadFlag;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getRegLevel() {
        return regLevel;
    }

    public void setRegLevel(String regLevel) {
        this.regLevel = regLevel;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @Override
    public String toString() {
        return "PublicAccountPayoutTemp{" +
        "accDtime=" + accDtime +
        ", cardNo=" + cardNo +
        ", patientName=" + patientName +
        ", paykindCode=" + paykindCode +
        ", paykindName=" + paykindName +
        ", mcardNo=" + mcardNo +
        ", pactCode=" + pactCode +
        ", area=" + area +
        ", cost=" + cost +
        ", payoutFlag=" + payoutFlag +
        ", reportFlag=" + reportFlag +
        ", loadFlag=" + loadFlag +
        ", operCode=" + operCode +
        ", regLevel=" + regLevel +
        ", feeCode=" + feeCode +
        ", recipeNo=" + recipeNo +
        ", invoiceNo=" + invoiceNo +
        "}";
    }
}
