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
public class ViewJcptYyjc implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal id;

    private String cardNo;

    private String patientName;

    private String itemName;

    private String yyDate;

    private LocalDateTime operDate;


    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getYyDate() {
        return yyDate;
    }

    public void setYyDate(String yyDate) {
        this.yyDate = yyDate;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "ViewJcptYyjc{" +
        "id=" + id +
        ", cardNo=" + cardNo +
        ", patientName=" + patientName +
        ", itemName=" + itemName +
        ", yyDate=" + yyDate +
        ", operDate=" + operDate +
        "}";
    }
}
