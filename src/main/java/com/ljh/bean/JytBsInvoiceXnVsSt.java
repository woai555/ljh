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
public class JytBsInvoiceXnVsSt implements Serializable {

    private static final long serialVersionUID=1L;

    private String serialno;

    private String fbillno;

    private String transType;


    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public String getFbillno() {
        return fbillno;
    }

    public void setFbillno(String fbillno) {
        this.fbillno = fbillno;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    @Override
    public String toString() {
        return "JytBsInvoiceXnVsSt{" +
        "serialno=" + serialno +
        ", fbillno=" + fbillno +
        ", transType=" + transType +
        "}";
    }
}
