package com.ljh.bean;

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
public class VeiwTestDrugNosend implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime feeDate;

    private String payFlag;

    private String feeCode;

    private Integer windowNo;

    private String invoiceNo;

    private String printNum;


    public LocalDateTime getFeeDate() {
        return feeDate;
    }

    public void setFeeDate(LocalDateTime feeDate) {
        this.feeDate = feeDate;
    }

    public String getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public Integer getWindowNo() {
        return windowNo;
    }

    public void setWindowNo(Integer windowNo) {
        this.windowNo = windowNo;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getPrintNum() {
        return printNum;
    }

    public void setPrintNum(String printNum) {
        this.printNum = printNum;
    }

    @Override
    public String toString() {
        return "VeiwTestDrugNosend{" +
        "feeDate=" + feeDate +
        ", payFlag=" + payFlag +
        ", feeCode=" + feeCode +
        ", windowNo=" + windowNo +
        ", invoiceNo=" + invoiceNo +
        ", printNum=" + printNum +
        "}";
    }
}
