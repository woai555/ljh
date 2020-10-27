package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术申请表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpApply implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "OPERATIONNO", type = IdType.AUTO)
    private String operationno;

    private BigDecimal recordno;

    private String inpatientNo;

    private String patientNo;

    private String cardNo;

    private LocalDateTime regDate;

    private String bedNo;

    /**
     * 1门诊  2 住院
     */
    private String pasource;

    private String name;

    private String sex;

    private LocalDateTime birthday;

    private BigDecimal prepayCost;

    private String deptCode;

    private String bloodcode;

    private String operationkind;

    private String operationitem;

    private String diagnose;

    private String operatedoc;

    private String guidedoc;

    private String ynemclinic;

    private String seedoctype;

    private String sickroom;

    private BigDecimal duration;

    private LocalDateTime predtime;

    private String anestype;

    private BigDecimal helpernum;

    private BigDecimal washnurse;

    private BigDecimal acconurse;

    private BigDecimal prepnurse;

    private String execdept;

    /**
     * 1普通 2加台 3点台 4 加急台
     */
    private String consoletype;

    private String applydoc;

    private LocalDateTime applytime;

    private String applynote;

    private String approvedoc;

    private LocalDateTime approvetime;

    private String approvenote;

    private String anesdoc;

    private BigDecimal fee;

    private String degree;

    private String incisiontype;

    /**
     * 1 有菌 2无菌
     */
    private String yngerm;

    /**
     * 1 幕上 2 幕下
     */
    private String screenupe;

    private String operoom;

    private String console;

    private LocalDateTime recepttime;

    private String bloodkind;

    private BigDecimal bloodnum;

    private String bloodunit;

    private String operatenote;

    private String anesthnote;

    /**
     * 1手术申请 2 手术审批 3手术安排 4手术完成
     */
    private String execstatus;

    /**
     * 0未做手术  1已做手术
     */
    private String ynfinished;

    /**
     * 0 未麻醉  1 已麻醉
     */
    private String ynanesth;

    private String folk;

    private String relation;

    private String folkcomment;

    /**
     * 1是  2否
     */
    private String ynurgent;

    private String ynchange;

    private String ynheavy;

    private String operator;

    private LocalDateTime operatetime;

    /**
     * 0 无效  1有效
     */
    private String ynvalid;

    private String ynunite;

    private String uniteNo;


    public String getOperationno() {
        return operationno;
    }

    public void setOperationno(String operationno) {
        this.operationno = operationno;
    }

    public BigDecimal getRecordno() {
        return recordno;
    }

    public void setRecordno(BigDecimal recordno) {
        this.recordno = recordno;
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getPasource() {
        return pasource;
    }

    public void setPasource(String pasource) {
        this.pasource = pasource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getPrepayCost() {
        return prepayCost;
    }

    public void setPrepayCost(BigDecimal prepayCost) {
        this.prepayCost = prepayCost;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getBloodcode() {
        return bloodcode;
    }

    public void setBloodcode(String bloodcode) {
        this.bloodcode = bloodcode;
    }

    public String getOperationkind() {
        return operationkind;
    }

    public void setOperationkind(String operationkind) {
        this.operationkind = operationkind;
    }

    public String getOperationitem() {
        return operationitem;
    }

    public void setOperationitem(String operationitem) {
        this.operationitem = operationitem;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getOperatedoc() {
        return operatedoc;
    }

    public void setOperatedoc(String operatedoc) {
        this.operatedoc = operatedoc;
    }

    public String getGuidedoc() {
        return guidedoc;
    }

    public void setGuidedoc(String guidedoc) {
        this.guidedoc = guidedoc;
    }

    public String getYnemclinic() {
        return ynemclinic;
    }

    public void setYnemclinic(String ynemclinic) {
        this.ynemclinic = ynemclinic;
    }

    public String getSeedoctype() {
        return seedoctype;
    }

    public void setSeedoctype(String seedoctype) {
        this.seedoctype = seedoctype;
    }

    public String getSickroom() {
        return sickroom;
    }

    public void setSickroom(String sickroom) {
        this.sickroom = sickroom;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public LocalDateTime getPredtime() {
        return predtime;
    }

    public void setPredtime(LocalDateTime predtime) {
        this.predtime = predtime;
    }

    public String getAnestype() {
        return anestype;
    }

    public void setAnestype(String anestype) {
        this.anestype = anestype;
    }

    public BigDecimal getHelpernum() {
        return helpernum;
    }

    public void setHelpernum(BigDecimal helpernum) {
        this.helpernum = helpernum;
    }

    public BigDecimal getWashnurse() {
        return washnurse;
    }

    public void setWashnurse(BigDecimal washnurse) {
        this.washnurse = washnurse;
    }

    public BigDecimal getAcconurse() {
        return acconurse;
    }

    public void setAcconurse(BigDecimal acconurse) {
        this.acconurse = acconurse;
    }

    public BigDecimal getPrepnurse() {
        return prepnurse;
    }

    public void setPrepnurse(BigDecimal prepnurse) {
        this.prepnurse = prepnurse;
    }

    public String getExecdept() {
        return execdept;
    }

    public void setExecdept(String execdept) {
        this.execdept = execdept;
    }

    public String getConsoletype() {
        return consoletype;
    }

    public void setConsoletype(String consoletype) {
        this.consoletype = consoletype;
    }

    public String getApplydoc() {
        return applydoc;
    }

    public void setApplydoc(String applydoc) {
        this.applydoc = applydoc;
    }

    public LocalDateTime getApplytime() {
        return applytime;
    }

    public void setApplytime(LocalDateTime applytime) {
        this.applytime = applytime;
    }

    public String getApplynote() {
        return applynote;
    }

    public void setApplynote(String applynote) {
        this.applynote = applynote;
    }

    public String getApprovedoc() {
        return approvedoc;
    }

    public void setApprovedoc(String approvedoc) {
        this.approvedoc = approvedoc;
    }

    public LocalDateTime getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(LocalDateTime approvetime) {
        this.approvetime = approvetime;
    }

    public String getApprovenote() {
        return approvenote;
    }

    public void setApprovenote(String approvenote) {
        this.approvenote = approvenote;
    }

    public String getAnesdoc() {
        return anesdoc;
    }

    public void setAnesdoc(String anesdoc) {
        this.anesdoc = anesdoc;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getIncisiontype() {
        return incisiontype;
    }

    public void setIncisiontype(String incisiontype) {
        this.incisiontype = incisiontype;
    }

    public String getYngerm() {
        return yngerm;
    }

    public void setYngerm(String yngerm) {
        this.yngerm = yngerm;
    }

    public String getScreenupe() {
        return screenupe;
    }

    public void setScreenupe(String screenupe) {
        this.screenupe = screenupe;
    }

    public String getOperoom() {
        return operoom;
    }

    public void setOperoom(String operoom) {
        this.operoom = operoom;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public LocalDateTime getRecepttime() {
        return recepttime;
    }

    public void setRecepttime(LocalDateTime recepttime) {
        this.recepttime = recepttime;
    }

    public String getBloodkind() {
        return bloodkind;
    }

    public void setBloodkind(String bloodkind) {
        this.bloodkind = bloodkind;
    }

    public BigDecimal getBloodnum() {
        return bloodnum;
    }

    public void setBloodnum(BigDecimal bloodnum) {
        this.bloodnum = bloodnum;
    }

    public String getBloodunit() {
        return bloodunit;
    }

    public void setBloodunit(String bloodunit) {
        this.bloodunit = bloodunit;
    }

    public String getOperatenote() {
        return operatenote;
    }

    public void setOperatenote(String operatenote) {
        this.operatenote = operatenote;
    }

    public String getAnesthnote() {
        return anesthnote;
    }

    public void setAnesthnote(String anesthnote) {
        this.anesthnote = anesthnote;
    }

    public String getExecstatus() {
        return execstatus;
    }

    public void setExecstatus(String execstatus) {
        this.execstatus = execstatus;
    }

    public String getYnfinished() {
        return ynfinished;
    }

    public void setYnfinished(String ynfinished) {
        this.ynfinished = ynfinished;
    }

    public String getYnanesth() {
        return ynanesth;
    }

    public void setYnanesth(String ynanesth) {
        this.ynanesth = ynanesth;
    }

    public String getFolk() {
        return folk;
    }

    public void setFolk(String folk) {
        this.folk = folk;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getFolkcomment() {
        return folkcomment;
    }

    public void setFolkcomment(String folkcomment) {
        this.folkcomment = folkcomment;
    }

    public String getYnurgent() {
        return ynurgent;
    }

    public void setYnurgent(String ynurgent) {
        this.ynurgent = ynurgent;
    }

    public String getYnchange() {
        return ynchange;
    }

    public void setYnchange(String ynchange) {
        this.ynchange = ynchange;
    }

    public String getYnheavy() {
        return ynheavy;
    }

    public void setYnheavy(String ynheavy) {
        this.ynheavy = ynheavy;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LocalDateTime getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(LocalDateTime operatetime) {
        this.operatetime = operatetime;
    }

    public String getYnvalid() {
        return ynvalid;
    }

    public void setYnvalid(String ynvalid) {
        this.ynvalid = ynvalid;
    }

    public String getYnunite() {
        return ynunite;
    }

    public void setYnunite(String ynunite) {
        this.ynunite = ynunite;
    }

    public String getUniteNo() {
        return uniteNo;
    }

    public void setUniteNo(String uniteNo) {
        this.uniteNo = uniteNo;
    }

    @Override
    public String toString() {
        return "OpApply{" +
        "operationno=" + operationno +
        ", recordno=" + recordno +
        ", inpatientNo=" + inpatientNo +
        ", patientNo=" + patientNo +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", bedNo=" + bedNo +
        ", pasource=" + pasource +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", prepayCost=" + prepayCost +
        ", deptCode=" + deptCode +
        ", bloodcode=" + bloodcode +
        ", operationkind=" + operationkind +
        ", operationitem=" + operationitem +
        ", diagnose=" + diagnose +
        ", operatedoc=" + operatedoc +
        ", guidedoc=" + guidedoc +
        ", ynemclinic=" + ynemclinic +
        ", seedoctype=" + seedoctype +
        ", sickroom=" + sickroom +
        ", duration=" + duration +
        ", predtime=" + predtime +
        ", anestype=" + anestype +
        ", helpernum=" + helpernum +
        ", washnurse=" + washnurse +
        ", acconurse=" + acconurse +
        ", prepnurse=" + prepnurse +
        ", execdept=" + execdept +
        ", consoletype=" + consoletype +
        ", applydoc=" + applydoc +
        ", applytime=" + applytime +
        ", applynote=" + applynote +
        ", approvedoc=" + approvedoc +
        ", approvetime=" + approvetime +
        ", approvenote=" + approvenote +
        ", anesdoc=" + anesdoc +
        ", fee=" + fee +
        ", degree=" + degree +
        ", incisiontype=" + incisiontype +
        ", yngerm=" + yngerm +
        ", screenupe=" + screenupe +
        ", operoom=" + operoom +
        ", console=" + console +
        ", recepttime=" + recepttime +
        ", bloodkind=" + bloodkind +
        ", bloodnum=" + bloodnum +
        ", bloodunit=" + bloodunit +
        ", operatenote=" + operatenote +
        ", anesthnote=" + anesthnote +
        ", execstatus=" + execstatus +
        ", ynfinished=" + ynfinished +
        ", ynanesth=" + ynanesth +
        ", folk=" + folk +
        ", relation=" + relation +
        ", folkcomment=" + folkcomment +
        ", ynurgent=" + ynurgent +
        ", ynchange=" + ynchange +
        ", ynheavy=" + ynheavy +
        ", operator=" + operator +
        ", operatetime=" + operatetime +
        ", ynvalid=" + ynvalid +
        ", ynunite=" + ynunite +
        ", uniteNo=" + uniteNo +
        "}";
    }
}
