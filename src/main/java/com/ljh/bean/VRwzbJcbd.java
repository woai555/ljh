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
public class VRwzbJcbd implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String cardnoJyt;

    private String mcardNo;

    private String name;

    private String recipeNo;

    private BigDecimal sequenceNo;

    private String itemCode;

    private String itemName;

    private String typeId;

    private String typeName;

    private LocalDateTime yyDate;

    private LocalDateTime timeCome;

    private BigDecimal price;

    private String deptCode;

    private BigDecimal id;

    private String combNo;

    private BigDecimal mbId;

    private String seeNo;

    private LocalDateTime djDate;

    private BigDecimal jcOrder;

    private String jcStatus;

    private String jcMachinecode;

    private String idOri;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public BigDecimal getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(BigDecimal sequenceNo) {
        this.sequenceNo = sequenceNo;
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

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public LocalDateTime getYyDate() {
        return yyDate;
    }

    public void setYyDate(LocalDateTime yyDate) {
        this.yyDate = yyDate;
    }

    public LocalDateTime getTimeCome() {
        return timeCome;
    }

    public void setTimeCome(LocalDateTime timeCome) {
        this.timeCome = timeCome;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCombNo() {
        return combNo;
    }

    public void setCombNo(String combNo) {
        this.combNo = combNo;
    }

    public BigDecimal getMbId() {
        return mbId;
    }

    public void setMbId(BigDecimal mbId) {
        this.mbId = mbId;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public LocalDateTime getDjDate() {
        return djDate;
    }

    public void setDjDate(LocalDateTime djDate) {
        this.djDate = djDate;
    }

    public BigDecimal getJcOrder() {
        return jcOrder;
    }

    public void setJcOrder(BigDecimal jcOrder) {
        this.jcOrder = jcOrder;
    }

    public String getJcStatus() {
        return jcStatus;
    }

    public void setJcStatus(String jcStatus) {
        this.jcStatus = jcStatus;
    }

    public String getJcMachinecode() {
        return jcMachinecode;
    }

    public void setJcMachinecode(String jcMachinecode) {
        this.jcMachinecode = jcMachinecode;
    }

    public String getIdOri() {
        return idOri;
    }

    public void setIdOri(String idOri) {
        this.idOri = idOri;
    }

    @Override
    public String toString() {
        return "VRwzbJcbd{" +
        "cardNo=" + cardNo +
        ", cardnoJyt=" + cardnoJyt +
        ", mcardNo=" + mcardNo +
        ", name=" + name +
        ", recipeNo=" + recipeNo +
        ", sequenceNo=" + sequenceNo +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", typeId=" + typeId +
        ", typeName=" + typeName +
        ", yyDate=" + yyDate +
        ", timeCome=" + timeCome +
        ", price=" + price +
        ", deptCode=" + deptCode +
        ", id=" + id +
        ", combNo=" + combNo +
        ", mbId=" + mbId +
        ", seeNo=" + seeNo +
        ", djDate=" + djDate +
        ", jcOrder=" + jcOrder +
        ", jcStatus=" + jcStatus +
        ", jcMachinecode=" + jcMachinecode +
        ", idOri=" + idOri +
        "}";
    }
}
