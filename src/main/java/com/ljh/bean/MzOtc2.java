package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 不合格处方登记表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MzOtc2 implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 流水序号 *
     */
    @TableId(value = "NUM_NO", type = IdType.AUTO)
    private BigDecimal numNo;

    /**
     * 处方号 *
     */
    private String recipeNo;

    /**
     * 就诊卡号 *
     */
    private String cardNo;

    /**
     * 发票号 *
     */
    private String invoiceNo;

    /**
     * 挂号日期 *
     */
    private LocalDateTime regDate;

    /**
     * 不合格处方原因 ：1-诊断与用药不符 2-开药超限量 3-存在说明书禁忌用药 4-无签字/与签字卡不符 5-剂量剂型用法不当 6-疑似重复用药 7-处方前记有误 8-其他(合理性不确定性的)
     */
    private String recipeYy;

    /**
     * 操作日期 *
     */
    private LocalDateTime operDate;

    /**
     * 操作人 *
     */
    private String opertor;

    /**
     * 备注
     */
    private String remark;

    /**
     * 药品编码 *
     */
    private String drugCode;

    /**
     * 药品名称 *
     */
    private String drugName;

    /**
     * 患者姓名
     */
    private String name;

    /**
     * 患者性别
     */
    private String sex;

    /**
     * 结算类别
     */
    private String paykind;

    /**
     * 看诊科室
     */
    private String seedept;

    /**
     * 总金额
     */
    private BigDecimal ownCost;

    /**
     * 开方医生
     */
    private String doctCode;

    /**
     * 标志
     */
    private String bz;

    /**
     * 规格
     */
    private String spec;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private BigDecimal qty;


    public BigDecimal getNumNo() {
        return numNo;
    }

    public void setNumNo(BigDecimal numNo) {
        this.numNo = numNo;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getRecipeYy() {
        return recipeYy;
    }

    public void setRecipeYy(String recipeYy) {
        this.recipeYy = recipeYy;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOpertor() {
        return opertor;
    }

    public void setOpertor(String opertor) {
        this.opertor = opertor;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPaykind() {
        return paykind;
    }

    public void setPaykind(String paykind) {
        this.paykind = paykind;
    }

    public String getSeedept() {
        return seedept;
    }

    public void setSeedept(String seedept) {
        this.seedept = seedept;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "MzOtc2{" +
        "numNo=" + numNo +
        ", recipeNo=" + recipeNo +
        ", cardNo=" + cardNo +
        ", invoiceNo=" + invoiceNo +
        ", regDate=" + regDate +
        ", recipeYy=" + recipeYy +
        ", operDate=" + operDate +
        ", opertor=" + opertor +
        ", remark=" + remark +
        ", drugCode=" + drugCode +
        ", drugName=" + drugName +
        ", name=" + name +
        ", sex=" + sex +
        ", paykind=" + paykind +
        ", seedept=" + seedept +
        ", ownCost=" + ownCost +
        ", doctCode=" + doctCode +
        ", bz=" + bz +
        ", spec=" + spec +
        ", price=" + price +
        ", qty=" + qty +
        "}";
    }
}
