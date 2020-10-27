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
public class WfDeprecord implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "YEARCODE", type = IdType.AUTO)
    private String yearcode;

    private String yearmonth;

    private BigDecimal cardno;

    private String facinamecode;

    private String facilityname;

    private String facikind;

    private String speci;

    private String faciunit;

    private Integer status;

    private String deptcode;

    private BigDecimal deprate;

    private BigDecimal depno;

    private BigDecimal monthdepre;

    private BigDecimal scrapvalue;

    private LocalDateTime begindate;

    private LocalDateTime enddate;

    private String operator;

    private LocalDateTime registdate;


    public String getYearcode() {
        return yearcode;
    }

    public void setYearcode(String yearcode) {
        this.yearcode = yearcode;
    }

    public String getYearmonth() {
        return yearmonth;
    }

    public void setYearmonth(String yearmonth) {
        this.yearmonth = yearmonth;
    }

    public BigDecimal getCardno() {
        return cardno;
    }

    public void setCardno(BigDecimal cardno) {
        this.cardno = cardno;
    }

    public String getFacinamecode() {
        return facinamecode;
    }

    public void setFacinamecode(String facinamecode) {
        this.facinamecode = facinamecode;
    }

    public String getFacilityname() {
        return facilityname;
    }

    public void setFacilityname(String facilityname) {
        this.facilityname = facilityname;
    }

    public String getFacikind() {
        return facikind;
    }

    public void setFacikind(String facikind) {
        this.facikind = facikind;
    }

    public String getSpeci() {
        return speci;
    }

    public void setSpeci(String speci) {
        this.speci = speci;
    }

    public String getFaciunit() {
        return faciunit;
    }

    public void setFaciunit(String faciunit) {
        this.faciunit = faciunit;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public BigDecimal getDeprate() {
        return deprate;
    }

    public void setDeprate(BigDecimal deprate) {
        this.deprate = deprate;
    }

    public BigDecimal getDepno() {
        return depno;
    }

    public void setDepno(BigDecimal depno) {
        this.depno = depno;
    }

    public BigDecimal getMonthdepre() {
        return monthdepre;
    }

    public void setMonthdepre(BigDecimal monthdepre) {
        this.monthdepre = monthdepre;
    }

    public BigDecimal getScrapvalue() {
        return scrapvalue;
    }

    public void setScrapvalue(BigDecimal scrapvalue) {
        this.scrapvalue = scrapvalue;
    }

    public LocalDateTime getBegindate() {
        return begindate;
    }

    public void setBegindate(LocalDateTime begindate) {
        this.begindate = begindate;
    }

    public LocalDateTime getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        this.enddate = enddate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LocalDateTime getRegistdate() {
        return registdate;
    }

    public void setRegistdate(LocalDateTime registdate) {
        this.registdate = registdate;
    }

    @Override
    public String toString() {
        return "WfDeprecord{" +
        "yearcode=" + yearcode +
        ", yearmonth=" + yearmonth +
        ", cardno=" + cardno +
        ", facinamecode=" + facinamecode +
        ", facilityname=" + facilityname +
        ", facikind=" + facikind +
        ", speci=" + speci +
        ", faciunit=" + faciunit +
        ", status=" + status +
        ", deptcode=" + deptcode +
        ", deprate=" + deprate +
        ", depno=" + depno +
        ", monthdepre=" + monthdepre +
        ", scrapvalue=" + scrapvalue +
        ", begindate=" + begindate +
        ", enddate=" + enddate +
        ", operator=" + operator +
        ", registdate=" + registdate +
        "}";
    }
}
