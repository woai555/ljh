package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 非药品明细表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class UndrugDetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 处方号
     */
    @TableId(value = "RECIPE_NO", type = IdType.AUTO)
    private String recipeNo;

    /**
     * 处方内项目流水号
     */
    private Integer sequenceNo;

    /**
     * 交易类型,1正交易，2反交易
     */
    private String transType;

    /**
     * 病历卡号
     */
    private String cardNo;

    /**
     * 挂号日期
     */
    private LocalDateTime regDtime;

    /**
     * 项目代码
     */
    private String undrugCode;

    /**
     * 项目名称
     */
    private String undrugName;

    /**
     * 最小费用代码
     */
    private String feeCode;

    /**
     * 系统类别代码
     */
    private String sysClass;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 数量
     */
    private BigDecimal qty;

    /**
     * 可报效金额
     */
    private BigDecimal pubCost;

    /**
     * 自付金额
     */
    private BigDecimal payCost;

    /**
     * 不可报效金额
     */
    private BigDecimal ownCost;

    /**
     * 检查科室代码
     */
    private String deptCode;

    /**
     * 检查科室名称
     */
    private String deptName;

    /**
     * 上级科室代码
     */
    private String sdeptCode;

    /**
     * 收费标志，0未收费，1收费,2急诊未结算，9本职未审核3京医通锁号
     */
    private String payFlag;

    /**
     * 作废标志,0未作废,1作废
     */
    private String cancelFlag;

    /**
     * 减免金额
     */
    private BigDecimal derateCost;

    /**
     * 加急标志
     */
    private String emergFlag;

    /**
     * 医保中心项目代码
     */
    private String centerCode;

    /**
     * 发票上小票号
     */
    private String dataFrom;

    /**
     * 库房代码
     */
    private String stockCode;

    /**
     * 扣库存标志,0未扣，1扣
     */
    private String minusStockFlag;

    /**
     * 库存单位
     */
    private String stockUnit;

    /**
     * 医保审批号
     */
    private String apprNo;

    /**
     * 划价员代码
     */
    private String recorder;

    /**
     * 划价日期
     */
    private LocalDateTime recordDate;

    /**
     * 收款员代码
     */
    private String operCode;

    /**
     * 收款日期
     */
    private LocalDateTime operDate;

    /**
     * 票据号
     */
    private String invoiceNo;

    /**
     * 项目等级,1甲类，2乙类，3丙类
     */
    private String itemGrade;

    /**
     * 开方医师
     */
    private String doctCode;

    /**
     * 开方医师所在科室(不是开单科室)
     */
    private String doctDept;

    /**
     * 急诊标志 1 是  0
     */
    private String ifFru;

    /**
     * 组套编码
     */
    private String ztCode;

    /**
     * 组套名称
     */
    private String ztName;

    /**
     * 检验科已做检验标志，1已做，0未做
     */
    private String lisFlag;

    /**
     * 审核人
     */
    private String checkOperCode;

    /**
     * 审核时间
     */
    private LocalDateTime checkDate;

    /**
     * 执行确认标志（0未确认1确认,2取消）
     */
    private String confirmFlag;

    /**
     * 确认人代码
     */
    private String confirmOperCode;

    /**
     * 确认时间
     */
    private LocalDateTime confirmDate;

    /**
     * 取消人代码
     */
    private String cancelOperCode;

    /**
     * 取消时间
     */
    private LocalDateTime cancelDate;

    /**
     * 设备代码
     */
    private String machineCode;

    /**
     * 执行人员编码
     */
    private String execOperCode;

    private String djbFlag;

    /**
     * 门诊流水号
     */
    private String clinicCode;

    /**
     * 医嘱流水号
     */
    private String moOrder;

    /**
     * 终端取消确认人
     */
    private String invalidateOperCode;

    /**
     * 终端取消确认时间
     */
    private LocalDateTime invalidateDate;

    /**
     * 临床试验记录序号
     */
    private Long trialSeqno;


    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDtime() {
        return regDtime;
    }

    public void setRegDtime(LocalDateTime regDtime) {
        this.regDtime = regDtime;
    }

    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getUndrugName() {
        return undrugName;
    }

    public void setUndrugName(String undrugName) {
        this.undrugName = undrugName;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getSysClass() {
        return sysClass;
    }

    public void setSysClass(String sysClass) {
        this.sysClass = sysClass;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public BigDecimal getPayCost() {
        return payCost;
    }

    public void setPayCost(BigDecimal payCost) {
        this.payCost = payCost;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getSdeptCode() {
        return sdeptCode;
    }

    public void setSdeptCode(String sdeptCode) {
        this.sdeptCode = sdeptCode;
    }

    public String getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public BigDecimal getDerateCost() {
        return derateCost;
    }

    public void setDerateCost(BigDecimal derateCost) {
        this.derateCost = derateCost;
    }

    public String getEmergFlag() {
        return emergFlag;
    }

    public void setEmergFlag(String emergFlag) {
        this.emergFlag = emergFlag;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public String getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getMinusStockFlag() {
        return minusStockFlag;
    }

    public void setMinusStockFlag(String minusStockFlag) {
        this.minusStockFlag = minusStockFlag;
    }

    public String getStockUnit() {
        return stockUnit;
    }

    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit;
    }

    public String getApprNo() {
        return apprNo;
    }

    public void setApprNo(String apprNo) {
        this.apprNo = apprNo;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    public LocalDateTime getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDateTime recordDate) {
        this.recordDate = recordDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getItemGrade() {
        return itemGrade;
    }

    public void setItemGrade(String itemGrade) {
        this.itemGrade = itemGrade;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getDoctDept() {
        return doctDept;
    }

    public void setDoctDept(String doctDept) {
        this.doctDept = doctDept;
    }

    public String getIfFru() {
        return ifFru;
    }

    public void setIfFru(String ifFru) {
        this.ifFru = ifFru;
    }

    public String getZtCode() {
        return ztCode;
    }

    public void setZtCode(String ztCode) {
        this.ztCode = ztCode;
    }

    public String getZtName() {
        return ztName;
    }

    public void setZtName(String ztName) {
        this.ztName = ztName;
    }

    public String getLisFlag() {
        return lisFlag;
    }

    public void setLisFlag(String lisFlag) {
        this.lisFlag = lisFlag;
    }

    public String getCheckOperCode() {
        return checkOperCode;
    }

    public void setCheckOperCode(String checkOperCode) {
        this.checkOperCode = checkOperCode;
    }

    public LocalDateTime getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(LocalDateTime checkDate) {
        this.checkDate = checkDate;
    }

    public String getConfirmFlag() {
        return confirmFlag;
    }

    public void setConfirmFlag(String confirmFlag) {
        this.confirmFlag = confirmFlag;
    }

    public String getConfirmOperCode() {
        return confirmOperCode;
    }

    public void setConfirmOperCode(String confirmOperCode) {
        this.confirmOperCode = confirmOperCode;
    }

    public LocalDateTime getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(LocalDateTime confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getCancelOperCode() {
        return cancelOperCode;
    }

    public void setCancelOperCode(String cancelOperCode) {
        this.cancelOperCode = cancelOperCode;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    public String getExecOperCode() {
        return execOperCode;
    }

    public void setExecOperCode(String execOperCode) {
        this.execOperCode = execOperCode;
    }

    public String getDjbFlag() {
        return djbFlag;
    }

    public void setDjbFlag(String djbFlag) {
        this.djbFlag = djbFlag;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
    }

    public String getMoOrder() {
        return moOrder;
    }

    public void setMoOrder(String moOrder) {
        this.moOrder = moOrder;
    }

    public String getInvalidateOperCode() {
        return invalidateOperCode;
    }

    public void setInvalidateOperCode(String invalidateOperCode) {
        this.invalidateOperCode = invalidateOperCode;
    }

    public LocalDateTime getInvalidateDate() {
        return invalidateDate;
    }

    public void setInvalidateDate(LocalDateTime invalidateDate) {
        this.invalidateDate = invalidateDate;
    }

    public Long getTrialSeqno() {
        return trialSeqno;
    }

    public void setTrialSeqno(Long trialSeqno) {
        this.trialSeqno = trialSeqno;
    }

    @Override
    public String toString() {
        return "UndrugDetail{" +
        "recipeNo=" + recipeNo +
        ", sequenceNo=" + sequenceNo +
        ", transType=" + transType +
        ", cardNo=" + cardNo +
        ", regDtime=" + regDtime +
        ", undrugCode=" + undrugCode +
        ", undrugName=" + undrugName +
        ", feeCode=" + feeCode +
        ", sysClass=" + sysClass +
        ", unitPrice=" + unitPrice +
        ", qty=" + qty +
        ", pubCost=" + pubCost +
        ", payCost=" + payCost +
        ", ownCost=" + ownCost +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", sdeptCode=" + sdeptCode +
        ", payFlag=" + payFlag +
        ", cancelFlag=" + cancelFlag +
        ", derateCost=" + derateCost +
        ", emergFlag=" + emergFlag +
        ", centerCode=" + centerCode +
        ", dataFrom=" + dataFrom +
        ", stockCode=" + stockCode +
        ", minusStockFlag=" + minusStockFlag +
        ", stockUnit=" + stockUnit +
        ", apprNo=" + apprNo +
        ", recorder=" + recorder +
        ", recordDate=" + recordDate +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", invoiceNo=" + invoiceNo +
        ", itemGrade=" + itemGrade +
        ", doctCode=" + doctCode +
        ", doctDept=" + doctDept +
        ", ifFru=" + ifFru +
        ", ztCode=" + ztCode +
        ", ztName=" + ztName +
        ", lisFlag=" + lisFlag +
        ", checkOperCode=" + checkOperCode +
        ", checkDate=" + checkDate +
        ", confirmFlag=" + confirmFlag +
        ", confirmOperCode=" + confirmOperCode +
        ", confirmDate=" + confirmDate +
        ", cancelOperCode=" + cancelOperCode +
        ", cancelDate=" + cancelDate +
        ", machineCode=" + machineCode +
        ", execOperCode=" + execOperCode +
        ", djbFlag=" + djbFlag +
        ", clinicCode=" + clinicCode +
        ", moOrder=" + moOrder +
        ", invalidateOperCode=" + invalidateOperCode +
        ", invalidateDate=" + invalidateDate +
        ", trialSeqno=" + trialSeqno +
        "}";
    }
}
