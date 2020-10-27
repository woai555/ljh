package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_INVOICE_PAYKIND
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewInvoicePaykind implements Serializable {

    private static final long serialVersionUID=1L;

    private String paykindCode;


    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    @Override
    public String toString() {
        return "ViewInvoicePaykind{" +
        "paykindCode=" + paykindCode +
        "}";
    }
}
