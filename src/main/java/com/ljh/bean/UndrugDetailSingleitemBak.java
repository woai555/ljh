package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊非药品最单项明细表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class UndrugDetailSingleitemBak implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 患者卡号
     */
    private String cardNo;

    /**
     * 处方号
     */
    private String recipeNo;

    /**
     * 处方序号
     */
    private Integer sequenceNo;

    /**
     * 收费类别
     */
    private String transType;

    /**
     * 明细项目编码
     */
    private String itemcode;

    /**
     * 明细项目名称
     */
    private String itemname;

    /**
     * 明细项目价格
     */
    private BigDecimal itemprice;

    /**
     * 明细项目规格
     */
    private String spec;

    /**
     * 明细项目数量
     */
    private BigDecimal quantity;

    /**
     * 收费日期
     */
    private LocalDateTime feedate;

    /**
     * 项目编码
     */
    private String itemCode;

    /**
     * 发票号
     */
    private String invoiceNo;

    /**
     * 医保内金额
     */
    private BigDecimal pubCost;

    /**
     * 个人账户支付
     */
    private BigDecimal payCost;

    /**
     * 医保外金额
     */
    private BigDecimal ownCost;

    /**
     * 备注
     */
    private String remark;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

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

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public BigDecimal getItemprice() {
        return itemprice;
    }

    public void setItemprice(BigDecimal itemprice) {
        this.itemprice = itemprice;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getFeedate() {
        return feedate;
    }

    public void setFeedate(LocalDateTime feedate) {
        this.feedate = feedate;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "UndrugDetailSingleitemBak{" +
        "cardNo=" + cardNo +
        ", recipeNo=" + recipeNo +
        ", sequenceNo=" + sequenceNo +
        ", transType=" + transType +
        ", itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", itemprice=" + itemprice +
        ", spec=" + spec +
        ", quantity=" + quantity +
        ", feedate=" + feedate +
        ", itemCode=" + itemCode +
        ", invoiceNo=" + invoiceNo +
        ", pubCost=" + pubCost +
        ", payCost=" + payCost +
        ", ownCost=" + ownCost +
        ", remark=" + remark +
        "}";
    }
}
