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
public class VYyjcDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String itemCode;

    private LocalDateTime yyDate;

    private BigDecimal yyWb;

    private String deptCode;

    private String operCode;

    private String operName;

    private LocalDateTime operDate;

    private BigDecimal id;

    private LocalDateTime djDate;

    private String seeNo;

    private String cancel;

    private String cancelOper;

    private String ynyy;

    private String itemName;

    private BigDecimal price;

    private String source;

    private String patientName;

    private String ifdoct;

    private LocalDateTime cancelDate;

    private LocalDateTime delOper;

    private LocalDateTime delDate;

    private String tel;

    private String typeId;

    private String typeName;

    private LocalDateTime timeFrom;

    private LocalDateTime timeTo;

    private LocalDateTime timeCome;

    private BigDecimal mbId;

    private String recipeNo;

    private BigDecimal sequenceNo;

    private String combNo;

    private BigDecimal orderNo;

    private String noonCode;

    private BigDecimal weight;

    private String remark;

    private String idOri;

    private String idOriSeq;

    private String ynChoosedate;

    private BigDecimal patientsource;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public LocalDateTime getYyDate() {
        return yyDate;
    }

    public void setYyDate(LocalDateTime yyDate) {
        this.yyDate = yyDate;
    }

    public BigDecimal getYyWb() {
        return yyWb;
    }

    public void setYyWb(BigDecimal yyWb) {
        this.yyWb = yyWb;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public LocalDateTime getDjDate() {
        return djDate;
    }

    public void setDjDate(LocalDateTime djDate) {
        this.djDate = djDate;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public String getCancelOper() {
        return cancelOper;
    }

    public void setCancelOper(String cancelOper) {
        this.cancelOper = cancelOper;
    }

    public String getYnyy() {
        return ynyy;
    }

    public void setYnyy(String ynyy) {
        this.ynyy = ynyy;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getIfdoct() {
        return ifdoct;
    }

    public void setIfdoct(String ifdoct) {
        this.ifdoct = ifdoct;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public LocalDateTime getDelOper() {
        return delOper;
    }

    public void setDelOper(LocalDateTime delOper) {
        this.delOper = delOper;
    }

    public LocalDateTime getDelDate() {
        return delDate;
    }

    public void setDelDate(LocalDateTime delDate) {
        this.delDate = delDate;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public LocalDateTime getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(LocalDateTime timeFrom) {
        this.timeFrom = timeFrom;
    }

    public LocalDateTime getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(LocalDateTime timeTo) {
        this.timeTo = timeTo;
    }

    public LocalDateTime getTimeCome() {
        return timeCome;
    }

    public void setTimeCome(LocalDateTime timeCome) {
        this.timeCome = timeCome;
    }

    public BigDecimal getMbId() {
        return mbId;
    }

    public void setMbId(BigDecimal mbId) {
        this.mbId = mbId;
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

    public String getCombNo() {
        return combNo;
    }

    public void setCombNo(String combNo) {
        this.combNo = combNo;
    }

    public BigDecimal getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(BigDecimal orderNo) {
        this.orderNo = orderNo;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIdOri() {
        return idOri;
    }

    public void setIdOri(String idOri) {
        this.idOri = idOri;
    }

    public String getIdOriSeq() {
        return idOriSeq;
    }

    public void setIdOriSeq(String idOriSeq) {
        this.idOriSeq = idOriSeq;
    }

    public String getYnChoosedate() {
        return ynChoosedate;
    }

    public void setYnChoosedate(String ynChoosedate) {
        this.ynChoosedate = ynChoosedate;
    }

    public BigDecimal getPatientsource() {
        return patientsource;
    }

    public void setPatientsource(BigDecimal patientsource) {
        this.patientsource = patientsource;
    }

    @Override
    public String toString() {
        return "VYyjcDetail{" +
        "cardNo=" + cardNo +
        ", itemCode=" + itemCode +
        ", yyDate=" + yyDate +
        ", yyWb=" + yyWb +
        ", deptCode=" + deptCode +
        ", operCode=" + operCode +
        ", operName=" + operName +
        ", operDate=" + operDate +
        ", id=" + id +
        ", djDate=" + djDate +
        ", seeNo=" + seeNo +
        ", cancel=" + cancel +
        ", cancelOper=" + cancelOper +
        ", ynyy=" + ynyy +
        ", itemName=" + itemName +
        ", price=" + price +
        ", source=" + source +
        ", patientName=" + patientName +
        ", ifdoct=" + ifdoct +
        ", cancelDate=" + cancelDate +
        ", delOper=" + delOper +
        ", delDate=" + delDate +
        ", tel=" + tel +
        ", typeId=" + typeId +
        ", typeName=" + typeName +
        ", timeFrom=" + timeFrom +
        ", timeTo=" + timeTo +
        ", timeCome=" + timeCome +
        ", mbId=" + mbId +
        ", recipeNo=" + recipeNo +
        ", sequenceNo=" + sequenceNo +
        ", combNo=" + combNo +
        ", orderNo=" + orderNo +
        ", noonCode=" + noonCode +
        ", weight=" + weight +
        ", remark=" + remark +
        ", idOri=" + idOri +
        ", idOriSeq=" + idOriSeq +
        ", ynChoosedate=" + ynChoosedate +
        ", patientsource=" + patientsource +
        "}";
    }
}
