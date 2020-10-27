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
public class VAppFeelist implements Serializable {

    private static final long serialVersionUID=1L;

    private String feeno;

    private String feename;

    private LocalDateTime crtreptime;

    private BigDecimal totalcost;

    private BigDecimal healcost;

    private BigDecimal selfcost;

    private String payby;

    private LocalDateTime paytime;

    private String paystatus;

    private LocalDateTime visitingtime;

    private String diagnosis;

    private String deptname;

    private String docname;

    private String patname;

    private String idcardtype;

    private String idcardno;

    private String accesspatid;

    private String patcardtype;

    private String patcardno;

    private String paybyname;

    private String elepayno;

    private String guideinfo;

    private String fb1;

    private String regTime;

    private String cardNo;

    private LocalDateTime startdate;

    private LocalDateTime enddate;


    public String getFeeno() {
        return feeno;
    }

    public void setFeeno(String feeno) {
        this.feeno = feeno;
    }

    public String getFeename() {
        return feename;
    }

    public void setFeename(String feename) {
        this.feename = feename;
    }

    public LocalDateTime getCrtreptime() {
        return crtreptime;
    }

    public void setCrtreptime(LocalDateTime crtreptime) {
        this.crtreptime = crtreptime;
    }

    public BigDecimal getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(BigDecimal totalcost) {
        this.totalcost = totalcost;
    }

    public BigDecimal getHealcost() {
        return healcost;
    }

    public void setHealcost(BigDecimal healcost) {
        this.healcost = healcost;
    }

    public BigDecimal getSelfcost() {
        return selfcost;
    }

    public void setSelfcost(BigDecimal selfcost) {
        this.selfcost = selfcost;
    }

    public String getPayby() {
        return payby;
    }

    public void setPayby(String payby) {
        this.payby = payby;
    }

    public LocalDateTime getPaytime() {
        return paytime;
    }

    public void setPaytime(LocalDateTime paytime) {
        this.paytime = paytime;
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

    public LocalDateTime getVisitingtime() {
        return visitingtime;
    }

    public void setVisitingtime(LocalDateTime visitingtime) {
        this.visitingtime = visitingtime;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public String getPatname() {
        return patname;
    }

    public void setPatname(String patname) {
        this.patname = patname;
    }

    public String getIdcardtype() {
        return idcardtype;
    }

    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getAccesspatid() {
        return accesspatid;
    }

    public void setAccesspatid(String accesspatid) {
        this.accesspatid = accesspatid;
    }

    public String getPatcardtype() {
        return patcardtype;
    }

    public void setPatcardtype(String patcardtype) {
        this.patcardtype = patcardtype;
    }

    public String getPatcardno() {
        return patcardno;
    }

    public void setPatcardno(String patcardno) {
        this.patcardno = patcardno;
    }

    public String getPaybyname() {
        return paybyname;
    }

    public void setPaybyname(String paybyname) {
        this.paybyname = paybyname;
    }

    public String getElepayno() {
        return elepayno;
    }

    public void setElepayno(String elepayno) {
        this.elepayno = elepayno;
    }

    public String getGuideinfo() {
        return guideinfo;
    }

    public void setGuideinfo(String guideinfo) {
        this.guideinfo = guideinfo;
    }

    public String getFb1() {
        return fb1;
    }

    public void setFb1(String fb1) {
        this.fb1 = fb1;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDateTime startdate) {
        this.startdate = startdate;
    }

    public LocalDateTime getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "VAppFeelist{" +
        "feeno=" + feeno +
        ", feename=" + feename +
        ", crtreptime=" + crtreptime +
        ", totalcost=" + totalcost +
        ", healcost=" + healcost +
        ", selfcost=" + selfcost +
        ", payby=" + payby +
        ", paytime=" + paytime +
        ", paystatus=" + paystatus +
        ", visitingtime=" + visitingtime +
        ", diagnosis=" + diagnosis +
        ", deptname=" + deptname +
        ", docname=" + docname +
        ", patname=" + patname +
        ", idcardtype=" + idcardtype +
        ", idcardno=" + idcardno +
        ", accesspatid=" + accesspatid +
        ", patcardtype=" + patcardtype +
        ", patcardno=" + patcardno +
        ", paybyname=" + paybyname +
        ", elepayno=" + elepayno +
        ", guideinfo=" + guideinfo +
        ", fb1=" + fb1 +
        ", regTime=" + regTime +
        ", cardNo=" + cardNo +
        ", startdate=" + startdate +
        ", enddate=" + enddate +
        "}";
    }
}
