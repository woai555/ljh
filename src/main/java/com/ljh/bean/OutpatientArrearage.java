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
public class OutpatientArrearage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院流水号
     */
    @TableId(value = "INPATIENT_NO", type = IdType.AUTO)
    private String inpatientNo;

    /**
     * 交易序号
     */
    private Integer transNo;

    /**
     * 1:收取  2：作废
     */
    private String transType;

    /**
     * 住院号
     */
    private String patientNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 出院科室代码
     */
    private String deptCode;

    /**
     * 床位号
     */
    private String bedNo;

    /**
     * 未结算费用金额(结转的金额)
     */
    private BigDecimal nobalanceCost;

    /**
     * 未结算预交金金额(结转的预交金额)
     */
    private BigDecimal nobalancePrecost;

    /**
     * 欠费金额
     */
    private BigDecimal arrearageCost;

    /**
     * 备注
     */
    private String demo;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public Integer getTransNo() {
        return transNo;
    }

    public void setTransNo(Integer transNo) {
        this.transNo = transNo;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public BigDecimal getNobalanceCost() {
        return nobalanceCost;
    }

    public void setNobalanceCost(BigDecimal nobalanceCost) {
        this.nobalanceCost = nobalanceCost;
    }

    public BigDecimal getNobalancePrecost() {
        return nobalancePrecost;
    }

    public void setNobalancePrecost(BigDecimal nobalancePrecost) {
        this.nobalancePrecost = nobalancePrecost;
    }

    public BigDecimal getArrearageCost() {
        return arrearageCost;
    }

    public void setArrearageCost(BigDecimal arrearageCost) {
        this.arrearageCost = arrearageCost;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    @Override
    public String toString() {
        return "OutpatientArrearage{" +
        "inpatientNo=" + inpatientNo +
        ", transNo=" + transNo +
        ", transType=" + transType +
        ", patientNo=" + patientNo +
        ", name=" + name +
        ", deptCode=" + deptCode +
        ", bedNo=" + bedNo +
        ", nobalanceCost=" + nobalanceCost +
        ", nobalancePrecost=" + nobalancePrecost +
        ", arrearageCost=" + arrearageCost +
        ", demo=" + demo +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}
