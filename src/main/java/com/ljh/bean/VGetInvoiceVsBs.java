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
public class VGetInvoiceVsBs implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime getDtime;

    private String getPersonCode;

    private String invoiceType;

    private String startNo;

    private String endNo;

    private String userdNo;

    private Integer usedState;

    private String bsBilltype;

    private String bsBillreg;

    private String bsUploads;


    public LocalDateTime getGetDtime() {
        return getDtime;
    }

    public void setGetDtime(LocalDateTime getDtime) {
        this.getDtime = getDtime;
    }

    public String getGetPersonCode() {
        return getPersonCode;
    }

    public void setGetPersonCode(String getPersonCode) {
        this.getPersonCode = getPersonCode;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getStartNo() {
        return startNo;
    }

    public void setStartNo(String startNo) {
        this.startNo = startNo;
    }

    public String getEndNo() {
        return endNo;
    }

    public void setEndNo(String endNo) {
        this.endNo = endNo;
    }

    public String getUserdNo() {
        return userdNo;
    }

    public void setUserdNo(String userdNo) {
        this.userdNo = userdNo;
    }

    public Integer getUsedState() {
        return usedState;
    }

    public void setUsedState(Integer usedState) {
        this.usedState = usedState;
    }

    public String getBsBilltype() {
        return bsBilltype;
    }

    public void setBsBilltype(String bsBilltype) {
        this.bsBilltype = bsBilltype;
    }

    public String getBsBillreg() {
        return bsBillreg;
    }

    public void setBsBillreg(String bsBillreg) {
        this.bsBillreg = bsBillreg;
    }

    public String getBsUploads() {
        return bsUploads;
    }

    public void setBsUploads(String bsUploads) {
        this.bsUploads = bsUploads;
    }

    @Override
    public String toString() {
        return "VGetInvoiceVsBs{" +
        "getDtime=" + getDtime +
        ", getPersonCode=" + getPersonCode +
        ", invoiceType=" + invoiceType +
        ", startNo=" + startNo +
        ", endNo=" + endNo +
        ", userdNo=" + userdNo +
        ", usedState=" + usedState +
        ", bsBilltype=" + bsBilltype +
        ", bsBillreg=" + bsBillreg +
        ", bsUploads=" + bsUploads +
        "}";
    }
}
