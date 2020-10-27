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
public class VYyPatient implements Serializable {

    private static final long serialVersionUID=1L;

    private String orderId;

    private String name;

    private String idenno;

    private String sexCode;

    private LocalDateTime birthday;

    private String dist;

    private String nationCode;

    private String mari;

    private String profCode;

    private String area;

    private String counCode;

    private String bloodCode;

    private String mcardNo;

    private String mcardId;

    private String paykindCode;

    private String pactCode;

    private String workName;

    private String workTel;

    private String workZip;

    private String workAdd;

    private String home;

    private String homeTel;

    private String homeZip;

    private String linkmanName;

    private String relaCode;

    private String linkmanTel;

    private String linkmanAdd;

    private String deptCode;

    private String noonCode;

    private LocalDateTime bookDate;

    private String ifReg;

    private String regOper;

    private LocalDateTime regDate;

    private String cardNo;

    private BigDecimal bookType;

    private String reglevlCode;

    private String reglevlName;

    private String doctCode;

    private String opercode;

    private LocalDateTime operdate;

    private String timeCode;

    private String firstDept;

    private String payWay;

    private String cardnoJyt;

    private String aliorderid;

    private BigDecimal refundAmount;

    private BigDecimal medicareAmount;

    private BigDecimal medicarePersonalFee;

    private String place;

    private String visitTime;

    private String jytChannel;

    private String alitradeno;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getMari() {
        return mari;
    }

    public void setMari(String mari) {
        this.mari = mari;
    }

    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCounCode() {
        return counCode;
    }

    public void setCounCode(String counCode) {
        this.counCode = counCode;
    }

    public String getBloodCode() {
        return bloodCode;
    }

    public void setBloodCode(String bloodCode) {
        this.bloodCode = bloodCode;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getMcardId() {
        return mcardId;
    }

    public void setMcardId(String mcardId) {
        this.mcardId = mcardId;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkTel() {
        return workTel;
    }

    public void setWorkTel(String workTel) {
        this.workTel = workTel;
    }

    public String getWorkZip() {
        return workZip;
    }

    public void setWorkZip(String workZip) {
        this.workZip = workZip;
    }

    public String getWorkAdd() {
        return workAdd;
    }

    public void setWorkAdd(String workAdd) {
        this.workAdd = workAdd;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getHomeZip() {
        return homeZip;
    }

    public void setHomeZip(String homeZip) {
        this.homeZip = homeZip;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }

    public String getRelaCode() {
        return relaCode;
    }

    public void setRelaCode(String relaCode) {
        this.relaCode = relaCode;
    }

    public String getLinkmanTel() {
        return linkmanTel;
    }

    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel;
    }

    public String getLinkmanAdd() {
        return linkmanAdd;
    }

    public void setLinkmanAdd(String linkmanAdd) {
        this.linkmanAdd = linkmanAdd;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public LocalDateTime getBookDate() {
        return bookDate;
    }

    public void setBookDate(LocalDateTime bookDate) {
        this.bookDate = bookDate;
    }

    public String getIfReg() {
        return ifReg;
    }

    public void setIfReg(String ifReg) {
        this.ifReg = ifReg;
    }

    public String getRegOper() {
        return regOper;
    }

    public void setRegOper(String regOper) {
        this.regOper = regOper;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public BigDecimal getBookType() {
        return bookType;
    }

    public void setBookType(BigDecimal bookType) {
        this.bookType = bookType;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getReglevlName() {
        return reglevlName;
    }

    public void setReglevlName(String reglevlName) {
        this.reglevlName = reglevlName;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getOpercode() {
        return opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    public String getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
    }

    public String getFirstDept() {
        return firstDept;
    }

    public void setFirstDept(String firstDept) {
        this.firstDept = firstDept;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getAliorderid() {
        return aliorderid;
    }

    public void setAliorderid(String aliorderid) {
        this.aliorderid = aliorderid;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getMedicareAmount() {
        return medicareAmount;
    }

    public void setMedicareAmount(BigDecimal medicareAmount) {
        this.medicareAmount = medicareAmount;
    }

    public BigDecimal getMedicarePersonalFee() {
        return medicarePersonalFee;
    }

    public void setMedicarePersonalFee(BigDecimal medicarePersonalFee) {
        this.medicarePersonalFee = medicarePersonalFee;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public String getJytChannel() {
        return jytChannel;
    }

    public void setJytChannel(String jytChannel) {
        this.jytChannel = jytChannel;
    }

    public String getAlitradeno() {
        return alitradeno;
    }

    public void setAlitradeno(String alitradeno) {
        this.alitradeno = alitradeno;
    }

    @Override
    public String toString() {
        return "VYyPatient{" +
        "orderId=" + orderId +
        ", name=" + name +
        ", idenno=" + idenno +
        ", sexCode=" + sexCode +
        ", birthday=" + birthday +
        ", dist=" + dist +
        ", nationCode=" + nationCode +
        ", mari=" + mari +
        ", profCode=" + profCode +
        ", area=" + area +
        ", counCode=" + counCode +
        ", bloodCode=" + bloodCode +
        ", mcardNo=" + mcardNo +
        ", mcardId=" + mcardId +
        ", paykindCode=" + paykindCode +
        ", pactCode=" + pactCode +
        ", workName=" + workName +
        ", workTel=" + workTel +
        ", workZip=" + workZip +
        ", workAdd=" + workAdd +
        ", home=" + home +
        ", homeTel=" + homeTel +
        ", homeZip=" + homeZip +
        ", linkmanName=" + linkmanName +
        ", relaCode=" + relaCode +
        ", linkmanTel=" + linkmanTel +
        ", linkmanAdd=" + linkmanAdd +
        ", deptCode=" + deptCode +
        ", noonCode=" + noonCode +
        ", bookDate=" + bookDate +
        ", ifReg=" + ifReg +
        ", regOper=" + regOper +
        ", regDate=" + regDate +
        ", cardNo=" + cardNo +
        ", bookType=" + bookType +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", doctCode=" + doctCode +
        ", opercode=" + opercode +
        ", operdate=" + operdate +
        ", timeCode=" + timeCode +
        ", firstDept=" + firstDept +
        ", payWay=" + payWay +
        ", cardnoJyt=" + cardnoJyt +
        ", aliorderid=" + aliorderid +
        ", refundAmount=" + refundAmount +
        ", medicareAmount=" + medicareAmount +
        ", medicarePersonalFee=" + medicarePersonalFee +
        ", place=" + place +
        ", visitTime=" + visitTime +
        ", jytChannel=" + jytChannel +
        ", alitradeno=" + alitradeno +
        "}";
    }
}
