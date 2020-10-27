package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class QfRecordMidtable implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    private String invoiceNo;

    private String divideSXml;

    private String divideXml;


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

    public String getDivideSXml() {
        return divideSXml;
    }

    public void setDivideSXml(String divideSXml) {
        this.divideSXml = divideSXml;
    }

    public String getDivideXml() {
        return divideXml;
    }

    public void setDivideXml(String divideXml) {
        this.divideXml = divideXml;
    }

    @Override
    public String toString() {
        return "QfRecordMidtable{" +
        "cardNo=" + cardNo +
        ", invoiceNo=" + invoiceNo +
        ", divideSXml=" + divideSXml +
        ", divideXml=" + divideXml +
        "}";
    }
}
