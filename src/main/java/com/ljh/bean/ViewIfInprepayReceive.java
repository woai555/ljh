package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_IF_INPREPAY_RECEIVE
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewIfInprepayReceive implements Serializable {

    private static final long serialVersionUID=1L;

    private String receiptNoMin;

    private String receiptNoMax;


    public String getReceiptNoMin() {
        return receiptNoMin;
    }

    public void setReceiptNoMin(String receiptNoMin) {
        this.receiptNoMin = receiptNoMin;
    }

    public String getReceiptNoMax() {
        return receiptNoMax;
    }

    public void setReceiptNoMax(String receiptNoMax) {
        this.receiptNoMax = receiptNoMax;
    }

    @Override
    public String toString() {
        return "ViewIfInprepayReceive{" +
        "receiptNoMin=" + receiptNoMin +
        ", receiptNoMax=" + receiptNoMax +
        "}";
    }
}
