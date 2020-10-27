package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 急诊医生长嘱表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdLongexecuterecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 看诊序号
     */
    @TableId(value = "SEE_NO", type = IdType.AUTO)
    private String seeNo;

    /**
     * 项目流水号
     */
    private Integer sequenceNo;

    /**
     * 1有效 2作废(添加或者删除项目时)
     */
    private String valid;

    /**
     * 就诊卡号
     */
    private String cardNo;

    /**
     * 挂号日期
     */
    private LocalDateTime regDate;

    /**
     * 项目代码
     */
    private String itemCode;

    /**
     * 项目名称
     */
    private String itemName;

    /**
     * 规格
     */
    private String spec;

    /**
     * 1药品，2非药品
     */
    private String drugFlag;

    /**
     * 系统类别
     */
    private String classCode;

    /**
     * 最小费用代码
     */
    private String feeCode;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 开立数量
     */
    private BigDecimal qty;

    /**
     * 付数
     */
    private Integer days;

    /**
     * 包装数量
     */
    private Integer packQty;

    /**
     * 计价单位
     */
    private String itemUnit;

    /**
     * 自费金额
     */
    private BigDecimal ownCost;

    /**
     * 自负金额
     */
    private BigDecimal payCost;

    /**
     * 报销金额
     */
    private BigDecimal pubCost;

    /**
     * 每次用量
     */
    private BigDecimal onceDose;

    /**
     * 每次用量单位
     */
    private String onceUnit;

    /**
     * 频次
     */
    private String freqCode;

    /**
     * 使用方法
     */
    private String usageCode;

    /**
     * 用法名称
     */
    private String usageName;

    /**
     * 执行科室代码
     */
    private String deptCode;

    /**
     * 执行科室名称
     */
    private String deptName;

    /**
     * 主药标志
     */
    private String mainDrug;

    /**
     * 组合号
     */
    private String combNo;

    /**
     * 自制药
     */
    private String selfMade;

    /**
     * 药品性质，普药、贵药
     */
    private String drugQuanlity;

    /**
     * 开立医生
     */
    private String doctCode;

    /**
     * 开立医生名称
     */
    private String doctName;

    /**
     * 医生科室
     */
    private String doctDeptid;

    /**
     * 开立时间
     */
    private LocalDateTime operDate;

    /**
     * 作废人
     */
    private String cancelUserid;

    /**
     * 作废时间
     */
    private LocalDateTime cancelDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 处方状态,1开立，2收费，3确认，4作废
     */
    private String status;

    /**
     * 检体
     */
    private String checkBody;

    /**
     * 申请单号
     */
    private String applyNo;

    /**
     * 是否需要确认，1需要，2不需要
     */
    private String needConfirm;

    /**
     * 确认人
     */
    private String confirmCode;

    /**
     * 确认科室
     */
    private String confirmDept;

    /**
     * 确认时间
     */
    private LocalDateTime confirmDate;

    /**
     * 基本剂量
     */
    private BigDecimal baseDose;

    /**
     * 处方号
     */
    private String recipeNo;

    /**
     * 样本类型
     */
    private String labType;

    /**
     * 检体代码
     */
    private String checkBodyCode;

    /**
     * 医保类别
     */
    private String itemGrade;

    /**
     * 组套代码
     */
    private String combid;

    /**
     * 使用天数
     */
    private BigDecimal useDays;

    /**
     * 组套编码
     */
    private String ztCode;

    /**
     * 组套名称
     */
    private String ztName;

    /**
     * 医嘱类型L长期，E嘱托
     */
    private String ordertype;

    /**
     * 发票号
     */
    private String invoiceNo;

    /**
     * longrecipedetail.sequence_no
     */
    private Integer longsequenceNo;


    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
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

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getDrugFlag() {
        return drugFlag;
    }

    public void setDrugFlag(String drugFlag) {
        this.drugFlag = drugFlag;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
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

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getPackQty() {
        return packQty;
    }

    public void setPackQty(Integer packQty) {
        this.packQty = packQty;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public BigDecimal getPayCost() {
        return payCost;
    }

    public void setPayCost(BigDecimal payCost) {
        this.payCost = payCost;
    }

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public BigDecimal getOnceDose() {
        return onceDose;
    }

    public void setOnceDose(BigDecimal onceDose) {
        this.onceDose = onceDose;
    }

    public String getOnceUnit() {
        return onceUnit;
    }

    public void setOnceUnit(String onceUnit) {
        this.onceUnit = onceUnit;
    }

    public String getFreqCode() {
        return freqCode;
    }

    public void setFreqCode(String freqCode) {
        this.freqCode = freqCode;
    }

    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode;
    }

    public String getUsageName() {
        return usageName;
    }

    public void setUsageName(String usageName) {
        this.usageName = usageName;
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

    public String getMainDrug() {
        return mainDrug;
    }

    public void setMainDrug(String mainDrug) {
        this.mainDrug = mainDrug;
    }

    public String getCombNo() {
        return combNo;
    }

    public void setCombNo(String combNo) {
        this.combNo = combNo;
    }

    public String getSelfMade() {
        return selfMade;
    }

    public void setSelfMade(String selfMade) {
        this.selfMade = selfMade;
    }

    public String getDrugQuanlity() {
        return drugQuanlity;
    }

    public void setDrugQuanlity(String drugQuanlity) {
        this.drugQuanlity = drugQuanlity;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public String getDoctDeptid() {
        return doctDeptid;
    }

    public void setDoctDeptid(String doctDeptid) {
        this.doctDeptid = doctDeptid;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getCancelUserid() {
        return cancelUserid;
    }

    public void setCancelUserid(String cancelUserid) {
        this.cancelUserid = cancelUserid;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheckBody() {
        return checkBody;
    }

    public void setCheckBody(String checkBody) {
        this.checkBody = checkBody;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getNeedConfirm() {
        return needConfirm;
    }

    public void setNeedConfirm(String needConfirm) {
        this.needConfirm = needConfirm;
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }

    public String getConfirmDept() {
        return confirmDept;
    }

    public void setConfirmDept(String confirmDept) {
        this.confirmDept = confirmDept;
    }

    public LocalDateTime getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(LocalDateTime confirmDate) {
        this.confirmDate = confirmDate;
    }

    public BigDecimal getBaseDose() {
        return baseDose;
    }

    public void setBaseDose(BigDecimal baseDose) {
        this.baseDose = baseDose;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public String getLabType() {
        return labType;
    }

    public void setLabType(String labType) {
        this.labType = labType;
    }

    public String getCheckBodyCode() {
        return checkBodyCode;
    }

    public void setCheckBodyCode(String checkBodyCode) {
        this.checkBodyCode = checkBodyCode;
    }

    public String getItemGrade() {
        return itemGrade;
    }

    public void setItemGrade(String itemGrade) {
        this.itemGrade = itemGrade;
    }

    public String getCombid() {
        return combid;
    }

    public void setCombid(String combid) {
        this.combid = combid;
    }

    public BigDecimal getUseDays() {
        return useDays;
    }

    public void setUseDays(BigDecimal useDays) {
        this.useDays = useDays;
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

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Integer getLongsequenceNo() {
        return longsequenceNo;
    }

    public void setLongsequenceNo(Integer longsequenceNo) {
        this.longsequenceNo = longsequenceNo;
    }

    @Override
    public String toString() {
        return "OrdLongexecuterecord{" +
        "seeNo=" + seeNo +
        ", sequenceNo=" + sequenceNo +
        ", valid=" + valid +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", spec=" + spec +
        ", drugFlag=" + drugFlag +
        ", classCode=" + classCode +
        ", feeCode=" + feeCode +
        ", unitPrice=" + unitPrice +
        ", qty=" + qty +
        ", days=" + days +
        ", packQty=" + packQty +
        ", itemUnit=" + itemUnit +
        ", ownCost=" + ownCost +
        ", payCost=" + payCost +
        ", pubCost=" + pubCost +
        ", onceDose=" + onceDose +
        ", onceUnit=" + onceUnit +
        ", freqCode=" + freqCode +
        ", usageCode=" + usageCode +
        ", usageName=" + usageName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", mainDrug=" + mainDrug +
        ", combNo=" + combNo +
        ", selfMade=" + selfMade +
        ", drugQuanlity=" + drugQuanlity +
        ", doctCode=" + doctCode +
        ", doctName=" + doctName +
        ", doctDeptid=" + doctDeptid +
        ", operDate=" + operDate +
        ", cancelUserid=" + cancelUserid +
        ", cancelDate=" + cancelDate +
        ", remark=" + remark +
        ", status=" + status +
        ", checkBody=" + checkBody +
        ", applyNo=" + applyNo +
        ", needConfirm=" + needConfirm +
        ", confirmCode=" + confirmCode +
        ", confirmDept=" + confirmDept +
        ", confirmDate=" + confirmDate +
        ", baseDose=" + baseDose +
        ", recipeNo=" + recipeNo +
        ", labType=" + labType +
        ", checkBodyCode=" + checkBodyCode +
        ", itemGrade=" + itemGrade +
        ", combid=" + combid +
        ", useDays=" + useDays +
        ", ztCode=" + ztCode +
        ", ztName=" + ztName +
        ", ordertype=" + ordertype +
        ", invoiceNo=" + invoiceNo +
        ", longsequenceNo=" + longsequenceNo +
        "}";
    }
}
