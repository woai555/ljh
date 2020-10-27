package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_IF_INPREPAY_USELESS
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewIfInprepayUseless implements Serializable {

    private static final long serialVersionUID=1L;

    private String receiptNo;


    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    @Override
    public String toString() {
        return "ViewIfInprepayUseless{" +
        "receiptNo=" + receiptNo +
        "}";
    }
}
