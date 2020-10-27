package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_INVOICE_RETURN
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewInvoiceReturn implements Serializable {

    private static final long serialVersionUID=1L;

    private String invoiceNo;

    private String paykindCode;


    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    @Override
    public String toString() {
        return "ViewInvoiceReturn{" +
        "invoiceNo=" + invoiceNo +
        ", paykindCode=" + paykindCode +
        "}";
    }
}
